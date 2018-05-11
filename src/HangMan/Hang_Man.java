package HangMan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.UIManager.getIcon;

public class Hang_Man extends javax.swing.JFrame {
        int incorrectCount=0;
        int place=0;
        String word="";

    public Hang_Man() {
        initComponents();
        setLocationRelativeTo(null);
        txtGuess_Word.requestFocusInWindow();
        setDefaultSettings();
        System.out.println(word);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtGuess_Word = new javax.swing.JTextField();
        lblWrongGuessCounter = new javax.swing.JLabel();
        btnGuess = new javax.swing.JButton();
        lblchar1 = new javax.swing.JLabel();
        lblchar2 = new javax.swing.JLabel();
        lblchar4 = new javax.swing.JLabel();
        lblchar3 = new javax.swing.JLabel();
        lblchar7 = new javax.swing.JLabel();
        lblchar5 = new javax.swing.JLabel();
        lblchar10 = new javax.swing.JLabel();
        lblchar9 = new javax.swing.JLabel();
        lblchar6 = new javax.swing.JLabel();
        lblchar8 = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();
        lblMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 204));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        txtGuess_Word.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtGuess_Word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuess_WordActionPerformed(evt);
            }
        });

        lblWrongGuessCounter.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblWrongGuessCounter.setForeground(new java.awt.Color(255, 0, 0));

        btnGuess.setBackground(new java.awt.Color(255, 255, 255));
        btnGuess.setFont(new java.awt.Font("Eras Demi ITC", 3, 14)); // NOI18N
        btnGuess.setForeground(new java.awt.Color(0, 0, 204));
        btnGuess.setText("Guess");
        btnGuess.setToolTipText("Click to guess the letter");
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });

        lblchar1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblchar1.setForeground(new java.awt.Color(255, 255, 255));

        lblchar2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblchar2.setForeground(new java.awt.Color(255, 255, 255));

        lblchar4.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblchar4.setForeground(new java.awt.Color(255, 255, 255));

        lblchar3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblchar3.setForeground(new java.awt.Color(255, 255, 255));

        lblchar7.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblchar7.setForeground(new java.awt.Color(255, 255, 255));

        lblchar5.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblchar5.setForeground(new java.awt.Color(255, 255, 255));

        lblchar10.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblchar10.setForeground(new java.awt.Color(255, 255, 255));

        lblchar9.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblchar9.setForeground(new java.awt.Color(255, 255, 255));

        lblchar6.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblchar6.setForeground(new java.awt.Color(255, 255, 255));

        lblchar8.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblchar8.setForeground(new java.awt.Color(255, 255, 255));

        btnImage.setBackground(new java.awt.Color(255, 255, 255));
        btnImage.setForeground(new java.awt.Color(255, 255, 255));
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        lblMessage.setBackground(new java.awt.Color(255, 255, 255));
        lblMessage.setFont(new java.awt.Font("Eras Demi ITC", 1, 14)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("The Hangman");

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Eras Demi ITC", 3, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("Exit");
        btnExit.setToolTipText("Click to exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.setToolTipText("Clear the text");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(130, 130, 130))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblchar1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblchar2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblchar3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblchar4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblchar5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblchar6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblchar7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblchar8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblchar9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblchar10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuess, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addComponent(btnExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblWrongGuessCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtGuess_Word, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnClear)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(btnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblchar1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblchar2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblchar3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblchar4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblchar7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblchar9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblchar10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblchar5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblchar6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblchar8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtGuess_Word, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblWrongGuessCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnExit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear))
                    .addComponent(btnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGuess_WordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuess_WordActionPerformed
   
    }//GEN-LAST:event_txtGuess_WordActionPerformed

    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed
        try{
        chckCorrectLetter();
        int condition = WinStatus();
        if (condition == 1) {
                ShowGameOver(1);
                setDefaultSettings();
        }
        checkIncorrectLetter();
    }catch (Exception e){
        
    }
    }//GEN-LAST:event_btnGuessActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImageActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      txtGuess_Word.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hang_Man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hang_Man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hang_Man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hang_Man.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        
        java.awt.EventQueue.invokeLater(() -> {
            new Hang_Man().setVisible(true);
        });
    }
    //Images 
     public static Icon getIcon(int guesstxt) {
        Icon one = new ImageIcon("1.jpg");
        Icon two = new ImageIcon("2.jpg");
        Icon three = new ImageIcon("final.jpg");
        Icon defaultIcon = new ImageIcon("cover.jpg");

        if (guesstxt == 1) {
            return one;
        } else if (guesstxt == 2) {
            return two;
        } else if (guesstxt == 3) {
            return three;
        } else {
            return defaultIcon;
        }
    }
     
     
 public static void ShowGameOver(int guesstxt) {
        if (guesstxt == 1) {
            JOptionPane.showMessageDialog(null, "Congratulations!", "Game Over", INFORMATION_MESSAGE);
        } else if (guesstxt == 2) {
           JOptionPane.showMessageDialog(null, "Game over", "Game Over", INFORMATION_MESSAGE);
        }
    }
 
 private void setDefaultSettings() {
        word = RandomWord();//Get random word
        txtGuess_Word.setText(Character.toString(word.charAt(1)));
        Icon defaultIcon = getIcon(0);
        incorrectCount = 0;

        //Set appropriate labels to X
        lblchar1.setText("X");
        lblchar2.setText("X");
        lblchar3.setText("X");
        lblchar4.setText("");
        lblchar5.setText("");
        lblchar6.setText("");
        lblchar7.setText("");
        lblchar8.setText("");
        lblchar9.setText("");
        lblchar10.setText("");
        if (word.length() == 4) {
            lblchar4.setText("X");
        } else if (word.length() == 5) {         //Set appropriate labels to X
            lblchar4.setText("X");
            lblchar5.setText("X");
        } else if (word.length() == 6) {
            lblchar4.setText("X");
            lblchar5.setText("X");
            lblchar6.setText("X");
        } else if (word.length() == 7) {
            lblchar4.setText("X");
            lblchar5.setText("X");
            lblchar6.setText("X");
            lblchar7.setText("X");
        } else if (word.length() == 8) {
            lblchar4.setText("X");
            lblchar5.setText("X");
            lblchar6.setText("X");
            lblchar7.setText("X");
            lblchar8.setText("X");
        } else if (word.length() == 9) {
            lblchar4.setText("X");
            lblchar5.setText("X");
            lblchar6.setText("X");
            lblchar7.setText("X");
            lblchar8.setText("X");
            lblchar9.setText("X");
        } else if (word.length() == 10) {
            lblchar4.setText("X");
            lblchar5.setText("X");
            lblchar6.setText("X");
            lblchar7.setText("X");
            lblchar8.setText("X");
            lblchar9.setText("X");
            lblchar10.setText("X");
    }
        btnImage.setIcon(defaultIcon);
        lblWrongGuessCounter.setText(Integer.toString(incorrectCount));//Display incorrectCount
        txtGuess_Word.requestFocusInWindow();
    }
    public int WinStatus() {
        String check = lblchar1.getText() + lblchar2.getText() + lblchar3.getText() + lblchar4.getText() + lblchar5.getText() + lblchar6.getText() + lblchar7.getText() + lblchar8.getText() + lblchar9.getText() + lblchar10.getText();
        if (check.equals(word)) {
            return 1;
        } else {
            return 2;
        }
    }
    
    
    public void GuessResult_txt(int option) {
        if (option == 1) {
            lblMessage.setText("Correct Guess!");
            txtGuess_Word.setText(null);
        } else if (option == 2) {
            lblWrongGuessCounter.setText(Integer.toString(incorrectCount));
            lblMessage.setText("Incorrect Guess! Try Again");
            txtGuess_Word.setText(null);
        }
        txtGuess_Word.requestFocusInWindow();//Set cursor at the start
    }


    public static String RandomWord() {
        String[] wordList = new String[6];
        String randomWord = "";
        Random wrd = new Random();
        int randomNumber = wrd.nextInt(5 + 1 )+ 0;

        try {
     
            Scanner reader = new Scanner(new File("word_list.txt"));

            //Repeatedly get random word from words.txt
            for (int n = 0; n <= 5; n++) {
                wordList[n] = reader.nextLine();
            }
            for (int n = 0; n <= randomNumber; n++) {
                randomWord = wordList[n];
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        return randomWord;
    }

    
    
    
    public void chckCorrectLetter() {
        try {
            char guesstxt = txtGuess_Word.getText().toLowerCase().charAt(0);

            for (int n = 0; n < word.length(); n++) {
                if (guesstxt == word.charAt(n)) {
                    place = n + 1;
                    String character = Character.toString(guesstxt);

                    if (place == 1 && !lblchar1.getText().equals(character)) {
                        lblchar1.setText(character);
                        GuessResult_txt(1);
                        break;
                    } else if (place == 2 && !lblchar2.getText().equals(character)) {
                        lblchar2.setText(character);
                        GuessResult_txt(1);//Display result of the guess
                        break;
                    } else if (place == 3 && !lblchar3.getText().equals(character)) {
                        lblchar3.setText(character);
                        GuessResult_txt(1);
                        break;
                    } else if (place == 4 && !lblchar4.getText().equals(character)) {
                        lblchar4.setText(character);
                        GuessResult_txt(1);
                        break;
                    } else if (place == 5 && !lblchar5.getText().equals(character)) {
                        lblchar5.setText(character);
                        GuessResult_txt(1);
                        break;
                    } else if (place == 6 && !lblchar6.getText().equals(character)) {
                        lblchar6.setText(character);
                        GuessResult_txt(1);
                        break;
                    } else if (place == 7 && !lblchar7.getText().equals(character)) {
                        lblchar7.setText(character);
                        GuessResult_txt(1);
                        break;
                    } else if (place == 8 && !lblchar8.getText().equals(character)) {
                        lblchar8.setText(character);
                        GuessResult_txt(1);
                        break;
                    } else if (place == 9 && !lblchar9.getText().equals(character)) {
                        lblchar9.setText(character);
                        GuessResult_txt(1);
                        break;
                    } else if (place == 10 && !lblchar10.getText().equals(character)) {
                        lblchar10.setText(character);
                        GuessResult_txt(1);
                        break;
                    } else {
                        txtGuess_Word.setText("");
                        txtGuess_Word.requestFocusInWindow();
                    }
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            //Display error message for null input
            JOptionPane.showMessageDialog(null, "Please input a character", "Invalid Input", ERROR_MESSAGE);
            txtGuess_Word.requestFocusInWindow();//Set curor 
        }
    }
     public void checkIncorrectLetter() {
        int counter = 0;
        char guesstxt = txtGuess_Word.getText().toLowerCase().charAt(0);//User input
        char[] letter = new char[word.length()];//Create character array

        //Split characters of the word
        for (int n = 0; n < word.length(); n++) {
            letter[n] = word.toLowerCase().charAt(n);
        }

        //Check for incorrect character 
        for (char character : letter) {
            if (character != guesstxt) {
                counter++;
            }
        }

        //Increase incorrectCount if true
        if (counter == word.length()) {
            incorrectCount++;
            GuessResult_txt(2);
        }

        Icon part1 = getIcon(1);
        Icon part2 = getIcon(2);
        Icon part3 = getIcon(3);

        switch (incorrectCount) {
            case 1:
                btnImage.setIcon(part1);
                break;
            case 2:
                btnImage.setIcon(part2);
                break;
            case 3:
                btnImage.setIcon(part3);
                break;
        }

        if (incorrectCount >= 3) {
           ShowGameOver(2);
            setDefaultSettings(); 
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuess;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblWrongGuessCounter;
    private javax.swing.JLabel lblchar1;
    private javax.swing.JLabel lblchar10;
    private javax.swing.JLabel lblchar2;
    private javax.swing.JLabel lblchar3;
    private javax.swing.JLabel lblchar4;
    private javax.swing.JLabel lblchar5;
    private javax.swing.JLabel lblchar6;
    private javax.swing.JLabel lblchar7;
    private javax.swing.JLabel lblchar8;
    private javax.swing.JLabel lblchar9;
    private javax.swing.JTextField txtGuess_Word;
    // End of variables declaration//GEN-END:variables
}
