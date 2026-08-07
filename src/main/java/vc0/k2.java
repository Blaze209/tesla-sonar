package vc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBM\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JS\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b \u0010\u0016R\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b\"\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b#\u0010\u0016¨\u0006$"}, d2 = {"Lvc0/k2;", "Lcom/squareup/wire/f;", "", "", "os_version_major", "os_version_minor", "os_version_patch", "app_version_major", "app_version_minor", "app_version_patch", "Lokio/k;", "unknownFields", "<init>", "(IIIIIILokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(IIIIIILokio/k;)Lvc0/k2;", "I", "f", "b", "g", "c", "h", DateTokenConverter.CONVERTER_KEY, "e", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k2 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ProtoAdapter<k2> f118795h = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(k2.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "osVersionMajor", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final int os_version_major;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "osVersionMinor", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final int os_version_minor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "osVersionPatch", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final int os_version_patch;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "appVersionMajor", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final int app_version_major;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "appVersionMinor", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final int app_version_minor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "appVersionPatch", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int app_version_patch;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"vc0/k2$a", "Lcom/squareup/wire/ProtoAdapter;", "Lvc0/k2;", "value", "", "c", "(Lvc0/k2;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lvc0/k2;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lvc0/k2;", DateTokenConverter.CONVERTER_KEY, "(Lvc0/k2;)Lvc0/k2;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<k2> {
        a(com.squareup.wire.b bVar, co0.d<k2> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/VCSEC.PhoneVersionInfo", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k2 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            int iIntValue4 = 0;
            int iIntValue5 = 0;
            int iIntValue6 = 0;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new k2(iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        iIntValue = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 2:
                        iIntValue2 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 3:
                        iIntValue3 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 4:
                        iIntValue4 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 5:
                        iIntValue5 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    case 6:
                        iIntValue6 = ProtoAdapter.UINT32.decode(reader).intValue();
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, k2 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getOs_version_major() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 1, Integer.valueOf(value.getOs_version_major()));
            }
            if (value.getOs_version_minor() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 2, Integer.valueOf(value.getOs_version_minor()));
            }
            if (value.getOs_version_patch() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, Integer.valueOf(value.getOs_version_patch()));
            }
            if (value.getApp_version_major() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 4, Integer.valueOf(value.getApp_version_major()));
            }
            if (value.getApp_version_minor() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 5, Integer.valueOf(value.getApp_version_minor()));
            }
            if (value.getApp_version_patch() != 0) {
                ProtoAdapter.UINT32.encodeWithTag(writer, 6, Integer.valueOf(value.getApp_version_patch()));
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(k2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getOs_version_major() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(1, Integer.valueOf(value.getOs_version_major()));
            }
            if (value.getOs_version_minor() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(value.getOs_version_minor()));
            }
            if (value.getOs_version_patch() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(3, Integer.valueOf(value.getOs_version_patch()));
            }
            if (value.getApp_version_major() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(value.getApp_version_major()));
            }
            if (value.getApp_version_minor() != 0) {
                iD += ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(value.getApp_version_minor()));
            }
            return value.getApp_version_patch() != 0 ? iD + ProtoAdapter.UINT32.encodedSizeWithTag(6, Integer.valueOf(value.getApp_version_patch())) : iD;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public k2 redact(k2 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return k2.b(value, 0, 0, 0, 0, 0, 0, okio.k.f97943e, 63, null);
        }
    }

    public k2() {
        this(0, 0, 0, 0, 0, 0, null, 127, null);
    }

    public static /* synthetic */ k2 b(k2 k2Var, int i11, int i12, int i13, int i14, int i15, int i16, okio.k kVar, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i11 = k2Var.os_version_major;
        }
        if ((i17 & 2) != 0) {
            i12 = k2Var.os_version_minor;
        }
        if ((i17 & 4) != 0) {
            i13 = k2Var.os_version_patch;
        }
        if ((i17 & 8) != 0) {
            i14 = k2Var.app_version_major;
        }
        if ((i17 & 16) != 0) {
            i15 = k2Var.app_version_minor;
        }
        if ((i17 & 32) != 0) {
            i16 = k2Var.app_version_patch;
        }
        if ((i17 & 64) != 0) {
            kVar = k2Var.unknownFields();
        }
        int i18 = i16;
        okio.k kVar2 = kVar;
        int i19 = i15;
        int i21 = i13;
        return k2Var.a(i11, i12, i21, i14, i19, i18, kVar2);
    }

    public final k2 a(int os_version_major, int os_version_minor, int os_version_patch, int app_version_major, int app_version_minor, int app_version_patch, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new k2(os_version_major, os_version_minor, os_version_patch, app_version_major, app_version_minor, app_version_patch, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getApp_version_major() {
        return this.app_version_major;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getApp_version_minor() {
        return this.app_version_minor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getApp_version_patch() {
        return this.app_version_patch;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), k2Var.unknownFields()) && this.os_version_major == k2Var.os_version_major && this.os_version_minor == k2Var.os_version_minor && this.os_version_patch == k2Var.os_version_patch && this.app_version_major == k2Var.app_version_major && this.app_version_minor == k2Var.app_version_minor && this.app_version_patch == k2Var.app_version_patch;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getOs_version_major() {
        return this.os_version_major;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getOs_version_minor() {
        return this.os_version_minor;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getOs_version_patch() {
        return this.os_version_patch;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + Integer.hashCode(this.os_version_major)) * 37) + Integer.hashCode(this.os_version_minor)) * 37) + Integer.hashCode(this.os_version_patch)) * 37) + Integer.hashCode(this.app_version_major)) * 37) + Integer.hashCode(this.app_version_minor)) * 37) + Integer.hashCode(this.app_version_patch);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m815newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("os_version_major=" + this.os_version_major);
        arrayList.add("os_version_minor=" + this.os_version_minor);
        arrayList.add("os_version_patch=" + this.os_version_patch);
        arrayList.add("app_version_major=" + this.app_version_major);
        arrayList.add("app_version_minor=" + this.app_version_minor);
        arrayList.add("app_version_patch=" + this.app_version_patch);
        return p013kotlin.collections.v.y0(arrayList, ", ", "PhoneVersionInfo{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ k2(int i11, int i12, int i13, int i14, int i15, int i16, okio.k kVar, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i11, (i17 & 2) != 0 ? 0 : i12, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) != 0 ? 0 : i14, (i17 & 16) != 0 ? 0 : i15, (i17 & 32) != 0 ? 0 : i16, (i17 & 64) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m815newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(int i11, int i12, int i13, int i14, int i15, int i16, okio.k unknownFields) {
        super(f118795h, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.os_version_major = i11;
        this.os_version_minor = i12;
        this.os_version_patch = i13;
        this.app_version_major = i14;
        this.app_version_minor = i15;
        this.app_version_patch = i16;
    }
}
