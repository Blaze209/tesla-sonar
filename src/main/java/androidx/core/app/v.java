package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import ch.qos.logback.core.joran.action.Action;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    CharSequence f7602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    IconCompat f7603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f7604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f7605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f7606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f7607f;

    static class a {
        static Person a(v vVar) {
            return new Person.Builder().setName(vVar.c()).setIcon(vVar.a() != null ? vVar.a().n() : null).setUri(vVar.d()).setKey(vVar.b()).setBot(vVar.e()).setImportant(vVar.f()).build();
        }
    }

    public IconCompat a() {
        return this.f7603b;
    }

    public String b() {
        return this.f7605d;
    }

    public CharSequence c() {
        return this.f7602a;
    }

    public String d() {
        return this.f7604c;
    }

    public boolean e() {
        return this.f7606e;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        String strB = b();
        String strB2 = vVar.b();
        if (strB == null && strB2 == null) {
            return Objects.equals(Objects.toString(c()), Objects.toString(vVar.c())) && Objects.equals(d(), vVar.d()) && Boolean.valueOf(e()).equals(Boolean.valueOf(vVar.e())) && Boolean.valueOf(f()).equals(Boolean.valueOf(vVar.f()));
        }
        return Objects.equals(strB, strB2);
    }

    public boolean f() {
        return this.f7607f;
    }

    public String g() {
        String str = this.f7604c;
        if (str != null) {
            return str;
        }
        if (this.f7602a == null) {
            return "";
        }
        return "name:" + ((Object) this.f7602a);
    }

    public Person h() {
        return a.a(this);
    }

    public int hashCode() {
        String strB = b();
        return strB != null ? strB.hashCode() : Objects.hash(c(), d(), Boolean.valueOf(e()), Boolean.valueOf(f()));
    }

    public Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f7602a);
        IconCompat iconCompat = this.f7603b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m() : null);
        bundle.putString("uri", this.f7604c);
        bundle.putString(Action.KEY_ATTRIBUTE, this.f7605d);
        bundle.putBoolean("isBot", this.f7606e);
        bundle.putBoolean("isImportant", this.f7607f);
        return bundle;
    }
}
