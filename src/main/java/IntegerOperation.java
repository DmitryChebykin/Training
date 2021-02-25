
class IntegerOperation implements CombineInput {

        String str1, str2;
        int result;
        int int1, int2;

        public void setString1(String str1) {
            this.str1 = str1;
        }

        public void setString2(String str2) {
            this.str2 = str2;
        }

        public void typeConvert() {
            try {
                this.int1 = Integer.parseInt(this.str1);
            } catch (NumberFormatException ex) {
                System.out.println("Не смог преобразовать первую строку в целое число");
            }
            try {
                this.int2 = Integer.parseInt(this.str2);
            } catch (NumberFormatException ex) {
                System.out.println("Не смог преобразовать втроую строку в целое число");
            }
        }

        @Override
        public void doCombine() {

            this.result = int1 + int2;
        }
    }
