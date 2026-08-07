package ic0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b/\u0018\u0000 O2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00013Bó\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0002H\u0017¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00182\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.Jù\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b/\u00100R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b2\u0010.R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010.R\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b6\u0010.R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010,R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bA\u0010CR\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010E\u001a\u0004\bI\u0010GR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010?\u001a\u0004\b5\u0010,R\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010?\u001a\u0004\b7\u0010,R\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bK\u0010,R\u001a\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\bL\u0010,R\u001a\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010?\u001a\u0004\bH\u0010,R\u001a\u0010\u0017\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010?\u001a\u0004\bJ\u0010,R\u001a\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\bD\u0010.R\u001a\u0010\u001b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u00101\u001a\u0004\b>\u0010.R\u001a\u0010\u001c\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u00101\u001a\u0004\bS\u0010.R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bM\u0010UR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u00101\u001a\u0004\bQ\u0010.R\u001c\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\bR\u0010.¨\u0006V"}, d2 = {"Lic0/g;", "Lcom/squareup/wire/f;", "", "", "commandId", "requestId", "response", "Lic0/h;", "result", "Lic0/q;", "transport", "", "statusCode", "Lic0/j;", "hermesState", "", "nativeBridgeStartTimestamp", "jsResponseReceivedTimestamp", "bridgeJsToNativeDurationMilliseconds", "bridgeNativeToJsDurationMilliseconds", "nativeDurationMilliseconds", "wireDurationMilliseconds", "jsRequestCreatedToBridgeDurationMilliseconds", "jsResponseReceivedBridgeToEndDurationMilliseconds", "", "userInitiatedCommand", "initialConnectivityState", "connectivityState", "sourceContext", "Ljc0/a;", "nominalError", "resultReason", "routableSignatureDataBase64", "Lokio/k;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic0/h;Lic0/q;ILic0/j;JJIIIIIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljc0/a;Ljava/lang/String;Ljava/lang/String;Lokio/k;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic0/h;Lic0/q;ILic0/j;JJIIIIIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljc0/a;Ljava/lang/String;Ljava/lang/String;Lokio/k;)Lic0/g;", "Ljava/lang/String;", "e", "b", "o", "c", "p", DateTokenConverter.CONVERTER_KEY, "Lic0/h;", "q", "()Lic0/h;", "Lic0/q;", "v", "()Lic0/q;", "f", "I", "u", "g", "Lic0/j;", "()Lic0/j;", "h", "J", "l", "()J", IntegerTokenConverter.CONVERTER_KEY, "k", "j", "m", "x", "n", "Z", "w", "()Z", "r", "s", "t", "Ljc0/a;", "()Ljc0/a;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends com.squareup.wire.f {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final ProtoAdapter<g> f77514x = new a(com.squareup.wire.b.LENGTH_DELIMITED, o0.b(g.class), com.squareup.wire.o.PROTO_3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 1)
    private final String commandId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 2)
    private final String requestId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 3)
    private final String response;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.CommandResult#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 4)
    private final h result;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.Transport#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 5)
    private final q transport;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 6)
    private final int statusCode;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.commandcenter.HermesState#ADAPTER", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 7)
    private final j hermesState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 10)
    private final long nativeBridgeStartTimestamp;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 11)
    private final long jsResponseReceivedTimestamp;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 12)
    private final int bridgeJsToNativeDurationMilliseconds;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 13)
    private final int bridgeNativeToJsDurationMilliseconds;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 14)
    private final int nativeDurationMilliseconds;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 15)
    private final int wireDurationMilliseconds;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 16)
    private final int jsRequestCreatedToBridgeDurationMilliseconds;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 17)
    private final int jsResponseReceivedBridgeToEndDurationMilliseconds;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 19)
    private final boolean userInitiatedCommand;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 20)
    private final String initialConnectivityState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 21)
    private final String connectivityState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = com.squareup.wire.q.a.OMIT_IDENTITY, tag = 22)
    private final String sourceContext;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.tesla.generated.errors.GenericError_E#ADAPTER", tag = 8)
    private final jc0.a nominalError;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    private final String resultReason;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @com.squareup.wire.q(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 18)
    private final String routableSignatureDataBase64;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"ic0/g$a", "Lcom/squareup/wire/ProtoAdapter;", "Lic0/g;", "value", "", "c", "(Lic0/g;)I", "Lcom/squareup/wire/l;", "writer", "Ljn0/h0;", "b", "(Lcom/squareup/wire/l;Lic0/g;)V", "Lcom/squareup/wire/k;", "reader", "a", "(Lcom/squareup/wire/k;)Lic0/g;", DateTokenConverter.CONVERTER_KEY, "(Lic0/g;)Lic0/g;", "generated_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ProtoAdapter<g> {
        a(com.squareup.wire.b bVar, co0.d<g> dVar, com.squareup.wire.o oVar) {
            super(bVar, dVar, "type.googleapis.com/tesla.proto.CommandResponse", oVar, (Object) null);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g decode(com.squareup.wire.k reader) {
            q qVar;
            j jVar;
            String str;
            s.k(reader, "reader");
            h hVar = h.RESULT_NONE;
            q qVar2 = q.TRANSPORT_NONE;
            j jVar2 = j.INITIAL_STATE;
            long jD = reader.d();
            h hVarDecode = hVar;
            String strDecode = "";
            String strDecode2 = strDecode;
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            int iIntValue4 = 0;
            int iIntValue5 = 0;
            int iIntValue6 = 0;
            int iIntValue7 = 0;
            boolean zBooleanValue = false;
            long jLongValue = 0;
            long jLongValue2 = 0;
            jc0.a aVarDecode = null;
            String strDecode3 = null;
            String strDecode4 = null;
            j jVarDecode = jVar2;
            String strDecode5 = strDecode2;
            String strDecode6 = strDecode5;
            String strDecode7 = strDecode6;
            String strDecode8 = strDecode7;
            q qVarDecode = qVar2;
            while (true) {
                int iG = reader.g();
                if (iG == -1) {
                    return new g(strDecode5, strDecode6, strDecode7, hVarDecode, qVarDecode, iIntValue, jVarDecode, jLongValue, jLongValue2, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, iIntValue7, zBooleanValue, strDecode8, strDecode, strDecode2, aVarDecode, strDecode3, strDecode4, reader.e(jD));
                }
                switch (iG) {
                    case 1:
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 2:
                        strDecode6 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 3:
                        strDecode7 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 4:
                        qVar = qVarDecode;
                        jVar = jVarDecode;
                        str = strDecode5;
                        try {
                            hVarDecode = h.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e11.value));
                        }
                        qVarDecode = qVar;
                        jVarDecode = jVar;
                        strDecode5 = str;
                        break;
                    case 5:
                        qVar = qVarDecode;
                        jVar = jVarDecode;
                        str = strDecode5;
                        try {
                            qVarDecode = q.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e12) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e12.value));
                            qVarDecode = qVar;
                        }
                        jVarDecode = jVar;
                        strDecode5 = str;
                        break;
                    case 6:
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 7:
                        qVar = qVarDecode;
                        jVar = jVarDecode;
                        str = strDecode5;
                        try {
                            jVarDecode = j.ADAPTER.decode(reader);
                            qVarDecode = qVar;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e13) {
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e13.value));
                            qVarDecode = qVar;
                            jVarDecode = jVar;
                        }
                        strDecode5 = str;
                        break;
                    case 8:
                        try {
                            aVarDecode = jc0.a.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e14) {
                            qVar = qVarDecode;
                            jVar = jVarDecode;
                            str = strDecode5;
                            reader.a(iG, com.squareup.wire.b.VARINT, Long.valueOf(e14.value));
                            qVarDecode = qVar;
                            jVarDecode = jVar;
                            strDecode5 = str;
                        }
                        break;
                    case 9:
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 10:
                        jLongValue = ProtoAdapter.INT64.decode(reader).longValue();
                        break;
                    case 11:
                        jLongValue2 = ProtoAdapter.INT64.decode(reader).longValue();
                        break;
                    case 12:
                        iIntValue2 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 13:
                        iIntValue3 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 14:
                        iIntValue4 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 15:
                        iIntValue5 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 16:
                        iIntValue6 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 17:
                        iIntValue7 = ProtoAdapter.INT32.decode(reader).intValue();
                        break;
                    case 18:
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 19:
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                        break;
                    case 20:
                        strDecode8 = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 21:
                        strDecode = ProtoAdapter.STRING.decode(reader);
                        break;
                    case 22:
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                        break;
                    default:
                        reader.m(iG);
                        qVar = qVarDecode;
                        jVar = jVarDecode;
                        str = strDecode5;
                        qVarDecode = qVar;
                        jVarDecode = jVar;
                        strDecode5 = str;
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void encode(com.squareup.wire.l writer, g value) {
            s.k(writer, "writer");
            s.k(value, "value");
            if (!s.f(value.getCommandId(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.getCommandId());
            }
            if (!s.f(value.getRequestId(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.getRequestId());
            }
            if (!s.f(value.getResponse(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.getResponse());
            }
            if (value.getResult() != h.RESULT_NONE) {
                h.ADAPTER.encodeWithTag(writer, 4, value.getResult());
            }
            if (value.getTransport() != q.TRANSPORT_NONE) {
                q.ADAPTER.encodeWithTag(writer, 5, value.getTransport());
            }
            if (value.getStatusCode() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 6, Integer.valueOf(value.getStatusCode()));
            }
            if (value.getHermesState() != j.INITIAL_STATE) {
                j.ADAPTER.encodeWithTag(writer, 7, value.getHermesState());
            }
            if (value.getNativeBridgeStartTimestamp() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 10, Long.valueOf(value.getNativeBridgeStartTimestamp()));
            }
            if (value.getJsResponseReceivedTimestamp() != 0) {
                ProtoAdapter.INT64.encodeWithTag(writer, 11, Long.valueOf(value.getJsResponseReceivedTimestamp()));
            }
            if (value.getBridgeJsToNativeDurationMilliseconds() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 12, Integer.valueOf(value.getBridgeJsToNativeDurationMilliseconds()));
            }
            if (value.getBridgeNativeToJsDurationMilliseconds() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 13, Integer.valueOf(value.getBridgeNativeToJsDurationMilliseconds()));
            }
            if (value.getNativeDurationMilliseconds() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 14, Integer.valueOf(value.getNativeDurationMilliseconds()));
            }
            if (value.getWireDurationMilliseconds() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 15, Integer.valueOf(value.getWireDurationMilliseconds()));
            }
            if (value.getJsRequestCreatedToBridgeDurationMilliseconds() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 16, Integer.valueOf(value.getJsRequestCreatedToBridgeDurationMilliseconds()));
            }
            if (value.getJsResponseReceivedBridgeToEndDurationMilliseconds() != 0) {
                ProtoAdapter.INT32.encodeWithTag(writer, 17, Integer.valueOf(value.getJsResponseReceivedBridgeToEndDurationMilliseconds()));
            }
            if (value.getUserInitiatedCommand()) {
                ProtoAdapter.BOOL.encodeWithTag(writer, 19, Boolean.valueOf(value.getUserInitiatedCommand()));
            }
            if (!s.f(value.getInitialConnectivityState(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 20, value.getInitialConnectivityState());
            }
            if (!s.f(value.getConnectivityState(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 21, value.getConnectivityState());
            }
            if (!s.f(value.getSourceContext(), "")) {
                ProtoAdapter.STRING.encodeWithTag(writer, 22, value.getSourceContext());
            }
            jc0.a.ADAPTER.encodeWithTag(writer, 8, value.getNominalError());
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(writer, 9, value.getResultReason());
            protoAdapter.encodeWithTag(writer, 18, value.getRoutableSignatureDataBase64());
            writer.a(value.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int encodedSize(g value) {
            s.k(value, "value");
            int iD = value.unknownFields().D();
            if (!s.f(value.getCommandId(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getCommandId());
            }
            if (!s.f(value.getRequestId(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getRequestId());
            }
            if (!s.f(value.getResponse(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getResponse());
            }
            if (value.getResult() != h.RESULT_NONE) {
                iD += h.ADAPTER.encodedSizeWithTag(4, value.getResult());
            }
            if (value.getTransport() != q.TRANSPORT_NONE) {
                iD += q.ADAPTER.encodedSizeWithTag(5, value.getTransport());
            }
            if (value.getStatusCode() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(6, Integer.valueOf(value.getStatusCode()));
            }
            if (value.getHermesState() != j.INITIAL_STATE) {
                iD += j.ADAPTER.encodedSizeWithTag(7, value.getHermesState());
            }
            if (value.getNativeBridgeStartTimestamp() != 0) {
                iD += ProtoAdapter.INT64.encodedSizeWithTag(10, Long.valueOf(value.getNativeBridgeStartTimestamp()));
            }
            if (value.getJsResponseReceivedTimestamp() != 0) {
                iD += ProtoAdapter.INT64.encodedSizeWithTag(11, Long.valueOf(value.getJsResponseReceivedTimestamp()));
            }
            if (value.getBridgeJsToNativeDurationMilliseconds() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(12, Integer.valueOf(value.getBridgeJsToNativeDurationMilliseconds()));
            }
            if (value.getBridgeNativeToJsDurationMilliseconds() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(13, Integer.valueOf(value.getBridgeNativeToJsDurationMilliseconds()));
            }
            if (value.getNativeDurationMilliseconds() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(14, Integer.valueOf(value.getNativeDurationMilliseconds()));
            }
            if (value.getWireDurationMilliseconds() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(15, Integer.valueOf(value.getWireDurationMilliseconds()));
            }
            if (value.getJsRequestCreatedToBridgeDurationMilliseconds() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(16, Integer.valueOf(value.getJsRequestCreatedToBridgeDurationMilliseconds()));
            }
            if (value.getJsResponseReceivedBridgeToEndDurationMilliseconds() != 0) {
                iD += ProtoAdapter.INT32.encodedSizeWithTag(17, Integer.valueOf(value.getJsResponseReceivedBridgeToEndDurationMilliseconds()));
            }
            if (value.getUserInitiatedCommand()) {
                iD += ProtoAdapter.BOOL.encodedSizeWithTag(19, Boolean.valueOf(value.getUserInitiatedCommand()));
            }
            if (!s.f(value.getInitialConnectivityState(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(20, value.getInitialConnectivityState());
            }
            if (!s.f(value.getConnectivityState(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(21, value.getConnectivityState());
            }
            if (!s.f(value.getSourceContext(), "")) {
                iD += ProtoAdapter.STRING.encodedSizeWithTag(22, value.getSourceContext());
            }
            int iEncodedSizeWithTag = iD + jc0.a.ADAPTER.encodedSizeWithTag(8, value.getNominalError());
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(9, value.getResultReason()) + protoAdapter.encodedSizeWithTag(18, value.getRoutableSignatureDataBase64());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public g redact(g value) {
            s.k(value, "value");
            return g.b(value, null, null, null, null, null, 0, null, 0L, 0L, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, null, okio.k.f97943e, 4194303, null);
        }
    }

    public g() {
        this(null, null, null, null, null, 0, null, 0L, 0L, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, null, null, 8388607, null);
    }

    public static /* synthetic */ g b(g gVar, String str, String str2, String str3, h hVar, q qVar, int i11, j jVar, long j11, long j12, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11, String str4, String str5, String str6, jc0.a aVar, String str7, String str8, okio.k kVar, int i18, Object obj) {
        return gVar.a((i18 & 1) != 0 ? gVar.commandId : str, (i18 & 2) != 0 ? gVar.requestId : str2, (i18 & 4) != 0 ? gVar.response : str3, (i18 & 8) != 0 ? gVar.result : hVar, (i18 & 16) != 0 ? gVar.transport : qVar, (i18 & 32) != 0 ? gVar.statusCode : i11, (i18 & 64) != 0 ? gVar.hermesState : jVar, (i18 & 128) != 0 ? gVar.nativeBridgeStartTimestamp : j11, (i18 & 256) != 0 ? gVar.jsResponseReceivedTimestamp : j12, (i18 & 512) != 0 ? gVar.bridgeJsToNativeDurationMilliseconds : i12, (i18 & 1024) != 0 ? gVar.bridgeNativeToJsDurationMilliseconds : i13, (i18 & 2048) != 0 ? gVar.nativeDurationMilliseconds : i14, (i18 & 4096) != 0 ? gVar.wireDurationMilliseconds : i15, (i18 & PKIFailureInfo.certRevoked) != 0 ? gVar.jsRequestCreatedToBridgeDurationMilliseconds : i16, (i18 & 16384) != 0 ? gVar.jsResponseReceivedBridgeToEndDurationMilliseconds : i17, (i18 & 32768) != 0 ? gVar.userInitiatedCommand : z11, (i18 & 65536) != 0 ? gVar.initialConnectivityState : str4, (i18 & 131072) != 0 ? gVar.connectivityState : str5, (i18 & 262144) != 0 ? gVar.sourceContext : str6, (i18 & PKIFailureInfo.signerNotTrusted) != 0 ? gVar.nominalError : aVar, (i18 & PKIFailureInfo.badCertTemplate) != 0 ? gVar.resultReason : str7, (i18 & PKIFailureInfo.badSenderNonce) != 0 ? gVar.routableSignatureDataBase64 : str8, (i18 & 4194304) != 0 ? gVar.unknownFields() : kVar);
    }

    public final g a(String commandId, String requestId, String response, h result, q transport, int statusCode, j hermesState, long nativeBridgeStartTimestamp, long jsResponseReceivedTimestamp, int bridgeJsToNativeDurationMilliseconds, int bridgeNativeToJsDurationMilliseconds, int nativeDurationMilliseconds, int wireDurationMilliseconds, int jsRequestCreatedToBridgeDurationMilliseconds, int jsResponseReceivedBridgeToEndDurationMilliseconds, boolean userInitiatedCommand, String initialConnectivityState, String connectivityState, String sourceContext, jc0.a nominalError, String resultReason, String routableSignatureDataBase64, okio.k unknownFields) {
        s.k(commandId, "commandId");
        s.k(requestId, "requestId");
        s.k(response, "response");
        s.k(result, "result");
        s.k(transport, "transport");
        s.k(hermesState, "hermesState");
        s.k(initialConnectivityState, "initialConnectivityState");
        s.k(connectivityState, "connectivityState");
        s.k(sourceContext, "sourceContext");
        s.k(unknownFields, "unknownFields");
        return new g(commandId, requestId, response, result, transport, statusCode, hermesState, nativeBridgeStartTimestamp, jsResponseReceivedTimestamp, bridgeJsToNativeDurationMilliseconds, bridgeNativeToJsDurationMilliseconds, nativeDurationMilliseconds, wireDurationMilliseconds, jsRequestCreatedToBridgeDurationMilliseconds, jsResponseReceivedBridgeToEndDurationMilliseconds, userInitiatedCommand, initialConnectivityState, connectivityState, sourceContext, nominalError, resultReason, routableSignatureDataBase64, unknownFields);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBridgeJsToNativeDurationMilliseconds() {
        return this.bridgeJsToNativeDurationMilliseconds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getBridgeNativeToJsDurationMilliseconds() {
        return this.bridgeNativeToJsDurationMilliseconds;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCommandId() {
        return this.commandId;
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return s.f(unknownFields(), gVar.unknownFields()) && s.f(this.commandId, gVar.commandId) && s.f(this.requestId, gVar.requestId) && s.f(this.response, gVar.response) && this.result == gVar.result && this.transport == gVar.transport && this.statusCode == gVar.statusCode && this.hermesState == gVar.hermesState && this.nativeBridgeStartTimestamp == gVar.nativeBridgeStartTimestamp && this.jsResponseReceivedTimestamp == gVar.jsResponseReceivedTimestamp && this.bridgeJsToNativeDurationMilliseconds == gVar.bridgeJsToNativeDurationMilliseconds && this.bridgeNativeToJsDurationMilliseconds == gVar.bridgeNativeToJsDurationMilliseconds && this.nativeDurationMilliseconds == gVar.nativeDurationMilliseconds && this.wireDurationMilliseconds == gVar.wireDurationMilliseconds && this.jsRequestCreatedToBridgeDurationMilliseconds == gVar.jsRequestCreatedToBridgeDurationMilliseconds && this.jsResponseReceivedBridgeToEndDurationMilliseconds == gVar.jsResponseReceivedBridgeToEndDurationMilliseconds && this.userInitiatedCommand == gVar.userInitiatedCommand && s.f(this.initialConnectivityState, gVar.initialConnectivityState) && s.f(this.connectivityState, gVar.connectivityState) && s.f(this.sourceContext, gVar.sourceContext) && this.nominalError == gVar.nominalError && s.f(this.resultReason, gVar.resultReason) && s.f(this.routableSignatureDataBase64, gVar.routableSignatureDataBase64);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getConnectivityState() {
        return this.connectivityState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final j getHermesState() {
        return this.hermesState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getInitialConnectivityState() {
        return this.initialConnectivityState;
    }

    public int hashCode() {
        int i11 = this.hashCode;
        if (i11 != 0) {
            return i11;
        }
        int iHashCode = ((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.commandId.hashCode()) * 37) + this.requestId.hashCode()) * 37) + this.response.hashCode()) * 37) + this.result.hashCode()) * 37) + this.transport.hashCode()) * 37) + Integer.hashCode(this.statusCode)) * 37) + this.hermesState.hashCode()) * 37) + Long.hashCode(this.nativeBridgeStartTimestamp)) * 37) + Long.hashCode(this.jsResponseReceivedTimestamp)) * 37) + Integer.hashCode(this.bridgeJsToNativeDurationMilliseconds)) * 37) + Integer.hashCode(this.bridgeNativeToJsDurationMilliseconds)) * 37) + Integer.hashCode(this.nativeDurationMilliseconds)) * 37) + Integer.hashCode(this.wireDurationMilliseconds)) * 37) + Integer.hashCode(this.jsRequestCreatedToBridgeDurationMilliseconds)) * 37) + Integer.hashCode(this.jsResponseReceivedBridgeToEndDurationMilliseconds)) * 37) + Boolean.hashCode(this.userInitiatedCommand)) * 37) + this.initialConnectivityState.hashCode()) * 37) + this.connectivityState.hashCode()) * 37) + this.sourceContext.hashCode()) * 37;
        jc0.a aVar = this.nominalError;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 37;
        String str = this.resultReason;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.routableSignatureDataBase64;
        int iHashCode4 = iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getJsRequestCreatedToBridgeDurationMilliseconds() {
        return this.jsRequestCreatedToBridgeDurationMilliseconds;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getJsResponseReceivedBridgeToEndDurationMilliseconds() {
        return this.jsResponseReceivedBridgeToEndDurationMilliseconds;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getJsResponseReceivedTimestamp() {
        return this.jsResponseReceivedTimestamp;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getNativeBridgeStartTimestamp() {
        return this.nativeBridgeStartTimestamp;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getNativeDurationMilliseconds() {
        return this.nativeDurationMilliseconds;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final jc0.a getNominalError() {
        return this.nominalError;
    }

    @Override // com.squareup.wire.f
    public /* bridge */ /* synthetic */ com.squareup.wire.f.a newBuilder() {
        return (com.squareup.wire.f.a) m468newBuilder();
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final h getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getResultReason() {
        return this.resultReason;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getRoutableSignatureDataBase64() {
        return this.routableSignatureDataBase64;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getSourceContext() {
        return this.sourceContext;
    }

    @Override // com.squareup.wire.f
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("commandId=" + x20.d.i(this.commandId));
        arrayList.add("requestId=" + x20.d.i(this.requestId));
        arrayList.add("response=" + x20.d.i(this.response));
        arrayList.add("result=" + this.result);
        arrayList.add("transport=" + this.transport);
        arrayList.add("statusCode=" + this.statusCode);
        arrayList.add("hermesState=" + this.hermesState);
        arrayList.add("nativeBridgeStartTimestamp=" + this.nativeBridgeStartTimestamp);
        arrayList.add("jsResponseReceivedTimestamp=" + this.jsResponseReceivedTimestamp);
        arrayList.add("bridgeJsToNativeDurationMilliseconds=" + this.bridgeJsToNativeDurationMilliseconds);
        arrayList.add("bridgeNativeToJsDurationMilliseconds=" + this.bridgeNativeToJsDurationMilliseconds);
        arrayList.add("nativeDurationMilliseconds=" + this.nativeDurationMilliseconds);
        arrayList.add("wireDurationMilliseconds=" + this.wireDurationMilliseconds);
        arrayList.add("jsRequestCreatedToBridgeDurationMilliseconds=" + this.jsRequestCreatedToBridgeDurationMilliseconds);
        arrayList.add("jsResponseReceivedBridgeToEndDurationMilliseconds=" + this.jsResponseReceivedBridgeToEndDurationMilliseconds);
        arrayList.add("userInitiatedCommand=" + this.userInitiatedCommand);
        arrayList.add("initialConnectivityState=" + x20.d.i(this.initialConnectivityState));
        arrayList.add("connectivityState=" + x20.d.i(this.connectivityState));
        arrayList.add("sourceContext=" + x20.d.i(this.sourceContext));
        jc0.a aVar = this.nominalError;
        if (aVar != null) {
            arrayList.add("nominalError=" + aVar);
        }
        String str = this.resultReason;
        if (str != null) {
            arrayList.add("resultReason=" + x20.d.i(str));
        }
        String str2 = this.routableSignatureDataBase64;
        if (str2 != null) {
            arrayList.add("routableSignatureDataBase64=" + x20.d.i(str2));
        }
        return v.y0(arrayList, ", ", "CommandResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final q getTransport() {
        return this.transport;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final boolean getUserInitiatedCommand() {
        return this.userInitiatedCommand;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getWireDurationMilliseconds() {
        return this.wireDurationMilliseconds;
    }

    public /* synthetic */ g(String str, String str2, String str3, h hVar, q qVar, int i11, j jVar, long j11, long j12, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11, String str4, String str5, String str6, jc0.a aVar, String str7, String str8, okio.k kVar, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this((i18 & 1) != 0 ? "" : str, (i18 & 2) != 0 ? "" : str2, (i18 & 4) != 0 ? "" : str3, (i18 & 8) != 0 ? h.RESULT_NONE : hVar, (i18 & 16) != 0 ? q.TRANSPORT_NONE : qVar, (i18 & 32) != 0 ? 0 : i11, (i18 & 64) != 0 ? j.INITIAL_STATE : jVar, (i18 & 128) != 0 ? 0L : j11, (i18 & 256) == 0 ? j12 : 0L, (i18 & 512) != 0 ? 0 : i12, (i18 & 1024) != 0 ? 0 : i13, (i18 & 2048) != 0 ? 0 : i14, (i18 & 4096) != 0 ? 0 : i15, (i18 & PKIFailureInfo.certRevoked) != 0 ? 0 : i16, (i18 & 16384) != 0 ? 0 : i17, (i18 & 32768) != 0 ? false : z11, (i18 & 65536) != 0 ? "" : str4, (i18 & 131072) != 0 ? "" : str5, (i18 & 262144) == 0 ? str6 : "", (i18 & PKIFailureInfo.signerNotTrusted) != 0 ? null : aVar, (i18 & PKIFailureInfo.badCertTemplate) != 0 ? null : str7, (i18 & PKIFailureInfo.badSenderNonce) == 0 ? str8 : null, (i18 & 4194304) != 0 ? okio.k.f97943e : kVar);
    }

    @jn0.e
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m468newBuilder() {
        throw new AssertionError();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String commandId, String requestId, String response, h result, q transport, int i11, j hermesState, long j11, long j12, int i12, int i13, int i14, int i15, int i16, int i17, boolean z11, String initialConnectivityState, String connectivityState, String sourceContext, jc0.a aVar, String str, String str2, okio.k unknownFields) {
        super(f77514x, unknownFields);
        s.k(commandId, "commandId");
        s.k(requestId, "requestId");
        s.k(response, "response");
        s.k(result, "result");
        s.k(transport, "transport");
        s.k(hermesState, "hermesState");
        s.k(initialConnectivityState, "initialConnectivityState");
        s.k(connectivityState, "connectivityState");
        s.k(sourceContext, "sourceContext");
        s.k(unknownFields, "unknownFields");
        this.commandId = commandId;
        this.requestId = requestId;
        this.response = response;
        this.result = result;
        this.transport = transport;
        this.statusCode = i11;
        this.hermesState = hermesState;
        this.nativeBridgeStartTimestamp = j11;
        this.jsResponseReceivedTimestamp = j12;
        this.bridgeJsToNativeDurationMilliseconds = i12;
        this.bridgeNativeToJsDurationMilliseconds = i13;
        this.nativeDurationMilliseconds = i14;
        this.wireDurationMilliseconds = i15;
        this.jsRequestCreatedToBridgeDurationMilliseconds = i16;
        this.jsResponseReceivedBridgeToEndDurationMilliseconds = i17;
        this.userInitiatedCommand = z11;
        this.initialConnectivityState = initialConnectivityState;
        this.connectivityState = connectivityState;
        this.sourceContext = sourceContext;
        this.nominalError = aVar;
        this.resultReason = str;
        this.routableSignatureDataBase64 = str2;
        if (x20.d.c(aVar, str) > 1) {
            throw new IllegalArgumentException("At most one of nominalError, resultReason may be non-null");
        }
    }
}
