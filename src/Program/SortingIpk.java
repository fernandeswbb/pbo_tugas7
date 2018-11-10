/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author Fernandes_WB
 */
import java.util.Comparator;
public class SortingIpk implements Comparator<Mahasiswa>{
    @Override
    public int compare(Mahasiswa a, Mahasiswa b) {
        return Float.compare(a.getIpk(), b.getIpk());
    }
}