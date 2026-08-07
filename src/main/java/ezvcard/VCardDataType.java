package ezvcard;

import com.google.android.gms.common.internal.ImagesContract;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import xj0.c;

/* JADX INFO: loaded from: classes8.dex */
public class VCardDataType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ezvcard.util.a<VCardDataType, String> f63491b = new a(VCardDataType.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @c({VCardVersion.V2_1})
    public static final VCardDataType f63492c = new VCardDataType(ImagesContract.URL);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @c({VCardVersion.V2_1})
    public static final VCardDataType f63493d = new VCardDataType("content-id");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @c({VCardVersion.V3_0})
    public static final VCardDataType f63494e = new VCardDataType("binary");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @c({VCardVersion.V3_0, VCardVersion.V4_0})
    public static final VCardDataType f63495f = new VCardDataType("uri");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final VCardDataType f63496g = new VCardDataType("text");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @c({VCardVersion.V3_0, VCardVersion.V4_0})
    public static final VCardDataType f63497h = new VCardDataType(InquiryField.DateField.TYPE);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @c({VCardVersion.V3_0, VCardVersion.V4_0})
    public static final VCardDataType f63498i = new VCardDataType("time");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @c({VCardVersion.V3_0, VCardVersion.V4_0})
    public static final VCardDataType f63499j = new VCardDataType("date-time");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @c({VCardVersion.V4_0})
    public static final VCardDataType f63500k = new VCardDataType("date-and-or-time");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @c({VCardVersion.V4_0})
    public static final VCardDataType f63501l = new VCardDataType("timestamp");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @c({VCardVersion.V4_0})
    public static final VCardDataType f63502m = new VCardDataType(InquiryField.BooleanField.TYPE);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @c({VCardVersion.V4_0})
    public static final VCardDataType f63503n = new VCardDataType(InquiryField.IntegerField.TYPE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @c({VCardVersion.V4_0})
    public static final VCardDataType f63504o = new VCardDataType(InquiryField.FloatField.TYPE);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @c({VCardVersion.V4_0})
    public static final VCardDataType f63505p = new VCardDataType("utc-offset");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @c({VCardVersion.V4_0})
    public static final VCardDataType f63506q = new VCardDataType("language-tag");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63507a;

    static class a extends ezvcard.util.a<VCardDataType, String> {
        a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ezvcard.util.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public VCardDataType c(String str) {
            return new VCardDataType(str, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ezvcard.util.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean h(VCardDataType vCardDataType, String str) {
            return vCardDataType.f63507a.equalsIgnoreCase(str);
        }
    }

    /* synthetic */ VCardDataType(String str, a aVar) {
        this(str);
    }

    public static Collection<VCardDataType> b() {
        return f63491b.a();
    }

    public static VCardDataType c(String str) {
        return f63491b.d(str);
    }

    public static VCardDataType d(String str) {
        return f63491b.e(str);
    }

    public String e() {
        return this.f63507a;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public VCardVersion[] f() {
        for (Field field : getClass().getFields()) {
            if (Modifier.isStatic(field.getModifiers())) {
                try {
                    if (field.get(null) == this) {
                        c cVar = (c) field.getAnnotation(c.class);
                        return cVar == null ? VCardVersion.values() : cVar.value();
                    }
                } catch (IllegalAccessException | IllegalArgumentException unused) {
                    continue;
                }
            }
        }
        return VCardVersion.values();
    }

    public boolean g(VCardVersion vCardVersion) {
        for (VCardVersion vCardVersion2 : f()) {
            if (vCardVersion2 == vCardVersion) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return this.f63507a;
    }

    private VCardDataType(String str) {
        this.f63507a = str;
    }
}
