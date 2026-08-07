package com.auth0.android.jwt;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.gson.g;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f20273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f20274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f20275d;

    static class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i11) {
            return new d[i11];
        }
    }

    class b extends com.google.gson.reflect.a<Map<String, String>> {
        b() {
        }
    }

    public d(@NonNull String str) {
        b(str);
        this.f20272a = str;
    }

    private String a(String str) {
        try {
            return new String(Base64.decode(str, 11), Charset.defaultCharset());
        } catch (IllegalArgumentException e11) {
            throw new DecodeException("Received bytes didn't correspond to a valid Base64 encoded string.", e11);
        }
    }

    private void b(String str) {
        String[] strArrI = i(str);
        this.f20273b = (Map) h(a(strArrI[0]), new b().getType());
        this.f20274c = (f) h(a(strArrI[1]), f.class);
        this.f20275d = strArrI[2];
    }

    static com.google.gson.f e() {
        return new g().d(f.class, new e()).b();
    }

    private <T> T h(String str, Type type) {
        try {
            return (T) e().k(str, type);
        } catch (Exception e11) {
            throw new DecodeException("The token's payload had an invalid JSON format.", e11);
        }
    }

    private String[] i(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 2 && str.endsWith(".")) {
            strArrSplit = new String[]{strArrSplit[0], strArrSplit[1], ""};
        }
        if (strArrSplit.length == 3) {
            return strArrSplit;
        }
        throw new DecodeException(String.format("The token was expected to have 3 parts, but got %s.", Integer.valueOf(strArrSplit.length)));
    }

    @NonNull
    public com.auth0.android.jwt.b c(@NonNull String str) {
        return this.f20274c.a(str);
    }

    public Date d() {
        return this.f20274c.f20279c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String f() {
        return this.f20274c.f20277a;
    }

    public boolean g(long j11) {
        if (j11 < 0) {
            throw new IllegalArgumentException("The leeway must be a positive value.");
        }
        long jFloor = (long) (Math.floor(new Date().getTime() / 1000) * 1000.0d);
        long j12 = j11 * 1000;
        Date date = new Date(jFloor + j12);
        Date date2 = new Date(jFloor - j12);
        Date date3 = this.f20274c.f20279c;
        boolean z11 = date3 == null || !date2.after(date3);
        Date date4 = this.f20274c.f20281e;
        return (z11 && (date4 == null || !date.before(date4))) ? false : true;
    }

    public String toString() {
        return this.f20272a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f20272a);
    }
}
