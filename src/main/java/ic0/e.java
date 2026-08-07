package ic0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b.\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B÷\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\r\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\r\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0017¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001eH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.Jý\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\r2\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u00132\b\b\u0002\u0010\u001d\u001a\u00020\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b2\u0010.R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010.R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b=\u0010<R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010>\u001a\u0004\b5\u0010?R\u001a\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bA\u0010.R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u0015\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010:\u001a\u0004\bF\u0010<R\u001a\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u0010<R\u001a\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010<R\u001a\u0010\u0018\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bK\u0010<R\u001a\u0010\u0019\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010:\u001a\u0004\bL\u0010<R\u001a\u0010\u001a\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010:\u001a\u0004\bN\u0010<R\u001a\u0010\u001b\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bB\u0010ER\u001a\u0010\u001c\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010C\u001a\u0004\b@\u0010ER\u001a\u0010\u001d\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bG\u0010ER\u001a\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010P\u001a\u0004\b9\u0010,R\u001a\u0010 \u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u00101\u001a\u0004\bM\u0010.R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010Q\u001a\u0004\bO\u0010RR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010S\u001a\u0004\bI\u0010T¨\u0006U"}, d2 = {"Lic0/e;", "Lcom/squareup/wire/f;", "", "", "id", "vehicleId", "", "Lic0/q;", "transports", "Lic0/f;", "source", "", "oapiHeaders", "", "letSleep", "bypassCounter", "Lic0/c;", "action", "vin", "", "receivedRequestBytesTimestamp", "useIncorrectHandleInitially", "useIncorrectCounterInitially", "useIncorrectEpochInitially", "useIncorrectExpiryTimeTooLongInitially", "useIncorrectTimeExpiredInitially", "useAnotherKeysHandleInitially", "jsStartTimestamp", "jsBridgeStartTimestamp", "nativeStartTimestamp", "", "bridgeJsToNativeDurationMilliseconds", "sourceContext", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lic0/f;Ljava/util/Map;ZZLic0/c;Ljava/lang/String;JZZZZZZJJJILjava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lic0/f;Ljava/util/Map;ZZLic0/c;Ljava/lang/String;JZZZZZZJJJILjava/lang/String;Lokio/k;)Lic0/e;", "Ljava/lang/String;", "f", "b", "v", "c", "Lic0/f;", "m", "()Lic0/f;", DateTokenConverter.CONVERTER_KEY, "Z", IntegerTokenConverter.CONVERTER_KEY, "()Z", "e", "Lic0/c;", "()Lic0/c;", "g", "w", "h", "J", "l", "()J", "t", "j", "q", "k", "r", "s", "u", "n", "p", "o", "I", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/util/Map;", "()Ljava/util/Map;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends com.squareup.wire.f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final ProtoAdapter<e> f77490w = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(e.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final String vehicleId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.CommandRequestSource#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final f source;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final boolean letSleep;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final boolean bypassCounter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.CommandAction#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 8)
    private final c action;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 9)
    private final String vin;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final long receivedRequestBytesTimestamp;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final boolean useIncorrectHandleInitially;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final boolean useIncorrectCounterInitially;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 13)
    private final boolean useIncorrectEpochInitially;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 14)
    private final boolean useIncorrectExpiryTimeTooLongInitially;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 15)
    private final boolean useIncorrectTimeExpiredInitially;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 16)
    private final boolean useAnotherKeysHandleInitially;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 17)
    private final long jsStartTimestamp;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 18)
    private final long jsBridgeStartTimestamp;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 19)
    private final long nativeStartTimestamp;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 21)
    private final int bridgeJsToNativeDurationMilliseconds;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 22)
    private final String sourceContext;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.Transport#ADAPTER", label = com.squareup.wire.q.a.REPEATED, tag = 3)
    private final List<q> transports;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    private final Map<String, String> oapiHeaders;

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R-\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00120\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"ic0/e$a", "Lcom/squareup/wire/ProtoAdapter;", "Lic0/e;", "value", "", DateTokenConverter.CONVERTER_KEY, "(Lic0/e;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "c", "(Lcom/squareup/wire/l;Lic0/e;)V", "Lcom/squareup/wire/k;", "reader", "b", "(Lcom/squareup/wire/k;)Lic0/e;", "g", "(Lic0/e;)Lic0/e;", "", "", "a", "Lkotlin/Lazy;", "e", "()Lcom/squareup/wire/ProtoAdapter;", "oapiHeadersAdapter", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Lazy oapiHeadersAdapter;

        a(com.squareup.wire.b bVar, co0.d<e> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.CommandRequest", oVar, (Object) null);
            this.oapiHeadersAdapter = jn0.m.b(new wn0.a() { // from class: ic0.d
                @Override // wn0.a
                public final Object invoke() {
                    return e.a.f();
                }
            });
        }

        private final ProtoAdapter<Map<String, String>> e() {
            return (ProtoAdapter) this.oapiHeadersAdapter.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProtoAdapter f() {
            ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return companion.e(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e decode(com.squareup.wire.k reader) throws IOException {
            LinkedHashMap linkedHashMap;
            String str;
            String str2;
            s.k(reader, "reader");
            ArrayList arrayList = new ArrayList();
            f fVar = f.SOURCE_NONE;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            long jD = reader.d();
            f fVarDecode = fVar;
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            boolean zBooleanValue3 = false;
            boolean zBooleanValue4 = false;
            boolean zBooleanValue5 = false;
            boolean zBooleanValue6 = false;
            boolean zBooleanValue7 = false;
            boolean zBooleanValue8 = false;
            int iIntValue = 0;
            c cVarDecode = null;
            long jLongValue = 0;
            long jLongValue2 = 0;
            long jLongValue3 = 0;
            long jLongValue4 = 0;
            String strDecode = "";
            String strDecode2 = strDecode;
            String strDecode3 = strDecode2;
            String strDecode4 = strDecode3;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new e(strDecode, strDecode2, arrayList, fVarDecode, linkedHashMap2, zBooleanValue, zBooleanValue2, cVarDecode, strDecode3, jLongValue, zBooleanValue3, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, zBooleanValue8, jLongValue2, jLongValue3, jLongValue4, iIntValue, strDecode4, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        linkedHashMap = linkedHashMap2;
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        linkedHashMap = linkedHashMap2;
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        linkedHashMap = linkedHashMap2;
                        str = strDecode;
                        str2 = strDecode2;
                        try {
                            arrayList.add(q.ADAPTER.decode(reader));
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                            h0 h0Var = h0.f84049a;
                        }
                        strDecode = str;
                        strDecode2 = str2;
                        break;
                    case 4:
                        try {
                            fVarDecode = f.ADAPTER.decode(reader);
                            linkedHashMap = linkedHashMap2;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            linkedHashMap = linkedHashMap2;
                            str = strDecode;
                            str2 = strDecode2;
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            strDecode = str;
                            strDecode2 = str2;
                        }
                        break;
                    case 5:
                        linkedHashMap2.putAll(e().decode(reader));
                        linkedHashMap = linkedHashMap2;
                        str = strDecode;
                        str2 = strDecode2;
                        strDecode = str;
                        strDecode2 = str2;
                        break;
                    case 6:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 7:
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 8:
                        cVarDecode = c.f77465y.decode(reader);
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 9:
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 10:
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 11:
                        zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 12:
                        zBooleanValue4 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 13:
                        zBooleanValue5 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 14:
                        zBooleanValue6 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 15:
                        zBooleanValue7 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 16:
                        zBooleanValue8 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 17:
                        jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 18:
                        jLongValue3 = ProtoAdapter.INT64.decode(reader).longValue();
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 19:
                        jLongValue4 = ProtoAdapter.INT64.decode(reader).longValue();
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 20:
                    default:
                        reader.m(iG);
                        linkedHashMap = linkedHashMap2;
                        str = strDecode;
                        str2 = strDecode2;
                        strDecode = str;
                        strDecode2 = str2;
                        break;
                    case 21:
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        linkedHashMap = linkedHashMap2;
                        break;
                    case 22:
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                        linkedHashMap = linkedHashMap2;
                        break;
                }
                linkedHashMap2 = linkedHashMap;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, e value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (!s.f(value.getId(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getId());
            }
            if (!s.f(value.getVehicleId(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getVehicleId());
            }
            q.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.o());
            if (value.getSource() != f.SOURCE_NONE) {
                f.ADAPTER.encodeWithTag(writer, 4, value.getSource());
            }
            e().encodeWithTag(writer, 5, value.k());
            if (value.getLetSleep()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 6, Boolean.valueOf(value.getLetSleep()));
            }
            if (value.getBypassCounter()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 7, Boolean.valueOf(value.getBypassCounter()));
            }
            if (value.getAction() != null) {
                c.f77465y.encodeWithTag(writer, 8, value.getAction());
            }
            if (!s.f(value.getVin(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 9, value.getVin());
            }
            if (value.getReceivedRequestBytesTimestamp() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 10, Long.valueOf(value.getReceivedRequestBytesTimestamp()));
            }
            if (value.getUseIncorrectHandleInitially()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 11, Boolean.valueOf(value.getUseIncorrectHandleInitially()));
            }
            if (value.getUseIncorrectCounterInitially()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 12, Boolean.valueOf(value.getUseIncorrectCounterInitially()));
            }
            if (value.getUseIncorrectEpochInitially()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 13, Boolean.valueOf(value.getUseIncorrectEpochInitially()));
            }
            if (value.getUseIncorrectExpiryTimeTooLongInitially()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 14, Boolean.valueOf(value.getUseIncorrectExpiryTimeTooLongInitially()));
            }
            if (value.getUseIncorrectTimeExpiredInitially()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 15, Boolean.valueOf(value.getUseIncorrectTimeExpiredInitially()));
            }
            if (value.getUseAnotherKeysHandleInitially()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 16, Boolean.valueOf(value.getUseAnotherKeysHandleInitially()));
            }
            if (value.getJsStartTimestamp() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 17, Long.valueOf(value.getJsStartTimestamp()));
            }
            if (value.getJsBridgeStartTimestamp() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 18, Long.valueOf(value.getJsBridgeStartTimestamp()));
            }
            if (value.getNativeStartTimestamp() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 19, Long.valueOf(value.getNativeStartTimestamp()));
            }
            if (value.getBridgeJsToNativeDurationMilliseconds() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 21, Integer.valueOf(value.getBridgeJsToNativeDurationMilliseconds()));
            }
            if (!s.f(value.getSourceContext(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 22, value.getSourceContext());
            }
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int encodedSize(e value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!s.f(value.getId(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
            }
            if (!s.f(value.getVehicleId(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getVehicleId());
            }
            int iEncodedSizeWithTag = iD + q.ADAPTER.asRepeated().encodedSizeWithTag(3, value.o());
            if (value.getSource() != f.SOURCE_NONE) {
                iEncodedSizeWithTag += f.ADAPTER.encodedSizeWithTag(4, value.getSource());
            }
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + e().encodedSizeWithTag(5, value.k());
            if (value.getLetSleep()) {
                iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(6, Boolean.valueOf(value.getLetSleep()));
            }
            if (value.getBypassCounter()) {
                iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getBypassCounter()));
            }
            if (value.getAction() != null) {
                iEncodedSizeWithTag2 += c.f77465y.encodedSizeWithTag(8, value.getAction());
            }
            if (!s.f(value.getVin(), "")) {
                iEncodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getVin());
            }
            if (value.getReceivedRequestBytesTimestamp() != 0) {
                iEncodedSizeWithTag2 += ProtoAdapter.INT64.encodedSizeWithTag(10, Long.valueOf(value.getReceivedRequestBytesTimestamp()));
            }
            if (value.getUseIncorrectHandleInitially()) {
                iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(11, Boolean.valueOf(value.getUseIncorrectHandleInitially()));
            }
            if (value.getUseIncorrectCounterInitially()) {
                iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(12, Boolean.valueOf(value.getUseIncorrectCounterInitially()));
            }
            if (value.getUseIncorrectEpochInitially()) {
                iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(13, Boolean.valueOf(value.getUseIncorrectEpochInitially()));
            }
            if (value.getUseIncorrectExpiryTimeTooLongInitially()) {
                iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(14, Boolean.valueOf(value.getUseIncorrectExpiryTimeTooLongInitially()));
            }
            if (value.getUseIncorrectTimeExpiredInitially()) {
                iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(15, Boolean.valueOf(value.getUseIncorrectTimeExpiredInitially()));
            }
            if (value.getUseAnotherKeysHandleInitially()) {
                iEncodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(16, Boolean.valueOf(value.getUseAnotherKeysHandleInitially()));
            }
            if (value.getJsStartTimestamp() != 0) {
                iEncodedSizeWithTag2 += ProtoAdapter.INT64.encodedSizeWithTag(17, Long.valueOf(value.getJsStartTimestamp()));
            }
            if (value.getJsBridgeStartTimestamp() != 0) {
                iEncodedSizeWithTag2 += ProtoAdapter.INT64.encodedSizeWithTag(18, Long.valueOf(value.getJsBridgeStartTimestamp()));
            }
            if (value.getNativeStartTimestamp() != 0) {
                iEncodedSizeWithTag2 += ProtoAdapter.INT64.encodedSizeWithTag(19, Long.valueOf(value.getNativeStartTimestamp()));
            }
            if (value.getBridgeJsToNativeDurationMilliseconds() != 0) {
                iEncodedSizeWithTag2 += ProtoAdapter.INT32.encodedSizeWithTag(21, Integer.valueOf(value.getBridgeJsToNativeDurationMilliseconds()));
            }
            return !s.f(value.getSourceContext(), "") ? iEncodedSizeWithTag2 + ProtoAdapter.STRING.encodedSizeWithTag(22, value.getSourceContext()) : iEncodedSizeWithTag2;
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public e redact(e value) {
            s.k(value, "value");
            c action = value.getAction();
            return e.b(value, null, null, null, null, null, false, false, action != null ? c.f77465y.redact(action) : null, null, 0L, false, false, false, false, false, false, 0L, 0L, 0L, 0, null, okio.k.f97943e, 2097023, null);
        }
    }

    public e() {
        this(null, null, null, null, null, false, false, null, null, 0L, false, false, false, false, false, false, 0L, 0L, 0L, 0, null, null, 4194303, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e b(e eVar, String str, String str2, List list, f fVar, Map map, boolean z11, boolean z12, c cVar, String str3, long j11, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, long j12, long j13, long j14, int i11, String str4, okio.k kVar, int i12, Object obj) {
        String str5 = (i12 & 1) != 0 ? eVar.id : str;
        return eVar.a(str5, (i12 & 2) != 0 ? eVar.vehicleId : str2, (i12 & 4) != 0 ? eVar.transports : list, (i12 & 8) != 0 ? eVar.source : fVar, (i12 & 16) != 0 ? eVar.oapiHeaders : map, (i12 & 32) != 0 ? eVar.letSleep : z11, (i12 & 64) != 0 ? eVar.bypassCounter : z12, (i12 & 128) != 0 ? eVar.action : cVar, (i12 & 256) != 0 ? eVar.vin : str3, (i12 & 512) != 0 ? eVar.receivedRequestBytesTimestamp : j11, (i12 & 1024) != 0 ? eVar.useIncorrectHandleInitially : z13, (i12 & 2048) != 0 ? eVar.useIncorrectCounterInitially : z14, (i12 & 4096) != 0 ? eVar.useIncorrectEpochInitially : z15, (i12 & PKIFailureInfo.certRevoked) != 0 ? eVar.useIncorrectExpiryTimeTooLongInitially : z16, (i12 & 16384) != 0 ? eVar.useIncorrectTimeExpiredInitially : z17, (i12 & 32768) != 0 ? eVar.useAnotherKeysHandleInitially : z18, (i12 & 65536) != 0 ? eVar.jsStartTimestamp : j12, (i12 & 131072) != 0 ? eVar.jsBridgeStartTimestamp : j13, (i12 & 262144) != 0 ? eVar.nativeStartTimestamp : j14, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? eVar.bridgeJsToNativeDurationMilliseconds : i11, (i12 & PKIFailureInfo.badCertTemplate) != 0 ? eVar.sourceContext : str4, (i12 & PKIFailureInfo.badSenderNonce) != 0 ? eVar.unknownFields() : kVar);
    }

    public final e a(String id2, String vehicleId, List<? extends q> transports, f source, Map<String, String> oapiHeaders, boolean letSleep, boolean bypassCounter, c action, String vin, long receivedRequestBytesTimestamp, boolean useIncorrectHandleInitially, boolean useIncorrectCounterInitially, boolean useIncorrectEpochInitially, boolean useIncorrectExpiryTimeTooLongInitially, boolean useIncorrectTimeExpiredInitially, boolean useAnotherKeysHandleInitially, long jsStartTimestamp, long jsBridgeStartTimestamp, long nativeStartTimestamp, int bridgeJsToNativeDurationMilliseconds, String sourceContext, okio.k unknownFields) {
        s.k(id2, "id");
        s.k(vehicleId, "vehicleId");
        s.k(transports, "transports");
        s.k(source, "source");
        s.k(oapiHeaders, "oapiHeaders");
        s.k(vin, "vin");
        s.k(sourceContext, "sourceContext");
        s.k(unknownFields, "unknownFields");
        return new e(id2, vehicleId, transports, source, oapiHeaders, letSleep, bypassCounter, action, vin, receivedRequestBytesTimestamp, useIncorrectHandleInitially, useIncorrectCounterInitially, useIncorrectEpochInitially, useIncorrectExpiryTimeTooLongInitially, useIncorrectTimeExpiredInitially, useAnotherKeysHandleInitially, jsStartTimestamp, jsBridgeStartTimestamp, nativeStartTimestamp, bridgeJsToNativeDurationMilliseconds, sourceContext, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getBridgeJsToNativeDurationMilliseconds() {
        return this.bridgeJsToNativeDurationMilliseconds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getBypassCounter() {
        return this.bypassCounter;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return s.f(unknownFields(), eVar.unknownFields()) && s.f(this.id, eVar.id) && s.f(this.vehicleId, eVar.vehicleId) && s.f(this.transports, eVar.transports) && this.source == eVar.source && s.f(this.oapiHeaders, eVar.oapiHeaders) && this.letSleep == eVar.letSleep && this.bypassCounter == eVar.bypassCounter && s.f(this.action, eVar.action) && s.f(this.vin, eVar.vin) && this.receivedRequestBytesTimestamp == eVar.receivedRequestBytesTimestamp && this.useIncorrectHandleInitially == eVar.useIncorrectHandleInitially && this.useIncorrectCounterInitially == eVar.useIncorrectCounterInitially && this.useIncorrectEpochInitially == eVar.useIncorrectEpochInitially && this.useIncorrectExpiryTimeTooLongInitially == eVar.useIncorrectExpiryTimeTooLongInitially && this.useIncorrectTimeExpiredInitially == eVar.useIncorrectTimeExpiredInitially && this.useAnotherKeysHandleInitially == eVar.useAnotherKeysHandleInitially && this.jsStartTimestamp == eVar.jsStartTimestamp && this.jsBridgeStartTimestamp == eVar.jsBridgeStartTimestamp && this.nativeStartTimestamp == eVar.nativeStartTimestamp && this.bridgeJsToNativeDurationMilliseconds == eVar.bridgeJsToNativeDurationMilliseconds && s.f(this.sourceContext, eVar.sourceContext);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getJsBridgeStartTimestamp() {
        return this.jsBridgeStartTimestamp;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getJsStartTimestamp() {
        return this.jsStartTimestamp;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.vehicleId.hashCode()) * 37) + this.transports.hashCode()) * 37) + this.source.hashCode()) * 37) + this.oapiHeaders.hashCode()) * 37) + Boolean.hashCode(this.letSleep)) * 37) + Boolean.hashCode(this.bypassCounter)) * 37;
        c cVar = this.action;
        int iHashCode2 = ((((((((((((((((((((((((((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 37) + this.vin.hashCode()) * 37) + Long.hashCode(this.receivedRequestBytesTimestamp)) * 37) + Boolean.hashCode(this.useIncorrectHandleInitially)) * 37) + Boolean.hashCode(this.useIncorrectCounterInitially)) * 37) + Boolean.hashCode(this.useIncorrectEpochInitially)) * 37) + Boolean.hashCode(this.useIncorrectExpiryTimeTooLongInitially)) * 37) + Boolean.hashCode(this.useIncorrectTimeExpiredInitially)) * 37) + Boolean.hashCode(this.useAnotherKeysHandleInitially)) * 37) + Long.hashCode(this.jsStartTimestamp)) * 37) + Long.hashCode(this.jsBridgeStartTimestamp)) * 37) + Long.hashCode(this.nativeStartTimestamp)) * 37) + Integer.hashCode(this.bridgeJsToNativeDurationMilliseconds)) * 37) + this.sourceContext.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getLetSleep() {
        return this.letSleep;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getNativeStartTimestamp() {
        return this.nativeStartTimestamp;
    }

    public final Map<String, String> k() {
        return this.oapiHeaders;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getReceivedRequestBytesTimestamp() {
        return this.receivedRequestBytesTimestamp;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final f getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getSourceContext() {
        return this.sourceContext;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m467newBuilder();
    }

    public final List<q> o() {
        return this.transports;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getUseAnotherKeysHandleInitially() {
        return this.useAnotherKeysHandleInitially;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getUseIncorrectCounterInitially() {
        return this.useIncorrectCounterInitially;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getUseIncorrectEpochInitially() {
        return this.useIncorrectEpochInitially;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getUseIncorrectExpiryTimeTooLongInitially() {
        return this.useIncorrectExpiryTimeTooLongInitially;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final boolean getUseIncorrectHandleInitially() {
        return this.useIncorrectHandleInitially;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + x20.d.i(this.id));
        arrayList.add("vehicleId=" + x20.d.i(this.vehicleId));
        if (!this.transports.isEmpty()) {
            arrayList.add("transports=" + this.transports);
        }
        arrayList.add("source=" + this.source);
        if (!this.oapiHeaders.isEmpty()) {
            arrayList.add("oapiHeaders=" + this.oapiHeaders);
        }
        arrayList.add("letSleep=" + this.letSleep);
        arrayList.add("bypassCounter=" + this.bypassCounter);
        c cVar = this.action;
        if (cVar != null) {
            arrayList.add("action=" + cVar);
        }
        arrayList.add("vin=" + x20.d.i(this.vin));
        arrayList.add("receivedRequestBytesTimestamp=" + this.receivedRequestBytesTimestamp);
        arrayList.add("useIncorrectHandleInitially=" + this.useIncorrectHandleInitially);
        arrayList.add("useIncorrectCounterInitially=" + this.useIncorrectCounterInitially);
        arrayList.add("useIncorrectEpochInitially=" + this.useIncorrectEpochInitially);
        arrayList.add("useIncorrectExpiryTimeTooLongInitially=" + this.useIncorrectExpiryTimeTooLongInitially);
        arrayList.add("useIncorrectTimeExpiredInitially=" + this.useIncorrectTimeExpiredInitially);
        arrayList.add("useAnotherKeysHandleInitially=" + this.useAnotherKeysHandleInitially);
        arrayList.add("jsStartTimestamp=" + this.jsStartTimestamp);
        arrayList.add("jsBridgeStartTimestamp=" + this.jsBridgeStartTimestamp);
        arrayList.add("nativeStartTimestamp=" + this.nativeStartTimestamp);
        arrayList.add("bridgeJsToNativeDurationMilliseconds=" + this.bridgeJsToNativeDurationMilliseconds);
        arrayList.add("sourceContext=" + x20.d.i(this.sourceContext));
        return v.y0(arrayList, ", ", "CommandRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final boolean getUseIncorrectTimeExpiredInitially() {
        return this.useIncorrectTimeExpiredInitially;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getVehicleId() {
        return this.vehicleId;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    public /* synthetic */ e(String str, String str2, List list, f fVar, Map map, boolean z11, boolean z12, c cVar, String str3, long j11, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, long j12, long j13, long j14, int i11, String str4, okio.k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? v.m() : list, (i12 & 8) != 0 ? f.SOURCE_NONE : fVar, (i12 & 16) != 0 ? v0.i() : map, (i12 & 32) != 0 ? false : z11, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? null : cVar, (i12 & 256) != 0 ? "" : str3, (i12 & 512) != 0 ? 0L : j11, (i12 & 1024) != 0 ? false : z13, (i12 & 2048) != 0 ? false : z14, (i12 & 4096) != 0 ? false : z15, (i12 & PKIFailureInfo.certRevoked) != 0 ? false : z16, (i12 & 16384) != 0 ? false : z17, (i12 & 32768) != 0 ? false : z18, (i12 & 65536) != 0 ? 0L : j12, (i12 & 131072) != 0 ? 0L : j13, (i12 & 262144) != 0 ? 0L : j14, (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? 0 : i11, (i12 & PKIFailureInfo.badCertTemplate) == 0 ? str4 : "", (i12 & PKIFailureInfo.badSenderNonce) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m467newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String id2, String vehicleId, List<? extends q> transports, f source, Map<String, String> oapiHeaders, boolean z11, boolean z12, c cVar, String vin, long j11, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, long j12, long j13, long j14, int i11, String sourceContext, okio.k unknownFields) {
        super(f77490w, unknownFields);
        s.k(id2, "id");
        s.k(vehicleId, "vehicleId");
        s.k(transports, "transports");
        s.k(source, "source");
        s.k(oapiHeaders, "oapiHeaders");
        s.k(vin, "vin");
        s.k(sourceContext, "sourceContext");
        s.k(unknownFields, "unknownFields");
        this.id = id2;
        this.vehicleId = vehicleId;
        this.source = source;
        this.letSleep = z11;
        this.bypassCounter = z12;
        this.action = cVar;
        this.vin = vin;
        this.receivedRequestBytesTimestamp = j11;
        this.useIncorrectHandleInitially = z13;
        this.useIncorrectCounterInitially = z14;
        this.useIncorrectEpochInitially = z15;
        this.useIncorrectExpiryTimeTooLongInitially = z16;
        this.useIncorrectTimeExpiredInitially = z17;
        this.useAnotherKeysHandleInitially = z18;
        this.jsStartTimestamp = j12;
        this.jsBridgeStartTimestamp = j13;
        this.nativeStartTimestamp = j14;
        this.bridgeJsToNativeDurationMilliseconds = i11;
        this.sourceContext = sourceContext;
        this.transports = x20.d.g("transports", transports);
        this.oapiHeaders = x20.d.h("oapiHeaders", oapiHeaders);
    }
}
