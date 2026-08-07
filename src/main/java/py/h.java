package py;

import android.view.View;
import com.henninghall.date_picker.l;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes6.dex */
public class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f104084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f104085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f104086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f104087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f104088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Set<e> f104089f = new HashSet();

    h(j jVar, l lVar, f fVar, View view) {
        this.f104084a = jVar;
        this.f104086c = fVar;
        this.f104085b = lVar;
        this.f104087d = view;
    }

    private boolean c() {
        SimpleDateFormat simpleDateFormatE = e();
        String strR = this.f104084a.r();
        try {
            simpleDateFormatE.setLenient(false);
            simpleDateFormatE.parse(strR);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    private Calendar d() {
        SimpleDateFormat simpleDateFormatE = e();
        simpleDateFormatE.setLenient(false);
        for (int i11 = 0; i11 < 10; i11++) {
            try {
                String strS = this.f104084a.s(i11);
                Calendar calendar = Calendar.getInstance(this.f104085b.H());
                calendar.setTime(simpleDateFormatE.parse(strS));
                return calendar;
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    private SimpleDateFormat e() {
        TimeZone timeZoneH = this.f104085b.H();
        SimpleDateFormat simpleDateFormatC = this.f104086c.c();
        simpleDateFormatC.setTimeZone(timeZoneH);
        return simpleDateFormatC;
    }

    private Calendar f() {
        SimpleDateFormat simpleDateFormatE = e();
        String strR = this.f104084a.r();
        Calendar calendar = Calendar.getInstance(this.f104085b.H());
        try {
            simpleDateFormatE.setLenient(true);
            calendar.setTime(simpleDateFormatE.parse(strR));
            return calendar;
        } catch (ParseException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // py.g
    public void a(ry.g gVar) {
        if (this.f104084a.A()) {
            return;
        }
        if (!c()) {
            Calendar calendarD = d();
            if (calendarD != null) {
                this.f104086c.b(calendarD);
                return;
            }
            return;
        }
        Calendar calendarF = f();
        if (calendarF == null) {
            return;
        }
        Calendar calendarB = this.f104085b.B();
        if (calendarB != null && calendarF.before(calendarB)) {
            this.f104086c.b(calendarB);
            return;
        }
        Calendar calendarA = this.f104085b.A();
        if (calendarA != null && calendarF.after(calendarA)) {
            this.f104086c.b(calendarA);
            return;
        }
        String strD = this.f104086c.d();
        this.f104086c.k(calendarF);
        com.henninghall.date_picker.e.e(calendarF, strD, this.f104085b.u(), this.f104087d);
    }

    @Override // py.g
    public void b(ry.g gVar) {
        d dVar = this.f104084a.A() ? d.spinning : d.idle;
        if (dVar.equals(this.f104088e)) {
            return;
        }
        this.f104088e = dVar;
        com.henninghall.date_picker.e.f(dVar, this.f104085b.u(), this.f104087d);
        Iterator<e> it = this.f104089f.iterator();
        while (it.hasNext()) {
            it.next().a(dVar);
        }
    }
}
