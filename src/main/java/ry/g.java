package ry;

import android.graphics.Paint;
import com.henninghall.date_picker.l;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final l f109243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Calendar f109244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<String> f109245c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.henninghall.date_picker.pickers.a f109246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SimpleDateFormat f109247e;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f109248a;

        static {
            int[] iArr = new int[ny.b.values().length];
            f109248a = iArr;
            try {
                iArr[ny.b.date.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f109248a[ny.b.time.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f109248a[ny.b.datetime.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(com.henninghall.date_picker.pickers.a aVar, l lVar) {
        this.f109243a = lVar;
        this.f109246d = aVar;
        this.f109247e = new SimpleDateFormat(e(), lVar.y());
        aVar.setTextAlign(l());
        aVar.setWrapSelectorWheel(w());
    }

    private String[] c(ArrayList<String> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(t(it.next()));
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }

    private SimpleDateFormat d(Locale locale) {
        return new SimpleDateFormat(e(), locale);
    }

    private int g() {
        return this.f109246d.getValue();
    }

    private int h(Calendar calendar) {
        this.f109247e.setTimeZone(this.f109243a.H());
        return this.f109245c.indexOf(this.f109247e.format(calendar.getTime()));
    }

    private String k(Calendar calendar, Locale locale) {
        return d(locale).format(calendar.getTime());
    }

    private void p() {
        this.f109246d.setMinValue(0);
        this.f109246d.setMaxValue(0);
        ArrayList<String> arrayListO = o();
        this.f109245c = arrayListO;
        this.f109246d.setDisplayedValues(c(arrayListO));
        this.f109246d.setMaxValue(this.f109245c.size() - 1);
    }

    public void a(Calendar calendar) {
        this.f109246d.c(h(calendar));
    }

    public String b() {
        return t(n(g()));
    }

    public abstract String e();

    public int f() {
        ny.b bVarD = this.f109243a.D();
        if (this.f109243a.f45233q.h()) {
            return 10;
        }
        return a.f109248a[bVarD.ordinal()] != 1 ? 5 : 15;
    }

    String i(Calendar calendar) {
        return k(calendar, this.f109243a.y());
    }

    public String j(int i11) {
        if (!v()) {
            return this.f109247e.format(this.f109244b.getTime());
        }
        int size = this.f109245c.size();
        return n(((g() + size) - i11) % size);
    }

    public abstract Paint.Align l();

    public String m() {
        return !v() ? this.f109247e.format(this.f109244b.getTime()) : n(g());
    }

    public String n(int i11) {
        return this.f109245c.get(i11);
    }

    public abstract ArrayList<String> o();

    public void q() {
        this.f109247e = new SimpleDateFormat(e(), this.f109243a.y());
        if (v()) {
            p();
        }
    }

    public void r() {
        this.f109246d.setItemPaddingHorizontal(f());
    }

    public void s(Calendar calendar) {
        this.f109247e.setTimeZone(this.f109243a.H());
        this.f109244b = calendar;
        int iH = h(calendar);
        if (iH > -1) {
            if (this.f109246d.getValue() == 0) {
                this.f109246d.setValue(iH);
            } else {
                this.f109246d.c(iH);
            }
        }
    }

    public void u() {
        this.f109246d.setVisibility(v() ? 0 : 8);
    }

    public abstract boolean v();

    public abstract boolean w();

    public String t(String str) {
        return str;
    }
}
