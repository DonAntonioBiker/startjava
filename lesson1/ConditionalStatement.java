public class ConditionalStatement {

    public static void main(String[] args) {
    	int age;
    	String sex;
    	double height;
    	String name;
    	char nameFirstLetter;

    	if(age > 20) {
    		System.out.println("Ваш возраст больше 20 лет");
    	}

    	if(sex == "male") {
    		System.out.println("Вы - мужчина");
    	}

    	if(sex == "female") {
    		System.out.println("Вы - женщина");
    	}

    	if(height < 1.80) {
    		System.out.println("Вы высокий");
    	} else {
    		System.out.println("Вы низкий");
    	}

    	if(nameFirstLetter == 'М') {
    		System.out.println("Ваше имя начинается на букву M");
    	} else if(nameFirstLetter == 'И') {
    		System.out.println("Ваше имя начинается на букву И");
    	} else {
    		System.out.println("Ваше имя не начинается на буквы М и И");
    	}
    }
}