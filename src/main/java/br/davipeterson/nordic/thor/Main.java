package br.davipeterson.nordic.thor;

public class Main {
    public static void main(String[] args) {
        // O deus Thor é uma divindade masculina,
        // designado deus do trovão; sua fraqueza
        // é se tornar não digno, e mora
        // na cidade de Nova York do reino de Midgard.
        // Thor detém vários poderes:
        // tecido sobre-humanamente denso;
        Reino r = new Reino();
        r.setNome("Midgard");

        Cidade c = new Cidade();
        c.setNome("Nova York");
        c.setReino(r);

        Deus t = new Deus();
        t.setNome("Thor");
        t.setSexo("masculino");
        t.setDesignacao("deus do trovão");
        t.setFraqueza("tornar-se não digno");
        t.setMora(c);

        Poder p = new Poder();
        p.setDescricao("tecido sobre-humanamente denso");

        t.getPoderes().add(p);

        System.out.println("Nome: " + t.getNome());
        System.out.println("Sexo: " + t.getSexo());
        System.out.println("Designação: " + t.getDesignacao());
        System.out.println("Fraqueza: " + t.getFraqueza());
        System.out.println("Mora na cidade: " + t.getMora().getNome());
        System.out.println("Reino: " + t.getMora().getReino().getNome());
        System.out.println("Poderes:");
        for (Poder poder : t.getPoderes()) {
            System.out.println("- " + poder.getDescricao());
        }
    }
}
