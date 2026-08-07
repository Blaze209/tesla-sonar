package com.tesla.messagedecoding;

import androidx.annotation.Keep;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.tesla.logging.g;
import com.tesla.messagedecoding.RoutableMessageDecoder;
import com.tesla.oapi.CommandActionExtensionsKt;
import com.tesla.sessionmanager.VehicleSessionInfo;
import expo.modules.interfaces.permissions.PermissionsResponse;
import fc0.a3;
import fc0.b3;
import fc0.d;
import fc0.e3;
import fc0.h0;
import fc0.m3;
import fc0.o2;
import fc0.s2;
import fc0.u5;
import fc0.v0;
import fc0.x4;
import fc0.y5;
import fc0.z1;
import ie0.p0;
import j$.time.Instant;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import jc0.c;
import jn0.m;
import jn0.p;
import ke0.e;
import okio.k;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import sc0.f;
import sc0.h;
import vc0.i0;
import vc0.k3;
import vc0.l3;
import vc0.w0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u000223B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\u00020\b*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0014\u001a\u00020\b*\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010$\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\b&\u0010'JE\u0010-\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b-\u0010.R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00100¨\u00064"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder;", "", "<init>", "()V", "Lsc0/h;", "routable", "Lokio/k;", "messageAsBytes", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", IntegerTokenConverter.CONVERTER_KEY, "(Lsc0/h;Lokio/k;)Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "Lcom/tesla/messagedecoding/b$a;", "l", "(Lcom/tesla/messagedecoding/b$a;)Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "Lcom/tesla/messagedecoding/a$a;", "", "requestUUID", "rawSessionInfoData", "Lrc0/m;", SignResponseData.JSON_RESPONSE_DATA_SIGNATURE_DATA, "k", "(Lcom/tesla/messagedecoding/a$a;Lsc0/h;[B[BLrc0/m;)Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "sessionInfo", "Lsc0/d;", "fault", "j", "(Lcom/tesla/sessionmanager/VehicleSessionInfo;Lsc0/h;[B[BLrc0/m;Lsc0/d;)Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "", "vin", "f", "(Lsc0/h;Ljava/lang/String;Lokio/k;)Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "Lsc0/f;", "messageStatus", "Lsc0/b;", "domain", "h", "(Lsc0/h;Lsc0/f;Lsc0/b;)Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", DateTokenConverter.CONVERTER_KEY, "(Lsc0/h;Lsc0/b;Lsc0/d;)Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "routableMessage", "Lid0/a;", "messageDecrypter", "requestTag", "vehicleKeyHex", "b", "(Lsc0/h;Lid0/a;Ljava/lang/String;[BLjava/lang/String;)Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "Result", "a", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoutableMessageDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RoutableMessageDecoder f56417a = new RoutableMessageDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g logger = g.INSTANCE.a("RoutableMessageDecoder");

    @Keep
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR'\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000e\u0082\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "addTelemetry", "(Ljava/lang/String;Ljava/lang/String;)V", "", "_telemetryData$delegate", "Lkotlin/Lazy;", "get_telemetryData", "()Ljava/util/Map;", "_telemetryData", "", "getTelemetryData", "telemetryData", "b", "a", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Result {

        /* JADX INFO: renamed from: _telemetryData$delegate, reason: from kotlin metadata */
        private final Lazy _telemetryData;

        @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0018\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0018\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123¨\u00064"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "<init>", "()V", "r", "b", "c", "w", DateTokenConverter.CONVERTER_KEY, "v", "f", "u", "e", "t", "j", "g", "k", "h", "x", "l", "m", "a", "n", "o", "p", "q", IntegerTokenConverter.CONVERTER_KEY, "s", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$a;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$b;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$c;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$d;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$e;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$f;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$g;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$h;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$i;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$j;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$k;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$l;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$m;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$n;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$o;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$p;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$q;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$r;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$s;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$t;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$u;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$v;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$w;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$x;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class a extends Result {

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$a;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class C1133a extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C1133a f56419a = new C1133a();

                private C1133a() {
                    super(null);
                }

                public String toString() {
                    return "error: bad parameter";
                }
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$b;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;", "response", "Lsc0/d;", "fault", "<init>", "(Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;Lsc0/d;)V", "", "toString", "()Ljava/lang/String;", "a", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;", "c", "()Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;", "b", "Lsc0/d;", "()Lsc0/d;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class b extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final SessionInfoResponse response;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                private final sc0.d fault;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(SessionInfoResponse response, sc0.d fault) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(response, "response");
                    p013kotlin.jvm.internal.s.k(fault, "fault");
                    this.response = response;
                    this.fault = fault;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final sc0.d getFault() {
                    return this.fault;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final SessionInfoResponse getResponse() {
                    return this.response;
                }

                public String toString() {
                    return "error: bad session info " + this.fault + " -- successfully received new session info.";
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$c;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "Lsc0/b;", "domain", "<init>", "(Lsc0/b;)V", "", "toString", "()Ljava/lang/String;", "a", "Lsc0/b;", "b", "()Lsc0/b;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class c extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final sc0.b domain;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(sc0.b domain) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(domain, "domain");
                    this.domain = domain;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final sc0.b getDomain() {
                    return this.domain;
                }

                public String toString() {
                    return "error: bad session info -- failed to receive new session info";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$d;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class d extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final d f56423a = new d();

                private d() {
                    super(null);
                }

                public String toString() {
                    return "error: busy";
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$e;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "", "resultReason", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class e extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String resultReason;

                public e(String str) {
                    super(null);
                    this.resultReason = str;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getResultReason() {
                    return this.resultReason;
                }

                public String toString() {
                    return "car server error result reason => " + this.resultReason;
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$f;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class f extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final f f56425a = new f();

                private f() {
                    super(null);
                }

                public String toString() {
                    return "error: insufficient privileges";
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$g;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "Ljc0/a;", AnalyticsAttribute.Error, "<init>", "(Ljc0/a;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljc0/a;", "b", "()Ljc0/a;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class g extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final jc0.a error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(jc0.a error) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(error, "error");
                    this.error = error;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final jc0.a getError() {
                    return this.error;
                }

                public String toString() {
                    return "error: nominal => " + this.error;
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$h;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "Lsc0/b;", "domain", "<init>", "(Lsc0/b;)V", "", "toString", "()Ljava/lang/String;", "a", "Lsc0/b;", "b", "()Lsc0/b;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class h extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final sc0.b domain;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h(sc0.b domain) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(domain, "domain");
                    this.domain = domain;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final sc0.b getDomain() {
                    return this.domain;
                }

                public String toString() {
                    return "error: invalid handle";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$i;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class i extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final i f56428a = new i();

                private i() {
                    super(null);
                }

                public String toString() {
                    return "error: Missing data to validate session info";
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$j;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "", AnalyticsAttribute.Reason, "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class j extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String reason;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public j(String reason) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(reason, "reason");
                    this.reason = reason;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getReason() {
                    return this.reason;
                }

                public String toString() {
                    return "error: nominal => " + this.reason;
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$k;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "Lsc0/b;", "domain", "<init>", "(Lsc0/b;)V", "", "toString", "()Ljava/lang/String;", "a", "Lsc0/b;", "b", "()Lsc0/b;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class k extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final sc0.b domain;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public k(sc0.b domain) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(domain, "domain");
                    this.domain = domain;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final sc0.b getDomain() {
                    return this.domain;
                }

                public String toString() {
                    return "error: not on whitelist";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$l;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class l extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final l f56431a = new l();

                private l() {
                    super(null);
                }

                public String toString() {
                    return "error: remote access disabled";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$m;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class m extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final m f56432a = new m();

                private m() {
                    super(null);
                }

                public String toString() {
                    return "error: remote service access disabled";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$n;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class n extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final n f56433a = new n();

                private n() {
                    super(null);
                }

                public String toString() {
                    return "error: Client sent a request with a field that exceeds MTU";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$o;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class o extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final o f56434a = new o();

                private o() {
                    super(null);
                }

                public String toString() {
                    return "error: Client's request was received, but response size exceeded MTU";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$p;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class p extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final p f56435a = new p();

                private p() {
                    super(null);
                }

                public String toString() {
                    return "error: Client's request requires supporting encrypted response but was not declared in signing metadata flags.";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$q;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class q extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final q f56436a = new q();

                private q() {
                    super(null);
                }

                public String toString() {
                    return "error: Command can only be sent over BLE.";
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$r;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;", "response", "<init>", "(Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;)V", "", "toString", "()Ljava/lang/String;", "a", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;", "b", "()Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class r extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final SessionInfoResponse response;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public r(SessionInfoResponse response) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(response, "response");
                    this.response = response;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final SessionInfoResponse getResponse() {
                    return this.response;
                }

                public String toString() {
                    return "error: session info empty signature";
                }
            }

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$s;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Exception;", "b", "()Ljava/lang/Exception;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class s extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final Exception exception;

                public s(Exception exc) {
                    super(null);
                    this.exception = exc;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Exception getException() {
                    return this.exception;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof s) && p013kotlin.jvm.internal.s.f(this.exception, ((s) other).exception);
                }

                public int hashCode() {
                    Exception exc = this.exception;
                    if (exc == null) {
                        return 0;
                    }
                    return exc.hashCode();
                }

                public String toString() {
                    Exception exc = this.exception;
                    return "error: exception => " + (exc != null ? exc.getMessage() : null);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$t;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class t extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final String message;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public t(String message) {
                    super(null);
                    p013kotlin.jvm.internal.s.k(message, "message");
                    this.message = message;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getMessage() {
                    return this.message;
                }

                public String toString() {
                    return "error: unhandled => " + this.message;
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$u;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class u extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final u f56440a = new u();

                private u() {
                    super(null);
                }

                public String toString() {
                    return "error: internal error";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$v;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class v extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final v f56441a = new v();

                private v() {
                    super(null);
                }

                public String toString() {
                    return "error: vehicle timeout";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$w;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class w extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final w f56442a = new w();

                private w() {
                    super(null);
                }

                public String toString() {
                    return "error: wait";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a$x;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class x extends a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final x f56443a = new x();

                private x() {
                    super(null);
                }

                public String toString() {
                    return "error: whitelist full";
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0012\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0012\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result;", "<init>", "()V", "c", "b", "n", "h", "o", IntegerTokenConverter.CONVERTER_KEY, "j", "l", "r", "q", "g", "m", "k", "e", "f", "a", DateTokenConverter.CONVERTER_KEY, "p", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$a;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$b;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$c;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$d;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$e;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$f;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$g;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$h;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$i;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$j;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$k;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$l;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$m;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$n;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$o;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$p;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$q;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$r;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static abstract class b extends Result {

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$a, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$a;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lfc0/d;", "addManagedChargingSiteResponse", "<init>", "(Lfc0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfc0/d;", "b", "()Lfc0/d;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class AddManagedChargingSiteResponse extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final d addManagedChargingSiteResponse;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AddManagedChargingSiteResponse(d addManagedChargingSiteResponse) {
                    super(null);
                    s.k(addManagedChargingSiteResponse, "addManagedChargingSiteResponse");
                    this.addManagedChargingSiteResponse = addManagedChargingSiteResponse;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final d getAddManagedChargingSiteResponse() {
                    return this.addManagedChargingSiteResponse;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof AddManagedChargingSiteResponse) && s.f(this.addManagedChargingSiteResponse, ((AddManagedChargingSiteResponse) other).addManagedChargingSiteResponse);
                }

                public int hashCode() {
                    return this.addManagedChargingSiteResponse.hashCode();
                }

                public String toString() {
                    return "AddManagedChargingSiteResponse(addManagedChargingSiteResponse=" + this.addManagedChargingSiteResponse + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$b;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lvc0/i0;", PermissionsResponse.STATUS_KEY, "<init>", "(Lvc0/i0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvc0/i0;", "b", "()Lvc0/i0;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class CommandStatus extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final i0 status;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CommandStatus(i0 status) {
                    super(null);
                    s.k(status, "status");
                    this.status = status;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final i0 getStatus() {
                    return this.status;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof CommandStatus) && s.f(this.status, ((CommandStatus) other).status);
                }

                public int hashCode() {
                    return this.status.hashCode();
                }

                public String toString() {
                    return "CommandStatus(status=" + this.status + ")";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$c;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class c extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final c f56446a = new c();

                private c() {
                    super(null);
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                public int hashCode() {
                    return 1052790957;
                }

                public String toString() {
                    return "EmptyResponse";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$d, reason: from toString */
            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$d;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "", "txid", "", "messageData", "<init>", "(Ljava/lang/String;[B)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTxid", "b", "[B", "()[B", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class EncryptedGetReaderKeyResponse extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String txid;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final byte[] messageData;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public EncryptedGetReaderKeyResponse(String txid, byte[] messageData) {
                    super(null);
                    s.k(txid, "txid");
                    s.k(messageData, "messageData");
                    this.txid = txid;
                    this.messageData = messageData;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final byte[] getMessageData() {
                    return this.messageData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof EncryptedGetReaderKeyResponse)) {
                        return false;
                    }
                    EncryptedGetReaderKeyResponse encryptedGetReaderKeyResponse = (EncryptedGetReaderKeyResponse) other;
                    return s.f(this.txid, encryptedGetReaderKeyResponse.txid) && s.f(this.messageData, encryptedGetReaderKeyResponse.messageData);
                }

                public int hashCode() {
                    return (this.txid.hashCode() * 31) + Arrays.hashCode(this.messageData);
                }

                public String toString() {
                    return "EncryptedGetReaderKeyResponse(txid=" + this.txid + ", messageData=" + Arrays.toString(this.messageData) + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$e, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$e;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lfc0/h0;", "getChargeOnSolarFeatureResponse", "<init>", "(Lfc0/h0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfc0/h0;", "b", "()Lfc0/h0;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class GetChargeOnSolarFeatureResponse extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final h0 getChargeOnSolarFeatureResponse;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public GetChargeOnSolarFeatureResponse(h0 getChargeOnSolarFeatureResponse) {
                    super(null);
                    s.k(getChargeOnSolarFeatureResponse, "getChargeOnSolarFeatureResponse");
                    this.getChargeOnSolarFeatureResponse = getChargeOnSolarFeatureResponse;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final h0 getGetChargeOnSolarFeatureResponse() {
                    return this.getChargeOnSolarFeatureResponse;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof GetChargeOnSolarFeatureResponse) && s.f(this.getChargeOnSolarFeatureResponse, ((GetChargeOnSolarFeatureResponse) other).getChargeOnSolarFeatureResponse);
                }

                public int hashCode() {
                    return this.getChargeOnSolarFeatureResponse.hashCode();
                }

                public String toString() {
                    return "GetChargeOnSolarFeatureResponse(getChargeOnSolarFeatureResponse=" + this.getChargeOnSolarFeatureResponse + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$f, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$f;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lfc0/v0;", "getManagedChargingSitesResponse", "<init>", "(Lfc0/v0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfc0/v0;", "b", "()Lfc0/v0;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class GetManagedChargingSitesResponse extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final v0 getManagedChargingSitesResponse;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public GetManagedChargingSitesResponse(v0 getManagedChargingSitesResponse) {
                    super(null);
                    s.k(getManagedChargingSitesResponse, "getManagedChargingSitesResponse");
                    this.getManagedChargingSitesResponse = getManagedChargingSitesResponse;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final v0 getGetManagedChargingSitesResponse() {
                    return this.getManagedChargingSitesResponse;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof GetManagedChargingSitesResponse) && s.f(this.getManagedChargingSitesResponse, ((GetManagedChargingSitesResponse) other).getManagedChargingSitesResponse);
                }

                public int hashCode() {
                    return this.getManagedChargingSitesResponse.hashCode();
                }

                public String toString() {
                    return "GetManagedChargingSitesResponse(getManagedChargingSitesResponse=" + this.getManagedChargingSitesResponse + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$g, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$g;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lfc0/z1;", "keysInfoResponse", "<init>", "(Lfc0/z1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfc0/z1;", "b", "()Lfc0/z1;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class KeysInfoResponse extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final z1 keysInfoResponse;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public KeysInfoResponse(z1 keysInfoResponse) {
                    super(null);
                    s.k(keysInfoResponse, "keysInfoResponse");
                    this.keysInfoResponse = keysInfoResponse;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final z1 getKeysInfoResponse() {
                    return this.keysInfoResponse;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof KeysInfoResponse) && s.f(this.keysInfoResponse, ((KeysInfoResponse) other).keysInfoResponse);
                }

                public int hashCode() {
                    return this.keysInfoResponse.hashCode();
                }

                public String toString() {
                    return "KeysInfoResponse(keysInfoResponse=" + this.keysInfoResponse + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$h, reason: from toString */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$h;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "", "protoMessageBase64", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class NavigationRoute extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String protoMessageBase64;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public NavigationRoute(String protoMessageBase64) {
                    super(null);
                    s.k(protoMessageBase64, "protoMessageBase64");
                    this.protoMessageBase64 = protoMessageBase64;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getProtoMessageBase64() {
                    return this.protoMessageBase64;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof NavigationRoute) && s.f(this.protoMessageBase64, ((NavigationRoute) other).protoMessageBase64);
                }

                public int hashCode() {
                    return this.protoMessageBase64.hashCode();
                }

                public String toString() {
                    return "NavigationRoute(protoMessageBase64=" + this.protoMessageBase64 + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$i, reason: from toString */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$i;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "", "protoMessageBase64", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class PiiKeyResponse extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String protoMessageBase64;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public PiiKeyResponse(String protoMessageBase64) {
                    super(null);
                    s.k(protoMessageBase64, "protoMessageBase64");
                    this.protoMessageBase64 = protoMessageBase64;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getProtoMessageBase64() {
                    return this.protoMessageBase64;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof PiiKeyResponse) && s.f(this.protoMessageBase64, ((PiiKeyResponse) other).protoMessageBase64);
                }

                public int hashCode() {
                    return this.protoMessageBase64.hashCode();
                }

                public String toString() {
                    return "PiiKeyResponse(protoMessageBase64=" + this.protoMessageBase64 + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$j, reason: from toString */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$j;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "", "protoMessageBase64", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Ping extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String protoMessageBase64;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ping(String protoMessageBase64) {
                    super(null);
                    s.k(protoMessageBase64, "protoMessageBase64");
                    this.protoMessageBase64 = protoMessageBase64;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getProtoMessageBase64() {
                    return this.protoMessageBase64;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Ping) && s.f(this.protoMessageBase64, ((Ping) other).protoMessageBase64);
                }

                public int hashCode() {
                    return this.protoMessageBase64.hashCode();
                }

                public String toString() {
                    return "Ping(protoMessageBase64=" + this.protoMessageBase64 + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$k, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$k;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lfc0/e3;", "pseudonymSyncResponse", "<init>", "(Lfc0/e3;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfc0/e3;", "b", "()Lfc0/e3;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class PseudonymSyncResponse extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final e3 pseudonymSyncResponse;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public PseudonymSyncResponse(e3 pseudonymSyncResponse) {
                    super(null);
                    s.k(pseudonymSyncResponse, "pseudonymSyncResponse");
                    this.pseudonymSyncResponse = pseudonymSyncResponse;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final e3 getPseudonymSyncResponse() {
                    return this.pseudonymSyncResponse;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof PseudonymSyncResponse) && s.f(this.pseudonymSyncResponse, ((PseudonymSyncResponse) other).pseudonymSyncResponse);
                }

                public int hashCode() {
                    return this.pseudonymSyncResponse.hashCode();
                }

                public String toString() {
                    return "PseudonymSyncResponse(pseudonymSyncResponse=" + this.pseudonymSyncResponse + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$l, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$l;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;", "response", "<init>", "(Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;", "b", "()Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SessionInfo extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final SessionInfoResponse response;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SessionInfo(SessionInfoResponse response) {
                    super(null);
                    s.k(response, "response");
                    this.response = response;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final SessionInfoResponse getResponse() {
                    return this.response;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SessionInfo) && s.f(this.response, ((SessionInfo) other).response);
                }

                public int hashCode() {
                    return this.response.hashCode();
                }

                public String toString() {
                    return "SessionInfo(response=" + this.response + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$m, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$m;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lid0/e;", "streamMessageInfo", "<init>", "(Lid0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lid0/e;", "b", "()Lid0/e;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class StreamMessageInfo extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final id0.StreamMessageInfo streamMessageInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public StreamMessageInfo(id0.StreamMessageInfo streamMessageInfo) {
                    super(null);
                    s.k(streamMessageInfo, "streamMessageInfo");
                    this.streamMessageInfo = streamMessageInfo;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final id0.StreamMessageInfo getStreamMessageInfo() {
                    return this.streamMessageInfo;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof StreamMessageInfo) && s.f(this.streamMessageInfo, ((StreamMessageInfo) other).streamMessageInfo);
                }

                public int hashCode() {
                    return this.streamMessageInfo.hashCode();
                }

                public String toString() {
                    return "StreamMessageInfo(streamMessageInfo=" + this.streamMessageInfo + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$n, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$n;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lfc0/u5;", "vehicleData", "<init>", "(Lfc0/u5;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfc0/u5;", "b", "()Lfc0/u5;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class VehicleData extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final u5 vehicleData;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public VehicleData(u5 vehicleData) {
                    super(null);
                    s.k(vehicleData, "vehicleData");
                    this.vehicleData = vehicleData;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final u5 getVehicleData() {
                    return this.vehicleData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof VehicleData) && s.f(this.vehicleData, ((VehicleData) other).vehicleData);
                }

                public int hashCode() {
                    return this.vehicleData.hashCode();
                }

                public String toString() {
                    return "VehicleData(vehicleData=" + this.vehicleData + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$o, reason: from toString */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$o;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "", "protoMessageBase64", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class VehicleDataSubscription extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String protoMessageBase64;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public VehicleDataSubscription(String protoMessageBase64) {
                    super(null);
                    s.k(protoMessageBase64, "protoMessageBase64");
                    this.protoMessageBase64 = protoMessageBase64;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getProtoMessageBase64() {
                    return this.protoMessageBase64;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof VehicleDataSubscription) && s.f(this.protoMessageBase64, ((VehicleDataSubscription) other).protoMessageBase64);
                }

                public int hashCode() {
                    return this.protoMessageBase64.hashCode();
                }

                public String toString() {
                    return "VehicleDataSubscription(protoMessageBase64=" + this.protoMessageBase64 + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$p, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$p;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lwc0/b;", "webrtcResponse", "<init>", "(Lwc0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwc0/b;", "b", "()Lwc0/b;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class WebrtcResponse extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final wc0.b webrtcResponse;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public WebrtcResponse(wc0.b webrtcResponse) {
                    super(null);
                    s.k(webrtcResponse, "webrtcResponse");
                    this.webrtcResponse = webrtcResponse;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final wc0.b getWebrtcResponse() {
                    return this.webrtcResponse;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof WebrtcResponse) && s.f(this.webrtcResponse, ((WebrtcResponse) other).webrtcResponse);
                }

                public int hashCode() {
                    return this.webrtcResponse.hashCode();
                }

                public String toString() {
                    return "WebrtcResponse(webrtcResponse=" + this.webrtcResponse + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$q, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$q;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lvc0/k3;", "info", "<init>", "(Lvc0/k3;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvc0/k3;", "b", "()Lvc0/k3;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class WhitelistEntryInfo extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final k3 info;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public WhitelistEntryInfo(k3 info) {
                    super(null);
                    s.k(info, "info");
                    this.info = info;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final k3 getInfo() {
                    return this.info;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof WhitelistEntryInfo) && s.f(this.info, ((WhitelistEntryInfo) other).info);
                }

                public int hashCode() {
                    return this.info.hashCode();
                }

                public String toString() {
                    return "WhitelistEntryInfo(info=" + this.info + ")";
                }
            }

            /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$Result$b$r, reason: from toString */
            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b$r;", "Lcom/tesla/messagedecoding/RoutableMessageDecoder$Result$b;", "Lvc0/l3;", "whitelistInfo", "<init>", "(Lvc0/l3;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvc0/l3;", "b", "()Lvc0/l3;", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class WhitelistInfo extends b {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final l3 whitelistInfo;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public WhitelistInfo(l3 whitelistInfo) {
                    super(null);
                    s.k(whitelistInfo, "whitelistInfo");
                    this.whitelistInfo = whitelistInfo;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final l3 getWhitelistInfo() {
                    return this.whitelistInfo;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof WhitelistInfo) && s.f(this.whitelistInfo, ((WhitelistInfo) other).whitelistInfo);
                }

                public int hashCode() {
                    return this.whitelistInfo.hashCode();
                }

                public String toString() {
                    return "WhitelistInfo(whitelistInfo=" + this.whitelistInfo + ")";
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private b() {
                super(null);
            }
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map _telemetryData_delegate$lambda$0() {
            return new LinkedHashMap();
        }

        private final Map<String, String> get_telemetryData() {
            return (Map) this._telemetryData.getValue();
        }

        public final void addTelemetry(String key, String value) {
            s.k(key, "key");
            s.k(value, "value");
            get_telemetryData().put(key, value);
        }

        public final Map<String, String> getTelemetryData() {
            return get_telemetryData();
        }

        private Result() {
            this._telemetryData = m.a(p.NONE, new wn0.a() { // from class: id0.c
                @Override // wn0.a
                public final Object invoke() {
                    return RoutableMessageDecoder.Result._telemetryData_delegate$lambda$0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.tesla.messagedecoding.RoutableMessageDecoder$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b&\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010\u0015¨\u0006)"}, d2 = {"Lcom/tesla/messagedecoding/RoutableMessageDecoder$a;", "", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "sessionInfo", "", "rawSessionInfoData", "Lrc0/m;", SignResponseData.JSON_RESPONSE_DATA_SIGNATURE_DATA, "requestUUID", "Lsc0/b;", "domain", "<init>", "(Lcom/tesla/sessionmanager/VehicleSessionInfo;[BLrc0/m;[BLsc0/b;)V", "a", "()Lcom/tesla/sessionmanager/VehicleSessionInfo;", "b", "()[B", "c", "()Lrc0/m;", DateTokenConverter.CONVERTER_KEY, "e", "()Lsc0/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "f", "[B", "getRawSessionInfoData", "Lrc0/m;", "getSignatureData", "getRequestUUID", "Lsc0/b;", "getDomain", "message-decoding_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SessionInfoResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final VehicleSessionInfo sessionInfo;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final byte[] rawSessionInfoData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final rc0.m signatureData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final byte[] requestUUID;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final sc0.b domain;

        public SessionInfoResponse(VehicleSessionInfo sessionInfo, byte[] rawSessionInfoData, rc0.m signatureData, byte[] requestUUID, sc0.b domain) {
            s.k(sessionInfo, "sessionInfo");
            s.k(rawSessionInfoData, "rawSessionInfoData");
            s.k(signatureData, "signatureData");
            s.k(requestUUID, "requestUUID");
            s.k(domain, "domain");
            this.sessionInfo = sessionInfo;
            this.rawSessionInfoData = rawSessionInfoData;
            this.signatureData = signatureData;
            this.requestUUID = requestUUID;
            this.domain = domain;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final VehicleSessionInfo getSessionInfo() {
            return this.sessionInfo;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final byte[] getRawSessionInfoData() {
            return this.rawSessionInfoData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final rc0.m getSignatureData() {
            return this.signatureData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final byte[] getRequestUUID() {
            return this.requestUUID;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final sc0.b getDomain() {
            return this.domain;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SessionInfoResponse)) {
                return false;
            }
            SessionInfoResponse sessionInfoResponse = (SessionInfoResponse) other;
            return s.f(this.sessionInfo, sessionInfoResponse.sessionInfo) && s.f(this.rawSessionInfoData, sessionInfoResponse.rawSessionInfoData) && s.f(this.signatureData, sessionInfoResponse.signatureData) && s.f(this.requestUUID, sessionInfoResponse.requestUUID) && this.domain == sessionInfoResponse.domain;
        }

        public final VehicleSessionInfo f() {
            return this.sessionInfo;
        }

        public int hashCode() {
            return (((((((this.sessionInfo.hashCode() * 31) + Arrays.hashCode(this.rawSessionInfoData)) * 31) + this.signatureData.hashCode()) * 31) + Arrays.hashCode(this.requestUUID)) * 31) + this.domain.hashCode();
        }

        public String toString() {
            return "SessionInfoResponse(sessionInfo=" + this.sessionInfo + ", rawSessionInfoData=" + Arrays.toString(this.rawSessionInfoData) + ", signatureData=" + this.signatureData + ", requestUUID=" + Arrays.toString(this.requestUUID) + ", domain=" + this.domain + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f56468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f56469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f56470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f56471d;

        static {
            int[] iArr = new int[sc0.b.values().length];
            try {
                iArr[sc0.b.DOMAIN_VEHICLE_SECURITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sc0.b.DOMAIN_INFOTAINMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f56468a = iArr;
            int[] iArr2 = new int[sc0.g.values().length];
            try {
                iArr2[sc0.g.OPERATIONSTATUS_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[sc0.g.OPERATIONSTATUS_WAIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[sc0.g.OPERATIONSTATUS_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            f56469b = iArr2;
            int[] iArr3 = new int[s2.values().length];
            try {
                iArr3[s2.OPERATIONSTATUS_OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[s2.OPERATIONSTATUS_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f56470c = iArr3;
            int[] iArr4 = new int[sc0.d.values().length];
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_UNKNOWN_KEY_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_NOT_PROVISIONED_WITH_IDENTITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_KEYCHAIN_IS_FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_BUSY.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_TIMEOUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_COMMAND_REQUIRES_ACCOUNT_CREDENTIALS.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_INSUFFICIENT_PRIVILEGES.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_INTERNAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_REMOTE_ACCESS_DISABLED.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_BAD_PARAMETER.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_REQUEST_MTU_EXCEEDED.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_RESPONSE_MTU_EXCEEDED.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_NONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_REMOTE_SERVICE_ACCESS_DISABLED.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_REQUIRES_RESPONSE_ENCRYPTION.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_COMMAND_REQUIRES_PHYSICAL_PROXIMITY.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_REPEATED_COUNTER.ordinal()] = 17;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_INCORRECT_EPOCH.ordinal()] = 18;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_INVALID_TOKEN_OR_COUNTER.ordinal()] = 19;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_TIME_EXPIRED.ordinal()] = 20;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_TIME_TO_LIVE_TOO_LONG.ordinal()] = 21;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_INACTIVE_KEY.ordinal()] = 22;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_INVALID_DOMAINS.ordinal()] = 23;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_INVALID_COMMAND.ordinal()] = 24;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_DECODING.ordinal()] = 25;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_WRONG_PERSONALIZATION.ordinal()] = 26;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_IV_INCORRECT_LENGTH.ordinal()] = 27;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_COULD_NOT_HASH_METADATA.ordinal()] = 28;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_INVALID_KEY_HANDLE.ordinal()] = 29;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr4[sc0.d.MESSAGEFAULT_ERROR_INVALID_SIGNATURE.ordinal()] = 30;
            } catch (NoSuchFieldError unused37) {
            }
            f56471d = iArr4;
        }
    }

    private RoutableMessageDecoder() {
    }

    private static final void c(Result result, byte[] bArr) {
        result.addTelemetry("received_routable_message_size_bytes", String.valueOf(bArr.length));
    }

    private final Result d(h routable, sc0.b domain, sc0.d fault) {
        try {
            k session_info = routable.getSession_info();
            if (session_info != null) {
                return e(domain, routable, fault, rc0.k.f107686i.decode(session_info));
            }
            return (fault == sc0.d.MESSAGEFAULT_ERROR_INVALID_KEY_HANDLE || fault == sc0.d.MESSAGEFAULT_ERROR_INVALID_SIGNATURE) ? new Result.a.h(domain) : new Result.a.t("routable message didn't contain a payload to decode!");
        } catch (Exception e11) {
            return new Result.a.s(e11);
        }
    }

    private static final Result e(sc0.b bVar, h hVar, sc0.d dVar, rc0.k kVar) {
        a.AbstractC1135a abstractC1135aA = a.f56472a.a(kVar, bVar, id0.d.b(hVar, logger, false, 2, null));
        if (abstractC1135aA instanceof a.AbstractC1135a.Success) {
            RoutableMessageDecoder routableMessageDecoder = f56417a;
            VehicleSessionInfo sessionInfo = ((a.AbstractC1135a.Success) abstractC1135aA).getSessionInfo();
            byte[] bArrJ = hVar.getRequest_uuid().J();
            k session_info = hVar.getSession_info();
            return routableMessageDecoder.j(sessionInfo, hVar, bArrJ, session_info != null ? session_info.J() : null, hVar.getSignature_data(), dVar);
        }
        if (abstractC1135aA instanceof a.AbstractC1135a.b) {
            return new Result.a.k(bVar);
        }
        if (abstractC1135aA instanceof a.AbstractC1135a.ThrownError) {
            return new Result.a.s(((a.AbstractC1135a.ThrownError) abstractC1135aA).getException());
        }
        if (abstractC1135aA instanceof a.AbstractC1135a.C1136a) {
            return new Result.a.h(bVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Result f(h routable, final String vin, k messageAsBytes) {
        final Instant pii_key_expiration;
        m3 m3VarD;
        try {
            if (messageAsBytes == null) {
                k session_info = routable.getSession_info();
                if (session_info == null) {
                    return new Result.a.t("routable message didn't contain a payload to decode!");
                }
                RoutableMessageDecoder routableMessageDecoder = f56417a;
                a.AbstractC1135a abstractC1135aA = a.f56472a.a(rc0.k.f107686i.decode(session_info), sc0.b.DOMAIN_INFOTAINMENT, id0.d.b(routable, logger, false, 2, null));
                byte[] bArrJ = routable.getRequest_uuid().J();
                k session_info2 = routable.getSession_info();
                return routableMessageDecoder.k(abstractC1135aA, routable, bArrJ, session_info2 != null ? session_info2.J() : null, routable.getSignature_data());
            }
            try {
                fc0.l3 l3VarDecode = fc0.l3.f65204w.decode(messageAsBytes);
                g gVar = logger;
                gVar.a("decoded: size:" + messageAsBytes.D() + " " + l3VarDecode);
                fc0.b bVarB = l3VarDecode.getActionStatus();
                s2 s2VarC = bVarB != null ? bVarB.getResult() : null;
                int i11 = s2VarC == null ? -1 : b.f56470c[s2VarC.ordinal()];
                if (i11 != -1 && i11 != 1) {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fc0.b bVarB2 = l3VarDecode.getActionStatus();
                    String strC = (bVarB2 == null || (m3VarD = bVarB2.getResult_reason()) == null) ? null : m3VarD.getPlain_text();
                    if (s.f(strC, "com.tesla.Auth.Error.UnknownKeyID")) {
                        return new Result.a.k(sc0.b.DOMAIN_INFOTAINMENT);
                    }
                    if (s.f(strC, "com.tesla.Auth.Error.InvalidSignature")) {
                        return new Result.a.c(sc0.b.DOMAIN_INFOTAINMENT);
                    }
                    if (s.f(strC, "Unknown command")) {
                        return new Result.a.e(strC);
                    }
                    if (s.f(strC, "")) {
                        return new Result.a.e(strC);
                    }
                    return (strC == null || t.b0(strC, "com.tesla", false, 2, null)) ? new Result.a.e(strC) : new Result.a.j(strC);
                }
                x4 x4VarR = l3VarDecode.getStreamMessage();
                if (x4VarR != null) {
                    return f56417a.l(com.tesla.messagedecoding.b.f56478a.a(x4VarR));
                }
                rc0.k kVarL = l3VarDecode.getGetSessionInfoResponse();
                if (kVarL != null) {
                    RoutableMessageDecoder routableMessageDecoder2 = f56417a;
                    a.AbstractC1135a abstractC1135aA2 = a.f56472a.a(kVarL, sc0.b.DOMAIN_INFOTAINMENT, id0.d.b(routable, gVar, false, 2, null));
                    byte[] bArrJ2 = routable.getRequest_uuid().J();
                    k session_info3 = routable.getSession_info();
                    return routableMessageDecoder2.k(abstractC1135aA2, routable, bArrJ2, session_info3 != null ? session_info3.J() : null, routable.getSignature_data());
                }
                u5 u5VarS = l3VarDecode.getVehicleData();
                if (u5VarS != null) {
                    return new Result.b.VehicleData(u5VarS);
                }
                o2 o2VarN = l3VarDecode.getNavigationRouteResponse();
                if (o2VarN != null) {
                    return new Result.b.NavigationRoute(o2VarN.encodeByteString().a());
                }
                y5 y5VarT = l3VarDecode.getVehicleDataSubscriptionResponse();
                if (y5VarT != null) {
                    return new Result.b.VehicleDataSubscription(y5VarT.encodeByteString().a());
                }
                final a3 a3VarO = l3VarDecode.getPiiKeyResponse();
                if (a3VarO != null && (pii_key_expiration = a3VarO.getPii_key_expiration()) != null) {
                    if (vin != null) {
                        qb0.a.Companion companion = qb0.a.INSTANCE;
                        String strO = companion.b().o(companion.b().v(), vin);
                        Long lZ = strO != null ? t.z(strO) : null;
                        boolean z11 = lZ == null || pii_key_expiration.toEpochMilli() != lZ.longValue();
                        gVar.j("[PII] haveToDecryptKey: " + z11 + ", piiKeyExpiration.toEpochMilli() " + pii_key_expiration.toEpochMilli() + ", myPiiKeyExpiration: " + lZ);
                        if (z11) {
                            p0.a(new wn0.a() { // from class: id0.b
                                @Override // wn0.a
                                public final Object invoke() {
                                    return RoutableMessageDecoder.g(a3VarO, pii_key_expiration, vin);
                                }
                            });
                        }
                    }
                    return new Result.b.PiiKeyResponse(a3VarO.encodeByteString().a());
                }
                b3 b3VarP = l3VarDecode.getPing();
                if (b3VarP != null) {
                    return new Result.b.Ping(b3VarP.encodeByteString().a());
                }
                e3 e3VarQ = l3VarDecode.getPseudonymSyncResponse();
                if (e3VarQ != null) {
                    return new Result.b.PseudonymSyncResponse(e3VarQ);
                }
                h0 h0VarF = l3VarDecode.getGetChargeOnSolarFeatureResponse();
                if (h0VarF != null) {
                    return new Result.b.GetChargeOnSolarFeatureResponse(h0VarF);
                }
                v0 v0VarH = l3VarDecode.getGetManagedChargingSitesResponse();
                if (v0VarH != null) {
                    return new Result.b.GetManagedChargingSitesResponse(v0VarH);
                }
                d dVarC = l3VarDecode.getAddManagedChargingSiteResponse();
                if (dVarC != null) {
                    return new Result.b.AddManagedChargingSiteResponse(dVarC);
                }
                z1 z1VarM = l3VarDecode.getKeysInfoResponse();
                if (z1VarM != null) {
                    return new Result.b.KeysInfoResponse(z1VarM);
                }
                wc0.b bVarV = l3VarDecode.getWebrtcResponse();
                return bVarV != null ? new Result.b.WebrtcResponse(bVarV) : Result.b.c.f56446a;
            } catch (Exception e11) {
                return new Result.a.s(e11);
            }
        } catch (Exception e12) {
            return new Result.a.s(e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 g(a3 a3Var, Instant instant, String str) {
        e.f85983a.e(a3Var.getEncrypted_pii_key().J(), instant, str);
        return jn0.h0.f84049a;
    }

    private final Result h(h routable, f messageStatus, sc0.b domain) {
        Result kVar;
        sc0.d signed_message_fault = messageStatus != null ? messageStatus.getSigned_message_fault() : null;
        g gVar = logger;
        gVar.j("fault: " + (signed_message_fault != null ? CommandActionExtensionsKt.getAnalyticsName(signed_message_fault) : null) + " " + (signed_message_fault != null ? Integer.valueOf(signed_message_fault.getValue()) : null));
        switch (signed_message_fault == null ? -1 : b.f56471d[signed_message_fault.ordinal()]) {
            case -1:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                Result resultD = d(routable, domain, signed_message_fault);
                gVar.j("decode incorrect epoch result: " + resultD);
                return resultD;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
                kVar = new Result.a.k(domain);
                break;
            case 3:
                kVar = Result.a.x.f56443a;
                break;
            case 4:
                kVar = Result.a.d.f56423a;
                break;
            case 5:
                kVar = Result.a.v.f56441a;
                break;
            case 6:
            case 7:
                kVar = Result.a.f.f56425a;
                break;
            case 8:
                kVar = Result.a.u.f56440a;
                break;
            case 9:
                kVar = Result.a.l.f56431a;
                break;
            case 10:
                kVar = Result.a.C1133a.f56419a;
                break;
            case 11:
                kVar = Result.a.n.f56433a;
                break;
            case 12:
                kVar = Result.a.o.f56434a;
                break;
            case 13:
                kVar = new Result.a.t("unsupported routable message status message fault " + signed_message_fault.name());
                break;
            case 14:
                kVar = Result.a.m.f56432a;
                break;
            case 15:
                kVar = Result.a.p.f56435a;
                break;
            case 16:
                kVar = Result.a.q.f56436a;
                break;
        }
        kVar.addTelemetry("signed_command_fault", String.valueOf(signed_message_fault.getValue()));
        return kVar;
    }

    private final Result i(h routable, k messageAsBytes) {
        sc0.b bVar = sc0.b.DOMAIN_VEHICLE_SECURITY;
        if (messageAsBytes != null) {
            try {
                w0 w0VarDecode = w0.f118956z.decode(messageAsBytes);
                g gVar = logger;
                gVar.a("decoded: size:" + messageAsBytes.D() + " " + w0VarDecode);
                l3 l3VarZ = w0VarDecode.getWhitelistInfo();
                if (l3VarZ != null) {
                    return new Result.b.WhitelistInfo(l3VarZ);
                }
                k3 k3VarY = w0VarDecode.getWhitelistEntryInfo();
                if (k3VarY != null) {
                    return new Result.b.WhitelistEntryInfo(k3VarY);
                }
                rc0.k kVarI = w0VarDecode.getEpochSessionInfo();
                if (kVarI != null) {
                    RoutableMessageDecoder routableMessageDecoder = f56417a;
                    a.AbstractC1135a abstractC1135aA = a.f56472a.a(kVarI, bVar, id0.d.b(routable, gVar, false, 2, null));
                    byte[] bArrJ = routable.getRequest_uuid().J();
                    k session_info = routable.getSession_info();
                    return routableMessageDecoder.k(abstractC1135aA, routable, bArrJ, session_info != null ? session_info.J() : null, routable.getSignature_data());
                }
                c cVarM = w0VarDecode.getNominalError();
                if (cVarM != null) {
                    return new Result.a.g(cVarM.getGenericError());
                }
                i0 i0VarH = w0VarDecode.getCommandStatus();
                if (i0VarH != null) {
                    return new Result.b.CommandStatus(i0VarH);
                }
            } catch (Exception e11) {
                return new Result.a.s(e11);
            }
        }
        k session_info2 = routable.getSession_info();
        return session_info2 != null ? f56417a.k(a.f56472a.a(rc0.k.f107686i.decode(session_info2), bVar, id0.d.b(routable, logger, false, 2, null)), routable, routable.getRequest_uuid().J(), session_info2.J(), routable.getSignature_data()) : Result.b.c.f56446a;
    }

    private final Result j(VehicleSessionInfo sessionInfo, h routable, byte[] requestUUID, byte[] rawSessionInfoData, rc0.m signatureData, sc0.d fault) {
        if (rawSessionInfoData == null || signatureData == null) {
            return Result.a.i.f56428a;
        }
        rc0.f session_info_tag = signatureData.getSession_info_tag();
        if (s.f(session_info_tag != null ? session_info_tag.getTag() : null, k.f97943e)) {
            return new Result.a.r(new SessionInfoResponse(sessionInfo, rawSessionInfoData, signatureData, requestUUID, sessionInfo.getDomain()));
        }
        return fault != null ? new Result.a.b(new SessionInfoResponse(sessionInfo, rawSessionInfoData, signatureData, requestUUID, sessionInfo.getDomain()), fault) : new Result.b.SessionInfo(new SessionInfoResponse(sessionInfo, rawSessionInfoData, signatureData, requestUUID, sessionInfo.getDomain()));
    }

    private final Result k(a.AbstractC1135a abstractC1135a, h hVar, byte[] bArr, byte[] bArr2, rc0.m mVar) {
        if (abstractC1135a instanceof a.AbstractC1135a.Success) {
            return j(((a.AbstractC1135a.Success) abstractC1135a).getSessionInfo(), hVar, bArr, bArr2, mVar, null);
        }
        if (abstractC1135a instanceof a.AbstractC1135a.b) {
            return new Result.a.k(((a.AbstractC1135a.b) abstractC1135a).getDomain());
        }
        if (abstractC1135a instanceof a.AbstractC1135a.ThrownError) {
            return new Result.a.s(((a.AbstractC1135a.ThrownError) abstractC1135a).getException());
        }
        if (abstractC1135a instanceof a.AbstractC1135a.C1136a) {
            return new Result.a.h(((a.AbstractC1135a.C1136a) abstractC1135a).getDomain());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Result l(com.tesla.messagedecoding.b.a aVar) {
        if (aVar instanceof com.tesla.messagedecoding.b.a.Success) {
            return new Result.b.StreamMessageInfo(((com.tesla.messagedecoding.b.a.Success) aVar).getStreamMessageInfo());
        }
        if (aVar instanceof com.tesla.messagedecoding.b.a.ThrownError) {
            return new Result.a.s(((com.tesla.messagedecoding.b.a.ThrownError) aVar).getException());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Result b(h routableMessage, id0.a messageDecrypter, String vin, byte[] requestTag, String vehicleKeyHex) {
        sc0.b domain;
        k kVarA;
        h hVar;
        sc0.b bVar;
        byte[] bArr;
        f fVar;
        k kVar;
        sc0.g operation_status;
        s.k(routableMessage, "routableMessage");
        byte[] bArrEncode = routableMessage.encode();
        f signedMessageStatus = routableMessage.getSignedMessageStatus();
        sc0.a from_destination = routableMessage.getFrom_destination();
        if (from_destination == null || (domain = from_destination.getDomain()) == null) {
            return new Result.a.t("destination null, can't parse!");
        }
        k protobuf_message_as_bytes = routableMessage.getProtobuf_message_as_bytes();
        if (vin == null || requestTag == null || vehicleKeyHex == null) {
            kVarA = protobuf_message_as_bytes;
        } else {
            kVarA = messageDecrypter != null ? messageDecrypter.a(vin, routableMessage, domain, requestTag, vehicleKeyHex) : null;
        }
        if (kVarA != null) {
            protobuf_message_as_bytes = kVarA;
        }
        if (protobuf_message_as_bytes != null) {
            kVar = protobuf_message_as_bytes;
            bVar = domain;
            bArr = bArrEncode;
            fVar = signedMessageStatus;
            hVar = routableMessage;
            h.b(hVar, null, null, null, null, null, 0, kVar, null, null, null, null, null, 4031, null);
        } else {
            hVar = routableMessage;
            bVar = domain;
            bArr = bArrEncode;
            fVar = signedMessageStatus;
            kVar = protobuf_message_as_bytes;
        }
        if (fVar == null || (operation_status = fVar.getOperation_status()) == null) {
            operation_status = sc0.g.OPERATIONSTATUS_OK;
        }
        int i11 = b.f56469b[operation_status.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return Result.a.w.f56442a;
            }
            if (i11 == 3) {
                return h(hVar, fVar, bVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        sc0.b bVar2 = bVar;
        int i12 = b.f56468a[bVar2.ordinal()];
        if (i12 == 1) {
            Result resultI = i(hVar, kVar);
            c(resultI, bArr);
            return resultI;
        }
        if (i12 == 2) {
            Result resultF = f(hVar, vin, kVar);
            c(resultF, bArr);
            return resultF;
        }
        return new Result.a.t("cannot decode messages for domain " + bVar2);
    }
}
