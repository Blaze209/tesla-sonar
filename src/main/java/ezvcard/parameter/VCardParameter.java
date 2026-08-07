package ezvcard.parameter;

import ezvcard.VCardVersion;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes8.dex */
public class VCardParameter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f63612a;

    public VCardParameter(String str) {
        this(str, false);
    }

    public VCardVersion[] a() {
        for (Field field : getClass().getFields()) {
            if (Modifier.isStatic(field.getModifiers())) {
                try {
                    if (field.get(null) == this) {
                        xj0.c cVar = (xj0.c) field.getAnnotation(xj0.c.class);
                        return cVar == null ? VCardVersion.values() : cVar.value();
                    }
                } catch (IllegalAccessException | IllegalArgumentException unused) {
                    continue;
                }
            }
        }
        return VCardVersion.values();
    }

    public String b() {
        return this.f63612a;
    }

    public boolean c(VCardVersion vCardVersion) {
        for (VCardVersion vCardVersion2 : a()) {
            if (vCardVersion2 == vCardVersion) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VCardParameter vCardParameter = (VCardParameter) obj;
        String str = this.f63612a;
        if (str == null) {
            if (vCardParameter.f63612a != null) {
                return false;
            }
        } else if (!str.equals(vCardParameter.f63612a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f63612a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return this.f63612a;
    }

    protected VCardParameter(String str, boolean z11) {
        if (str != null && !z11) {
            str = str.toLowerCase();
        }
        this.f63612a = str;
    }
}
