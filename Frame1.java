package MainExam1;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Frame1 {

    Total TotalP= new Total();
    ProdNames ProductP= new ProdNames();
    Frame1() {

        JFrame f1 = new JFrame("Forever Diamonds");





        f1.getContentPane().setBackground(Color.lightGray);


        JPanel panelTitle = new JPanel(new FlowLayout());
        JPanel panelGrid1 = new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel panelGrid2 = new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel panelGrid3 = new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel panelGrid4 = new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel panelGrid5 = new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel panelGrid6 = new JPanel(new GridLayout(1, 3, 10, 10));
        JPanel panelButton = new JPanel(new GridLayout(1, 1, 10, 10));



        panelTitle.setBounds(300, 10, 370, 40);
        panelTitle.setOpaque(false);
        panelGrid1.setBounds(70, 90, 850, 120);
        panelGrid1.setOpaque(false);
        panelGrid2.setBounds(75, 200, 840, 35);
        panelGrid2.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, Color.BLACK));
        panelGrid2.setOpaque(false);
        panelGrid3.setBounds(70, 240, 850, 120);
        panelGrid3.setOpaque(false);
        panelGrid4.setBounds(75, 350, 840, 35);
        panelGrid4.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, Color.BLACK));

        panelGrid4.setOpaque(false);
        panelGrid5.setBounds(70, 390, 850, 120);
        panelGrid5.setOpaque(false);
        panelGrid6.setBounds(75, 500, 840, 35);
        panelGrid6.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, Color.BLACK));

        panelGrid6.setOpaque(false);
        panelButton.setBounds(70, 560, 850, 120);
        panelButton.setOpaque(false);



        JLabel labelTitle = new JLabel("Forever Diamonds", JLabel.CENTER);
        labelTitle.setFont(new Font("Times New Roman", Font.BOLD, 30));


        JLabel label1 = new JLabel(String.valueOf(TotalP.myNum[0]));
        JLabel label2 = new JLabel(String.valueOf(TotalP.myNum[1]));
        JLabel label3 = new JLabel(String.valueOf(TotalP.myNum[2]));

        JLabel label4 = new JLabel(String.valueOf(TotalP.myNum[3]));
        JLabel label5 = new JLabel(String.valueOf(TotalP.myNum[4]));
        JLabel label6 = new JLabel(String.valueOf(TotalP.myNum[5]));

        JLabel label7 = new JLabel(String.valueOf(TotalP.myNum[6]));
        JLabel label8 = new JLabel(String.valueOf(TotalP.myNum[7]));
        JLabel label9 = new JLabel(String.valueOf(TotalP.myNum[8]));



        JButton b1 = new JButton(new ImageIcon("D:\\JavaStuff\\Java1\\src\\MainExam1\\1p.jpg"));
        b1.setToolTipText(" Material: Silver S925 (92.5% Silver and 7.5% other metals produced by Italian Silver technology) beautifully polished, non-rusting, non-allergic, easy to lighten and maintain");
        b1.setBorder(BorderFactory.createTitledBorder(ProductP.StringP[0]));
        b1.setOpaque(false);
        b1.setContentAreaFilled(false);
        JButton b2 = new JButton(new ImageIcon("D:\\JavaStuff\\Java1\\src\\MainExam1\\2.jpg"));
        b2.setToolTipText("Material: Silver S925 Color: Silver Free jewelry box and silk mesh bag/order Style: Chic, elegant / cute, pretty");
        b2.setBorder(BorderFactory.createTitledBorder(ProductP.StringP[1]));
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        JButton b3 = new JButton(new ImageIcon("D:\\JavaStuff\\Java1\\src\\MainExam1\\3.jpg"));
        b3.setToolTipText("Material: High quality 925 sterling silver - Strap length: 42cm (under 60kg fits around the neck) - Style: Small, delicate, sharp, modern design");
        b3.setBorder(BorderFactory.createTitledBorder(ProductP.StringP[2]));
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        JButton b4 = new JButton(new ImageIcon("D:\\JavaStuff\\Java1\\src\\MainExam1\\4.jpg"));
        b4.setToolTipText("The Obsidian stone represents the root chakra, offering grounding and protection. This necklace symbolizes reconnecting with your deep roots and stability as you explore your depths. Made of volcanic glass, Obsidian is known as a stone that works like magic thanks to its metaphysical characteristics.");
        b4.setBorder(BorderFactory.createTitledBorder(ProductP.StringP[3]));
        b4.setOpaque(false);
        b4.setContentAreaFilled(false);
        JButton b5 = new JButton(new ImageIcon("D:\\JavaStuff\\Java1\\src\\MainExam1\\5.jpg"));
        b5.setToolTipText("Blue topaz is an incredibly versatile gemstone that is both impressively strong as well as stunningly beautiful! It is hard to go wrong with a blue topaz necklace and it even comes in multiple different shades to best match your preferences.");
        b5.setBorder(BorderFactory.createTitledBorder(ProductP.StringP[4]));
        b5.setOpaque(false);
        b5.setContentAreaFilled(false);
        JButton b6 = new JButton(new ImageIcon("D:\\JavaStuff\\Java1\\src\\MainExam1\\6.jpg"));
        b6.setToolTipText("Aquamarine Necklace This stunning aquamarine necklace is handmade using sterling silver. An aquamarine gemstone is the hero of the piece. The gemstone hangs within seven sterling silver rings each ring representing someone special in the wearers life.");
        b6.setBorder(BorderFactory.createTitledBorder(ProductP.StringP[5]));
        b6.setOpaque(false);
        b6.setContentAreaFilled(false);
        JButton b7 = new JButton(new ImageIcon("D:\\JavaStuff\\Java1\\src\\MainExam1\\7.jpg"));
        b7.setToolTipText("sugilite bead bracelet is a special pain reliever and excellent stone for self-clear. It helps to clear headaches. Sugilite Bracelet It symbolizes purpose, hope, and harmony.");
        b7.setBorder(BorderFactory.createTitledBorder(ProductP.StringP[6]));
        b7.setOpaque(false);
        b7.setContentAreaFilled(false);
        JButton b8 = new JButton(new ImageIcon("D:\\JavaStuff\\Java1\\src\\MainExam1\\8.jpg"));
        b8.setToolTipText("The Opal Bracelet is not your average friendship bracelet. It's refined, with a centrepiece of opals and gleaming cubic zirconia stones, but simple and fine.");
        b8.setBorder(BorderFactory.createTitledBorder(ProductP.StringP[7]));
        b8.setOpaque(false);
        b8.setContentAreaFilled(false);
        JButton b9 = new JButton(new ImageIcon("D:\\JavaStuff\\Java1\\src\\MainExam1\\9.jpg"));
        b9.setToolTipText("Quartz is the most powerful healing stone of the mineral kingdom, it’s able to work on any condition. Clear Quartz is known as the stone of power and amplifies any energy or intention.");
        b9.setBorder(BorderFactory.createTitledBorder(ProductP.StringP[8]));
        b9.setOpaque(false);
        b9.setContentAreaFilled(false);

        JButton b10 = new JButton("Check Out");




        f1.add(panelTitle);
        f1.add(panelGrid1);
        f1.add(panelGrid3);
        f1.add(panelGrid2);
        f1.add(panelGrid5);
        f1.add(panelGrid4);
        f1.add(panelGrid6);
        f1.add(panelButton);


        panelTitle.add(labelTitle);


        panelGrid1.add(b1);
        panelGrid1.add(b2);
        panelGrid1.add(b3);
        panelGrid2.add(label1);
        panelGrid2.add(label2);
        panelGrid2.add(label3);


        panelGrid3.add(b4);
        panelGrid3.add(b5);
        panelGrid3.add(b6);
        panelGrid4.add(label4);
        panelGrid4.add(label5);
        panelGrid4.add(label6);

        panelGrid5.add(b7);
        panelGrid5.add(b8);
        panelGrid5.add(b9);
        panelGrid6.add(label7);
        panelGrid6.add(label8);
        panelGrid6.add(label9);

        panelButton.add(b10);

        f1.setLayout(null);
        f1.setSize(1000, 800);
        f1.setResizable(false);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        //to make the buttons do something
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                TotalP.Basket[0] =  TotalP.Basket [0] + 1;
                TotalP.TotalRetail[0] = TotalP.TotalRetail[0] + TotalP.myNum[0];
                TotalP.TotalWholesale[0] = TotalP.TotalWholesale[0] + TotalP.myWholesale[0];
                TotalP.Transac[0] = TotalP.Transac[0] + TotalP.myNum[0];
                TotalP.Transac[1] = TotalP.Transac[1] + TotalP.myWholesale[0];


            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                TotalP.Basket[1] =  TotalP.Basket [1] + 1;
                TotalP.TotalRetail[1] = TotalP.TotalRetail[1] + TotalP.myNum[1];
                TotalP.TotalWholesale[1] = TotalP.TotalWholesale[1] + TotalP.myWholesale[1];
                TotalP.Transac[0] = TotalP.Transac[0] + TotalP.myNum[1];
                TotalP.Transac[1] = TotalP.Transac[1] + TotalP.myWholesale[1];

                }

        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalP.Basket[2] =  TotalP.Basket [2] + 1;
                TotalP.TotalRetail[2] = TotalP.TotalRetail[2] + TotalP.myNum[2];
                TotalP.TotalWholesale[2] = TotalP.TotalWholesale[2] + TotalP.myWholesale[2];
                TotalP.Transac[0] = TotalP.Transac[0] + TotalP.myNum[2];
                TotalP.Transac[1] = TotalP.Transac[1] + TotalP.myWholesale[2];
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalP.Basket[3] =  TotalP.Basket [3] + 1;
                TotalP.TotalRetail[3] = TotalP.TotalRetail[3] + TotalP.myNum[3];
                TotalP.TotalWholesale[3] = TotalP.TotalWholesale[3] + TotalP.myWholesale[3];
                TotalP.Transac[0] = TotalP.Transac[0] + TotalP.myNum[3];
                TotalP.Transac[1] = TotalP.Transac[1] + TotalP.myWholesale[3];
            }
        });

        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalP.Basket[4] =  TotalP.Basket [4] + 1;
                TotalP.TotalRetail[4] = TotalP.TotalRetail[4] + TotalP.myNum[4];
                TotalP.TotalWholesale[4] = TotalP.TotalWholesale[4] + TotalP.myWholesale[4];
                TotalP.Transac[0] = TotalP.Transac[0] + TotalP.myNum[4];
                TotalP.Transac[1] = TotalP.Transac[1] + TotalP.myWholesale[4];
            }
        });

        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalP.Basket[5] =  TotalP.Basket [5] + 1;
                TotalP.TotalRetail[5] = TotalP.TotalRetail[5] + TotalP.myNum[5];
                TotalP.TotalWholesale[5] = TotalP.TotalWholesale[5] + TotalP.myWholesale[5];
                TotalP.Transac[0] = TotalP.Transac[0] + TotalP.myNum[5];
                TotalP.Transac[1] = TotalP.Transac[1] + TotalP.myWholesale[5];
            }
        });

        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalP.Basket[6] =  TotalP.Basket [6] + 1;
                TotalP.TotalRetail[6] = TotalP.TotalRetail[6] + TotalP.myNum[6];
                TotalP.TotalWholesale[6] = TotalP.TotalWholesale[6] + TotalP.myWholesale[6];
                TotalP.Transac[0] = TotalP.Transac[0] + TotalP.myNum[6];
                TotalP.Transac[1] = TotalP.Transac[1] + TotalP.myWholesale[6];
            }
        });

        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalP.Basket[7] =  TotalP.Basket [7] + 1;
                TotalP.TotalRetail[7] = TotalP.TotalRetail[7] + TotalP.myNum[7];
                TotalP.TotalWholesale[7] = TotalP.TotalWholesale[7] + TotalP.myWholesale[7];
                TotalP.Transac[0] = TotalP.Transac[0] + TotalP.myNum[7];
                TotalP.Transac[1] = TotalP.Transac[1] + TotalP.myWholesale[7];
            }
        });

        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TotalP.Basket[8] =  TotalP.Basket [8] + 1;
                TotalP.TotalRetail[8] = TotalP.TotalRetail[8] + TotalP.myNum[8];
                TotalP.TotalWholesale[8] = TotalP.TotalWholesale[8] + TotalP.myWholesale[8];
                TotalP.Transac[0] = TotalP.Transac[0] + TotalP.myNum[8];
                TotalP.Transac[1] = TotalP.Transac[1] + TotalP.myWholesale[8];
            }
        });

        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CheckOutButton();

            }
        });

    }


    public void CheckOutButton() {
        int input = JOptionPane.showConfirmDialog(null, "Confirm Purchase?");
// 0=yes, 1=no, 2=cancel
        if (input == 0) {
            ReceiptTXT();
        }

        }

    public void ReceiptTXT() {

        try {
            FileWriter myWriter = new FileWriter("D:\\JavaStuff\\Java1\\src\\MainExam1\\filename.txt");
            myWriter.write("----------------------------------------------------\n");
            myWriter.write("         *         Forever Gems         *             \n");
            myWriter.write("----------------------------------------------------\n");
            myWriter.write("Product" + "\t\t\t\t\t\t\t\t\t" + "Retail" + "\t" + "Wholesale\n");

            myWriter.write( TotalP.Basket[0] + "x" + "\t" + ProductP.StringP[0] + "\t\t\t\t\t\t" + TotalP.TotalRetail[0] + "\t" + TotalP.TotalWholesale[0] + "\t" + "\n");
            myWriter.write( TotalP.Basket[1] + "x" + "\t" + ProductP.StringP[1] + "\t\t\t\t\t\t" + TotalP.TotalRetail[1] + "\t" + TotalP.TotalWholesale[1] + "\t" + "\n");
            myWriter.write( TotalP.Basket[2] + "x" + "\t" + ProductP.StringP[2] + "\t\t\t\t\t" + TotalP.TotalRetail[2] + "\t" + TotalP.TotalWholesale[2] + "\t" + "\n");
            myWriter.write( TotalP.Basket[3] + "x" + "\t" + ProductP.StringP[3] + "\t\t\t\t\t" + TotalP.TotalRetail[3] + "\t" + TotalP.TotalWholesale[3] + "\t" + "\n");
            myWriter.write( TotalP.Basket[4] + "x" + "\t" + ProductP.StringP[4] + "\t\t\t\t\t\t" + TotalP.TotalRetail[4] + "\t" + TotalP.TotalWholesale[4] + "\t" + "\n");
            myWriter.write( TotalP.Basket[5] + "x" + "\t" + ProductP.StringP[5] + "\t\t\t\t\t" + TotalP.TotalRetail[5] + "\t" + TotalP.TotalWholesale[5] + "\t" + "\n");
            myWriter.write( TotalP.Basket[6] + "x" + "\t" + ProductP.StringP[6] + "\t\t\t\t\t" + TotalP.TotalRetail[6] + "\t" + TotalP.TotalWholesale[6] + "\t" + "\n");
            myWriter.write( TotalP.Basket[7] + "x" + "\t" + ProductP.StringP[7] + "\t\t\t\t\t\t" + TotalP.TotalRetail[7] + "\t" + TotalP.TotalWholesale[7] + "\t" + "\n");
            myWriter.write( TotalP.Basket[8] + "x" + "\t" + ProductP.StringP[8] + "\t\t\t\t\t\t" + TotalP.TotalRetail[8] + "\t" + TotalP.TotalWholesale[8] + "\t" + "\n");
            myWriter.write("----------------------------------------------------\n");
            myWriter.write( "Total Amount" + "\t\t\t\t\t\t\t" + TotalP.Transac[0] + "\t" + TotalP.Transac[1]);
              myWriter.close();

            System.out.println("Successfully wrote to the file.");
        } catch (
                IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    }

