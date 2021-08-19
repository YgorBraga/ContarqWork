package moveis;

import java.util.ArrayList;

public class Functions {

    public boolean checkValues(ArrayList data){
        int aux = 0;
        for(int i = 0;i < data.size(); i++){
            if((int)data.get(i) == 2){
                aux++;
            }
        }
        if(aux == data.size()){
            return true;
        }
        return false;
    }
}
