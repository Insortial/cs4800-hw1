package filesystem;

import java.util.ArrayList;
import java.util.HashMap;

public class Folder {
    private String name;
    private HashMap<String, Folder> subFolders;
    private ArrayList<File> files;

    public Folder()
    {
        this.subFolders = new HashMap<>();
        this.files = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void addFile(File file)
    {
        this.files.add(file);
    }

    public void addFolder(Folder folder)
    {
        this.subFolders.put(folder.getName(), folder);
    }

    public HashMap<String, Folder> getSubFolders()
    {
        return subFolders;
    }

    public ArrayList<File> getFiles()
    {
        return files;
    }

    public void printContents(int level)
    {
        for(int currLevel = 0; currLevel < level; currLevel++)
        {
            System.out.print("\t");
        }
        System.out.println("Folder: " + name);
        for (int i = 0; i < files.size(); i++)
        {
            for(int currLevel = 0; currLevel < level + 1; currLevel++)
            {
                System.out.print("\t");
            }
            System.out.print("\tfile:");
            System.out.println(files.get(i).getFilename());
        }
    }
}
