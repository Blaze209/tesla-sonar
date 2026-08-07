package com.google.gson.internal.sql;

import com.google.gson.JsonSyntaxException;
import com.google.gson.f;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
final class b extends x<Time> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final y f45000b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DateFormat f45001a;

    class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public <T> x<T> a(f fVar, com.google.gson.reflect.a<T> aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Time.class) {
                return new b(aVar2);
            }
            return null;
        }
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Time b(ex.a aVar) throws IOException {
        Time time;
        if (aVar.n0() == ex.b.NULL) {
            aVar.c0();
            return null;
        }
        String strO = aVar.O();
        synchronized (this) {
            TimeZone timeZone = this.f45001a.getTimeZone();
            try {
                try {
                    time = new Time(this.f45001a.parse(strO).getTime());
                    this.f45001a.setTimeZone(timeZone);
                } catch (ParseException e11) {
                    throw new JsonSyntaxException("Failed parsing '" + strO + "' as SQL Time; at path " + aVar.C(), e11);
                }
            } catch (Throwable th2) {
                this.f45001a.setTimeZone(timeZone);
                throw th2;
            }
        }
        return time;
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ex.c cVar, Time time) throws IOException {
        String str;
        if (time == null) {
            cVar.k0();
            return;
        }
        synchronized (this) {
            str = this.f45001a.format((Date) time);
        }
        cVar.O0(str);
    }

    private b() {
        this.f45001a = new SimpleDateFormat("hh:mm:ss a");
    }
}
