package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import ezvcard.property.Gender;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\u0018\u0000 02\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u007f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0085\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b*\u0010)R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b&\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010.R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u00101\u001a\u0004\b/\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b3\u00102R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u00101\u001a\u0004\b+\u00102¨\u00064"}, d2 = {"Lgc0/p0;", "Lcom/squareup/wire/f;", "", "", "active_OBSOLETE", "pin_code_set_OBSOLETE", "", "max_limit_mph_OBSOLETE", "min_limit_mph_OBSOLETE", "current_limit_mph_OBSOLETE", "active", "pin_code_set", "max_limit_mph", "min_limit_mph", "current_limit_mph", "Lokio/k;", "unknownFields", "<init>", "(ZZFFFLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(ZZFFFLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lokio/k;)Lgc0/p0;", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "b", "l", "c", Gender.FEMALE, "h", "()F", "j", "e", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "g", "k", "Ljava/lang/Float;", "()Ljava/lang/Float;", IntegerTokenConverter.CONVERTER_KEY, "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p0 extends com.squareup.wire.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ProtoAdapter<p0> f68303l = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(p0.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "activeOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final boolean active_OBSOLETE;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "pinCodeSetOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final boolean pin_code_set_OBSOLETE;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "maxLimitMphOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final float max_limit_mph_OBSOLETE;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "minLimitMphOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final float min_limit_mph_OBSOLETE;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "currentLimitMphOBSOLETE", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final float current_limit_mph_OBSOLETE;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 103)
    private final Boolean active;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "pinCodeSet", tag = 104)
    private final Boolean pin_code_set;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "maxLimitMph", tag = 106)
    private final Float max_limit_mph;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "minLimitMph", tag = 107)
    private final Float min_limit_mph;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "currentLimitMph", tag = 108)
    private final Float current_limit_mph;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/p0$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/p0;", "value", "", "c", "(Lgc0/p0;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/p0;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/p0;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/p0;)Lgc0/p0;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<p0> {
        a(com.squareup.wire.b bVar, co0.d<p0> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.SpeedLimitMode", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            Boolean boolDecode = null;
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            float fFloatValue = 0.0f;
            float fFloatValue2 = 0.0f;
            float fFloatValue3 = 0.0f;
            Boolean boolDecode2 = null;
            Float fDecode = null;
            Float fDecode2 = null;
            Float fDecode3 = null;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new p0(zBooleanValue, zBooleanValue2, fFloatValue, fFloatValue2, fFloatValue3, boolDecode, boolDecode2, fDecode, fDecode2, fDecode3, reader.e(jD));
                }
                if (iG == 3) {
                    zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG == 4) {
                    zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                } else if (iG == 6) {
                    fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                } else if (iG == 7) {
                    fFloatValue2 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                } else if (iG == 8) {
                    fFloatValue3 = ProtoAdapter.FLOAT.decode(reader).floatValue();
                } else if (iG == 103) {
                    boolDecode = ProtoAdapter.BOOL.decode(reader);
                } else if (iG != 104) {
                    switch (iG) {
                        case 106:
                            fDecode = ProtoAdapter.FLOAT.decode(reader);
                            break;
                        case 107:
                            fDecode2 = ProtoAdapter.FLOAT.decode(reader);
                            break;
                        case 108:
                            fDecode3 = ProtoAdapter.FLOAT.decode(reader);
                            break;
                        default:
                            reader.m(iG);
                            break;
                    }
                } else {
                    boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, p0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            if (value.getActive_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, Boolean.valueOf(value.getActive_OBSOLETE()));
            }
            if (value.getPin_code_set_OBSOLETE()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, Boolean.valueOf(value.getPin_code_set_OBSOLETE()));
            }
            if (value.getMax_limit_mph_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 6, Float.valueOf(value.getMax_limit_mph_OBSOLETE()));
            }
            if (value.getMin_limit_mph_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 7, Float.valueOf(value.getMin_limit_mph_OBSOLETE()));
            }
            if (value.getCurrent_limit_mph_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                ProtoAdapter.FLOAT.encodeWithTag(writer, 8, Float.valueOf(value.getCurrent_limit_mph_OBSOLETE()));
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(writer, 103, value.getActive());
            protoAdapter.encodeWithTag(writer, 104, value.getPin_code_set());
            ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
            protoAdapter2.encodeWithTag(writer, 106, value.getMax_limit_mph());
            protoAdapter2.encodeWithTag(writer, 107, value.getMin_limit_mph());
            protoAdapter2.encodeWithTag(writer, 108, value.getCurrent_limit_mph());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(p0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            if (value.getActive_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getActive_OBSOLETE()));
            }
            if (value.getPin_code_set_OBSOLETE()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(4, Boolean.valueOf(value.getPin_code_set_OBSOLETE()));
            }
            if (value.getMax_limit_mph_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(6, Float.valueOf(value.getMax_limit_mph_OBSOLETE()));
            }
            if (value.getMin_limit_mph_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(7, Float.valueOf(value.getMin_limit_mph_OBSOLETE()));
            }
            if (value.getCurrent_limit_mph_OBSOLETE() != BitmapDescriptorFactory.HUE_RED) {
                iD += ProtoAdapter.FLOAT.encodedSizeWithTag(8, Float.valueOf(value.getCurrent_limit_mph_OBSOLETE()));
            }
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = iD + protoAdapter.encodedSizeWithTag(103, value.getActive()) + protoAdapter.encodedSizeWithTag(104, value.getPin_code_set());
            ProtoAdapter<Float> protoAdapter2 = ProtoAdapter.FLOAT;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(106, value.getMax_limit_mph()) + protoAdapter2.encodedSizeWithTag(107, value.getMin_limit_mph()) + protoAdapter2.encodedSizeWithTag(108, value.getCurrent_limit_mph());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p0 redact(p0 value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            return p0.b(value, false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, okio.k.f97943e, 1023, null);
        }
    }

    public p0() {
        this(false, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ p0 b(p0 p0Var, boolean z11, boolean z12, float f11, float f12, float f13, Boolean bool, Boolean bool2, Float f14, Float f15, Float f16, okio.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = p0Var.active_OBSOLETE;
        }
        if ((i11 & 2) != 0) {
            z12 = p0Var.pin_code_set_OBSOLETE;
        }
        if ((i11 & 4) != 0) {
            f11 = p0Var.max_limit_mph_OBSOLETE;
        }
        if ((i11 & 8) != 0) {
            f12 = p0Var.min_limit_mph_OBSOLETE;
        }
        if ((i11 & 16) != 0) {
            f13 = p0Var.current_limit_mph_OBSOLETE;
        }
        if ((i11 & 32) != 0) {
            bool = p0Var.active;
        }
        if ((i11 & 64) != 0) {
            bool2 = p0Var.pin_code_set;
        }
        if ((i11 & 128) != 0) {
            f14 = p0Var.max_limit_mph;
        }
        if ((i11 & 256) != 0) {
            f15 = p0Var.min_limit_mph;
        }
        if ((i11 & 512) != 0) {
            f16 = p0Var.current_limit_mph;
        }
        if ((i11 & 1024) != 0) {
            kVar = p0Var.unknownFields();
        }
        Float f17 = f16;
        okio.k kVar2 = kVar;
        Float f18 = f14;
        Float f19 = f15;
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        float f21 = f13;
        float f22 = f11;
        return p0Var.a(z11, z12, f22, f12, f21, bool3, bool4, f18, f19, f17, kVar2);
    }

    public final p0 a(boolean active_OBSOLETE, boolean pin_code_set_OBSOLETE, float max_limit_mph_OBSOLETE, float min_limit_mph_OBSOLETE, float current_limit_mph_OBSOLETE, Boolean active, Boolean pin_code_set, Float max_limit_mph, Float min_limit_mph, Float current_limit_mph, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new p0(active_OBSOLETE, pin_code_set_OBSOLETE, max_limit_mph_OBSOLETE, min_limit_mph_OBSOLETE, current_limit_mph_OBSOLETE, active, pin_code_set, max_limit_mph, min_limit_mph, current_limit_mph, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getActive() {
        return this.active;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getActive_OBSOLETE() {
        return this.active_OBSOLETE;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Float getCurrent_limit_mph() {
        return this.current_limit_mph;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), p0Var.unknownFields()) && this.active_OBSOLETE == p0Var.active_OBSOLETE && this.pin_code_set_OBSOLETE == p0Var.pin_code_set_OBSOLETE && this.max_limit_mph_OBSOLETE == p0Var.max_limit_mph_OBSOLETE && this.min_limit_mph_OBSOLETE == p0Var.min_limit_mph_OBSOLETE && this.current_limit_mph_OBSOLETE == p0Var.current_limit_mph_OBSOLETE && p013kotlin.jvm.internal.s.f(this.active, p0Var.active) && p013kotlin.jvm.internal.s.f(this.pin_code_set, p0Var.pin_code_set) && p013kotlin.jvm.internal.s.e(this.max_limit_mph, p0Var.max_limit_mph) && p013kotlin.jvm.internal.s.e(this.min_limit_mph, p0Var.min_limit_mph) && p013kotlin.jvm.internal.s.e(this.current_limit_mph, p0Var.current_limit_mph);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getCurrent_limit_mph_OBSOLETE() {
        return this.current_limit_mph_OBSOLETE;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Float getMax_limit_mph() {
        return this.max_limit_mph;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getMax_limit_mph_OBSOLETE() {
        return this.max_limit_mph_OBSOLETE;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.active_OBSOLETE)) * 37) + Boolean.hashCode(this.pin_code_set_OBSOLETE)) * 37) + Float.hashCode(this.max_limit_mph_OBSOLETE)) * 37) + Float.hashCode(this.min_limit_mph_OBSOLETE)) * 37) + Float.hashCode(this.current_limit_mph_OBSOLETE)) * 37;
        Boolean bool = this.active;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.pin_code_set;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        Float f11 = this.max_limit_mph;
        int iHashCode4 = (iHashCode3 + (f11 != null ? f11.hashCode() : 0)) * 37;
        Float f12 = this.min_limit_mph;
        int iHashCode5 = (iHashCode4 + (f12 != null ? f12.hashCode() : 0)) * 37;
        Float f13 = this.current_limit_mph;
        int iHashCode6 = iHashCode5 + (f13 != null ? f13.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Float getMin_limit_mph() {
        return this.min_limit_mph;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getMin_limit_mph_OBSOLETE() {
        return this.min_limit_mph_OBSOLETE;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getPin_code_set() {
        return this.pin_code_set;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getPin_code_set_OBSOLETE() {
        return this.pin_code_set_OBSOLETE;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m427newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("active_OBSOLETE=" + this.active_OBSOLETE);
        arrayList.add("pin_code_set_OBSOLETE=" + this.pin_code_set_OBSOLETE);
        arrayList.add("max_limit_mph_OBSOLETE=" + this.max_limit_mph_OBSOLETE);
        arrayList.add("min_limit_mph_OBSOLETE=" + this.min_limit_mph_OBSOLETE);
        arrayList.add("current_limit_mph_OBSOLETE=" + this.current_limit_mph_OBSOLETE);
        Boolean bool = this.active;
        if (bool != null) {
            arrayList.add("active=" + bool);
        }
        Boolean bool2 = this.pin_code_set;
        if (bool2 != null) {
            arrayList.add("pin_code_set=" + bool2);
        }
        Float f11 = this.max_limit_mph;
        if (f11 != null) {
            arrayList.add("max_limit_mph=" + f11);
        }
        Float f12 = this.min_limit_mph;
        if (f12 != null) {
            arrayList.add("min_limit_mph=" + f12);
        }
        Float f13 = this.current_limit_mph;
        if (f13 != null) {
            arrayList.add("current_limit_mph=" + f13);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "SpeedLimitMode{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ p0(boolean z11, boolean z12, float f11, float f12, float f13, Boolean bool, Boolean bool2, Float f14, Float f15, Float f16, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? 0.0f : f11, (i11 & 8) != 0 ? 0.0f : f12, (i11 & 16) != 0 ? 0.0f : f13, (i11 & 32) != 0 ? null : bool, (i11 & 64) != 0 ? null : bool2, (i11 & 128) != 0 ? null : f14, (i11 & 256) != 0 ? null : f15, (i11 & 512) != 0 ? null : f16, (i11 & 1024) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m427newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(boolean z11, boolean z12, float f11, float f12, float f13, Boolean bool, Boolean bool2, Float f14, Float f15, Float f16, okio.k unknownFields) {
        super(f68303l, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.active_OBSOLETE = z11;
        this.pin_code_set_OBSOLETE = z12;
        this.max_limit_mph_OBSOLETE = f11;
        this.min_limit_mph_OBSOLETE = f12;
        this.current_limit_mph_OBSOLETE = f13;
        this.active = bool;
        this.pin_code_set = bool2;
        this.max_limit_mph = f14;
        this.min_limit_mph = f15;
        this.current_limit_mph = f16;
    }
}
