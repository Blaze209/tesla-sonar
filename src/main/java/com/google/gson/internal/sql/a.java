package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import com.google.gson.f;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
final class a extends x<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final y f44998b = new C0704a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f44999a;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    class C0704a implements y {
        C0704a() {
        }

        @Override // com.google.gson.y
        public <T> x<T> a(f fVar, com.google.gson.reflect.a<T> aVar) {
            C0704a c0704a = null;
            if (aVar.getRawType() == Date.class) {
                return new a(c0704a);
            }
            return null;
        }
    }

    /* synthetic */ a(C0704a c0704a) {
        this();
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Date b(ex.a aVar) throws IOException {
        Date date;
        if (aVar.n0() == ex.b.NULL) {
            aVar.c0();
            return null;
        }
        String strO = aVar.O();
        synchronized (this) {
            TimeZone timeZone = this.f44999a.getTimeZone();
            try {
                try {
                    date = new Date(this.f44999a.parse(strO).getTime());
                    this.f44999a.setTimeZone(timeZone);
                } catch (ParseException e11) {
                    throw new JsonSyntaxException("Failed parsing '" + strO + "' as SQL Date; at path " + aVar.C(), e11);
                }
            } catch (Throwable th2) {
                this.f44999a.setTimeZone(timeZone);
                throw th2;
            }
        }
        return date;
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ex.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.k0();
            return;
        }
        synchronized (this) {
            str = this.f44999a.format((java.util.Date) date);
        }
        cVar.O0(str);
    }

    private a() {
        this.f44999a = new SimpleDateFormat("MMM d, yyyy");
    }
}
