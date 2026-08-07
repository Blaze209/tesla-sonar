package ry;

import android.graphics.Paint;
import com.henninghall.date_picker.l;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: loaded from: classes6.dex */
public class f extends g {
    public f(com.henninghall.date_picker.pickers.a aVar, l lVar) {
        super(aVar, lVar);
    }

    @Override // ry.g
    public String e() {
        return "LLLL";
    }

    @Override // ry.g
    public int f() {
        return 1;
    }

    @Override // ry.g
    public Paint.Align l() {
        return Paint.Align.LEFT;
    }

    @Override // ry.g
    public ArrayList<String> o() {
        ArrayList<String> arrayList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, 0);
        for (int i11 = 0; i11 <= 11; i11++) {
            arrayList.add(i(calendar));
            calendar.add(2, 1);
        }
        return arrayList;
    }

    @Override // ry.g
    public boolean v() {
        return this.f109243a.D() == ny.b.date;
    }

    @Override // ry.g
    public boolean w() {
        return true;
    }
}
