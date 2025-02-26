package memento;
import java.util.LinkedList;


public class TextEditor {
    private String[] sheat;
    private String[] contentBuffer = {"", "", ""};
    LinkedList<String> buffer = new LinkedList<String>();
    private int[] indexBuffer = {0, 0, 0};
    private int sheatPointer = -1;
    private int bufferPointer = 0;

    TextEditor(String[] sheat){
        this.sheat = sheat;
    }

    public String[] getSheat() {
        return sheat;
    }

    public void writeOnSheat(int index, String content){
        if (index < sheat.length || index > 0){
            saveStateBeforeChange(sheatPointer);
            sheat[index] = content;
            sheatPointer = index;
        } else {
            throw new IndexOutOfBoundsException("Está escrevendo fora da página");
        }
    }

    public void writeOnSheat(String content){
        if (sheatPointer < 0)
            saveStateBeforeChange(sheatPointer + 1);
        
        saveStateBeforeChange(bufferPointer);
        if (sheatPointer == sheat.length - 1) {
            sheat[sheatPointer] = content;
        } else {
            sheat[sheatPointer + 1] = content;
            sheatPointer++;
        }
    }

    public void showSheat(){
        for (String content : sheat) {
            System.out.println(content);
        }
        System.out.println("Fim." + "\n");
    }

    public void mementoZ(){
        // System.out.println("Ponteiro do buffer: " + bufferPointer);
        System.out.println("Ctrl Z...");
        sheat[sheatPointer] = contentBuffer[bufferPointer];
        sheat[bufferPointer] = contentBuffer[bufferPointer + 1];
    }

    private void saveStateBeforeChange(int index){
        buffer.add(sheat[index]);
        if (bufferPointer == indexBuffer.length - 1){
            bufferPointer = 0;
        } else {
            bufferPointer ++;
        }
    }

}