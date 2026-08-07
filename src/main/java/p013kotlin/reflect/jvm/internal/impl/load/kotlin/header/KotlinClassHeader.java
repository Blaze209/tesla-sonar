package p013kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import bo0.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import on0.a;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;

/* JADX INFO: loaded from: classes9.dex */
public final class KotlinClassHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Kind f87613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JvmMetadataVersion f87614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f87615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f87616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f87617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f87618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f87619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f87620h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f87621i;

    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);

        private static final Map<Integer, Kind> entryById;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f87622id;
        private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Kind getById(int i11) {
                Kind kind = (Kind) Kind.entryById.get(Integer.valueOf(i11));
                return kind == null ? Kind.UNKNOWN : kind;
            }

            private Companion() {
            }
        }

        static {
            Kind[] kindArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(kindArrValues.length), 16));
            for (Kind kind : kindArrValues) {
                linkedHashMap.put(Integer.valueOf(kind.f87622id), kind);
            }
            entryById = linkedHashMap;
        }

        Kind(int i11) {
            this.f87622id = i11;
        }

        public static final Kind getById(int i11) {
            return Companion.getById(i11);
        }
    }

    public KotlinClassHeader(Kind kind, JvmMetadataVersion metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i11, String str2, byte[] bArr) {
        s.k(kind, "kind");
        s.k(metadataVersion, "metadataVersion");
        this.f87613a = kind;
        this.f87614b = metadataVersion;
        this.f87615c = strArr;
        this.f87616d = strArr2;
        this.f87617e = strArr3;
        this.f87618f = str;
        this.f87619g = i11;
        this.f87620h = str2;
        this.f87621i = bArr;
    }

    private final boolean a(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    public final String[] getData() {
        return this.f87615c;
    }

    public final String[] getIncompatibleData() {
        return this.f87616d;
    }

    public final Kind getKind() {
        return this.f87613a;
    }

    public final JvmMetadataVersion getMetadataVersion() {
        return this.f87614b;
    }

    public final String getMultifileClassName() {
        String str = this.f87618f;
        if (this.f87613a == Kind.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public final List<String> getMultifilePartNames() {
        String[] strArr = this.f87615c;
        if (this.f87613a != Kind.MULTIFILE_CLASS) {
            strArr = null;
        }
        List<String> listH = strArr != null ? p013kotlin.collections.n.h(strArr) : null;
        return listH == null ? v.m() : listH;
    }

    public final String[] getStrings() {
        return this.f87617e;
    }

    public final boolean isPreRelease() {
        return a(this.f87619g, 2);
    }

    public final boolean isUnstableJvmIrBinary() {
        return a(this.f87619g, 16) && !a(this.f87619g, 32);
    }

    public String toString() {
        return this.f87613a + " version=" + this.f87614b;
    }
}
