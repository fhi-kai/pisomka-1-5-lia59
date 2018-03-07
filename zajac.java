public class zajac implements ZajacieUsi {


    public int zajacieUsi(int pocetZajacov) {

        int usi = 0;

        for (int i = 1; i < 5; i++) {
            if (pocetZajacov == i)
                usi = usi + 2;
            else if (pocetZajacov == i + 1)
                usi = usi + 3;

        }
        return usi;
    }
}