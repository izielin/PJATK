package PracticeLecture.PPJ27;

public class Main {
    public static void main(String[] args) {
        String[] texts = {
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam ut sollicitudin velit. Vestibulum sed ultrices diam. Curabitur et scelerisque erat. Sed ultrices augue quis sodales commodo. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Nullam ac lorem pharetra, molestie dolor id, eleifend nunc. Pellentesque mattis nisl eu magna auctor, eget vulputate risus sollicitudin. Ut dapibus, dui vel tempor venenatis, libero sapien bibendum lectus, nec pharetra tortor urna ut eros. Vestibulum non mauris ut mi dapibus pulvinar vitae sed arcu. Vestibulum nisl ex, congue feugiat magna egestas, auctor convallis lacus. Quisque lectus turpis, consequat nec massa tempor, consectetur venenatis dolor. Proin consectetur velit dui. Ut ut dictum est, vitae tempus quam. Nam lacinia diam tellus, id commodo lorem ultrices nec. Phasellus convallis, risus id placerat aliquam, libero purus imperdiet purus, et tristique mi tortor sed mauris.",
                "In hac habitasse platea dictumst. Nullam tincidunt ac diam venenatis pulvinar. Donec et nisi eget libero posuere tristique. Duis ac porttitor ipsum. Duis tincidunt dolor volutpat nunc hendrerit consequat. Duis ultrices feugiat elit at fringilla. Mauris lobortis, magna vel egestas auctor, tortor arcu tempor eros, sed rutrum neque ipsum at velit. Mauris posuere rutrum leo, vel fermentum enim iaculis sit amet.",
                "Suspendisse diam augue, malesuada ac tortor nec, elementum placerat diam. Vestibulum felis nisl, accumsan ac tincidunt eu, porta elementum ex. Cras eget sem dignissim, pellentesque felis non, aliquam augue. Nunc malesuada pharetra finibus. Cras vitae fringilla est, ut porttitor dui. Pellentesque non mi quis est vulputate elementum. Sed a diam at velit tristique suscipit. In eleifend eleifend nunc, eu auctor nunc egestas eu. Suspendisse gravida eu diam nec imperdiet.",
                "Suspendisse fringilla magna eu ligula finibus, vitae ultrices sem mollis. Fusce accumsan nibh at lectus faucibus pulvinar. Curabitur lectus dui, tristique id vulputate eu, molestie at tellus. Pellentesque neque augue, placerat quis felis a, ultricies efficitur erat. Donec lacus nulla, malesuada vel lorem ac, tempor condimentum lorem. Suspendisse ac semper erat, ac tincidunt ex. Aenean venenatis, felis ut vehicula vulputate, dui lorem tincidunt neque, a efficitur nulla eros eu tellus.",
                "Curabitur pretium ut libero non facilisis. Maecenas placerat ex tortor, eu faucibus urna mattis ut. Cras id dapibus diam, quis sodales turpis. In posuere viverra felis eget gravida. Nulla facilisi. Integer sollicitudin quis leo nec aliquam. Phasellus in mattis velit. Nulla venenatis nec velit feugiat eleifend. Aliquam euismod varius sem id luctus. Suspendisse scelerisque ipsum eget erat tincidunt, vel egestas dui blandit."
        };

        File[] files = new File[10];

        for (int i = 0; i < 10; i++) {
            int random = 1 + (int) (Math.random() * 3);
            if (random == 1) {
                File file = new File("Sprawa " + i, 20, texts[(int) (Math.random() * texts.length)]);
                files[i] = file;
            } else if (random == 2) {
                SecretFile file = new SecretFile("Sprawa " + i, 20, texts[(int) (Math.random() * texts.length)]);
                files[i] = file;
            } else {
                TopSecretFile file = new TopSecretFile("Sprawa " + i, 20, texts[(int) (Math.random() * texts.length)]);
                files[i] = file;
            }

        }

        for (File file : files) {
            file.show();
            System.out.println();
            System.out.println();
        }

    }

}

class File {
    String name;
    int pages;
    String text;

    public File(String name, int pages, String text) {
        this.name = name;
        this.pages = pages;
        this.text = text;
    }

    public void show() {
        System.out.print("czy masz dostęp?");
    }
}

class SecretFile extends File {
    public SecretFile(String name, int pages, String text) {
        super(name, pages, text);
    }

    @Override
    public void show() {
        String[] text = this.text.split(" ");
        for (int i = 0; i < text.length; i++) {
            if (i % 2 == 0) {
                System.out.print(text[i]);
            } else {
                for (int j = 0; j < text[i].length(); j++) {
                    System.out.print("*");
                }
            }
            System.out.print(" ");
        }
    }
}


class TopSecretFile extends File {
    public TopSecretFile(String name, int pages, String text) {
        super(name, pages, text);
    }

    @Override
    public void show() {
        String[] text = this.text.split(" ");
        for (int i = 0; i < text.length; i++) {
            if (i % 5 == 0) {
                System.out.print(text[i]);
            } else {
                for (int j = 0; j < text[i].length(); j++) {
                    System.out.print("*");
                }
            }
            System.out.print(" ");
        }
    }
}

