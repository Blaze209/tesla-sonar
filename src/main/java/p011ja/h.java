package p011ja;

import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u001cB;\b\u0000\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b\u001f\u0010\"R\u001a\u0010%\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lja/h;", "", "Lja/b0;", "type", "", "isNullable", "defaultValue", "defaultValuePresent", "unknownDefaultValuePresent", "<init>", "(Lja/b0;ZLjava/lang/Object;ZZ)V", "", "name", "Landroid/os/Bundle;", "bundle", "Ljn0/h0;", "e", "(Ljava/lang/String;Landroid/os/Bundle;)V", "f", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lja/b0;", "()Lja/b0;", "b", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "c", "isDefaultValuePresent", "isDefaultValueUnknown", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<Object> type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isNullable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultValuePresent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultValueUnknown;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object defaultValue;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, d2 = {"Lja/h$a;", "", "<init>", "()V", "T", "Lja/b0;", "type", "c", "(Lja/b0;)Lja/h$a;", "", "isNullable", "b", "(Z)Lja/h$a;", "Lja/h;", "a", "()Lja/h;", "Lja/b0;", "Z", "Ljava/lang/Object;", "defaultValue", DateTokenConverter.CONVERTER_KEY, "defaultValuePresent", "e", "unknownDefaultValuePresent", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private b0<Object> type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean isNullable;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Object defaultValue;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean defaultValuePresent;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean unknownDefaultValuePresent;

        public final h a() {
            b0<Object> b0VarA = this.type;
            if (b0VarA == null) {
                b0VarA = b0.INSTANCE.a(this.defaultValue);
                s.i(b0VarA, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
            }
            return new h(b0VarA, this.isNullable, this.defaultValue, this.defaultValuePresent, this.unknownDefaultValuePresent);
        }

        public final a b(boolean isNullable) {
            this.isNullable = isNullable;
            return this;
        }

        public final <T> a c(b0<T> type) {
            s.k(type, "type");
            this.type = type;
            return this;
        }
    }

    public h(b0<Object> type, boolean z11, Object obj, boolean z12, boolean z13) {
        s.k(type, "type");
        if (!type.getIsNullableAllowed() && z11) {
            throw new IllegalArgumentException((type.getName() + " does not allow nullable values").toString());
        }
        if (!z11 && z12 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + type.getName() + " has null value but is not nullable.").toString());
        }
        this.type = type;
        this.isNullable = z11;
        this.defaultValue = obj;
        this.isDefaultValuePresent = z12 || z13;
        this.isDefaultValueUnknown = z13;
    }

    public final b0<Object> a() {
        return this.type;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsDefaultValueUnknown() {
        return this.isDefaultValueUnknown;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    public final void e(String name, Bundle bundle) {
        Object obj;
        s.k(name, "name");
        s.k(bundle, "bundle");
        if (!this.isDefaultValuePresent || (obj = this.defaultValue) == null) {
            return;
        }
        this.type.h(bundle, name, obj);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && s.f(h.class, other.getClass())) {
            h hVar = (h) other;
            if (this.isNullable != hVar.isNullable || this.isDefaultValuePresent != hVar.isDefaultValuePresent || !s.f(this.type, hVar.type)) {
                return false;
            }
            Object obj = this.defaultValue;
            if (obj != null) {
                return s.f(obj, hVar.defaultValue);
            }
            if (hVar.defaultValue == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(String name, Bundle bundle) {
        s.k(name, "name");
        s.k(bundle, "bundle");
        if (!this.isNullable && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        try {
            this.type.a(bundle, name);
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        int iHashCode = ((((this.type.hashCode() * 31) + (this.isNullable ? 1 : 0)) * 31) + (this.isDefaultValuePresent ? 1 : 0)) * 31;
        Object obj = this.defaultValue;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append(" Type: " + this.type);
        sb2.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            sb2.append(" DefaultValue: " + this.defaultValue);
        }
        String string = sb2.toString();
        s.j(string, "sb.toString()");
        return string;
    }
}
