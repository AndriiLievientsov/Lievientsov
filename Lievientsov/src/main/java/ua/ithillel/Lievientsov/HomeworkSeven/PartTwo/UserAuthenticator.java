package ua.ithillel.Lievientsov.HomeworkSeven.PartTwo;
/*### Часть 2

- Создать класс `UserAuthenticator`. Создать статический метод который принимает на вход три параметра:
`login`, `password` и `confirmPassword`.

Правила для `login`:
- Должен содержать только латинские буквы, цифры.
- Длина должна быть меньше 20 символов.

Если `login` не соответствует этим требованиям, необходимо выбросить `WrongLoginException`.

Правила для `password`:
- должен содержать только латинские буквы, цифры и знак подчеркивания.
- Длина должна быть меньше 20 символов.
- `password` и `confirmPassword` должны быть равны.

Если `password` не соответствует этим требованиям, необходимо выбросить `WrongPasswordException`.

`WrongPasswordException` и `WrongLoginException` - пользовательские классы исключения с двумя конструкторами –
один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
 Обработка исключений проводится вне метода (В сигнатуре метода должно быть указано что он может бросить исключения).
 Используем `multi-catch block`. Метод возвращает `true`, если значения верны или `false` в другом случае.*/

public class UserAuthenticator {
    public static void main(String[] args) {
        try {
            UserAuthenticator.userAuthorization("Admin", "admin101", "admin101");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void userAuthorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches(("^[a-zA-Z0-9]+$"))) {
            throw new WrongLoginException("Login contains illegal characters. ✖");
        }
        if (login.length() > 20) {
            throw new WrongLoginException("The length of the login exceeds 20 characters. ✖");
        } else {
            System.out.println("Login - ✔");
        }
        if (!password.matches(("^[a-zA-Z0-9_]+$"))) {
            throw new WrongPasswordException("Password contains invalid characters. ✖");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("The length of the password exceeds 20 characters. ✖");
        } else {
            System.out.println("Password - ✔");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("'Password' and 'Confirm Password' do not match ✖");
        } else {
            System.out.println("The password matches - ✔ ");
        }
    }

}
