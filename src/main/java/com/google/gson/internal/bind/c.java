package com.google.gson.internal.bind;

import bx.e0;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.JsonSyntaxException;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes5.dex */
public final class c<T extends Date> extends x<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f44880c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b<T> f44881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<DateFormat> f44882b;

    class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public <T> x<T> a(com.google.gson.f fVar, com.google.gson.reflect.a<T> aVar) {
            a aVar2 = null;
            if (aVar.getRawType() != Date.class) {
                return null;
            }
            int i11 = 2;
            return new c(b.f44883b, i11, i11, aVar2);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    }

    public static abstract class b<T extends Date> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b<Date> f44883b = new a(Date.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f44884a;

        class a extends b<Date> {
            a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.c.b
            protected Date d(Date date) {
                return date;
            }
        }

        protected b(Class<T> cls) {
            this.f44884a = cls;
        }

        private y c(c<T> cVar) {
            return p.b(this.f44884a, cVar);
        }

        public final y a(int i11, int i12) {
            return c(new c<>(this, i11, i12, null));
        }

        public final y b(String str) {
            return c(new c<>(this, str, (a) null));
        }

        protected abstract T d(Date date);
    }

    /* synthetic */ c(b bVar, int i11, int i12, a aVar) {
        this(bVar, i11, i12);
    }

    private Date e(ex.a aVar) throws IOException {
        String strO = aVar.O();
        synchronized (this.f44882b) {
            try {
                for (DateFormat dateFormat : this.f44882b) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            Date date = dateFormat.parse(strO);
                            dateFormat.setTimeZone(timeZone);
                            return date;
                        } catch (Throwable th2) {
                            dateFormat.setTimeZone(timeZone);
                            throw th2;
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    return cx.a.c(strO, new ParsePosition(0));
                } catch (ParseException e11) {
                    throw new JsonSyntaxException("Failed parsing '" + strO + "' as Date; at path " + aVar.C(), e11);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public T b(ex.a aVar) throws IOException {
        if (aVar.n0() == ex.b.NULL) {
            aVar.c0();
            return null;
        }
        return (T) this.f44881a.d(e(aVar));
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(ex.c cVar, Date date) throws IOException {
        String str;
        if (date == null) {
            cVar.k0();
            return;
        }
        DateFormat dateFormat = this.f44882b.get(0);
        synchronized (this.f44882b) {
            str = dateFormat.format(date);
        }
        cVar.O0(str);
    }

    public String toString() {
        DateFormat dateFormat = this.f44882b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* synthetic */ c(b bVar, String str, a aVar) {
        this(bVar, str);
    }

    private c(b<T> bVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f44882b = arrayList;
        Objects.requireNonNull(bVar);
        this.f44881a = bVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private c(b<T> bVar, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        this.f44882b = arrayList;
        Objects.requireNonNull(bVar);
        this.f44881a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i11, i12, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i11, i12));
        }
        if (bx.y.c()) {
            arrayList.add(e0.c(i11, i12));
        }
    }
}
