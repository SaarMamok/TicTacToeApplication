package com.example.tictactoeapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Matrix;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class MainActivity_game_page extends AppCompatActivity {

    Boolean flag_X = true;
    int matrix[][] = new int[3][3]; // 1=X  2=O
    private ImageView empty_win;
    private ImageView empty_winner_message;
    int player_X = 0;
    int player_O = 0;

    public void addToMatrix(int XorO, int row, int col) {
        matrix[row][col] = XorO;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game_page);

        ImageButton btn_1 = findViewById(R.id.main_button1_btn);
        ImageButton btn_2 = findViewById(R.id.main_button2_btn);
        ImageButton btn_3 = findViewById(R.id.main_button3_btn);
        ImageButton btn_4 = findViewById(R.id.main_button4_btn);
        ImageButton btn_5 = findViewById(R.id.main_button5_btn);
        ImageButton btn_6 = findViewById(R.id.main_button6_btn);
        ImageButton btn_7 = findViewById(R.id.main_button7_btn);
        ImageButton btn_8 = findViewById(R.id.main_button8_btn);
        ImageButton btn_9 = findViewById(R.id.main_button9_btn);

        empty_win = findViewById(R.id.mainGP_emptyWin_image);
        empty_winner_message = findViewById(R.id.mainGP_emptyWinnerMessage_image);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_X) {
                    btn_1.setImageResource(R.drawable.x);
                    btn_1.setEnabled(false);
                    flag_X = false;
                    addToMatrix(1, 0, 0);
                } else {
                    btn_1.setImageResource(R.drawable.o);
                    btn_1.setEnabled(false);
                    flag_X = true;
                    addToMatrix(2, 0, 0);
                }
                isWin();
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_X) {
                    btn_2.setImageResource(R.drawable.x);
                    btn_2.setEnabled(false);
                    flag_X = false;
                    addToMatrix(1, 0, 1);
                } else {
                    btn_2.setImageResource(R.drawable.o);
                    btn_2.setEnabled(false);
                    flag_X = true;
                    addToMatrix(2, 0, 1);
                }
                isWin();
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_X) {
                    btn_3.setImageResource(R.drawable.x);
                    btn_3.setEnabled(false);
                    flag_X = false;
                    addToMatrix(1, 0, 2);
                } else {
                    btn_3.setImageResource(R.drawable.o);
                    btn_3.setEnabled(false);
                    flag_X = true;
                    addToMatrix(2, 0, 2);
                }
                isWin();
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_X) {
                    btn_4.setImageResource(R.drawable.x);
                    btn_4.setEnabled(false);
                    flag_X = false;
                    addToMatrix(1, 1, 0);
                } else {
                    btn_4.setImageResource(R.drawable.o);
                    btn_4.setEnabled(false);
                    flag_X = true;
                    addToMatrix(2, 1, 0);
                }
                isWin();
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_X) {
                    btn_5.setImageResource(R.drawable.x);
                    btn_5.setEnabled(false);
                    flag_X = false;
                    addToMatrix(1, 1, 1);
                } else {
                    btn_5.setImageResource(R.drawable.o);
                    btn_5.setEnabled(false);
                    flag_X = true;
                    addToMatrix(2, 1, 1);
                }
                isWin();
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_X) {
                    btn_6.setImageResource(R.drawable.x);
                    btn_6.setEnabled(false);
                    flag_X = false;
                    addToMatrix(1, 1, 2);
                } else {
                    btn_6.setImageResource(R.drawable.o);
                    btn_6.setEnabled(false);
                    flag_X = true;
                    addToMatrix(2, 1, 2);
                }
                isWin();
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_X) {
                    btn_7.setImageResource(R.drawable.x);
                    btn_7.setEnabled(false);
                    flag_X = false;
                    addToMatrix(1, 2, 0);
                } else {
                    btn_7.setImageResource(R.drawable.o);
                    btn_7.setEnabled(false);
                    flag_X = true;
                    addToMatrix(2, 2, 0);
                }
                isWin();
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_X) {
                    btn_8.setImageResource(R.drawable.x);
                    btn_8.setEnabled(false);
                    flag_X = false;
                    addToMatrix(1, 2, 1);
                } else {
                    btn_8.setImageResource(R.drawable.o);
                    btn_8.setEnabled(false);
                    flag_X = true;
                    addToMatrix(2, 2, 1);
                }
                isWin();
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (flag_X) {
                    btn_9.setImageResource(R.drawable.x);
                    btn_9.setEnabled(false);
                    flag_X = false;
                    addToMatrix(1, 2, 2);
                } else {
                    btn_9.setImageResource(R.drawable.o);
                    btn_9.setEnabled(false);
                    flag_X = true;
                    addToMatrix(2, 2, 2);
                }
                isWin();
            }
        });

    }

    public void isWin() {
        boolean flag_equality = true;
        // winner: X
        if(matrix[0][0] == 1 && matrix[1][0] == 1 && matrix[2][0] == 1) { // left
            empty_win.setImageResource(R.drawable.mark3);
            player_X++;
            empty_winner_message.setImageResource(R.drawable.xwin);
            flag_equality = false;
        }
        if(matrix[0][2] == 1 && matrix[1][2] == 1 && matrix[2][2] == 1) { // right
            empty_win.setImageResource(R.drawable.mark5);
            player_X++;
            empty_winner_message.setImageResource(R.drawable.xwin);
            flag_equality = false;
        }
        if(matrix[0][1] == 1 && matrix[1][1] == 1 && matrix[2][1] == 1) { // | middle
            empty_win.setImageResource(R.drawable.mark4);
            player_X++;
            empty_winner_message.setImageResource(R.drawable.xwin);
            flag_equality = false;
        }
        if(matrix[0][0] == 1 && matrix[0][1] == 1 && matrix[0][2] == 1) { // top
            empty_win.setImageResource(R.drawable.top);
            player_X++;
            empty_winner_message.setImageResource(R.drawable.xwin);
            flag_equality = false;
        }
        if(matrix[2][0] == 1 && matrix[2][1] == 1 && matrix[2][2] == 1) { // down
            empty_win.setImageResource(R.drawable.down);
            player_X++;
            empty_winner_message.setImageResource(R.drawable.xwin);
            flag_equality = false;
        }
        if(matrix[1][0] == 1 && matrix[1][1] == 1 && matrix[1][2] == 1) { // - middle
            empty_win.setImageResource(R.drawable.middle);
            player_X++;
            empty_winner_message.setImageResource(R.drawable.xwin);
            flag_equality = false;
        }
        if(matrix[2][0] == 1 && matrix[1][1] == 1 && matrix[0][2] == 1) { // /
            empty_win.setImageResource(R.drawable.mark2);
            player_X++;
            empty_winner_message.setImageResource(R.drawable.xwin);
            flag_equality = false;
        }
        if(matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1) { // \
            empty_win.setImageResource(R.drawable.mark1);
            player_X++;
            empty_winner_message.setImageResource(R.drawable.xwin);
            flag_equality = false;
        }

        // winner: O
        if(matrix[0][0] == 2 && matrix[1][0] == 2 && matrix[2][0] == 2) { // left
            empty_win.setImageResource(R.drawable.mark3);
            player_O++;
            empty_winner_message.setImageResource(R.drawable.owin);
            flag_equality = false;
        }
        if(matrix[0][2] == 2 && matrix[1][2] == 2 && matrix[2][2] == 2) { // right
            empty_win.setImageResource(R.drawable.mark5);
            player_O++;
            empty_winner_message.setImageResource(R.drawable.owin);
            flag_equality = false;
        }
        if(matrix[0][1] == 2 && matrix[1][1] == 2 && matrix[2][1] == 2) { // | middle
            empty_win.setImageResource(R.drawable.mark4);
            player_O++;
            empty_winner_message.setImageResource(R.drawable.owin);
            flag_equality = false;
        }
        if(matrix[0][0] == 2 && matrix[0][1] == 2 && matrix[0][2] == 2) { // top
            empty_win.setImageResource(R.drawable.top);
            player_O++;
            empty_winner_message.setImageResource(R.drawable.owin);
            flag_equality = false;
        }
        if(matrix[2][0] == 2 && matrix[2][1] == 2 && matrix[2][2] == 2) { // down
            empty_win.setImageResource(R.drawable.down);
            player_O++;
            empty_winner_message.setImageResource(R.drawable.owin);
            flag_equality = false;
        }
        if(matrix[1][0] == 2 && matrix[1][1] == 2 && matrix[1][2] == 2) { // - middle
            empty_win.setImageResource(R.drawable.middle);
            player_O++;
            empty_winner_message.setImageResource(R.drawable.owin);
            flag_equality = false;
        }
        if(matrix[2][0] == 2 && matrix[1][1] == 2 && matrix[0][2] == 2) { // /
            empty_win.setImageResource(R.drawable.mark2);
            player_O++;
            empty_winner_message.setImageResource(R.drawable.owin);
            flag_equality = false;
        }
        if(matrix[0][0] == 2 && matrix[1][1] == 2 && matrix[2][2] == 2) { // \
            empty_win.setImageResource(R.drawable.mark1);
            player_O++;
            empty_winner_message.setImageResource(R.drawable.owin);
            flag_equality = false;
        }

        // equality
        if(flag_equality)
            empty_winner_message.setImageResource(R.drawable.nowin);

    }

}