class ProdNames {
    String[] StringP = {"Cat Bracelet", "Bell bracelet", "Butterfly necklace", "Obsidian Necklace", "Topaz Necklace", "Aquamarine Necklace", "Sugilite Bracelet", "Opal Bracelet", "Quartz Bracelet"};
}

class Total {

    int[] Basket = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    double[] myNum = {3000, 2700, 1500, 4800, 5600, 7000, 3500, 6800, 5400};

    double[] myWholesale = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    double[] TotalRetail = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    double[] TotalWholesale = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    double[] Transac = {0.00, 0.00};


    public void WholesaleChecker() {
        for (int i = 0; i < 9; i++) {
            if (Basket[i] <= 4) {
                myWholesale[i] = myNum[i] * 1;
            } else if (Basket[i] == 5) {
                myWholesale[i] = myNum[i] * 1.0 * 0.9;

            } else if (Basket[i] <= 10) {
                myWholesale[i] = myNum[i] * 1.0 * 0.8;

            } else if (Basket[i] <= 15) {
                myWholesale[i] = myNum[i] * 1.0 * 0.7;
            } else if (Basket[i] <= 20) {
                myWholesale[i] = myNum[i] * 1.0 * 0.6;
            }

        }


    }
}







