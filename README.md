# Test

## Тестовое задание для SferaZone

### Описание

- Модель Юзера : [User](https://github.com/patrik228/Test/blob/main/app/src/main/java/com/test/test/models/User.kt)
- Главный Активити : [MainActivity](https://github.com/patrik228/Test/blob/main/app/src/main/java/com/test/test/ui/MainActivity.kt)
- Unit-тест для Юзера : [UserUnitText](https://github.com/patrik228/Test/blob/main/app/src/test/java/com/test/test/UserUnitText.kt)

В коде главного активити создаю восемь юзеров и добавляю в ArrayList. Четыре из которых старше 18 лет, а четыре младше:

```kotlin
val userList: ArrayList<User> = ArrayList()

userList.add(User("Stan", 10)) // < 18
userList.add(User("Andy", 27))

userList.add(User("Kyle", 11)) // < 18
userList.add(User("Bash", 22))

userList.add(User("Kenny", 9)) // < 18
userList.add(User("Ivan", 22))

userList.add(User("Cartman", 10)) // < 18
userList.add(User("Misha", 46))
```

Дальше из этого списка делаю Sequence, фильтрую и преобразую в отфильтрованный ArrayList :

```kotlin
val filteredUsers: ArrayList<User> = ArrayList(
                userList.asSequence()
                    .filter { it.age >= 18 }
                    .toList()
        )
```

Затем помещаю отфильтрованных юзеров в TextView :

```kotlin
mTextView.text = filteredUsers.joinToString(separator = "\n")
```

### Скриншот

![Screenshot](https://github.com/patrik228/Test/blob/main/screenshots/0.png)
