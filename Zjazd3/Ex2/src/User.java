/*
2. Stwórz interfejs User, który posiada pole name oraz metodę showInfo().
        Stwórz klasy Admin oraz Developer, które implementują interfejs User.
        Metoda showInfo() powinna wyświetlić napis w formacie 'name - rola', gdzie rola to typ użytkownika.
        Stwórz obiekty obydwu typów.
        Wyświetl metodę showInfo() dla każdego z nich.
        - Da się zmienić wartość pola 'name'?
        3. Przeczytaj jak działa algorytm sortowania bąbelkowego (bubble sort).
        Stwórz metodę, która wykona sortowanie bąbelkowe na zadanej (dowolnej) tablicy liczb.
        np.:
        [3, 6, 5, 2] -> [2, 3, 5, 6]
        4. Stwórz klasę Fraction, która posiada 2 pola typu int: counter, denominator; oraz pole typu double: value.
        Value oznacza wartość ułamka w formacie dziesiętnym.
        Stwórz w tej klasie metodę, która wypisze na ekranie wartość oraz ułamek w postaci: value [counter/denominator]
        Stwórz kilka obiektów typu Fraction.
        Wywołaj powyższą metodę.
*/
public interface User {
    String name = "";
    public void showInfo();
}
