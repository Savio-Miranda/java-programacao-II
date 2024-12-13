package validadorCPF;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CPF {
    private String cpf;
    
    public CPF(String cpf) throws Exception{
        if (!validateAmountOfNumbers(cpf)){
            throw new Exception("CPF INVÁLIDO: FORMATO INVÁLIDO");
        }     
        if (!validateCPF(cpf)){
            throw new Exception("CPF INVÁLIDO: CÁLCULO INCORRETO");
        } else {
            this.cpf = cpf;
        }
    }

    private boolean validateAmountOfNumbers(String cpf){
        String padrao = "[0-9]{11}";
        Pattern pattern = Pattern.compile(padrao);
        Matcher matcher = pattern.matcher(cpf);
        return matcher.find();
    }

    private ArrayList<Integer> getNumbersAsIntegers(String cpf){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (char number : cpf.toCharArray()) {
            numbers.add(Integer.parseInt(String.valueOf(number)));
        }
        return numbers;
    }

    private boolean validateCPF(String cpf){
        ArrayList<Integer> numbers = getNumbersAsIntegers(cpf);
        int sum = 0;
        int digitVerifier;
        for (int i = 2; i > 0; i--){
            for (int j = 0; j < numbers.size() - i; j++) {
                sum += (j + 1) * numbers.get(j);
            }
            digitVerifier = (sum % 11 == 10) ? 0 : sum % 11;
            boolean isValid = numbers.get(numbers.size() - i) == digitVerifier;
            if (!isValid) {
                return false;
            }
            sum = 0;
        }
        return true;
    }

    public String getCPF(){
        return cpf;
    }
}
