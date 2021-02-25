
class Processor {

    String str1, str2, type;

    public void setString1(String str1) {
        this.str1 = str1;
    }

    public void setString2(String str2) {
        this.str2 = str2;
    }

    public void detectOperation () {
        this.type = "unknown";
        StringHandler stringHandler = new StringHandler();
        String type1 = stringHandler.detectType(this.str1);
        String type2 = stringHandler.detectType(this.str2);
        if (type1.equals(type2)) {
           this.type = type2;
        }
    }

    public void doSum() {
                   switch (this.type) {
                case "integer":
                    IntegerOperation io = new IntegerOperation();
                    io.setString1(str1);
                    io.setString2(str2);
                    io.typeConvert();
                    io.doCombine();
                    System.out.println("Вы ввели два целых числа. Результат сложения : " + io.result);
                    break;
                case "boolean":
                    LogicOperation lo = new LogicOperation();
                    lo.setStr1(str1);
                    lo.setStr2(str2);
                    lo.doCombine();
                    System.out.println("Вы ввели утверждения. Результат сложения logic: " + lo.result);
                    break;
                case "string":
                    StringOperation so = new StringOperation();
                    so.setString1(str1);
                    so.setString2(str2);
                    so.doCombine();
                    System.out.println("Вы ввели строки. Результат сложения строк: " + so.result);
                    break;
                    default:
                           System.out.println("Для ваших данных не предусмотрено операции");
                           break;
            }


        }
    }
