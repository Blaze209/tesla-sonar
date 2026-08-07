package gc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&B¡\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J§\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b(\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b*\u0010%R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b+\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b-\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b.\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b0\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b,\u0010%¨\u00061"}, d2 = {"Lgc0/b;", "Lcom/squareup/wire/f;", "", "Lec0/h0;", "Standby", "Unavailable", "Ready", "ActiveForward", "ActiveReverse", "Disabled", "Panic", "Preparing", "Aborting", "Paused", "Resuming", "OpeningGate", "Lokio/k;", "unknownFields", "<init>", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "(Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lec0/h0;Lokio/k;)Lgc0/b;", "Lec0/h0;", "l", "()Lec0/h0;", "b", "m", "c", "j", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "k", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends com.squareup.wire.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ProtoAdapter<b> f67961n = new a(com.squareup.wire.b.LENGTH_DELIMITED, p013kotlin.jvm.internal.o0.b(b.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 1)
    private final ec0.h0 Standby;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 2)
    private final ec0.h0 Unavailable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 3)
    private final ec0.h0 Ready;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 4)
    private final ec0.h0 ActiveForward;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 5)
    private final ec0.h0 ActiveReverse;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 6)
    private final ec0.h0 Disabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 7)
    private final ec0.h0 Panic;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 8)
    private final ec0.h0 Preparing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 9)
    private final ec0.h0 Aborting;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 10)
    private final ec0.h0 Paused;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 11)
    private final ec0.h0 Resuming;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.carserver.common.Void#ADAPTER", tag = 12)
    private final ec0.h0 OpeningGate;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"gc0/b$a", "Lcom/squareup/wire/ProtoAdapter;", "Lgc0/b;", "value", "", "c", "(Lgc0/b;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lgc0/b;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lgc0/b;", DateTokenConverter.CONVERTER_KEY, "(Lgc0/b;)Lgc0/b;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<b> {
        a(com.squareup.wire.b bVar, co0.d<b> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/CarServer.AutoparkState", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b decode(com.squareup.wire.k reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            long jD = reader.d();
            ec0.h0 h0VarDecode = null;
            ec0.h0 h0VarDecode2 = null;
            ec0.h0 h0VarDecode3 = null;
            ec0.h0 h0VarDecode4 = null;
            ec0.h0 h0VarDecode5 = null;
            ec0.h0 h0VarDecode6 = null;
            ec0.h0 h0VarDecode7 = null;
            ec0.h0 h0VarDecode8 = null;
            ec0.h0 h0VarDecode9 = null;
            ec0.h0 h0VarDecode10 = null;
            ec0.h0 h0VarDecode11 = null;
            ec0.h0 h0VarDecode12 = null;
            while (true) {
                int iG = reader.g();
                ec0.h0 h0Var = h0VarDecode;
                if (iG == -1) {
                    return new b(h0Var, h0VarDecode2, h0VarDecode3, h0VarDecode4, h0VarDecode5, h0VarDecode6, h0VarDecode7, h0VarDecode8, h0VarDecode9, h0VarDecode10, h0VarDecode11, h0VarDecode12, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        h0VarDecode = ec0.h0.f62622b.decode(reader);
                        continue;
                    case 2:
                        h0VarDecode2 = ec0.h0.f62622b.decode(reader);
                        break;
                    case 3:
                        h0VarDecode3 = ec0.h0.f62622b.decode(reader);
                        break;
                    case 4:
                        h0VarDecode4 = ec0.h0.f62622b.decode(reader);
                        break;
                    case 5:
                        h0VarDecode5 = ec0.h0.f62622b.decode(reader);
                        break;
                    case 6:
                        h0VarDecode6 = ec0.h0.f62622b.decode(reader);
                        break;
                    case 7:
                        h0VarDecode7 = ec0.h0.f62622b.decode(reader);
                        break;
                    case 8:
                        h0VarDecode8 = ec0.h0.f62622b.decode(reader);
                        break;
                    case 9:
                        h0VarDecode9 = ec0.h0.f62622b.decode(reader);
                        break;
                    case 10:
                        h0VarDecode10 = ec0.h0.f62622b.decode(reader);
                        break;
                    case 11:
                        h0VarDecode11 = ec0.h0.f62622b.decode(reader);
                        break;
                    case 12:
                        h0VarDecode12 = ec0.h0.f62622b.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        break;
                }
                h0VarDecode = h0Var;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, b value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
            protoAdapter.encodeWithTag(writer, 1, value.getStandby());
            protoAdapter.encodeWithTag(writer, 2, value.getUnavailable());
            protoAdapter.encodeWithTag(writer, 3, value.getReady());
            protoAdapter.encodeWithTag(writer, 4, value.getActiveForward());
            protoAdapter.encodeWithTag(writer, 5, value.getActiveReverse());
            protoAdapter.encodeWithTag(writer, 6, value.getDisabled());
            protoAdapter.encodeWithTag(writer, 7, value.getPanic());
            protoAdapter.encodeWithTag(writer, 8, value.getPreparing());
            protoAdapter.encodeWithTag(writer, 9, value.getAborting());
            protoAdapter.encodeWithTag(writer, 10, value.getPaused());
            protoAdapter.encodeWithTag(writer, 11, value.getResuming());
            protoAdapter.encodeWithTag(writer, 12, value.getOpeningGate());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(b value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            int iD = value.unknownFields().D();
            ProtoAdapter<ec0.h0> protoAdapter = ec0.h0.f62622b;
            return iD + protoAdapter.encodedSizeWithTag(1, value.getStandby()) + protoAdapter.encodedSizeWithTag(2, value.getUnavailable()) + protoAdapter.encodedSizeWithTag(3, value.getReady()) + protoAdapter.encodedSizeWithTag(4, value.getActiveForward()) + protoAdapter.encodedSizeWithTag(5, value.getActiveReverse()) + protoAdapter.encodedSizeWithTag(6, value.getDisabled()) + protoAdapter.encodedSizeWithTag(7, value.getPanic()) + protoAdapter.encodedSizeWithTag(8, value.getPreparing()) + protoAdapter.encodedSizeWithTag(9, value.getAborting()) + protoAdapter.encodedSizeWithTag(10, value.getPaused()) + protoAdapter.encodedSizeWithTag(11, value.getResuming()) + protoAdapter.encodedSizeWithTag(12, value.getOpeningGate());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b redact(b value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            ec0.h0 standby = value.getStandby();
            ec0.h0 h0VarRedact = standby != null ? ec0.h0.f62622b.redact(standby) : null;
            ec0.h0 unavailable = value.getUnavailable();
            ec0.h0 h0VarRedact2 = unavailable != null ? ec0.h0.f62622b.redact(unavailable) : null;
            ec0.h0 ready = value.getReady();
            ec0.h0 h0VarRedact3 = ready != null ? ec0.h0.f62622b.redact(ready) : null;
            ec0.h0 activeForward = value.getActiveForward();
            ec0.h0 h0VarRedact4 = activeForward != null ? ec0.h0.f62622b.redact(activeForward) : null;
            ec0.h0 activeReverse = value.getActiveReverse();
            ec0.h0 h0VarRedact5 = activeReverse != null ? ec0.h0.f62622b.redact(activeReverse) : null;
            ec0.h0 disabled = value.getDisabled();
            ec0.h0 h0VarRedact6 = disabled != null ? ec0.h0.f62622b.redact(disabled) : null;
            ec0.h0 panic = value.getPanic();
            ec0.h0 h0VarRedact7 = panic != null ? ec0.h0.f62622b.redact(panic) : null;
            ec0.h0 preparing = value.getPreparing();
            ec0.h0 h0VarRedact8 = preparing != null ? ec0.h0.f62622b.redact(preparing) : null;
            ec0.h0 aborting = value.getAborting();
            ec0.h0 h0VarRedact9 = aborting != null ? ec0.h0.f62622b.redact(aborting) : null;
            ec0.h0 paused = value.getPaused();
            ec0.h0 h0VarRedact10 = paused != null ? ec0.h0.f62622b.redact(paused) : null;
            ec0.h0 resuming = value.getResuming();
            ec0.h0 h0VarRedact11 = resuming != null ? ec0.h0.f62622b.redact(resuming) : null;
            ec0.h0 openingGate = value.getOpeningGate();
            return value.a(h0VarRedact, h0VarRedact2, h0VarRedact3, h0VarRedact4, h0VarRedact5, h0VarRedact6, h0VarRedact7, h0VarRedact8, h0VarRedact9, h0VarRedact10, h0VarRedact11, openingGate != null ? ec0.h0.f62622b.redact(openingGate) : null, okio.k.f97943e);
        }
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final b a(ec0.h0 Standby, ec0.h0 Unavailable, ec0.h0 Ready, ec0.h0 ActiveForward, ec0.h0 ActiveReverse, ec0.h0 Disabled, ec0.h0 Panic, ec0.h0 Preparing, ec0.h0 Aborting, ec0.h0 Paused, ec0.h0 Resuming, ec0.h0 OpeningGate, okio.k unknownFields) {
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        return new b(Standby, Unavailable, Ready, ActiveForward, ActiveReverse, Disabled, Panic, Preparing, Aborting, Paused, Resuming, OpeningGate, unknownFields);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ec0.h0 getAborting() {
        return this.Aborting;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ec0.h0 getActiveForward() {
        return this.ActiveForward;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ec0.h0 getActiveReverse() {
        return this.ActiveReverse;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ec0.h0 getDisabled() {
        return this.Disabled;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return p013kotlin.jvm.internal.s.f(unknownFields(), bVar.unknownFields()) && p013kotlin.jvm.internal.s.f(this.Standby, bVar.Standby) && p013kotlin.jvm.internal.s.f(this.Unavailable, bVar.Unavailable) && p013kotlin.jvm.internal.s.f(this.Ready, bVar.Ready) && p013kotlin.jvm.internal.s.f(this.ActiveForward, bVar.ActiveForward) && p013kotlin.jvm.internal.s.f(this.ActiveReverse, bVar.ActiveReverse) && p013kotlin.jvm.internal.s.f(this.Disabled, bVar.Disabled) && p013kotlin.jvm.internal.s.f(this.Panic, bVar.Panic) && p013kotlin.jvm.internal.s.f(this.Preparing, bVar.Preparing) && p013kotlin.jvm.internal.s.f(this.Aborting, bVar.Aborting) && p013kotlin.jvm.internal.s.f(this.Paused, bVar.Paused) && p013kotlin.jvm.internal.s.f(this.Resuming, bVar.Resuming) && p013kotlin.jvm.internal.s.f(this.OpeningGate, bVar.OpeningGate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ec0.h0 getOpeningGate() {
        return this.OpeningGate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ec0.h0 getPanic() {
        return this.Panic;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ec0.h0 getPaused() {
        return this.Paused;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ec0.h0 h0Var = this.Standby;
        int iHashCode2 = (iHashCode + (h0Var != null ? h0Var.hashCode() : 0)) * 37;
        ec0.h0 h0Var2 = this.Unavailable;
        int iHashCode3 = (iHashCode2 + (h0Var2 != null ? h0Var2.hashCode() : 0)) * 37;
        ec0.h0 h0Var3 = this.Ready;
        int iHashCode4 = (iHashCode3 + (h0Var3 != null ? h0Var3.hashCode() : 0)) * 37;
        ec0.h0 h0Var4 = this.ActiveForward;
        int iHashCode5 = (iHashCode4 + (h0Var4 != null ? h0Var4.hashCode() : 0)) * 37;
        ec0.h0 h0Var5 = this.ActiveReverse;
        int iHashCode6 = (iHashCode5 + (h0Var5 != null ? h0Var5.hashCode() : 0)) * 37;
        ec0.h0 h0Var6 = this.Disabled;
        int iHashCode7 = (iHashCode6 + (h0Var6 != null ? h0Var6.hashCode() : 0)) * 37;
        ec0.h0 h0Var7 = this.Panic;
        int iHashCode8 = (iHashCode7 + (h0Var7 != null ? h0Var7.hashCode() : 0)) * 37;
        ec0.h0 h0Var8 = this.Preparing;
        int iHashCode9 = (iHashCode8 + (h0Var8 != null ? h0Var8.hashCode() : 0)) * 37;
        ec0.h0 h0Var9 = this.Aborting;
        int iHashCode10 = (iHashCode9 + (h0Var9 != null ? h0Var9.hashCode() : 0)) * 37;
        ec0.h0 h0Var10 = this.Paused;
        int iHashCode11 = (iHashCode10 + (h0Var10 != null ? h0Var10.hashCode() : 0)) * 37;
        ec0.h0 h0Var11 = this.Resuming;
        int iHashCode12 = (iHashCode11 + (h0Var11 != null ? h0Var11.hashCode() : 0)) * 37;
        ec0.h0 h0Var12 = this.OpeningGate;
        int iHashCode13 = iHashCode12 + (h0Var12 != null ? h0Var12.hashCode() : 0);
        this.hashCode = iHashCode13;
        return iHashCode13;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ec0.h0 getPreparing() {
        return this.Preparing;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final ec0.h0 getReady() {
        return this.Ready;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final ec0.h0 getResuming() {
        return this.Resuming;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final ec0.h0 getStandby() {
        return this.Standby;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final ec0.h0 getUnavailable() {
        return this.Unavailable;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m389newBuilder();
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ec0.h0 h0Var = this.Standby;
        if (h0Var != null) {
            arrayList.add("Standby=" + h0Var);
        }
        ec0.h0 h0Var2 = this.Unavailable;
        if (h0Var2 != null) {
            arrayList.add("Unavailable=" + h0Var2);
        }
        ec0.h0 h0Var3 = this.Ready;
        if (h0Var3 != null) {
            arrayList.add("Ready=" + h0Var3);
        }
        ec0.h0 h0Var4 = this.ActiveForward;
        if (h0Var4 != null) {
            arrayList.add("ActiveForward=" + h0Var4);
        }
        ec0.h0 h0Var5 = this.ActiveReverse;
        if (h0Var5 != null) {
            arrayList.add("ActiveReverse=" + h0Var5);
        }
        ec0.h0 h0Var6 = this.Disabled;
        if (h0Var6 != null) {
            arrayList.add("Disabled=" + h0Var6);
        }
        ec0.h0 h0Var7 = this.Panic;
        if (h0Var7 != null) {
            arrayList.add("Panic=" + h0Var7);
        }
        ec0.h0 h0Var8 = this.Preparing;
        if (h0Var8 != null) {
            arrayList.add("Preparing=" + h0Var8);
        }
        ec0.h0 h0Var9 = this.Aborting;
        if (h0Var9 != null) {
            arrayList.add("Aborting=" + h0Var9);
        }
        ec0.h0 h0Var10 = this.Paused;
        if (h0Var10 != null) {
            arrayList.add("Paused=" + h0Var10);
        }
        ec0.h0 h0Var11 = this.Resuming;
        if (h0Var11 != null) {
            arrayList.add("Resuming=" + h0Var11);
        }
        ec0.h0 h0Var12 = this.OpeningGate;
        if (h0Var12 != null) {
            arrayList.add("OpeningGate=" + h0Var12);
        }
        return p013kotlin.collections.v.y0(arrayList, ", ", "AutoparkState{", "}", 0, null, null, 56, null);
    }

    public /* synthetic */ b(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, ec0.h0 h0Var6, ec0.h0 h0Var7, ec0.h0 h0Var8, ec0.h0 h0Var9, ec0.h0 h0Var10, ec0.h0 h0Var11, ec0.h0 h0Var12, okio.k kVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : h0Var, (i11 & 2) != 0 ? null : h0Var2, (i11 & 4) != 0 ? null : h0Var3, (i11 & 8) != 0 ? null : h0Var4, (i11 & 16) != 0 ? null : h0Var5, (i11 & 32) != 0 ? null : h0Var6, (i11 & 64) != 0 ? null : h0Var7, (i11 & 128) != 0 ? null : h0Var8, (i11 & 256) != 0 ? null : h0Var9, (i11 & 512) != 0 ? null : h0Var10, (i11 & 1024) != 0 ? null : h0Var11, (i11 & 2048) == 0 ? h0Var12 : null, (i11 & 4096) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m389newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ec0.h0 h0Var, ec0.h0 h0Var2, ec0.h0 h0Var3, ec0.h0 h0Var4, ec0.h0 h0Var5, ec0.h0 h0Var6, ec0.h0 h0Var7, ec0.h0 h0Var8, ec0.h0 h0Var9, ec0.h0 h0Var10, ec0.h0 h0Var11, ec0.h0 h0Var12, okio.k unknownFields) {
        super(f67961n, unknownFields);
        p013kotlin.jvm.internal.s.k(unknownFields, "unknownFields");
        this.Standby = h0Var;
        this.Unavailable = h0Var2;
        this.Ready = h0Var3;
        this.ActiveForward = h0Var4;
        this.ActiveReverse = h0Var5;
        this.Disabled = h0Var6;
        this.Panic = h0Var7;
        this.Preparing = h0Var8;
        this.Aborting = h0Var9;
        this.Paused = h0Var10;
        this.Resuming = h0Var11;
        this.OpeningGate = h0Var12;
        if (x20.d.e(h0Var, h0Var2, h0Var3, h0Var4, h0Var5, h0Var6, h0Var7, h0Var8, h0Var9, h0Var10, h0Var11, h0Var12) > 1) {
            throw new IllegalArgumentException("At most one of Standby, Unavailable, Ready, ActiveForward, ActiveReverse, Disabled, Panic, Preparing, Aborting, Paused, Resuming, OpeningGate may be non-null");
        }
    }
}
