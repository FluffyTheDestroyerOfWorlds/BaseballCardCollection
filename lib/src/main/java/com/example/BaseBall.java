package com.example;

public class BaseBall {
    public static void main (String[]  args){
        // Player	Team	Pos	G	AB	R	H	2B	3B	HR▼	RBI	BB	SO	SB	CS	AVG	OBP	SLG	OP [19, 20]
        String [][] BaseBallCard = {
                {" Trumbo, M","BAL","RF","159","613","94","157","27","1","47","108","51","170","2","0","0.256","0.316","0.533","0.85"},
                {" Cruz, N","SEA","DH","155","589","96","169","27","1","43","105","62","159","2","0","0.287","0.36","0.555","0.915"},
                {" Davis, K","OAK","LF","150","555","85","137","24","2","42","102","42","166","1","2","0.247","0.307","0.524","0.831"},
                {" Dozier, B","MIN","2B","155","615","104","165","35","5","42","99","61","138","18","2","0.268","0.34","0.546","0.886"},
                {" Encarnacion, E","TOR","DH","160","601","99","158","34","0","42","127","87","138","2","0","0.263","0.357","0.529","0.886"},
                {" Arenado, N","COL","3B","160","618","116","182","35","6","41","133","68","103","2","3","0.294","0.362","0.57","0.932"},
                {" Carter, C","MIL","1B","160","549","84","122","27","1","41","94","76","206","3","1","0.222","0.321","0.499","0.821"},
                {" Frazier, T","CWS","3B","158","590","89","133","21","0","40","98","64","163","15","5","0.225","0.302","0.464","0.767"},
                {" Bryant, K","CHC","3B","155","603","121","176","35","3","39","102","75","154","8","5","0.292","0.385","0.554","0.939"},
                {" Cano, R","SEA","2B","161","655","107","195","33","2","39","103","47","100","0","1","0.298","0.35","0.533","0.882"},
                {" Cabrera, M","DET","1B","158","595","92","188","31","1","38","108","75","116","0","0","0.316","0.393","0.563","0.956"},
                {" Davis, C","BAL","1B","157","566","99","125","21","0","38","84","88","219","1","0","0.221","0.332","0.459","0.792"},
                {" Ortiz, D","BOS","DH","151","537","79","169","48","1","38","127","80","86","2","0","0.315","0.401","0.62","1.021"},
                {" Donaldson, J","TOR","3B","155","577","122","164","32","5","37","99","109","119","7","1","0.284","0.404","0.549","0.953"},
                {" Machado, M","BAL","3B","157","640","105","188","40","1","37","96","48","120","0","3","0.294","0.343","0.533","0.876"},
                {" Longoria, E","TB","3B","160","633","81","173","41","4","36","98","42","144","0","3","0.273","0.318","0.521","0.84"},
                {" Kemp, M","ATL","LF","156","623","89","167","39","0","35","108","36","156","1","0","0.268","0.304","0.499","0.803"},
                {" Freeman, F","ATL","1B","158","589","102","178","43","6","34","91","89","171","6","1","0.302","0.4","0.569","0.968"},
                {" Napoli, M","CLE","1B","150","557","92","133","22","1","34","101","78","194","5","1","0.239","0.335","0.465","0.8"},
                {" Santana, C","CLE","DH","158","582","89","151","31","3","34","87","99","99","5","2","0.259","0.366","0.498","0.865"}

        };

         //How many of each team is there?
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 19; j++) {

                if(BaseBallCard[i][1].compareToIgnoreCase(BaseBallCard[j][1]) > 0) {

                    String temp[] = BaseBallCard[i];

                    BaseBallCard[i] = BaseBallCard[j];
                    BaseBallCard[j] = temp;


                }
            }

        }

        String prevTeam = "";
        Integer totalPlayers = 0;

        for (int i = 0; i < 20 ; i++) {
            totalPlayers++;
            if (prevTeam.compareToIgnoreCase(BaseBallCard[i][1]) > 0 ) {
                if (i != 0) {
                    System.out.println(prevTeam + " has " + totalPlayers + " in total.");
                }
                totalPlayers = 0;
            }

            prevTeam = BaseBallCard[i][1];
        }

        // Who has the most HR?
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 19; j++) {

                if(Double.parseDouble(BaseBallCard[i][9]) > Double.parseDouble(BaseBallCard[j][9])) {

                    String temp[] = BaseBallCard[i];

                    BaseBallCard[i] = BaseBallCard[j];
                    BaseBallCard[j] = temp;


                }
            }

        }
        System.out.println(BaseBallCard[0][0] + " has the most homeruns at " + BaseBallCard[0][9] + " and \n" + BaseBallCard[19][0]+ " has the least.");

        // Avg Triples for all 20 players
Double avg3 = 0.0;

        for (int i = 0; i < 19; i++) {
            avg3 += Double.parseDouble(BaseBallCard[i][8]);
        }
        avg3 /= BaseBallCard.length;

        System.out.println("The average number of triples this season is: " + avg3);


        // list the array


        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(BaseBallCard[i][j] + " - ");
            }
            System.out.println();
        }




    }

}
