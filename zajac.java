public class zajac implements ZajacieUsi {


        @Override
        public int zajacieUsi(int pocetZajacov) {

            if (pocetZajacov == 0){
                return 0;
            }
            else if (pocetZajacov % 2 == 0){
                return 3 + zajacieUsi(pocetZajacov -1);
            }
            else{
                return 2 + zajacieUsi(pocetZajacov -1);
            }

        }
}