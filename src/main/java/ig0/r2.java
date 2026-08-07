package ig0;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import oi0.n5;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import y20.Snapshot;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0006FHNJPLBi\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b#\u0010$J7\u0010(\u001a\u00020\"*\u001e0%R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)JU\u00101\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\"0/0-0,*\u00020*2\"\u0010+\u001a\u001e0%R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b1\u00102JU\u00104\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020.\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\"0/0-0,*\u0002032\"\u0010+\u001a\u001e0%R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b4\u00105JG\u00107\u001a\u00020\"*\u0002062\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00032\"\u0010+\u001a\u001e0%R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b7\u00108JG\u0010:\u001a\u00020\"*\u0002092\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00032\"\u0010+\u001a\u001e0%R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b:\u0010;J!\u0010?\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u00022\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020=2\u0006\u0010A\u001a\u00020\u0003H\u0016¢\u0006\u0004\bB\u0010CJC\u0010D\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00032\"\u0010+\u001a\u001e0%R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006^"}, d2 = {"Lig0/r2;", "Ly20/k;", "Lig0/r2$b;", "Lig0/r2$f;", "Lig0/r2$c;", "", "Lec/r;", "imageLoader", "Landroid/content/Context;", "applicationContext", "Loh0/c1;", "permissionRequestWorkflow", "Lig0/c;", "documentCameraWorker", "Lig0/v2$b;", "documentsSelectWorkerFactory", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "documentCreateWorker", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "documentLoadWorker", "Lcom/withpersona/sdk2/inquiry/document/network/b$a;", "documentFileUploadWorker", "Lkg0/a$a;", "documentFileDeleteWorker", "Lcom/withpersona/sdk2/inquiry/document/network/d$a;", "documentSubmitWorker", "Lii0/b;", "navigationStateManager", "Lei0/c;", "externalEventLogger", "<init>", "(Lec/r;Landroid/content/Context;Loh0/c1;Lig0/c;Lig0/v2$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lcom/withpersona/sdk2/inquiry/document/network/b$a;Lkg0/a$a;Lcom/withpersona/sdk2/inquiry/document/network/d$a;Lii0/b;Lei0/c;)V", "renderProps", "renderState", "Ljn0/h0;", "K0", "(Lig0/r2$b;Lig0/r2$f;)V", "Ly20/k$a;", "Lig0/r2$a;", "event", "L0", "(Ly20/k$a;Lig0/r2$a;)V", "Lig0/u;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Lkotlin/Pair;", "", "Lkotlin/Function1;", "Loi0/n5;", "A0", "(Lig0/u;Ly20/k$a;)Ljava/util/List;", "Lig0/b3;", "B0", "(Lig0/b3;Ly20/k$a;)Ljava/util/List;", "Lig0/r2$f$a;", "I1", "(Lig0/r2$f$a;Lig0/r2$b;Lig0/r2$f;Ly20/k$a;)V", "Lig0/r2$f$f;", "J1", "(Lig0/r2$f$f;Lig0/r2$b;Lig0/r2$f;Ly20/k$a;)V", "props", "Ly20/i;", "snapshot", "J0", "(Lig0/r2$b;Ly20/i;)Lig0/r2$f;", "state", "b2", "(Lig0/r2$f;)Ly20/i;", "W0", "(Lig0/r2$b;Lig0/r2$f;Ly20/k$a;)Ljava/lang/Object;", "a", "Lec/r;", "b", "Landroid/content/Context;", "c", "Loh0/c1;", DateTokenConverter.CONVERTER_KEY, "Lig0/c;", "e", "Lig0/v2$b;", "f", "Lcom/withpersona/sdk2/inquiry/document/network/a$a;", "g", "Lcom/withpersona/sdk2/inquiry/document/network/c$a;", "h", "Lcom/withpersona/sdk2/inquiry/document/network/b$a;", IntegerTokenConverter.CONVERTER_KEY, "Lkg0/a$a;", "j", "Lcom/withpersona/sdk2/inquiry/document/network/d$a;", "k", "Lii0/b;", "l", "Lei0/c;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r2 extends y20.k<Input, f, c, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ec.r imageLoader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oh0.c1 permissionRequestWorkflow;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ig0.c documentCameraWorker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final v2.b documentsSelectWorkerFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.document.network.a.C1162a documentCreateWorker;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.document.network.c.a documentLoadWorker;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.document.network.b.a documentFileUploadWorker;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final kg0.a.C1838a documentFileDeleteWorker;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.document.network.d.a documentSubmitWorker;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ii0.b navigationStateManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ei0.c externalEventLogger;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lig0/r2$a;", "", "<init>", "()V", "b", "a", "g", "h", "j", "e", "c", "f", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "Lig0/r2$a$a;", "Lig0/r2$a$b;", "Lig0/r2$a$c;", "Lig0/r2$a$d;", "Lig0/r2$a$e;", "Lig0/r2$a$f;", "Lig0/r2$a$g;", "Lig0/r2$a$h;", "Lig0/r2$a$i;", "Lig0/r2$a$j;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: ig0.r2$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig0/r2$a$a;", "Lig0/r2$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class C1643a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1643a f77857a = new C1643a();

            private C1643a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1643a);
            }

            public int hashCode() {
                return 1245705540;
            }

            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig0/r2$a$b;", "Lig0/r2$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f77858a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1143899241;
            }

            public String toString() {
                return "Cancel";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig0/r2$a$c;", "Lig0/r2$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f77859a = new c();

            private c() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1422406686;
            }

            public String toString() {
                return "CloseUploadOptions";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig0/r2$a$d;", "Lig0/r2$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f77860a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -967280389;
            }

            public String toString() {
                return "DismissError";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig0/r2$a$e;", "Lig0/r2$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f77861a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return -1532240394;
            }

            public String toString() {
                return "OpenUploadOptions";
            }
        }

        /* JADX INFO: renamed from: ig0.r2$a$f, reason: from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lig0/r2$a$f;", "Lig0/r2$a;", "", "documentId", "Lig0/d$b;", "document", "<init>", "(Ljava/lang/String;Lig0/d$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lig0/d$b;", "()Lig0/d$b;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RemoveDocument extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final ig0.d.Remote document;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RemoveDocument(String documentId, ig0.d.Remote document) {
                super(null);
                p013kotlin.jvm.internal.s.k(documentId, "documentId");
                p013kotlin.jvm.internal.s.k(document, "document");
                this.documentId = documentId;
                this.document = document;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ig0.d.Remote getDocument() {
                return this.document;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RemoveDocument)) {
                    return false;
                }
                RemoveDocument removeDocument = (RemoveDocument) other;
                return p013kotlin.jvm.internal.s.f(this.documentId, removeDocument.documentId) && p013kotlin.jvm.internal.s.f(this.document, removeDocument.document);
            }

            public int hashCode() {
                return (this.documentId.hashCode() * 31) + this.document.hashCode();
            }

            public String toString() {
                return "RemoveDocument(documentId=" + this.documentId + ", document=" + this.document + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig0/r2$a$g;", "Lig0/r2$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class g extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f77864a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            public int hashCode() {
                return -1818587564;
            }

            public String toString() {
                return "SelectDocument";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig0/r2$a$h;", "Lig0/r2$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class h extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final h f77865a = new h();

            private h() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            public int hashCode() {
                return 1457257560;
            }

            public String toString() {
                return "SelectPhotoFromLibrary";
            }
        }

        /* JADX INFO: renamed from: ig0.r2$a$i, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lig0/r2$a$i;", "Lig0/r2$a;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Submit extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Submit(String documentId) {
                super(null);
                p013kotlin.jvm.internal.s.k(documentId, "documentId");
                this.documentId = documentId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Submit) && p013kotlin.jvm.internal.s.f(this.documentId, ((Submit) other).documentId);
            }

            public int hashCode() {
                return this.documentId.hashCode();
            }

            public String toString() {
                return "Submit(documentId=" + this.documentId + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig0/r2$a$j;", "Lig0/r2$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class j extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final j f77867a = new j();

            private j() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            public int hashCode() {
                return -623405138;
            }

            public String toString() {
                return "TakePhoto";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ig0.r2$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010&R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010&R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010-\u001a\u0004\b4\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b3\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b:\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b;\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010-\u001a\u0004\b<\u0010&R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\b9\u0010&R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b=\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b7\u0010&R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b;\u0010C\u001a\u0004\b>\u0010DR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b5\u0010(R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b/\u0010IR\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bJ\u0010H\u001a\u0004\b1\u0010IR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bK\u0010-\u001a\u0004\bK\u0010&R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u0010-\u001a\u0004\bJ\u0010&R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010-\u001a\u0004\bG\u0010&R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\bE\u0010&R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bA\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bM\u0010O\u001a\u0004\b,\u0010PR\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b:\u0010Q\u001a\u0004\b?\u0010R¨\u0006S"}, d2 = {"Lig0/r2$b;", "", "", "sessionToken", "inquiryId", "fromStep", "fromComponent", "promptTitle", "promptDescription", "disclaimer", "submitButtonText", "pendingTitle", "pendingDescription", "fieldKeyDocument", "kind", "documentId", "Lig0/r2$e;", "startPage", "Lig0/l;", "pages", "", "documentFileLimit", "", "backStepEnabled", "cancelButtonEnabled", "permissionsTitle", "permissionsRationale", "permissionsModalPositiveButton", "permissionsModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lig0/r2$e;Lig0/l;IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "v", "b", "j", "c", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "h", "e", "u", "f", "t", "g", "y", "o", "m", "k", "l", "n", "Lig0/r2$e;", "w", "()Lig0/r2$e;", "Lig0/l;", "()Lig0/l;", "p", "I", "q", "Z", "()Z", "r", "s", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "x", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Input {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionToken;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fromStep;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fromComponent;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String promptTitle;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String promptDescription;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String disclaimer;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String submitButtonText;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pendingTitle;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String pendingDescription;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fieldKeyDocument;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String kind;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final e startPage;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final l pages;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final int documentFileLimit;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean backStepEnabled;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final String permissionsTitle;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final String permissionsRationale;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String permissionsModalPositiveButton;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final String permissionsModalNegativeButton;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final StepStyles.DocumentStepStyle styles;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.Document.AssetConfig assetConfig;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final PendingPageTextPosition pendingPageTextVerticalPosition;

        public Input(String sessionToken, String inquiryId, String fromStep, String fromComponent, String str, String str2, String str3, String str4, String str5, String str6, String fieldKeyDocument, String kind, String str7, e startPage, l pages, int i11, boolean z11, boolean z12, String str8, String str9, String str10, String str11, StepStyles.DocumentStepStyle documentStepStyle, NextStep.Document.AssetConfig assetConfig, PendingPageTextPosition pendingPageTextVerticalPosition) {
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(fromStep, "fromStep");
            p013kotlin.jvm.internal.s.k(fromComponent, "fromComponent");
            p013kotlin.jvm.internal.s.k(fieldKeyDocument, "fieldKeyDocument");
            p013kotlin.jvm.internal.s.k(kind, "kind");
            p013kotlin.jvm.internal.s.k(startPage, "startPage");
            p013kotlin.jvm.internal.s.k(pages, "pages");
            p013kotlin.jvm.internal.s.k(assetConfig, "assetConfig");
            p013kotlin.jvm.internal.s.k(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.fromStep = fromStep;
            this.fromComponent = fromComponent;
            this.promptTitle = str;
            this.promptDescription = str2;
            this.disclaimer = str3;
            this.submitButtonText = str4;
            this.pendingTitle = str5;
            this.pendingDescription = str6;
            this.fieldKeyDocument = fieldKeyDocument;
            this.kind = kind;
            this.documentId = str7;
            this.startPage = startPage;
            this.pages = pages;
            this.documentFileLimit = i11;
            this.backStepEnabled = z11;
            this.cancelButtonEnabled = z12;
            this.permissionsTitle = str8;
            this.permissionsRationale = str9;
            this.permissionsModalPositiveButton = str10;
            this.permissionsModalNegativeButton = str11;
            this.styles = documentStepStyle;
            this.assetConfig = assetConfig;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final NextStep.Document.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getDocumentFileLimit() {
            return this.documentFileLimit;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Input)) {
                return false;
            }
            Input input = (Input) other;
            return p013kotlin.jvm.internal.s.f(this.sessionToken, input.sessionToken) && p013kotlin.jvm.internal.s.f(this.inquiryId, input.inquiryId) && p013kotlin.jvm.internal.s.f(this.fromStep, input.fromStep) && p013kotlin.jvm.internal.s.f(this.fromComponent, input.fromComponent) && p013kotlin.jvm.internal.s.f(this.promptTitle, input.promptTitle) && p013kotlin.jvm.internal.s.f(this.promptDescription, input.promptDescription) && p013kotlin.jvm.internal.s.f(this.disclaimer, input.disclaimer) && p013kotlin.jvm.internal.s.f(this.submitButtonText, input.submitButtonText) && p013kotlin.jvm.internal.s.f(this.pendingTitle, input.pendingTitle) && p013kotlin.jvm.internal.s.f(this.pendingDescription, input.pendingDescription) && p013kotlin.jvm.internal.s.f(this.fieldKeyDocument, input.fieldKeyDocument) && p013kotlin.jvm.internal.s.f(this.kind, input.kind) && p013kotlin.jvm.internal.s.f(this.documentId, input.documentId) && p013kotlin.jvm.internal.s.f(this.startPage, input.startPage) && p013kotlin.jvm.internal.s.f(this.pages, input.pages) && this.documentFileLimit == input.documentFileLimit && this.backStepEnabled == input.backStepEnabled && this.cancelButtonEnabled == input.cancelButtonEnabled && p013kotlin.jvm.internal.s.f(this.permissionsTitle, input.permissionsTitle) && p013kotlin.jvm.internal.s.f(this.permissionsRationale, input.permissionsRationale) && p013kotlin.jvm.internal.s.f(this.permissionsModalPositiveButton, input.permissionsModalPositiveButton) && p013kotlin.jvm.internal.s.f(this.permissionsModalNegativeButton, input.permissionsModalNegativeButton) && p013kotlin.jvm.internal.s.f(this.styles, input.styles) && p013kotlin.jvm.internal.s.f(this.assetConfig, input.assetConfig) && this.pendingPageTextVerticalPosition == input.pendingPageTextVerticalPosition;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        public int hashCode() {
            int iHashCode = ((((((this.sessionToken.hashCode() * 31) + this.inquiryId.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + this.fromComponent.hashCode()) * 31;
            String str = this.promptTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.promptDescription;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.disclaimer;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.submitButtonText;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.pendingTitle;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.pendingDescription;
            int iHashCode7 = (((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.fieldKeyDocument.hashCode()) * 31) + this.kind.hashCode()) * 31;
            String str7 = this.documentId;
            int iHashCode8 = (((((((((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.startPage.hashCode()) * 31) + this.pages.hashCode()) * 31) + Integer.hashCode(this.documentFileLimit)) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31;
            String str8 = this.permissionsTitle;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.permissionsRationale;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.permissionsModalPositiveButton;
            int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.permissionsModalNegativeButton;
            int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            return ((((iHashCode12 + (documentStepStyle != null ? documentStepStyle.hashCode() : 0)) * 31) + this.assetConfig.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final l getPages() {
            return this.pages;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getPendingDescription() {
            return this.pendingDescription;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getPendingTitle() {
            return this.pendingTitle;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getPermissionsModalNegativeButton() {
            return this.permissionsModalNegativeButton;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final String getPermissionsModalPositiveButton() {
            return this.permissionsModalPositiveButton;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final String getPermissionsRationale() {
            return this.permissionsRationale;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getPermissionsTitle() {
            return this.permissionsTitle;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final String getPromptDescription() {
            return this.promptDescription;
        }

        public String toString() {
            return "Input(sessionToken=" + this.sessionToken + ", inquiryId=" + this.inquiryId + ", fromStep=" + this.fromStep + ", fromComponent=" + this.fromComponent + ", promptTitle=" + this.promptTitle + ", promptDescription=" + this.promptDescription + ", disclaimer=" + this.disclaimer + ", submitButtonText=" + this.submitButtonText + ", pendingTitle=" + this.pendingTitle + ", pendingDescription=" + this.pendingDescription + ", fieldKeyDocument=" + this.fieldKeyDocument + ", kind=" + this.kind + ", documentId=" + this.documentId + ", startPage=" + this.startPage + ", pages=" + this.pages + ", documentFileLimit=" + this.documentFileLimit + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", permissionsTitle=" + this.permissionsTitle + ", permissionsRationale=" + this.permissionsRationale + ", permissionsModalPositiveButton=" + this.permissionsModalPositiveButton + ", permissionsModalNegativeButton=" + this.permissionsModalNegativeButton + ", styles=" + this.styles + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ")";
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final String getPromptTitle() {
            return this.promptTitle;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        /* JADX INFO: renamed from: w, reason: from getter */
        public final e getStartPage() {
            return this.startPage;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getSubmitButtonText() {
            return this.submitButtonText;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lig0/r2$c;", "", "<init>", "()V", "b", "a", "c", DateTokenConverter.CONVERTER_KEY, "Lig0/r2$c$a;", "Lig0/r2$c$b;", "Lig0/r2$c$c;", "Lig0/r2$c$d;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig0/r2$c$a;", "Lig0/r2$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f77893a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 89823627;
            }

            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig0/r2$c$b;", "Lig0/r2$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f77894a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -1234032835;
            }

            public String toString() {
                return "Canceled";
            }
        }

        /* JADX INFO: renamed from: ig0.r2$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lig0/r2$c$c;", "Lig0/r2$c;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Errored extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Errored(InternalErrorInfo cause) {
                super(null);
                p013kotlin.jvm.internal.s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Errored) && p013kotlin.jvm.internal.s.f(this.cause, ((Errored) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "Errored(cause=" + this.cause + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig0/r2$c$d;", "Lig0/r2$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f77896a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1784519914;
            }

            public String toString() {
                return "Finished";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lig0/r2$d;", "", "<init>", "()V", "b", "a", "Lig0/r2$d$a;", "Lig0/r2$d$b;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class d {

        /* JADX INFO: renamed from: ig0.r2$d$a, reason: from toString */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010$R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010'R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b%\u0010'R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b\u001d\u0010-R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010.\u001a\u0004\b(\u0010/¨\u00060"}, d2 = {"Lig0/r2$d$a;", "Lig0/r2$d;", "", "title", "prompt", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "onBack", "onCancel", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "assetConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lii0/a;Lwn0/a;Lwn0/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "h", "b", "f", "c", "Lii0/a;", "()Lii0/a;", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "()Lwn0/a;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "g", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LoadingAnimation extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String prompt;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ii0.a navigationState;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final wn0.a<jn0.h0> onBack;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final wn0.a<jn0.h0> onCancel;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final StepStyles.DocumentStepStyle styles;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final NextStep.Document.AssetConfig.PendingPage assetConfig;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final PendingPageTextPosition pendingPageTextVerticalPosition;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadingAnimation(String str, String str2, ii0.a navigationState, wn0.a<jn0.h0> onBack, wn0.a<jn0.h0> onCancel, StepStyles.DocumentStepStyle documentStepStyle, NextStep.Document.AssetConfig.PendingPage pendingPage, PendingPageTextPosition pendingPageTextVerticalPosition) {
                super(null);
                p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
                p013kotlin.jvm.internal.s.k(onBack, "onBack");
                p013kotlin.jvm.internal.s.k(onCancel, "onCancel");
                p013kotlin.jvm.internal.s.k(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
                this.title = str;
                this.prompt = str2;
                this.navigationState = navigationState;
                this.onBack = onBack;
                this.onCancel = onCancel;
                this.styles = documentStepStyle;
                this.assetConfig = pendingPage;
                this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final NextStep.Document.AssetConfig.PendingPage getAssetConfig() {
                return this.assetConfig;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ii0.a getNavigationState() {
                return this.navigationState;
            }

            public final wn0.a<jn0.h0> c() {
                return this.onBack;
            }

            public final wn0.a<jn0.h0> d() {
                return this.onCancel;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
                return this.pendingPageTextVerticalPosition;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadingAnimation)) {
                    return false;
                }
                LoadingAnimation loadingAnimation = (LoadingAnimation) other;
                return p013kotlin.jvm.internal.s.f(this.title, loadingAnimation.title) && p013kotlin.jvm.internal.s.f(this.prompt, loadingAnimation.prompt) && p013kotlin.jvm.internal.s.f(this.navigationState, loadingAnimation.navigationState) && p013kotlin.jvm.internal.s.f(this.onBack, loadingAnimation.onBack) && p013kotlin.jvm.internal.s.f(this.onCancel, loadingAnimation.onCancel) && p013kotlin.jvm.internal.s.f(this.styles, loadingAnimation.styles) && p013kotlin.jvm.internal.s.f(this.assetConfig, loadingAnimation.assetConfig) && this.pendingPageTextVerticalPosition == loadingAnimation.pendingPageTextVerticalPosition;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final StepStyles.DocumentStepStyle getStyles() {
                return this.styles;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.title;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.prompt;
                int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.navigationState.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onCancel.hashCode()) * 31;
                StepStyles.DocumentStepStyle documentStepStyle = this.styles;
                int iHashCode3 = (iHashCode2 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
                NextStep.Document.AssetConfig.PendingPage pendingPage = this.assetConfig;
                return ((iHashCode3 + (pendingPage != null ? pendingPage.hashCode() : 0)) * 31) + this.pendingPageTextVerticalPosition.hashCode();
            }

            public String toString() {
                return "LoadingAnimation(title=" + this.title + ", prompt=" + this.prompt + ", navigationState=" + this.navigationState + ", onBack=" + this.onBack + ", onCancel=" + this.onCancel + ", styles=" + this.styles + ", assetConfig=" + this.assetConfig + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ")";
            }
        }

        /* JADX INFO: renamed from: ig0.r2$d$b, reason: from toString */
        @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001Bý\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u001a2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b4\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b8\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b/\u00109\u001a\u0004\b6\u0010:R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bG\u0010AR#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u00148\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bF\u0010JR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bG\u0010?\u001a\u0004\bH\u0010AR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010?\u001a\u0004\bB\u0010AR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\b>\u0010AR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b1\u0010NR\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b8\u0010M\u001a\u0004\b-\u0010NR\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b3\u0010M\u001a\u0004\bL\u0010NR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bO\u00102\u001a\u0004\b7\u0010%R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\bP\u0010?\u001a\u0004\bD\u0010AR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bK\u0010S¨\u0006T"}, d2 = {"Lig0/r2$d$b;", "Lig0/r2$d;", "Lec/r;", "imageLoader", "", "title", "prompt", "disclaimer", "submitButtonText", "", "Lig0/d;", "documents", "Lii0/a;", "navigationState", "Lkotlin/Function0;", "Ljn0/h0;", "openSelectFile", "selectFromPhotoLibrary", "openCamera", "openUploadOptions", "Lkotlin/Function1;", "Lig0/d$b;", "onRemove", "onSubmit", "onCancel", "onBack", "", "disabled", "addButtonEnabled", "submitButtonEnabled", AnalyticsAttribute.Error, "onErrorDismissed", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "<init>", "(Lec/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lii0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/a;Lwn0/l;Lwn0/a;Lwn0/a;Lwn0/a;ZZZLjava/lang/String;Lwn0/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lec/r;", "f", "()Lec/r;", "b", "Ljava/lang/String;", "r", "c", "n", DateTokenConverter.CONVERTER_KEY, "e", "q", "Ljava/util/List;", "()Ljava/util/List;", "g", "Lii0/a;", "()Lii0/a;", "h", "Lwn0/a;", "getOpenSelectFile", "()Lwn0/a;", IntegerTokenConverter.CONVERTER_KEY, "getSelectFromPhotoLibrary", "j", "getOpenCamera", "k", "m", "l", "Lwn0/l;", "()Lwn0/l;", "o", "p", "Z", "()Z", "s", "t", "u", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReviewCaptures extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final ec.r imageLoader;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String prompt;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String disclaimer;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String submitButtonText;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<ig0.d> documents;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final ii0.a navigationState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final wn0.a<jn0.h0> openSelectFile;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final wn0.a<jn0.h0> selectFromPhotoLibrary;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final wn0.a<jn0.h0> openCamera;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final wn0.a<jn0.h0> openUploadOptions;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final wn0.l<ig0.d.Remote, jn0.h0> onRemove;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final wn0.a<jn0.h0> onSubmit;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final wn0.a<jn0.h0> onCancel;

            /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
            private final wn0.a<jn0.h0> onBack;

            /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean disabled;

            /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean addButtonEnabled;

            /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean submitButtonEnabled;

            /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
            private final String error;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
            private final wn0.a<jn0.h0> onErrorDismissed;

            /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
            private final StepStyles.DocumentStepStyle styles;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCaptures(ec.r imageLoader, String str, String str2, String str3, String str4, List<? extends ig0.d> documents, ii0.a navigationState, wn0.a<jn0.h0> openSelectFile, wn0.a<jn0.h0> selectFromPhotoLibrary, wn0.a<jn0.h0> openCamera, wn0.a<jn0.h0> openUploadOptions, wn0.l<? super ig0.d.Remote, jn0.h0> onRemove, wn0.a<jn0.h0> onSubmit, wn0.a<jn0.h0> onCancel, wn0.a<jn0.h0> onBack, boolean z11, boolean z12, boolean z13, String str5, wn0.a<jn0.h0> onErrorDismissed, StepStyles.DocumentStepStyle documentStepStyle) {
                super(null);
                p013kotlin.jvm.internal.s.k(imageLoader, "imageLoader");
                p013kotlin.jvm.internal.s.k(documents, "documents");
                p013kotlin.jvm.internal.s.k(navigationState, "navigationState");
                p013kotlin.jvm.internal.s.k(openSelectFile, "openSelectFile");
                p013kotlin.jvm.internal.s.k(selectFromPhotoLibrary, "selectFromPhotoLibrary");
                p013kotlin.jvm.internal.s.k(openCamera, "openCamera");
                p013kotlin.jvm.internal.s.k(openUploadOptions, "openUploadOptions");
                p013kotlin.jvm.internal.s.k(onRemove, "onRemove");
                p013kotlin.jvm.internal.s.k(onSubmit, "onSubmit");
                p013kotlin.jvm.internal.s.k(onCancel, "onCancel");
                p013kotlin.jvm.internal.s.k(onBack, "onBack");
                p013kotlin.jvm.internal.s.k(onErrorDismissed, "onErrorDismissed");
                this.imageLoader = imageLoader;
                this.title = str;
                this.prompt = str2;
                this.disclaimer = str3;
                this.submitButtonText = str4;
                this.documents = documents;
                this.navigationState = navigationState;
                this.openSelectFile = openSelectFile;
                this.selectFromPhotoLibrary = selectFromPhotoLibrary;
                this.openCamera = openCamera;
                this.openUploadOptions = openUploadOptions;
                this.onRemove = onRemove;
                this.onSubmit = onSubmit;
                this.onCancel = onCancel;
                this.onBack = onBack;
                this.disabled = z11;
                this.addButtonEnabled = z12;
                this.submitButtonEnabled = z13;
                this.error = str5;
                this.onErrorDismissed = onErrorDismissed;
                this.styles = documentStepStyle;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getAddButtonEnabled() {
                return this.addButtonEnabled;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getDisabled() {
                return this.disabled;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getDisclaimer() {
                return this.disclaimer;
            }

            public final List<ig0.d> d() {
                return this.documents;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCaptures)) {
                    return false;
                }
                ReviewCaptures reviewCaptures = (ReviewCaptures) other;
                return p013kotlin.jvm.internal.s.f(this.imageLoader, reviewCaptures.imageLoader) && p013kotlin.jvm.internal.s.f(this.title, reviewCaptures.title) && p013kotlin.jvm.internal.s.f(this.prompt, reviewCaptures.prompt) && p013kotlin.jvm.internal.s.f(this.disclaimer, reviewCaptures.disclaimer) && p013kotlin.jvm.internal.s.f(this.submitButtonText, reviewCaptures.submitButtonText) && p013kotlin.jvm.internal.s.f(this.documents, reviewCaptures.documents) && p013kotlin.jvm.internal.s.f(this.navigationState, reviewCaptures.navigationState) && p013kotlin.jvm.internal.s.f(this.openSelectFile, reviewCaptures.openSelectFile) && p013kotlin.jvm.internal.s.f(this.selectFromPhotoLibrary, reviewCaptures.selectFromPhotoLibrary) && p013kotlin.jvm.internal.s.f(this.openCamera, reviewCaptures.openCamera) && p013kotlin.jvm.internal.s.f(this.openUploadOptions, reviewCaptures.openUploadOptions) && p013kotlin.jvm.internal.s.f(this.onRemove, reviewCaptures.onRemove) && p013kotlin.jvm.internal.s.f(this.onSubmit, reviewCaptures.onSubmit) && p013kotlin.jvm.internal.s.f(this.onCancel, reviewCaptures.onCancel) && p013kotlin.jvm.internal.s.f(this.onBack, reviewCaptures.onBack) && this.disabled == reviewCaptures.disabled && this.addButtonEnabled == reviewCaptures.addButtonEnabled && this.submitButtonEnabled == reviewCaptures.submitButtonEnabled && p013kotlin.jvm.internal.s.f(this.error, reviewCaptures.error) && p013kotlin.jvm.internal.s.f(this.onErrorDismissed, reviewCaptures.onErrorDismissed) && p013kotlin.jvm.internal.s.f(this.styles, reviewCaptures.styles);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final ec.r getImageLoader() {
                return this.imageLoader;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final ii0.a getNavigationState() {
                return this.navigationState;
            }

            public final wn0.a<jn0.h0> h() {
                return this.onBack;
            }

            public int hashCode() {
                int iHashCode = this.imageLoader.hashCode() * 31;
                String str = this.title;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.prompt;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.disclaimer;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.submitButtonText;
                int iHashCode5 = (((((((((((((((((((((((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.documents.hashCode()) * 31) + this.navigationState.hashCode()) * 31) + this.openSelectFile.hashCode()) * 31) + this.selectFromPhotoLibrary.hashCode()) * 31) + this.openCamera.hashCode()) * 31) + this.openUploadOptions.hashCode()) * 31) + this.onRemove.hashCode()) * 31) + this.onSubmit.hashCode()) * 31) + this.onCancel.hashCode()) * 31) + this.onBack.hashCode()) * 31) + Boolean.hashCode(this.disabled)) * 31) + Boolean.hashCode(this.addButtonEnabled)) * 31) + Boolean.hashCode(this.submitButtonEnabled)) * 31;
                String str5 = this.error;
                int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.onErrorDismissed.hashCode()) * 31;
                StepStyles.DocumentStepStyle documentStepStyle = this.styles;
                return iHashCode6 + (documentStepStyle != null ? documentStepStyle.hashCode() : 0);
            }

            public final wn0.a<jn0.h0> i() {
                return this.onCancel;
            }

            public final wn0.a<jn0.h0> j() {
                return this.onErrorDismissed;
            }

            public final wn0.l<ig0.d.Remote, jn0.h0> k() {
                return this.onRemove;
            }

            public final wn0.a<jn0.h0> l() {
                return this.onSubmit;
            }

            public final wn0.a<jn0.h0> m() {
                return this.openUploadOptions;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final String getPrompt() {
                return this.prompt;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final StepStyles.DocumentStepStyle getStyles() {
                return this.styles;
            }

            /* JADX INFO: renamed from: p, reason: from getter */
            public final boolean getSubmitButtonEnabled() {
                return this.submitButtonEnabled;
            }

            /* JADX INFO: renamed from: q, reason: from getter */
            public final String getSubmitButtonText() {
                return this.submitButtonText;
            }

            /* JADX INFO: renamed from: r, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public String toString() {
                return "ReviewCaptures(imageLoader=" + this.imageLoader + ", title=" + this.title + ", prompt=" + this.prompt + ", disclaimer=" + this.disclaimer + ", submitButtonText=" + this.submitButtonText + ", documents=" + this.documents + ", navigationState=" + this.navigationState + ", openSelectFile=" + this.openSelectFile + ", selectFromPhotoLibrary=" + this.selectFromPhotoLibrary + ", openCamera=" + this.openCamera + ", openUploadOptions=" + this.openUploadOptions + ", onRemove=" + this.onRemove + ", onSubmit=" + this.onSubmit + ", onCancel=" + this.onCancel + ", onBack=" + this.onBack + ", disabled=" + this.disabled + ", addButtonEnabled=" + this.addButtonEnabled + ", submitButtonEnabled=" + this.submitButtonEnabled + ", error=" + this.error + ", onErrorDismissed=" + this.onErrorDismissed + ", styles=" + this.styles + ")";
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lig0/r2$e;", "Landroid/os/Parcelable;", "a", "b", "Lig0/r2$e$a;", "Lig0/r2$e$b;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface e extends Parcelable {

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lig0/r2$e$a;", "Lig0/r2$e;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f77926a = new a();
            public static final Parcelable.Creator<a> CREATOR = new C1645a();

            /* JADX INFO: renamed from: ig0.r2$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C1645a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    parcel.readInt();
                    return a.f77926a;
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i11) {
                    return new a[i11];
                }
            }

            private a() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 813153962;
            }

            public String toString() {
                return "Prompt";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeInt(1);
            }
        }

        /* JADX INFO: renamed from: ig0.r2$e$b, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lig0/r2$e$b;", "Lig0/r2$e;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Review implements e {
            public static final Parcelable.Creator<Review> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentId;

            /* JADX INFO: renamed from: ig0.r2$e$b$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Review> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Review createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Review(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Review[] newArray(int i11) {
                    return new Review[i11];
                }
            }

            public Review(String documentId) {
                p013kotlin.jvm.internal.s.k(documentId, "documentId");
                this.documentId = documentId;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDocumentId() {
                return this.documentId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Review) && p013kotlin.jvm.internal.s.f(this.documentId, ((Review) other).documentId);
            }

            public int hashCode() {
                return this.documentId.hashCode();
            }

            public String toString() {
                return "Review(documentId=" + this.documentId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeString(this.documentId);
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0011\u001d\u001f\u0014\u000f\u0017B1\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\u0012JA\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\u0082\u0001\u0004#$%&¨\u0006'"}, d2 = {"Lig0/r2$f;", "Landroid/os/Parcelable;", "Lig0/r2$f$a;", "captureState", "Lig0/r2$f$f;", "uploadState", "", "documentId", "", "Lig0/d;", "documents", "<init>", "(Lig0/r2$f$a;Lig0/r2$f$f;Ljava/lang/String;Ljava/util/List;)V", "", "shouldShowUploadOptionsDialog", "b", "(Z)Lig0/r2$f;", "a", "(Lig0/r2$f$a;)Lig0/r2$f;", "documentFileToDelete", "c", "(Lig0/r2$f$f;Ljava/lang/String;Ljava/util/List;Lig0/d;)Lig0/r2$f;", "Lig0/r2$f$a;", "e", "()Lig0/r2$f$a;", "Lig0/r2$f$f;", "h", "()Lig0/r2$f$f;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "g", "()Ljava/util/List;", "Lig0/r2$f$b;", "Lig0/r2$f$c;", "Lig0/r2$f$d;", "Lig0/r2$f$e;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class f implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a captureState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC1646f uploadState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String documentId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<ig0.d> documents;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lig0/r2$f$a;", "", "<init>", "(Ljava/lang/String;I)V", "None", "CheckCameraPermissions", "CameraRunning", "SelectFileFromDocuments", "SelectImageFromPhotoLibrary", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public enum a {
            None,
            CheckCameraPermissions,
            CameraRunning,
            SelectFileFromDocuments,
            SelectImageFromPhotoLibrary;

            private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
            }
        }

        /* JADX INFO: renamed from: ig0.r2$f$f, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lig0/r2$f$f;", "Landroid/os/Parcelable;", "a", DateTokenConverter.CONVERTER_KEY, "b", "c", "Lig0/r2$f$f$a;", "Lig0/r2$f$f$b;", "Lig0/r2$f$f$c;", "Lig0/r2$f$f$d;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface InterfaceC1646f extends Parcelable {

            /* JADX INFO: renamed from: ig0.r2$f$f$a */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lig0/r2$f$f$a;", "Lig0/r2$f$f;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class a implements InterfaceC1646f {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f77956a = new a();
                public static final Parcelable.Creator<a> CREATOR = new C1647a();

                /* JADX INFO: renamed from: ig0.r2$f$f$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class C1647a implements Parcelable.Creator<a> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final a createFromParcel(Parcel parcel) {
                        p013kotlin.jvm.internal.s.k(parcel, "parcel");
                        parcel.readInt();
                        return a.f77956a;
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final a[] newArray(int i11) {
                        return new a[i11];
                    }
                }

                private a() {
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                public int hashCode() {
                    return 1079141691;
                }

                public String toString() {
                    return "CreateDocument";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    p013kotlin.jvm.internal.s.k(dest, "dest");
                    dest.writeInt(1);
                }
            }

            /* JADX INFO: renamed from: ig0.r2$f$f$b, reason: from toString */
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lig0/r2$f$f$b;", "Lig0/r2$f$f;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class DeleteFiles implements InterfaceC1646f {
                public static final Parcelable.Creator<DeleteFiles> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String documentId;

                /* JADX INFO: renamed from: ig0.r2$f$f$b$a */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<DeleteFiles> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final DeleteFiles createFromParcel(Parcel parcel) {
                        p013kotlin.jvm.internal.s.k(parcel, "parcel");
                        return new DeleteFiles(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final DeleteFiles[] newArray(int i11) {
                        return new DeleteFiles[i11];
                    }
                }

                public DeleteFiles(String documentId) {
                    p013kotlin.jvm.internal.s.k(documentId, "documentId");
                    this.documentId = documentId;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getDocumentId() {
                    return this.documentId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof DeleteFiles) && p013kotlin.jvm.internal.s.f(this.documentId, ((DeleteFiles) other).documentId);
                }

                public int hashCode() {
                    return this.documentId.hashCode();
                }

                public String toString() {
                    return "DeleteFiles(documentId=" + this.documentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    p013kotlin.jvm.internal.s.k(dest, "dest");
                    dest.writeString(this.documentId);
                }
            }

            /* JADX INFO: renamed from: ig0.r2$f$f$c, reason: from toString */
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lig0/r2$f$f$c;", "Lig0/r2$f$f;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getDocumentId", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class ReadyToSubmit implements InterfaceC1646f {
                public static final Parcelable.Creator<ReadyToSubmit> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String documentId;

                /* JADX INFO: renamed from: ig0.r2$f$f$c$a */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ReadyToSubmit> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final ReadyToSubmit createFromParcel(Parcel parcel) {
                        p013kotlin.jvm.internal.s.k(parcel, "parcel");
                        return new ReadyToSubmit(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final ReadyToSubmit[] newArray(int i11) {
                        return new ReadyToSubmit[i11];
                    }
                }

                public ReadyToSubmit(String documentId) {
                    p013kotlin.jvm.internal.s.k(documentId, "documentId");
                    this.documentId = documentId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ReadyToSubmit) && p013kotlin.jvm.internal.s.f(this.documentId, ((ReadyToSubmit) other).documentId);
                }

                public int hashCode() {
                    return this.documentId.hashCode();
                }

                public String toString() {
                    return "ReadyToSubmit(documentId=" + this.documentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    p013kotlin.jvm.internal.s.k(dest, "dest");
                    dest.writeString(this.documentId);
                }
            }

            /* JADX INFO: renamed from: ig0.r2$f$f$d, reason: from toString */
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Lig0/r2$f$f$d;", "Lig0/r2$f$f;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class UploadFiles implements InterfaceC1646f {
                public static final Parcelable.Creator<UploadFiles> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final String documentId;

                /* JADX INFO: renamed from: ig0.r2$f$f$d$a */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<UploadFiles> {
                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final UploadFiles createFromParcel(Parcel parcel) {
                        p013kotlin.jvm.internal.s.k(parcel, "parcel");
                        return new UploadFiles(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final UploadFiles[] newArray(int i11) {
                        return new UploadFiles[i11];
                    }
                }

                public UploadFiles(String documentId) {
                    p013kotlin.jvm.internal.s.k(documentId, "documentId");
                    this.documentId = documentId;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getDocumentId() {
                    return this.documentId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof UploadFiles) && p013kotlin.jvm.internal.s.f(this.documentId, ((UploadFiles) other).documentId);
                }

                public int hashCode() {
                    return this.documentId.hashCode();
                }

                public String toString() {
                    return "UploadFiles(documentId=" + this.documentId + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    p013kotlin.jvm.internal.s.k(dest, "dest");
                    dest.writeString(this.documentId);
                }
            }
        }

        public /* synthetic */ f(a aVar, InterfaceC1646f interfaceC1646f, String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, interfaceC1646f, str, list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ f d(f fVar, InterfaceC1646f interfaceC1646f, String str, List list, ig0.d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyWithUploadState");
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                list = null;
            }
            if ((i11 & 8) != 0) {
                dVar = null;
            }
            return fVar.c(interfaceC1646f, str, list, dVar);
        }

        public final f a(a captureState) {
            p013kotlin.jvm.internal.s.k(captureState, "captureState");
            if (this instanceof Start) {
                return Start.j((Start) this, captureState, null, null, false, 14, null);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.j((ReviewCaptures) this, null, null, captureState, null, null, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
            }
            if (this instanceof ReviewCapturesWithoutDocumentId) {
                return ReviewCapturesWithoutDocumentId.j((ReviewCapturesWithoutDocumentId) this, null, null, captureState, null, null, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final f b(boolean shouldShowUploadOptionsDialog) {
            if (this instanceof Start) {
                return Start.j((Start) this, null, null, null, shouldShowUploadOptionsDialog, 7, null);
            }
            if (this instanceof ReviewCaptures) {
                return ReviewCaptures.j((ReviewCaptures) this, null, null, null, null, null, false, shouldShowUploadOptionsDialog, null, 191, null);
            }
            if (this instanceof ReviewCapturesWithoutDocumentId) {
                return ReviewCapturesWithoutDocumentId.j((ReviewCapturesWithoutDocumentId) this, null, null, null, null, null, false, shouldShowUploadOptionsDialog, null, 191, null);
            }
            if (this instanceof UploadDocument) {
                return this;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final f c(InterfaceC1646f uploadState, String documentId, List<? extends ig0.d> documents, ig0.d documentFileToDelete) {
            p013kotlin.jvm.internal.s.k(uploadState, "uploadState");
            if (this instanceof Start) {
                Start start = (Start) this;
                if (documentId == null) {
                    documentId = start.getDocumentId();
                }
                return Start.j(start, null, uploadState, documentId, false, 9, null);
            }
            if (this instanceof ReviewCaptures) {
                ReviewCaptures reviewCaptures = (ReviewCaptures) this;
                if (documents == null) {
                    documents = reviewCaptures.g();
                }
                return ReviewCaptures.j(reviewCaptures, documents, null, null, uploadState, documentFileToDelete, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, null);
            }
            if (!(this instanceof ReviewCapturesWithoutDocumentId)) {
                if (this instanceof UploadDocument) {
                    return UploadDocument.j((UploadDocument) this, null, null, uploadState, null, 11, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (ReviewCapturesWithoutDocumentId) this;
            if (documentId == null) {
                documentId = reviewCapturesWithoutDocumentId.getDocumentId();
            }
            String str = documentId;
            if (documents == null) {
                documents = reviewCapturesWithoutDocumentId.g();
            }
            return ReviewCapturesWithoutDocumentId.j(reviewCapturesWithoutDocumentId, documents, str, null, uploadState, documentFileToDelete, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, null);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public a getCaptureState() {
            return this.captureState;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public String getDocumentId() {
            return this.documentId;
        }

        public List<ig0.d> g() {
            return this.documents;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public InterfaceC1646f getUploadState() {
            return this.uploadState;
        }

        /* JADX INFO: renamed from: ig0.r2$f$e, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b(\u0010\u0018¨\u0006)"}, d2 = {"Lig0/r2$f$e;", "Lig0/r2$f;", "", "Lig0/d;", "documents", "", "documentId", "Lig0/r2$f$f;", "uploadState", AnalyticsAttribute.Error, "<init>", "(Ljava/util/List;Ljava/lang/String;Lig0/r2$f$f;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Ljava/lang/String;Lig0/r2$f$f;Ljava/lang/String;)Lig0/r2$f$e;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "f", "Ljava/lang/String;", "Lig0/r2$f$f;", "h", "()Lig0/r2$f$f;", "getError", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class UploadDocument extends f {
            public static final Parcelable.Creator<UploadDocument> CREATOR = new a();

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<ig0.d> documents;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentId;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC1646f uploadState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final String error;

            /* JADX INFO: renamed from: ig0.r2$f$e$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<UploadDocument> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UploadDocument createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    int i11 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList.add(parcel.readParcelable(UploadDocument.class.getClassLoader()));
                    }
                    return new UploadDocument(arrayList, parcel.readString(), (InterfaceC1646f) parcel.readParcelable(UploadDocument.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final UploadDocument[] newArray(int i11) {
                    return new UploadDocument[i11];
                }
            }

            public /* synthetic */ UploadDocument(List list, String str, InterfaceC1646f interfaceC1646f, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i11 & 4) != 0 ? InterfaceC1646f.a.f77956a : interfaceC1646f, (i11 & 8) != 0 ? null : str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ UploadDocument j(UploadDocument uploadDocument, List list, String str, InterfaceC1646f interfaceC1646f, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = uploadDocument.documents;
                }
                if ((i11 & 2) != 0) {
                    str = uploadDocument.documentId;
                }
                if ((i11 & 4) != 0) {
                    interfaceC1646f = uploadDocument.uploadState;
                }
                if ((i11 & 8) != 0) {
                    str2 = uploadDocument.error;
                }
                return uploadDocument.i(list, str, interfaceC1646f, str2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UploadDocument)) {
                    return false;
                }
                UploadDocument uploadDocument = (UploadDocument) other;
                return p013kotlin.jvm.internal.s.f(this.documents, uploadDocument.documents) && p013kotlin.jvm.internal.s.f(this.documentId, uploadDocument.documentId) && p013kotlin.jvm.internal.s.f(this.uploadState, uploadDocument.uploadState) && p013kotlin.jvm.internal.s.f(this.error, uploadDocument.error);
            }

            @Override // ig0.r2.f
            /* JADX INFO: renamed from: f, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // ig0.r2.f
            public List<ig0.d> g() {
                return this.documents;
            }

            @Override // ig0.r2.f
            /* JADX INFO: renamed from: h, reason: from getter */
            public InterfaceC1646f getUploadState() {
                return this.uploadState;
            }

            public int hashCode() {
                int iHashCode = ((((this.documents.hashCode() * 31) + this.documentId.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                String str = this.error;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final UploadDocument i(List<? extends ig0.d> documents, String documentId, InterfaceC1646f uploadState, String error) {
                p013kotlin.jvm.internal.s.k(documents, "documents");
                p013kotlin.jvm.internal.s.k(documentId, "documentId");
                p013kotlin.jvm.internal.s.k(uploadState, "uploadState");
                return new UploadDocument(documents, documentId, uploadState, error);
            }

            public String toString() {
                return "UploadDocument(documents=" + this.documents + ", documentId=" + this.documentId + ", uploadState=" + this.uploadState + ", error=" + this.error + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                List<ig0.d> list = this.documents;
                dest.writeInt(list.size());
                Iterator<ig0.d> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeString(this.documentId);
                dest.writeParcelable(this.uploadState, flags);
                dest.writeString(this.error);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public UploadDocument(List<? extends ig0.d> documents, String documentId, InterfaceC1646f uploadState, String str) {
                super(a.None, uploadState, documentId, documents, null);
                p013kotlin.jvm.internal.s.k(documents, "documents");
                p013kotlin.jvm.internal.s.k(documentId, "documentId");
                p013kotlin.jvm.internal.s.k(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = documentId;
                this.uploadState = uploadState;
                this.error = str;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private f(a aVar, InterfaceC1646f interfaceC1646f, String str, List<? extends ig0.d> list) {
            this.captureState = aVar;
            this.uploadState = interfaceC1646f;
            this.documentId = str;
            this.documents = list;
        }

        /* JADX INFO: renamed from: ig0.r2$f$b, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJj\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b$\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b6\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b7\u0010\u001e¨\u00068"}, d2 = {"Lig0/r2$f$b;", "Lig0/r2$f;", "", "Lig0/d;", "documents", "", "documentId", "Lig0/r2$f$a;", "captureState", "Lig0/r2$f$f;", "uploadState", "documentFileToDelete", "", "reloadingFromPreviousSession", "shouldShowUploadOptionsDialog", AnalyticsAttribute.Error, "<init>", "(Ljava/util/List;Ljava/lang/String;Lig0/r2$f$a;Lig0/r2$f$f;Lig0/d;ZZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Ljava/lang/String;Lig0/r2$f$a;Lig0/r2$f$f;Lig0/d;ZZLjava/lang/String;)Lig0/r2$f$b;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "f", "Ljava/lang/String;", "Lig0/r2$f$a;", "()Lig0/r2$f$a;", "h", "Lig0/r2$f$f;", "()Lig0/r2$f$f;", "Lig0/d;", "k", "()Lig0/d;", "j", "Z", "m", "()Z", "q", "l", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReviewCaptures extends f {
            public static final Parcelable.Creator<ReviewCaptures> CREATOR = new a();

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<ig0.d> documents;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentId;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final a captureState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC1646f uploadState;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final ig0.d documentFileToDelete;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean reloadingFromPreviousSession;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldShowUploadOptionsDialog;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final String error;

            /* JADX INFO: renamed from: ig0.r2$f$b$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ReviewCaptures> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ReviewCaptures createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    int i11 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList.add(parcel.readParcelable(ReviewCaptures.class.getClassLoader()));
                    }
                    String string = parcel.readString();
                    a aVarValueOf = a.valueOf(parcel.readString());
                    InterfaceC1646f interfaceC1646f = (InterfaceC1646f) parcel.readParcelable(ReviewCaptures.class.getClassLoader());
                    ig0.d dVar = (ig0.d) parcel.readParcelable(ReviewCaptures.class.getClassLoader());
                    boolean z11 = true;
                    if (parcel.readInt() == 0) {
                        z11 = false;
                    }
                    return new ReviewCaptures(arrayList, string, aVarValueOf, interfaceC1646f, dVar, z11, parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ReviewCaptures[] newArray(int i11) {
                    return new ReviewCaptures[i11];
                }
            }

            public /* synthetic */ ReviewCaptures(List list, String str, a aVar, InterfaceC1646f interfaceC1646f, ig0.d dVar, boolean z11, boolean z12, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i11 & 4) != 0 ? a.None : aVar, (i11 & 8) != 0 ? InterfaceC1646f.a.f77956a : interfaceC1646f, (i11 & 16) != 0 ? null : dVar, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? null : str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ReviewCaptures j(ReviewCaptures reviewCaptures, List list, String str, a aVar, InterfaceC1646f interfaceC1646f, ig0.d dVar, boolean z11, boolean z12, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = reviewCaptures.documents;
                }
                if ((i11 & 2) != 0) {
                    str = reviewCaptures.documentId;
                }
                if ((i11 & 4) != 0) {
                    aVar = reviewCaptures.captureState;
                }
                if ((i11 & 8) != 0) {
                    interfaceC1646f = reviewCaptures.uploadState;
                }
                if ((i11 & 16) != 0) {
                    dVar = reviewCaptures.documentFileToDelete;
                }
                if ((i11 & 32) != 0) {
                    z11 = reviewCaptures.reloadingFromPreviousSession;
                }
                if ((i11 & 64) != 0) {
                    z12 = reviewCaptures.shouldShowUploadOptionsDialog;
                }
                if ((i11 & 128) != 0) {
                    str2 = reviewCaptures.error;
                }
                boolean z13 = z12;
                String str3 = str2;
                ig0.d dVar2 = dVar;
                boolean z14 = z11;
                return reviewCaptures.i(list, str, aVar, interfaceC1646f, dVar2, z14, z13, str3);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // ig0.r2.f
            /* JADX INFO: renamed from: e, reason: from getter */
            public a getCaptureState() {
                return this.captureState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCaptures)) {
                    return false;
                }
                ReviewCaptures reviewCaptures = (ReviewCaptures) other;
                return p013kotlin.jvm.internal.s.f(this.documents, reviewCaptures.documents) && p013kotlin.jvm.internal.s.f(this.documentId, reviewCaptures.documentId) && this.captureState == reviewCaptures.captureState && p013kotlin.jvm.internal.s.f(this.uploadState, reviewCaptures.uploadState) && p013kotlin.jvm.internal.s.f(this.documentFileToDelete, reviewCaptures.documentFileToDelete) && this.reloadingFromPreviousSession == reviewCaptures.reloadingFromPreviousSession && this.shouldShowUploadOptionsDialog == reviewCaptures.shouldShowUploadOptionsDialog && p013kotlin.jvm.internal.s.f(this.error, reviewCaptures.error);
            }

            @Override // ig0.r2.f
            /* JADX INFO: renamed from: f, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // ig0.r2.f
            public List<ig0.d> g() {
                return this.documents;
            }

            @Override // ig0.r2.f
            /* JADX INFO: renamed from: h, reason: from getter */
            public InterfaceC1646f getUploadState() {
                return this.uploadState;
            }

            public int hashCode() {
                int iHashCode = ((((((this.documents.hashCode() * 31) + this.documentId.hashCode()) * 31) + this.captureState.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                ig0.d dVar = this.documentFileToDelete;
                int iHashCode2 = (((((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31) + Boolean.hashCode(this.reloadingFromPreviousSession)) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog)) * 31;
                String str = this.error;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            public final ReviewCaptures i(List<? extends ig0.d> documents, String documentId, a captureState, InterfaceC1646f uploadState, ig0.d documentFileToDelete, boolean reloadingFromPreviousSession, boolean shouldShowUploadOptionsDialog, String error) {
                p013kotlin.jvm.internal.s.k(documents, "documents");
                p013kotlin.jvm.internal.s.k(documentId, "documentId");
                p013kotlin.jvm.internal.s.k(captureState, "captureState");
                p013kotlin.jvm.internal.s.k(uploadState, "uploadState");
                return new ReviewCaptures(documents, documentId, captureState, uploadState, documentFileToDelete, reloadingFromPreviousSession, shouldShowUploadOptionsDialog, error);
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final ig0.d getDocumentFileToDelete() {
                return this.documentFileToDelete;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final String getError() {
                return this.error;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final boolean getReloadingFromPreviousSession() {
                return this.reloadingFromPreviousSession;
            }

            /* JADX INFO: renamed from: q, reason: from getter */
            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            public String toString() {
                return "ReviewCaptures(documents=" + this.documents + ", documentId=" + this.documentId + ", captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentFileToDelete=" + this.documentFileToDelete + ", reloadingFromPreviousSession=" + this.reloadingFromPreviousSession + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ", error=" + this.error + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                List<ig0.d> list = this.documents;
                dest.writeInt(list.size());
                Iterator<ig0.d> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeString(this.documentId);
                dest.writeString(this.captureState.name());
                dest.writeParcelable(this.uploadState, flags);
                dest.writeParcelable(this.documentFileToDelete, flags);
                dest.writeInt(this.reloadingFromPreviousSession ? 1 : 0);
                dest.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
                dest.writeString(this.error);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCaptures(List<? extends ig0.d> documents, String documentId, a captureState, InterfaceC1646f uploadState, ig0.d dVar, boolean z11, boolean z12, String str) {
                super(captureState, uploadState, documentId, documents, null);
                p013kotlin.jvm.internal.s.k(documents, "documents");
                p013kotlin.jvm.internal.s.k(documentId, "documentId");
                p013kotlin.jvm.internal.s.k(captureState, "captureState");
                p013kotlin.jvm.internal.s.k(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = documentId;
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentFileToDelete = dVar;
                this.reloadingFromPreviousSession = z11;
                this.shouldShowUploadOptionsDialog = z12;
                this.error = str;
            }
        }

        /* JADX INFO: renamed from: ig0.r2$f$c, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJl\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b$\u0010+R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b6\u0010\u001e¨\u00068"}, d2 = {"Lig0/r2$f$c;", "Lig0/r2$f;", "", "Lig0/d;", "documents", "", "documentId", "Lig0/r2$f$a;", "captureState", "Lig0/r2$f$f;", "uploadState", "documentFileToDelete", "", "reloadingFromPreviousSession", "shouldShowUploadOptionsDialog", AnalyticsAttribute.Error, "<init>", "(Ljava/util/List;Ljava/lang/String;Lig0/r2$f$a;Lig0/r2$f$f;Lig0/d;ZZLjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Ljava/lang/String;Lig0/r2$f$a;Lig0/r2$f$f;Lig0/d;ZZLjava/lang/String;)Lig0/r2$f$c;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "f", "Ljava/lang/String;", "Lig0/r2$f$a;", "()Lig0/r2$f$a;", "h", "Lig0/r2$f$f;", "()Lig0/r2$f$f;", "Lig0/d;", "getDocumentFileToDelete", "()Lig0/d;", "j", "Z", "l", "()Z", "k", "m", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReviewCapturesWithoutDocumentId extends f {
            public static final Parcelable.Creator<ReviewCapturesWithoutDocumentId> CREATOR = new a();

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<ig0.d> documents;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentId;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final a captureState;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC1646f uploadState;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final ig0.d documentFileToDelete;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean reloadingFromPreviousSession;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldShowUploadOptionsDialog;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final String error;

            /* JADX INFO: renamed from: ig0.r2$f$c$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ReviewCapturesWithoutDocumentId> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ReviewCapturesWithoutDocumentId createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    int i11 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList.add(parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader()));
                    }
                    String string = parcel.readString();
                    a aVarValueOf = a.valueOf(parcel.readString());
                    InterfaceC1646f interfaceC1646f = (InterfaceC1646f) parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader());
                    ig0.d dVar = (ig0.d) parcel.readParcelable(ReviewCapturesWithoutDocumentId.class.getClassLoader());
                    boolean z11 = true;
                    if (parcel.readInt() == 0) {
                        z11 = false;
                    }
                    return new ReviewCapturesWithoutDocumentId(arrayList, string, aVarValueOf, interfaceC1646f, dVar, z11, parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ReviewCapturesWithoutDocumentId[] newArray(int i11) {
                    return new ReviewCapturesWithoutDocumentId[i11];
                }
            }

            public /* synthetic */ ReviewCapturesWithoutDocumentId(List list, String str, a aVar, InterfaceC1646f interfaceC1646f, ig0.d dVar, boolean z11, boolean z12, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, str, (i11 & 4) != 0 ? a.None : aVar, (i11 & 8) != 0 ? InterfaceC1646f.a.f77956a : interfaceC1646f, (i11 & 16) != 0 ? null : dVar, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? false : z12, (i11 & 128) != 0 ? null : str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ReviewCapturesWithoutDocumentId j(ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId, List list, String str, a aVar, InterfaceC1646f interfaceC1646f, ig0.d dVar, boolean z11, boolean z12, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = reviewCapturesWithoutDocumentId.documents;
                }
                if ((i11 & 2) != 0) {
                    str = reviewCapturesWithoutDocumentId.documentId;
                }
                if ((i11 & 4) != 0) {
                    aVar = reviewCapturesWithoutDocumentId.captureState;
                }
                if ((i11 & 8) != 0) {
                    interfaceC1646f = reviewCapturesWithoutDocumentId.uploadState;
                }
                if ((i11 & 16) != 0) {
                    dVar = reviewCapturesWithoutDocumentId.documentFileToDelete;
                }
                if ((i11 & 32) != 0) {
                    z11 = reviewCapturesWithoutDocumentId.reloadingFromPreviousSession;
                }
                if ((i11 & 64) != 0) {
                    z12 = reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog;
                }
                if ((i11 & 128) != 0) {
                    str2 = reviewCapturesWithoutDocumentId.error;
                }
                boolean z13 = z12;
                String str3 = str2;
                ig0.d dVar2 = dVar;
                boolean z14 = z11;
                return reviewCapturesWithoutDocumentId.i(list, str, aVar, interfaceC1646f, dVar2, z14, z13, str3);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // ig0.r2.f
            /* JADX INFO: renamed from: e, reason: from getter */
            public a getCaptureState() {
                return this.captureState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReviewCapturesWithoutDocumentId)) {
                    return false;
                }
                ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (ReviewCapturesWithoutDocumentId) other;
                return p013kotlin.jvm.internal.s.f(this.documents, reviewCapturesWithoutDocumentId.documents) && p013kotlin.jvm.internal.s.f(this.documentId, reviewCapturesWithoutDocumentId.documentId) && this.captureState == reviewCapturesWithoutDocumentId.captureState && p013kotlin.jvm.internal.s.f(this.uploadState, reviewCapturesWithoutDocumentId.uploadState) && p013kotlin.jvm.internal.s.f(this.documentFileToDelete, reviewCapturesWithoutDocumentId.documentFileToDelete) && this.reloadingFromPreviousSession == reviewCapturesWithoutDocumentId.reloadingFromPreviousSession && this.shouldShowUploadOptionsDialog == reviewCapturesWithoutDocumentId.shouldShowUploadOptionsDialog && p013kotlin.jvm.internal.s.f(this.error, reviewCapturesWithoutDocumentId.error);
            }

            @Override // ig0.r2.f
            /* JADX INFO: renamed from: f, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // ig0.r2.f
            public List<ig0.d> g() {
                return this.documents;
            }

            @Override // ig0.r2.f
            /* JADX INFO: renamed from: h, reason: from getter */
            public InterfaceC1646f getUploadState() {
                return this.uploadState;
            }

            public int hashCode() {
                int iHashCode = this.documents.hashCode() * 31;
                String str = this.documentId;
                int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.captureState.hashCode()) * 31) + this.uploadState.hashCode()) * 31;
                ig0.d dVar = this.documentFileToDelete;
                int iHashCode3 = (((((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31) + Boolean.hashCode(this.reloadingFromPreviousSession)) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog)) * 31;
                String str2 = this.error;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            public final ReviewCapturesWithoutDocumentId i(List<? extends ig0.d> documents, String documentId, a captureState, InterfaceC1646f uploadState, ig0.d documentFileToDelete, boolean reloadingFromPreviousSession, boolean shouldShowUploadOptionsDialog, String error) {
                p013kotlin.jvm.internal.s.k(documents, "documents");
                p013kotlin.jvm.internal.s.k(captureState, "captureState");
                p013kotlin.jvm.internal.s.k(uploadState, "uploadState");
                return new ReviewCapturesWithoutDocumentId(documents, documentId, captureState, uploadState, documentFileToDelete, reloadingFromPreviousSession, shouldShowUploadOptionsDialog, error);
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getError() {
                return this.error;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final boolean getReloadingFromPreviousSession() {
                return this.reloadingFromPreviousSession;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            public String toString() {
                return "ReviewCapturesWithoutDocumentId(documents=" + this.documents + ", documentId=" + this.documentId + ", captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentFileToDelete=" + this.documentFileToDelete + ", reloadingFromPreviousSession=" + this.reloadingFromPreviousSession + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ", error=" + this.error + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                List<ig0.d> list = this.documents;
                dest.writeInt(list.size());
                Iterator<ig0.d> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeString(this.documentId);
                dest.writeString(this.captureState.name());
                dest.writeParcelable(this.uploadState, flags);
                dest.writeParcelable(this.documentFileToDelete, flags);
                dest.writeInt(this.reloadingFromPreviousSession ? 1 : 0);
                dest.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
                dest.writeString(this.error);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReviewCapturesWithoutDocumentId(List<? extends ig0.d> documents, String str, a captureState, InterfaceC1646f uploadState, ig0.d dVar, boolean z11, boolean z12, String str2) {
                super(captureState, uploadState, str, documents, null);
                p013kotlin.jvm.internal.s.k(documents, "documents");
                p013kotlin.jvm.internal.s.k(captureState, "captureState");
                p013kotlin.jvm.internal.s.k(uploadState, "uploadState");
                this.documents = documents;
                this.documentId = str;
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentFileToDelete = dVar;
                this.reloadingFromPreviousSession = z11;
                this.shouldShowUploadOptionsDialog = z12;
                this.error = str2;
            }
        }

        /* JADX INFO: renamed from: ig0.r2$f$d, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lig0/r2$f$d;", "Lig0/r2$f;", "Lig0/r2$f$a;", "captureState", "Lig0/r2$f$f;", "uploadState", "", "documentId", "", "shouldShowUploadOptionsDialog", "<init>", "(Lig0/r2$f$a;Lig0/r2$f$f;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", IntegerTokenConverter.CONVERTER_KEY, "(Lig0/r2$f$a;Lig0/r2$f$f;Ljava/lang/String;Z)Lig0/r2$f$d;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Lig0/r2$f$a;", "()Lig0/r2$f$a;", "f", "Lig0/r2$f$f;", "h", "()Lig0/r2$f$f;", "g", "Ljava/lang/String;", "Z", "k", "()Z", "document_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Start extends f {
            public static final Parcelable.Creator<Start> CREATOR = new a();

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final a captureState;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC1646f uploadState;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final String documentId;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean shouldShowUploadOptionsDialog;

            /* JADX INFO: renamed from: ig0.r2$f$d$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Start> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Start createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Start(a.valueOf(parcel.readString()), (InterfaceC1646f) parcel.readParcelable(Start.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Start[] newArray(int i11) {
                    return new Start[i11];
                }
            }

            public /* synthetic */ Start(a aVar, InterfaceC1646f interfaceC1646f, String str, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? a.None : aVar, (i11 & 2) != 0 ? InterfaceC1646f.a.f77956a : interfaceC1646f, str, (i11 & 8) != 0 ? false : z11);
            }

            public static /* synthetic */ Start j(Start start, a aVar, InterfaceC1646f interfaceC1646f, String str, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    aVar = start.captureState;
                }
                if ((i11 & 2) != 0) {
                    interfaceC1646f = start.uploadState;
                }
                if ((i11 & 4) != 0) {
                    str = start.documentId;
                }
                if ((i11 & 8) != 0) {
                    z11 = start.shouldShowUploadOptionsDialog;
                }
                return start.i(aVar, interfaceC1646f, str, z11);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // ig0.r2.f
            /* JADX INFO: renamed from: e, reason: from getter */
            public a getCaptureState() {
                return this.captureState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Start)) {
                    return false;
                }
                Start start = (Start) other;
                return this.captureState == start.captureState && p013kotlin.jvm.internal.s.f(this.uploadState, start.uploadState) && p013kotlin.jvm.internal.s.f(this.documentId, start.documentId) && this.shouldShowUploadOptionsDialog == start.shouldShowUploadOptionsDialog;
            }

            @Override // ig0.r2.f
            /* JADX INFO: renamed from: f, reason: from getter */
            public String getDocumentId() {
                return this.documentId;
            }

            @Override // ig0.r2.f
            /* JADX INFO: renamed from: h, reason: from getter */
            public InterfaceC1646f getUploadState() {
                return this.uploadState;
            }

            public int hashCode() {
                int iHashCode = ((this.captureState.hashCode() * 31) + this.uploadState.hashCode()) * 31;
                String str = this.documentId;
                return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.shouldShowUploadOptionsDialog);
            }

            public final Start i(a captureState, InterfaceC1646f uploadState, String documentId, boolean shouldShowUploadOptionsDialog) {
                p013kotlin.jvm.internal.s.k(captureState, "captureState");
                p013kotlin.jvm.internal.s.k(uploadState, "uploadState");
                return new Start(captureState, uploadState, documentId, shouldShowUploadOptionsDialog);
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final boolean getShouldShowUploadOptionsDialog() {
                return this.shouldShowUploadOptionsDialog;
            }

            public String toString() {
                return "Start(captureState=" + this.captureState + ", uploadState=" + this.uploadState + ", documentId=" + this.documentId + ", shouldShowUploadOptionsDialog=" + this.shouldShowUploadOptionsDialog + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeString(this.captureState.name());
                dest.writeParcelable(this.uploadState, flags);
                dest.writeString(this.documentId);
                dest.writeInt(this.shouldShowUploadOptionsDialog ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Start(a captureState, InterfaceC1646f uploadState, String str, boolean z11) {
                super(captureState, uploadState, str, p013kotlin.collections.v.m(), null);
                p013kotlin.jvm.internal.s.k(captureState, "captureState");
                p013kotlin.jvm.internal.s.k(uploadState, "uploadState");
                this.captureState = captureState;
                this.uploadState = uploadState;
                this.documentId = str;
                this.shouldShowUploadOptionsDialog = z11;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f77961b;

        static {
            int[] iArr = new int[oh0.g1.values().length];
            try {
                iArr[oh0.g1.PermissionGranted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oh0.g1.PermissionRejected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oh0.g1.SettingsLaunched.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f77960a = iArr;
            int[] iArr2 = new int[f.a.values().length];
            try {
                iArr2[f.a.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[f.a.CheckCameraPermissions.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[f.a.CameraRunning.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[f.a.SelectFileFromDocuments.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f.a.SelectImageFromPhotoLibrary.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f77961b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.DocumentWorkflow$render$4", f = "DocumentWorkflow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f77962n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y20.k<Input, f, c, Object>.a f77963o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ r2 f77964p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f77965q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(y20.k<? super Input, f, ? extends c, ? extends Object>.a aVar, r2 r2Var, String str, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f77963o = aVar;
            this.f77964p = r2Var;
            this.f77965q = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(String str, y20.r.c cVar) {
            Object objC = cVar.c();
            f.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = objC instanceof f.ReviewCapturesWithoutDocumentId ? (f.ReviewCapturesWithoutDocumentId) objC : null;
            if (reviewCapturesWithoutDocumentId == null) {
                return jn0.h0.f84049a;
            }
            cVar.e(new f.ReviewCaptures(reviewCapturesWithoutDocumentId.g(), str, null, new f.InterfaceC1646f.UploadFiles(str), null, false, false, reviewCapturesWithoutDocumentId.getError(), 116, null));
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new h(this.f77963o, this.f77964p, this.f77965q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f77962n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            y20.h<y20.r<? super Input, f, ? extends c>> hVarC = this.f77963o.c();
            r2 r2Var = this.f77964p;
            final String str = this.f77965q;
            hVarC.b(y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.s2
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return r2.h.b(str, (y20.r.c) obj2);
                }
            }, 1, null));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.document.DocumentWorkflow$run$4", f = "DocumentWorkflow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f77966n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y20.k<Input, f, c, Object>.a f77967o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ r2 f77968p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ f.InterfaceC1646f f77969q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(y20.k<? super Input, f, ? extends c, ? extends Object>.a aVar, r2 r2Var, f.InterfaceC1646f interfaceC1646f, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f77967o = aVar;
            this.f77968p = r2Var;
            this.f77969q = interfaceC1646f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(f.InterfaceC1646f interfaceC1646f, y20.r.c cVar) {
            cVar.e(f.d((f) cVar.c(), new f.InterfaceC1646f.ReadyToSubmit(((f.InterfaceC1646f.UploadFiles) interfaceC1646f).getDocumentId()), null, null, null, 14, null));
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new i(this.f77967o, this.f77968p, this.f77969q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f77966n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            y20.h<y20.r<? super Input, f, ? extends c>> hVarC = this.f77967o.c();
            r2 r2Var = this.f77968p;
            final f.InterfaceC1646f interfaceC1646f = this.f77969q;
            hVarC.b(y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.t2
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return r2.i.b(interfaceC1646f, (y20.r.c) obj2);
                }
            }, 1, null));
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public r2(ec.r imageLoader, Context applicationContext, oh0.c1 permissionRequestWorkflow, ig0.c documentCameraWorker, v2.b documentsSelectWorkerFactory, com.withpersona.sdk2.inquiry.document.network.a.C1162a documentCreateWorker, com.withpersona.sdk2.inquiry.document.network.c.a documentLoadWorker, com.withpersona.sdk2.inquiry.document.network.b.a documentFileUploadWorker, kg0.a.C1838a documentFileDeleteWorker, com.withpersona.sdk2.inquiry.document.network.d.a documentSubmitWorker, ii0.b navigationStateManager, ei0.c externalEventLogger) {
        p013kotlin.jvm.internal.s.k(imageLoader, "imageLoader");
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        p013kotlin.jvm.internal.s.k(permissionRequestWorkflow, "permissionRequestWorkflow");
        p013kotlin.jvm.internal.s.k(documentCameraWorker, "documentCameraWorker");
        p013kotlin.jvm.internal.s.k(documentsSelectWorkerFactory, "documentsSelectWorkerFactory");
        p013kotlin.jvm.internal.s.k(documentCreateWorker, "documentCreateWorker");
        p013kotlin.jvm.internal.s.k(documentLoadWorker, "documentLoadWorker");
        p013kotlin.jvm.internal.s.k(documentFileUploadWorker, "documentFileUploadWorker");
        p013kotlin.jvm.internal.s.k(documentFileDeleteWorker, "documentFileDeleteWorker");
        p013kotlin.jvm.internal.s.k(documentSubmitWorker, "documentSubmitWorker");
        p013kotlin.jvm.internal.s.k(navigationStateManager, "navigationStateManager");
        p013kotlin.jvm.internal.s.k(externalEventLogger, "externalEventLogger");
        this.imageLoader = imageLoader;
        this.applicationContext = applicationContext;
        this.permissionRequestWorkflow = permissionRequestWorkflow;
        this.documentCameraWorker = documentCameraWorker;
        this.documentsSelectWorkerFactory = documentsSelectWorkerFactory;
        this.documentCreateWorker = documentCreateWorker;
        this.documentLoadWorker = documentLoadWorker;
        this.documentFileUploadWorker = documentFileUploadWorker;
        this.documentFileDeleteWorker = documentFileDeleteWorker;
        this.documentSubmitWorker = documentSubmitWorker;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
    }

    private final List<Pair<String, wn0.l<n5, jn0.h0>>> A0(u uVar, final y20.k<? super Input, f, ? extends c, ? extends Object>.a aVar) {
        return new mi0.b.a().a(uVar.getSelectDocumentButton(), new wn0.l() { // from class: ig0.v0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r2.C0(this.f77994a, aVar, (n5) obj);
            }
        }).a(uVar.getSelectPhotoButton(), new wn0.l() { // from class: ig0.w0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r2.D0(this.f78018a, aVar, (n5) obj);
            }
        }).a(uVar.getTakePhotoButton(), new wn0.l() { // from class: ig0.x0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r2.E0(this.f78036a, aVar, (n5) obj);
            }
        }).a(uVar.getLaunchUploadOptionsButton(), new wn0.l() { // from class: ig0.y0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r2.F0(this.f78042a, aVar, (n5) obj);
            }
        }).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 A1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.b.f77858a);
        return jn0.h0.f84049a;
    }

    private final List<Pair<String, wn0.l<n5, jn0.h0>>> B0(b3 b3Var, final y20.k<? super Input, f, ? extends c, ? extends Object>.a aVar) {
        return new mi0.b.a().a(b3Var.getSelectDocumentButton(), new wn0.l() { // from class: ig0.a1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r2.G0(this.f77686a, aVar, (n5) obj);
            }
        }).a(b3Var.getSelectPhotoButton(), new wn0.l() { // from class: ig0.b1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r2.H0(this.f77691a, aVar, (n5) obj);
            }
        }).a(b3Var.getTakePhotoButton(), new wn0.l() { // from class: ig0.c1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r2.I0(this.f77716a, aVar, (n5) obj);
            }
        }).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r B1(final r2 r2Var, final f fVar, final oh0.c1.Output it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.z0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r2.C1(it, r2Var, fVar, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 C0(r2 r2Var, y20.k.a aVar, n5 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        r2Var.L0(aVar, a.g.f77864a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 C1(oh0.c1.Output output, r2 r2Var, f fVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        int i11 = g.f77960a[output.getPermissionState().getResult().ordinal()];
        if (i11 == 1) {
            ig0.c cVar = r2Var.documentCameraWorker;
            String string = r2Var.applicationContext.getString(qh0.e.f105547a);
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
            action.e(cVar.c(string) ? fVar.a(f.a.CameraRunning) : fVar.a(f.a.None));
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            action.e(fVar.a(f.a.None));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 D0(r2 r2Var, y20.k.a aVar, n5 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        r2Var.L0(aVar, a.h.f77865a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r D1(r2 r2Var, final f fVar, final com.withpersona.sdk2.inquiry.document.network.c.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.c.b.C1171b) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.d1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.E1(fVar, it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.c.b.a) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.e1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.F1(it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 E0(r2 r2Var, y20.k.a aVar, n5 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        r2Var.L0(aVar, a.j.f77867a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 E1(f fVar, com.withpersona.sdk2.inquiry.document.network.c.b bVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        f.ReviewCaptures reviewCaptures = (f.ReviewCaptures) fVar;
        action.e(f.ReviewCaptures.j(reviewCaptures, ((com.withpersona.sdk2.inquiry.document.network.c.b.C1171b) bVar).a(), null, null, new f.InterfaceC1646f.ReadyToSubmit(reviewCaptures.getDocumentId()), null, false, false, null, EnumC4419g.SDK_ASSET_ICON_PIN_VALUE, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 F0(r2 r2Var, y20.k.a aVar, n5 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        r2Var.L0(aVar, a.e.f77861a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 F1(com.withpersona.sdk2.inquiry.document.network.c.b bVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(new c.Errored(((com.withpersona.sdk2.inquiry.document.network.c.b.a) bVar).getCause()));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 G0(r2 r2Var, y20.k.a aVar, n5 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        r2Var.L0(aVar, a.g.f77864a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 G1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.g.f77864a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 H0(r2 r2Var, y20.k.a aVar, n5 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        r2Var.L0(aVar, a.h.f77865a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 H1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.h.f77865a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 I0(r2 r2Var, y20.k.a aVar, n5 it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        r2Var.L0(aVar, a.j.f77867a);
        return jn0.h0.f84049a;
    }

    private final void I1(f.a aVar, final Input input, final f fVar, y20.k<? super Input, f, ? extends c, ? extends Object>.a aVar2) {
        int i11 = g.f77961b[aVar.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return;
        }
        if (i11 == 3) {
            y20.w.l(aVar2, this.documentCameraWorker, p013kotlin.jvm.internal.o0.o(ig0.c.class), "", new wn0.l() { // from class: ig0.g1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.K1(this.f77746a, input, (c.b) obj);
                }
            });
        } else {
            if (i11 != 4 && i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            y20.w.l(aVar2, fVar.getCaptureState() == f.a.SelectFileFromDocuments ? this.documentsSelectWorkerFactory.c() : this.documentsSelectWorkerFactory.e(), p013kotlin.jvm.internal.o0.o(v2.class), "", new wn0.l() { // from class: ig0.h1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.N1(this.f77754a, input, fVar, (v2.c) obj);
                }
            });
        }
    }

    private final void J1(final f.InterfaceC1646f interfaceC1646f, Input input, f fVar, y20.k<? super Input, f, ? extends c, ? extends Object>.a aVar) {
        if (p013kotlin.jvm.internal.s.f(interfaceC1646f, f.InterfaceC1646f.a.f77956a)) {
            if (fVar.getDocumentId() != null) {
                return;
            }
            y20.w.l(aVar, this.documentCreateWorker.a(input.getSessionToken(), input.getKind(), input.getFieldKeyDocument(), input.getDocumentFileLimit()), p013kotlin.jvm.internal.o0.o(com.withpersona.sdk2.inquiry.document.network.a.class), "", new wn0.l() { // from class: ig0.j1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.R1(this.f77783a, (com.withpersona.sdk2.inquiry.document.network.a.b) obj);
                }
            });
            return;
        }
        if (!(interfaceC1646f instanceof f.InterfaceC1646f.UploadFiles)) {
            if (!(interfaceC1646f instanceof f.InterfaceC1646f.DeleteFiles)) {
                if (!(interfaceC1646f instanceof f.InterfaceC1646f.ReadyToSubmit)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            } else {
                if (fVar instanceof f.ReviewCaptures) {
                    f.ReviewCaptures reviewCaptures = (f.ReviewCaptures) fVar;
                    ig0.d documentFileToDelete = reviewCaptures.getDocumentFileToDelete();
                    final ig0.d.Remote remote = documentFileToDelete instanceof ig0.d.Remote ? (ig0.d.Remote) documentFileToDelete : null;
                    if (remote == null) {
                        return;
                    }
                    y20.w.l(aVar, this.documentFileDeleteWorker.a(input.getSessionToken(), reviewCaptures.getDocumentId(), remote), p013kotlin.jvm.internal.o0.o(kg0.a.class), "", new wn0.l() { // from class: ig0.l1
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return r2.Z1(this.f77800a, remote, interfaceC1646f, (kg0.a.b) obj);
                        }
                    });
                    return;
                }
                return;
            }
        }
        List<ig0.d> listG = fVar.g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (obj instanceof ig0.d.Local) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            aVar.a("upload_complete", new i(aVar, this, interfaceC1646f, null));
            return;
        }
        for (final ig0.d.Local local : p013kotlin.collections.v.d1(arrayList, 3)) {
            y20.w.l(aVar, this.documentFileUploadWorker.a(input.getSessionToken(), ((f.InterfaceC1646f.UploadFiles) interfaceC1646f).getDocumentId(), local), p013kotlin.jvm.internal.o0.o(com.withpersona.sdk2.inquiry.document.network.b.class), local.getAbsoluteFilePath(), new wn0.l() { // from class: ig0.k1
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return r2.U1(this.f77789a, interfaceC1646f, local, (com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b) obj2);
                }
            });
        }
    }

    private final void K0(Input renderProps, f renderState) {
        ei0.b bVar;
        if (renderState.getCaptureState() == f.a.CameraRunning) {
            bVar = ei0.b.d.f62972a;
        } else if (renderState instanceof f.Start) {
            bVar = ei0.b.C1292b.f62970a;
        } else if ((renderState instanceof f.ReviewCaptures) || (renderState instanceof f.ReviewCapturesWithoutDocumentId)) {
            bVar = ei0.b.c.f62971a;
        } else {
            if (!(renderState instanceof f.UploadDocument)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = ei0.b.a.f62969a;
        }
        this.externalEventLogger.c(new ei0.i.b(renderProps.getFromStep(), bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r K1(r2 r2Var, final Input input, final ig0.c.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof ig0.c.b.C1638b) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.d2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.L1(it, input, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(it, ig0.c.b.a.f77707a)) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.e2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.M1((y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void L0(y20.k<? super Input, f, ? extends c, ? extends Object>.a aVar, final a aVar2) {
        y20.r<? super Object, f, ? extends Object> rVarD;
        if (p013kotlin.jvm.internal.s.f(aVar2, a.b.f77858a)) {
            rVarD = y20.z.d(this, null, new wn0.l() { // from class: ig0.p1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.M0((y20.r.c) obj);
                }
            }, 1, null);
        } else if (p013kotlin.jvm.internal.s.f(aVar2, a.C1643a.f77857a)) {
            rVarD = y20.z.d(this, null, new wn0.l() { // from class: ig0.r1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.N0((y20.r.c) obj);
                }
            }, 1, null);
        } else if (p013kotlin.jvm.internal.s.f(aVar2, a.g.f77864a)) {
            rVarD = y20.z.d(this, null, new wn0.l() { // from class: ig0.s1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.O0((y20.r.c) obj);
                }
            }, 1, null);
        } else if (p013kotlin.jvm.internal.s.f(aVar2, a.h.f77865a)) {
            rVarD = y20.z.d(this, null, new wn0.l() { // from class: ig0.t1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.P0((y20.r.c) obj);
                }
            }, 1, null);
        } else if (p013kotlin.jvm.internal.s.f(aVar2, a.j.f77867a)) {
            rVarD = y20.z.d(this, null, new wn0.l() { // from class: ig0.u1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.Q0((y20.r.c) obj);
                }
            }, 1, null);
        } else if (p013kotlin.jvm.internal.s.f(aVar2, a.e.f77861a)) {
            rVarD = y20.z.d(this, null, new wn0.l() { // from class: ig0.v1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.R0((y20.r.c) obj);
                }
            }, 1, null);
        } else if (p013kotlin.jvm.internal.s.f(aVar2, a.c.f77859a)) {
            rVarD = y20.z.d(this, null, new wn0.l() { // from class: ig0.w1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.S0((y20.r.c) obj);
                }
            }, 1, null);
        } else if (aVar2 instanceof a.RemoveDocument) {
            rVarD = y20.z.d(this, null, new wn0.l() { // from class: ig0.x1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.T0(aVar2, (y20.r.c) obj);
                }
            }, 1, null);
        } else if (p013kotlin.jvm.internal.s.f(aVar2, a.d.f77860a)) {
            rVarD = y20.z.d(this, null, new wn0.l() { // from class: ig0.y1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.U0((y20.r.c) obj);
                }
            }, 1, null);
        } else {
            if (!(aVar2 instanceof a.Submit)) {
                throw new NoWhenBranchMatchedException();
            }
            rVarD = y20.z.d(this, null, new wn0.l() { // from class: ig0.z1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.V0(aVar2, (y20.r.c) obj);
                }
            }, 1, null);
        }
        aVar.c().b(rVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 L1(ig0.c.b bVar, Input input, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        f.InterfaceC1646f uploadState = ((f) action.c()).getUploadState();
        f.a aVar = null;
        ig0.d dVar = null;
        boolean z11 = false;
        boolean z12 = false;
        String str = null;
        action.e(new f.ReviewCapturesWithoutDocumentId(p013kotlin.collections.v.d1(p013kotlin.collections.v.Q0(((f) action.c()).g(), new ig0.d.Local(((ig0.c.b.C1638b) bVar).getAbsoluteFilePath(), ig0.a.MANUAL, 0, 4, null)), input.getDocumentFileLimit()), ((f) action.c()).getDocumentId(), aVar, uploadState, dVar, z11, z12, str, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 M0(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(c.b.f77894a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 M1(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(((f) action.c()).a(f.a.None));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 N0(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(c.a.f77893a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r N1(final r2 r2Var, final Input input, final f fVar, final v2.c it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof v2.c.Success) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.f2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.O1(it, input, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof v2.c.Failure) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.g2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.P1(it, input, r2Var, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(it, v2.c.a.f78004a)) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.h2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.Q1(fVar, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 O0(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(((f) action.c()).a(f.a.SelectFileFromDocuments).b(false));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 O1(v2.c cVar, Input input, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        f.a aVar = null;
        action.e(new f.ReviewCapturesWithoutDocumentId(p013kotlin.collections.v.d1(p013kotlin.collections.v.P0(((f) action.c()).g(), u2.c(((v2.c.Success) cVar).a())), input.getDocumentFileLimit()), ((f) action.c()).getDocumentId(), aVar, ((f) action.c()).getUploadState(), null, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 P0(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(((f) action.c()).a(f.a.SelectImageFromPhotoLibrary).b(false));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 P1(v2.c cVar, Input input, r2 r2Var, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        f.a aVar = null;
        action.e(new f.ReviewCapturesWithoutDocumentId(p013kotlin.collections.v.d1(p013kotlin.collections.v.P0(((f) action.c()).g(), u2.c(((v2.c.Failure) cVar).a())), input.getDocumentFileLimit()), ((f) action.c()).getDocumentId(), aVar, ((f) action.c()).getUploadState(), null, false, false, r2Var.applicationContext.getString(qh0.e.f105556j), 116, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Q0(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(((f) action.c()).a(f.a.CheckCameraPermissions).b(false));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Q1(f fVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(fVar.a(f.a.None));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 R0(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(((f) action.c()).b(true));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r R1(r2 r2Var, final com.withpersona.sdk2.inquiry.document.network.a.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.a.b.C1164b) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.a2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.S1(it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.a.b.Error) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.c2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.T1(it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 S0(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(((f) action.c()).b(false));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 S1(com.withpersona.sdk2.inquiry.document.network.a.b bVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        com.withpersona.sdk2.inquiry.document.network.a.b.C1164b c1164b = (com.withpersona.sdk2.inquiry.document.network.a.b.C1164b) bVar;
        action.e(f.d((f) action.c(), new f.InterfaceC1646f.ReadyToSubmit(c1164b.getDocumentId()), c1164b.getDocumentId(), null, null, 12, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 T0(a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        if (action.c() instanceof f.ReviewCaptures) {
            a.RemoveDocument removeDocument = (a.RemoveDocument) aVar;
            action.e(f.d((f) action.c(), new f.InterfaceC1646f.DeleteFiles(removeDocument.getDocumentId()), null, null, removeDocument.getDocument(), 6, null));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 T1(com.withpersona.sdk2.inquiry.document.network.a.b bVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        com.withpersona.sdk2.inquiry.document.network.a.b.Error error = (com.withpersona.sdk2.inquiry.document.network.a.b.Error) bVar;
        if (!error.getCause().isRecoverable()) {
            action.d(new c.Errored(error.getCause()));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 U0(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        f fVar = (f) action.c();
        if (fVar instanceof f.ReviewCaptures) {
            action.e(f.ReviewCaptures.j((f.ReviewCaptures) fVar, null, null, null, null, null, false, false, null, 127, null));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r U1(final r2 r2Var, final f.InterfaceC1646f interfaceC1646f, final ig0.d.Local local, final com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b response) {
        p013kotlin.jvm.internal.s.k(response, "response");
        if (response instanceof com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b.d) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.i2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.V1(interfaceC1646f, response, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (response instanceof com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b.c) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.j2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.W1(local, response, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (response instanceof com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b.a) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.k2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.X1(local, interfaceC1646f, response, r2Var, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (response instanceof com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b.C1166b) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.l2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.Y1(response, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 V0(a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        a.Submit submit = (a.Submit) aVar;
        action.e(new f.UploadDocument(((f) action.c()).g(), submit.getDocumentId(), new f.InterfaceC1646f.ReadyToSubmit(submit.getDocumentId()), null, 8, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 V1(f.InterfaceC1646f interfaceC1646f, com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b abstractC1165b, y20.r.c action) {
        f.InterfaceC1646f readyToSubmit;
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        List<ig0.d> listG = ((f) action.c()).g();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listG, 10));
        for (Parcelable parcelableA : listG) {
            com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b.d dVar = (com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b.d) abstractC1165b;
            if (p013kotlin.jvm.internal.s.f(parcelableA, dVar.getOldLocalDocument())) {
                parcelableA = dVar.getNewRemoteDocument();
            }
            arrayList.add(parcelableA);
        }
        if (arrayList.isEmpty()) {
            readyToSubmit = new f.InterfaceC1646f.ReadyToSubmit(((f.InterfaceC1646f.UploadFiles) interfaceC1646f).getDocumentId());
            break;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                readyToSubmit = new f.InterfaceC1646f.ReadyToSubmit(((f.InterfaceC1646f.UploadFiles) interfaceC1646f).getDocumentId());
                break;
            }
            if (((ig0.d) it.next()) instanceof ig0.d.Local) {
                readyToSubmit = new f.InterfaceC1646f.UploadFiles(((f.InterfaceC1646f.UploadFiles) interfaceC1646f).getDocumentId());
                break;
            }
        }
        action.e(f.d((f) action.c(), readyToSubmit, null, arrayList, null, 10, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 W1(ig0.d.Local local, com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b abstractC1165b, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        List<ig0.d> listG = ((f) action.c()).g();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listG, 10));
        for (Parcelable parcelableB : listG) {
            if ((parcelableB instanceof ig0.d.Local) && p013kotlin.jvm.internal.s.f(parcelableB, local)) {
                parcelableB = ig0.d.Local.b((ig0.d.Local) parcelableB, null, null, ((com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b.c) abstractC1165b).getProgressPercentage(), 3, null);
            }
            arrayList.add(parcelableB);
        }
        action.e(f.d((f) action.c(), ((f) action.c()).getUploadState(), null, arrayList, null, 10, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 X0(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.C1643a.f77857a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 X1(ig0.d.Local local, f.InterfaceC1646f interfaceC1646f, com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b abstractC1165b, r2 r2Var, y20.r.c action) {
        f.InterfaceC1646f uploadFiles;
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        List listM0 = p013kotlin.collections.v.M0(((f) action.c()).g(), local);
        List list = listM0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uploadFiles = new f.InterfaceC1646f.ReadyToSubmit(((f.InterfaceC1646f.UploadFiles) interfaceC1646f).getDocumentId());
                    break;
                }
                if (((ig0.d) it.next()) instanceof ig0.d.Local) {
                    uploadFiles = new f.InterfaceC1646f.UploadFiles(((f.InterfaceC1646f.UploadFiles) interfaceC1646f).getDocumentId());
                    break;
                }
            }
        } else {
            uploadFiles = new f.InterfaceC1646f.ReadyToSubmit(((f.InterfaceC1646f.UploadFiles) interfaceC1646f).getDocumentId());
            break;
        }
        action.e(new f.ReviewCaptures(listM0, ((f.InterfaceC1646f.UploadFiles) interfaceC1646f).getDocumentId(), f.a.None, uploadFiles, null, false, false, u2.d(((com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b.a) abstractC1165b).getCause(), r2Var.applicationContext), 80, null));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Y0(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.b.f77858a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Y1(com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b abstractC1165b, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(new c.Errored(((com.withpersona.sdk2.inquiry.document.network.b.AbstractC1165b.C1166b) abstractC1165b).getCause()));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 Z0(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.j.f77867a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r Z1(r2 r2Var, final ig0.d.Remote remote, final f.InterfaceC1646f interfaceC1646f, final kg0.a.b response) {
        p013kotlin.jvm.internal.s.k(response, "response");
        return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.n2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r2.a2(remote, interfaceC1646f, response, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.e.f77861a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a2(ig0.d.Remote remote, f.InterfaceC1646f interfaceC1646f, kg0.a.b bVar, y20.r.c action) {
        f.InterfaceC1646f uploadFiles;
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        f.ReviewCaptures reviewCaptures = objC instanceof f.ReviewCaptures ? (f.ReviewCaptures) objC : null;
        if (reviewCaptures == null) {
            return jn0.h0.f84049a;
        }
        List listM0 = p013kotlin.collections.v.M0(reviewCaptures.g(), remote);
        List list = listM0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    uploadFiles = new f.InterfaceC1646f.ReadyToSubmit(((f.InterfaceC1646f.DeleteFiles) interfaceC1646f).getDocumentId());
                    break;
                }
                if (((ig0.d) it.next()) instanceof ig0.d.Local) {
                    uploadFiles = new f.InterfaceC1646f.UploadFiles(((f.InterfaceC1646f.DeleteFiles) interfaceC1646f).getDocumentId());
                    break;
                }
            }
        } else {
            uploadFiles = new f.InterfaceC1646f.ReadyToSubmit(((f.InterfaceC1646f.DeleteFiles) interfaceC1646f).getDocumentId());
            break;
        }
        f.InterfaceC1646f interfaceC1646f2 = uploadFiles;
        if (bVar instanceof kg0.a.b.C1840b) {
            action.e(f.ReviewCaptures.j(reviewCaptures, listM0, null, null, interfaceC1646f2, null, false, false, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, null));
        } else {
            if (!(bVar instanceof kg0.a.b.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            action.d(new c.Errored(((kg0.a.b.Error) bVar).getCause()));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b1(r2 r2Var, y20.k.a aVar, f fVar, ig0.d.Remote document) {
        p013kotlin.jvm.internal.s.k(document, "document");
        r2Var.L0(aVar, new a.RemoveDocument(((f.ReviewCaptures) fVar).getDocumentId(), document));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c1(r2 r2Var, y20.k.a aVar, f fVar) {
        r2Var.L0(aVar, new a.Submit(((f.ReviewCaptures) fVar).getDocumentId()));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.b.f77858a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 e1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.C1643a.f77857a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 f1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.d.f77860a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r g1(final r2 r2Var, final f fVar, final oh0.c1.Output it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.i1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r2.h1(it, r2Var, fVar, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 h1(oh0.c1.Output output, r2 r2Var, f fVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        int i11 = g.f77960a[output.getPermissionState().getResult().ordinal()];
        if (i11 == 1) {
            ig0.c cVar = r2Var.documentCameraWorker;
            String string = r2Var.applicationContext.getString(qh0.e.f105547a);
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
            action.e(cVar.c(string) ? fVar.a(f.a.CameraRunning) : fVar.a(f.a.None));
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            action.e(fVar.a(f.a.None));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 i1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.c.f77859a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 j1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.c.f77859a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 k1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.g.f77864a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 l1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.h.f77865a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 m1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.j.f77867a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 n1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.e.f77861a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 o1(ig0.d.Remote it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 p1() {
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 q1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.b.f77858a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 r1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.C1643a.f77857a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 s1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.d.f77860a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r t1(final r2 r2Var, final f fVar, final oh0.c1.Output it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.o1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r2.u1(it, r2Var, fVar, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 u1(oh0.c1.Output output, r2 r2Var, f fVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        int i11 = g.f77960a[output.getPermissionState().getResult().ordinal()];
        if (i11 == 1) {
            ig0.c cVar = r2Var.documentCameraWorker;
            String string = r2Var.applicationContext.getString(qh0.e.f105547a);
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
            action.e(cVar.c(string) ? fVar.a(f.a.CameraRunning) : fVar.a(f.a.None));
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            action.e(fVar.a(f.a.None));
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 v1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.c.f77859a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r w1(r2 r2Var, final com.withpersona.sdk2.inquiry.document.network.d.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (p013kotlin.jvm.internal.s.f(it, com.withpersona.sdk2.inquiry.document.network.d.b.C1173b.f57435a)) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.m1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.x1((y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof com.withpersona.sdk2.inquiry.document.network.d.b.Error) {
            return y20.z.d(r2Var, null, new wn0.l() { // from class: ig0.n1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.y1(it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 x1(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(c.d.f77896a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 y1(com.withpersona.sdk2.inquiry.document.network.d.b bVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(new c.Errored(((com.withpersona.sdk2.inquiry.document.network.d.b.Error) bVar).getCause()));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 z1(r2 r2Var, y20.k.a aVar) {
        r2Var.L0(aVar, a.b.f77858a);
        return jn0.h0.f84049a;
    }

    @Override // y20.k
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public f d(Input props, Snapshot snapshot) {
        f fVarB;
        p013kotlin.jvm.internal.s.k(props, "props");
        if (snapshot != null) {
            okio.k kVarB = snapshot.b();
            Parcelable parcelable = null;
            if (kVarB.D() <= 0) {
                kVarB = null;
            }
            if (kVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                p013kotlin.jvm.internal.s.j(parcelObtain, "obtain()");
                byte[] bArrJ = kVarB.J();
                parcelObtain.unmarshall(bArrJ, 0, bArrJ.length);
                parcelObtain.setDataPosition(0);
                Parcelable parcelable2 = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                p013kotlin.jvm.internal.s.h(parcelable2);
                p013kotlin.jvm.internal.s.j(parcelable2, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
                parcelable = parcelable2;
            }
            f fVar = (f) parcelable;
            if (fVar != null && (fVarB = fVar.b(false)) != null) {
                return fVarB;
            }
        }
        e startPage = props.getStartPage();
        if (p013kotlin.jvm.internal.s.f(startPage, e.a.f77926a)) {
            return new f.Start(null, null, props.getDocumentId(), false, 11, null);
        }
        if (startPage instanceof e.Review) {
            return new f.ReviewCaptures(p013kotlin.collections.v.m(), ((e.Review) props.getStartPage()).getDocumentId(), null, null, null, true, false, null, EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // y20.k
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public Object f(Input renderProps, final f renderState, final y20.k<? super Input, f, ? extends c, ? extends Object>.a context) {
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(renderState, "renderState");
        p013kotlin.jvm.internal.s.k(context, "context");
        this.navigationStateManager.c(renderProps.getBackStepEnabled(), renderProps.getCancelButtonEnabled(), !(renderState instanceof f.UploadDocument));
        I1(renderState.getCaptureState(), renderProps, renderState, context);
        J1(renderState.getUploadState(), renderProps, renderState, context);
        K0(renderProps, renderState);
        if (renderState instanceof f.Start) {
            Object iVar = new ig0.i(mi0.c.a(renderProps.getPages().getDocumentStartPage()), A0(renderProps.getPages().getDocumentStartPage(), context), this.navigationStateManager.b(), new wn0.a() { // from class: ig0.y
                @Override // wn0.a
                public final Object invoke() {
                    return r2.X0(this.f78040a, context);
                }
            }, new wn0.a() { // from class: ig0.a0
                @Override // wn0.a
                public final Object invoke() {
                    return r2.Y0(this.f77684a, context);
                }
            });
            f.Start start = (f.Start) renderState;
            if (start.getShouldShowUploadOptionsDialog()) {
                iVar = lh0.d.a(mi0.m.f92265a.j(mi0.c.a(renderProps.getPages().getUploadOptionsDialog()), B0(renderProps.getPages().getUploadOptionsDialog(), context), new wn0.a() { // from class: ig0.m0
                    @Override // wn0.a
                    public final Object invoke() {
                        return r2.j1(this.f77805a, context);
                    }
                }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), iVar, "document_upload_options_dialog");
            }
            boolean z11 = start.getCaptureState() == f.a.CheckCameraPermissions;
            oh0.d0 d0Var = oh0.d0.Camera;
            String permissionsTitle = renderProps.getPermissionsTitle();
            String str = permissionsTitle != null ? permissionsTitle : "";
            String permissionsRationale = renderProps.getPermissionsRationale();
            if (permissionsRationale == null) {
                permissionsRationale = this.applicationContext.getString(qh0.e.f105549c);
                p013kotlin.jvm.internal.s.j(permissionsRationale, "getString(...)");
            }
            Context context2 = this.applicationContext;
            String string = context2.getString(qh0.e.f105548b, yh0.f.b(context2));
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
            return oh0.l1.d(iVar, context, z11, d0Var, (19976 & 8) != 0 ? false : false, str, permissionsRationale, string, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : null, new wn0.l() { // from class: ig0.n0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.B1(this.f77810a, renderState, (oh0.c1.Output) obj);
                }
            });
        }
        if (renderState instanceof f.ReviewCaptures) {
            f.ReviewCaptures reviewCaptures = (f.ReviewCaptures) renderState;
            if (reviewCaptures.getReloadingFromPreviousSession()) {
                y20.w.l(context, this.documentLoadWorker.a(renderProps.getSessionToken(), reviewCaptures.getDocumentId()), p013kotlin.jvm.internal.o0.o(com.withpersona.sdk2.inquiry.document.network.c.class), "", new wn0.l() { // from class: ig0.o0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return r2.D1(this.f77823a, renderState, (com.withpersona.sdk2.inquiry.document.network.c.b) obj);
                    }
                });
            }
            d.ReviewCaptures reviewCaptures2 = new d.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCaptures.g(), this.navigationStateManager.b(), new wn0.a() { // from class: ig0.p0
                @Override // wn0.a
                public final Object invoke() {
                    return r2.G1(this.f77831a, context);
                }
            }, new wn0.a() { // from class: ig0.q0
                @Override // wn0.a
                public final Object invoke() {
                    return r2.H1(this.f77836a, context);
                }
            }, new wn0.a() { // from class: ig0.r0
                @Override // wn0.a
                public final Object invoke() {
                    return r2.Z0(this.f77843a, context);
                }
            }, new wn0.a() { // from class: ig0.s0
                @Override // wn0.a
                public final Object invoke() {
                    return r2.a1(this.f77971a, context);
                }
            }, new wn0.l() { // from class: ig0.t0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.b1(this.f77979a, context, renderState, (d.Remote) obj);
                }
            }, new wn0.a() { // from class: ig0.j0
                @Override // wn0.a
                public final Object invoke() {
                    return r2.c1(this.f77780a, context, renderState);
                }
            }, new wn0.a() { // from class: ig0.u0
                @Override // wn0.a
                public final Object invoke() {
                    return r2.d1(this.f77991a, context);
                }
            }, new wn0.a() { // from class: ig0.f1
                @Override // wn0.a
                public final Object invoke() {
                    return r2.e1(this.f77739a, context);
                }
            }, reviewCaptures.getReloadingFromPreviousSession(), reviewCaptures.g().size() < renderProps.getDocumentFileLimit(), !reviewCaptures.g().isEmpty() && p013kotlin.jvm.internal.s.f(reviewCaptures.getUploadState(), new f.InterfaceC1646f.ReadyToSubmit(reviewCaptures.getDocumentId())), reviewCaptures.getError(), new wn0.a() { // from class: ig0.q1
                @Override // wn0.a
                public final Object invoke() {
                    return r2.f1(this.f77838a, context);
                }
            }, renderProps.getStyles());
            boolean z12 = reviewCaptures.getCaptureState() == f.a.CheckCameraPermissions;
            oh0.d0 d0Var2 = oh0.d0.Camera;
            String permissionsTitle2 = renderProps.getPermissionsTitle();
            if (permissionsTitle2 == null) {
                permissionsTitle2 = "";
            }
            String permissionsRationale2 = renderProps.getPermissionsRationale();
            if (permissionsRationale2 == null) {
                permissionsRationale2 = this.applicationContext.getString(qh0.e.f105549c);
                p013kotlin.jvm.internal.s.j(permissionsRationale2, "getString(...)");
            }
            Context context3 = this.applicationContext;
            String string2 = context3.getString(qh0.e.f105548b, yh0.f.b(context3));
            p013kotlin.jvm.internal.s.j(string2, "getString(...)");
            lh0.c cVarD = oh0.l1.d(reviewCaptures2, context, z12, d0Var2, (19976 & 8) != 0 ? false : false, permissionsTitle2, permissionsRationale2, string2, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : null, new wn0.l() { // from class: ig0.b2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.g1(this.f77693a, renderState, (oh0.c1.Output) obj);
                }
            });
            return reviewCaptures.getShouldShowUploadOptionsDialog() ? lh0.d.a(mi0.m.f92265a.j(mi0.c.a(renderProps.getPages().getUploadOptionsDialog()), B0(renderProps.getPages().getUploadOptionsDialog(), context), new wn0.a() { // from class: ig0.m2
                @Override // wn0.a
                public final Object invoke() {
                    return r2.i1(this.f77807a, context);
                }
            }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), cVarD, "document_upload_screen") : new lh0.c(cVarD, p013kotlin.collections.v.m(), "document_upload_screen");
        }
        if (!(renderState instanceof f.ReviewCapturesWithoutDocumentId)) {
            if (!(renderState instanceof f.UploadDocument)) {
                throw new NoWhenBranchMatchedException();
            }
            y20.w.l(context, this.documentSubmitWorker.a(renderProps.getSessionToken(), renderProps.getInquiryId(), renderProps.getFromStep(), renderProps.getFromComponent(), ((f.UploadDocument) renderState).g()), p013kotlin.jvm.internal.o0.o(com.withpersona.sdk2.inquiry.document.network.d.class), "", new wn0.l() { // from class: ig0.i0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return r2.w1(this.f77773a, (com.withpersona.sdk2.inquiry.document.network.d.b) obj);
                }
            });
            ii0.b.d(this.navigationStateManager, false, false, false, 4, null);
            return new d.LoadingAnimation(renderProps.getPendingTitle(), renderProps.getPendingDescription(), this.navigationStateManager.b(), new wn0.a() { // from class: ig0.k0
                @Override // wn0.a
                public final Object invoke() {
                    return r2.z1(this.f77787a, context);
                }
            }, new wn0.a() { // from class: ig0.l0
                @Override // wn0.a
                public final Object invoke() {
                    return r2.A1(this.f77798a, context);
                }
            }, renderProps.getStyles(), renderProps.getAssetConfig().getPendingPage(), renderProps.getPendingPageTextVerticalPosition());
        }
        f.ReviewCapturesWithoutDocumentId reviewCapturesWithoutDocumentId = (f.ReviewCapturesWithoutDocumentId) renderState;
        String documentId = reviewCapturesWithoutDocumentId.getDocumentId();
        if (documentId != null) {
            context.a(documentId, new h(context, this, documentId, null));
        }
        d.ReviewCaptures reviewCaptures3 = new d.ReviewCaptures(this.imageLoader, renderProps.getPromptTitle(), renderProps.getPromptDescription(), renderProps.getDisclaimer(), renderProps.getSubmitButtonText(), reviewCapturesWithoutDocumentId.g(), this.navigationStateManager.b(), new wn0.a() { // from class: ig0.o2
            @Override // wn0.a
            public final Object invoke() {
                return r2.k1(this.f77828a, context);
            }
        }, new wn0.a() { // from class: ig0.p2
            @Override // wn0.a
            public final Object invoke() {
                return r2.l1(this.f77833a, context);
            }
        }, new wn0.a() { // from class: ig0.q2
            @Override // wn0.a
            public final Object invoke() {
                return r2.m1(this.f77840a, context);
            }
        }, new wn0.a() { // from class: ig0.z
            @Override // wn0.a
            public final Object invoke() {
                return r2.n1(this.f78063a, context);
            }
        }, new wn0.l() { // from class: ig0.b0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r2.o1((d.Remote) obj);
            }
        }, new wn0.a() { // from class: ig0.c0
            @Override // wn0.a
            public final Object invoke() {
                return r2.p1();
            }
        }, new wn0.a() { // from class: ig0.d0
            @Override // wn0.a
            public final Object invoke() {
                return r2.q1(this.f77726a, context);
            }
        }, new wn0.a() { // from class: ig0.e0
            @Override // wn0.a
            public final Object invoke() {
                return r2.r1(this.f77732a, context);
            }
        }, reviewCapturesWithoutDocumentId.getReloadingFromPreviousSession(), reviewCapturesWithoutDocumentId.g().size() < renderProps.getDocumentFileLimit(), false, reviewCapturesWithoutDocumentId.getError(), new wn0.a() { // from class: ig0.f0
            @Override // wn0.a
            public final Object invoke() {
                return r2.s1(this.f77737a, context);
            }
        }, renderProps.getStyles());
        boolean z13 = reviewCapturesWithoutDocumentId.getCaptureState() == f.a.CheckCameraPermissions;
        oh0.d0 d0Var3 = oh0.d0.Camera;
        String permissionsTitle3 = renderProps.getPermissionsTitle();
        if (permissionsTitle3 == null) {
            permissionsTitle3 = "";
        }
        String permissionsRationale3 = renderProps.getPermissionsRationale();
        if (permissionsRationale3 == null) {
            permissionsRationale3 = this.applicationContext.getString(qh0.e.f105549c);
            p013kotlin.jvm.internal.s.j(permissionsRationale3, "getString(...)");
        }
        Context context4 = this.applicationContext;
        String string3 = context4.getString(qh0.e.f105548b, yh0.f.b(context4));
        p013kotlin.jvm.internal.s.j(string3, "getString(...)");
        lh0.c cVarD2 = oh0.l1.d(reviewCaptures3, context, z13, d0Var3, (19976 & 8) != 0 ? false : false, permissionsTitle3, permissionsRationale3, string3, renderProps.getPermissionsModalPositiveButton(), renderProps.getPermissionsModalNegativeButton(), (19976 & 512) != 0 ? null : null, (19976 & 1024) != 0 ? null : null, (19976 & 2048) != 0 ? null : null, this.permissionRequestWorkflow, renderProps.getStyles(), (19976 & 16384) != 0 ? "" : null, new wn0.l() { // from class: ig0.g0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return r2.t1(this.f77744a, renderState, (oh0.c1.Output) obj);
            }
        });
        return reviewCapturesWithoutDocumentId.getShouldShowUploadOptionsDialog() ? lh0.d.a(mi0.m.f92265a.j(mi0.c.a(renderProps.getPages().getUploadOptionsDialog()), B0(renderProps.getPages().getUploadOptionsDialog(), context), new wn0.a() { // from class: ig0.h0
            @Override // wn0.a
            public final Object invoke() {
                return r2.v1(this.f77752a, context);
            }
        }, renderProps.getPages().getUploadOptionsDialog().getCancelButton()), cVarD2, "document_upload_screen") : new lh0.c(cVarD2, p013kotlin.collections.v.m(), "document_upload_screen");
    }

    @Override // y20.k
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public Snapshot g(f state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        return a30.s.a(state);
    }
}
