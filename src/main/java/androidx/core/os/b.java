package androidx.core.os;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f7633a;

    b(Object obj) {
        this.f7633a = (LocaleList) obj;
    }

    @Override // androidx.core.os.a
    public String a() {
        return this.f7633a.toLanguageTags();
    }

    @Override // androidx.core.os.a
    public Object b() {
        return this.f7633a;
    }

    public boolean equals(Object obj) {
        return this.f7633a.equals(((a) obj).b());
    }

    @Override // androidx.core.os.a
    public Locale get(int i11) {
        return this.f7633a.get(i11);
    }

    public int hashCode() {
        return this.f7633a.hashCode();
    }

    @Override // androidx.core.os.a
    public boolean isEmpty() {
        return this.f7633a.isEmpty();
    }

    @Override // androidx.core.os.a
    public int size() {
        return this.f7633a.size();
    }

    public String toString() {
        return this.f7633a.toString();
    }
}
