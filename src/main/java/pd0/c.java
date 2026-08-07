package pd0;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import androidx.core.app.r;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.brentvatne.exoplayer.v0;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.squareup.wire.ProtoAdapter;
import com.tesla.logging.g;
import ezvcard.property.Gender;
import fc0.u5;
import gc0.o;
import gc0.x;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import td0.m;
import vb0.NotificationPackage;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004[`cdB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b$\u0010%J!\u0010)\u001a\u0004\u0018\u00010\u00112\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010*J!\u0010+\u001a\u0004\u0018\u00010\u00112\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001bH\u0002¢\u0006\u0004\b+\u0010*J!\u0010,\u001a\u0004\u0018\u00010\u00112\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001bH\u0002¢\u0006\u0004\b,\u0010*J\u001f\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u001bH\u0002¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u00020\u00112\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0003¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00103J*\u0010:\u001a\u0002092\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\b\u00108\u001a\u0004\u0018\u000107H\u0087@¢\u0006\u0004\b:\u0010;J'\u0010>\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b>\u0010?J\u0019\u0010A\u001a\u0004\u0018\u00010\u00042\u0006\u0010@\u001a\u00020\u0004H\u0000¢\u0006\u0004\bA\u0010\u0019J\u001f\u0010D\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u0011H\u0000¢\u0006\u0004\bD\u0010EJ#\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010F\u001a\u00020#2\b\u0010H\u001a\u0004\u0018\u00010GH\u0000¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\bL\u0010MJ\u0015\u0010P\u001a\u0004\u0018\u00010O*\u00020NH\u0000¢\u0006\u0004\bP\u0010QJ\u0019\u0010T\u001a\u00020\u001b2\b\u0010S\u001a\u0004\u0018\u00010RH\u0000¢\u0006\u0004\bT\u0010UJ\u0019\u0010V\u001a\u00020\u001b2\b\u0010H\u001a\u0004\u0018\u00010GH\u0000¢\u0006\u0004\bV\u0010WJ\u0019\u0010X\u001a\u00020\u001b2\b\u00101\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020_0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006e"}, d2 = {"Lpd0/c;", "", "<init>", "()V", "", "vin", "Landroid/os/Bundle;", "source", "m", "(Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "rawHash", "Landroid/graphics/Bitmap;", Gender.FEMALE, "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/Bitmap;", "path", "", "targetPx", "B", "(Ljava/lang/String;I)Landroid/graphics/Bitmap;", "snapshotHash", "H", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "E", "(Ljava/lang/String;)Ljava/lang/String;", "bundle", "", "y", "(Landroid/os/Bundle;)Z", AnalyticsAttribute.Reason, "Ljn0/h0;", "o", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "base64", "Lfc0/u5;", "v", "(Ljava/lang/String;)Lfc0/u5;", "Lgc0/o;", "chargeState", "useMetric", "k", "(Lgc0/o;Z)Ljava/lang/Integer;", "r", "q", "", "miles", "u", "(FZ)I", Action.KEY_ATTRIBUTE, "p", "(Ljava/lang/String;)I", "w", "(Landroid/content/Context;)V", "x", "Landroid/app/PendingIntent;", "fcmIntent", "Lpd0/c$c;", "l", "(Landroid/content/Context;Landroid/os/Bundle;Landroid/app/PendingIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "srcWidth", "srcHeight", "n", "(III)I", "raw", "G", "input", "modulus", "D", "(Ljava/lang/String;I)I", "vehicleData", "", "chargeStateTimestampSec", "Lpd0/c$d;", "C", "(Lfc0/u5;Ljava/lang/Long;)Lpd0/c$d;", "A", "(Lgc0/o;)Z", "Lgc0/o$f;", "Lpd0/c$b;", "I", "(Lgc0/o$f;)Lpd0/c$b;", "Lgc0/x;", "guiSettings", "t", "(Lgc0/x;)Z", "s", "(Ljava/lang/Long;)Z", "z", "(Ljava/lang/String;)Z", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "log", "Ljava/util/concurrent/ConcurrentHashMap;", "Lpd0/c$a;", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "snapshotCache", DateTokenConverter.CONVERTER_KEY, "a", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f102111a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final g log = g.INSTANCE.a("ChargingNotificationManager");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, CachedSnapshot> snapshotCache = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: pd0.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lpd0/c$a;", "", "", "hash", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class CachedSnapshot {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String hash;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Bitmap bitmap;

        public CachedSnapshot(String hash, Bitmap bitmap) {
            s.k(hash, "hash");
            s.k(bitmap, "bitmap");
            this.hash = hash;
            this.bitmap = bitmap;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getHash() {
            return this.hash;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CachedSnapshot)) {
                return false;
            }
            CachedSnapshot cachedSnapshot = (CachedSnapshot) other;
            return s.f(this.hash, cachedSnapshot.hash) && s.f(this.bitmap, cachedSnapshot.bitmap);
        }

        public int hashCode() {
            return (this.hash.hashCode() * 31) + this.bitmap.hashCode();
        }

        public String toString() {
            return "CachedSnapshot(hash=" + this.hash + ", bitmap=" + this.bitmap + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lpd0/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "CHARGING", "COMPLETE", "STOPPED", "ERROR", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        CHARGING,
        COMPLETE,
        STOPPED,
        ERROR;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: pd0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lpd0/c$c;", "", "<init>", "()V", "c", "a", "b", "Lpd0/c$c$a;", "Lpd0/c$c$b;", "Lpd0/c$c$c;", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class AbstractC2164c {

        /* JADX INFO: renamed from: pd0.c$c$a */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpd0/c$c$a;", "Lpd0/c$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class a extends AbstractC2164c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f102116a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -1277548003;
            }

            public String toString() {
                return "Dismissed";
            }
        }

        /* JADX INFO: renamed from: pd0.c$c$b */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lpd0/c$c$b;", "Lpd0/c$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class b extends AbstractC2164c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f102117a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 760160559;
            }

            public String toString() {
                return "Malformed";
            }
        }

        /* JADX INFO: renamed from: pd0.c$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lpd0/c$c$c;", "Lpd0/c$c;", "Lvb0/b;", "package_", "<init>", "(Lvb0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvb0/b;", "()Lvb0/b;", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Notification extends AbstractC2164c {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final NotificationPackage package_;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Notification(NotificationPackage package_) {
                super(null);
                s.k(package_, "package_");
                this.package_ = package_;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final NotificationPackage getPackage_() {
                return this.package_;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Notification) && s.f(this.package_, ((Notification) other).package_);
            }

            public int hashCode() {
                return this.package_.hashCode();
            }

            public String toString() {
                return "Notification(package_=" + this.package_ + ")";
            }
        }

        public /* synthetic */ AbstractC2164c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC2164c() {
        }
    }

    /* JADX INFO: renamed from: pd0.c$d, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001B×\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b4\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u00108\u001a\u0004\b;\u0010:R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b4\u00108\u001a\u0004\b<\u0010:R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b6\u0010=\u001a\u0004\b7\u0010>R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b?\u0010-\u001a\u0004\b*\u0010/R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\b5\u0010/R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\b,\u0010/R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bB\u0010-\u001a\u0004\b0\u0010/R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bC\u00108\u001a\u0004\bC\u0010:R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b<\u00108\u001a\u0004\bB\u0010:R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b;\u0010D\u001a\u0004\b?\u0010ER\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b9\u0010F\u001a\u0004\b@\u0010 R\u0017\u0010\u001b\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\bG\u00108\u001a\u0004\bG\u0010:R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bA\u0010E¨\u0006I"}, d2 = {"Lpd0/c$d;", "", "Lpd0/c$b;", "displayState", "", "batteryPct", "chargeLimitPct", "", "chargePowerKw", "minutesToChargeLimit", "minutesToFullCharge", "", "isTripPlanChargingSession", "isTripPlanCharging", "isStale", "", "chargeStateTimestampSec", "batteryRangeDistance", "chargeRateDistancePerHour", "chargeAddedDistance", "chargeAddedEnergyKwh", "useMetric", "showEnergy", "", "paidSessionFee", "", "paidSessionFeeCurrency", "isUsingTeslaSupercharger", "paidSessionKwhRate", "<init>", "(Lpd0/c$b;ILjava/lang/Integer;DLjava/lang/Integer;Ljava/lang/Integer;ZZZLjava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZZLjava/lang/Float;Ljava/lang/String;ZLjava/lang/Float;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lpd0/c$b;", "h", "()Lpd0/c$b;", "b", "I", "c", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "D", "getChargePowerKw", "()D", IntegerTokenConverter.CONVERTER_KEY, "f", "j", "g", "Z", "r", "()Z", "q", "p", "Ljava/lang/Long;", "()Ljava/lang/Long;", "k", "l", "m", "n", "o", "Ljava/lang/Float;", "()Ljava/lang/Float;", "Ljava/lang/String;", "s", "t", "notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StructuredPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b displayState;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int batteryPct;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer chargeLimitPct;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final double chargePowerKw;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer minutesToChargeLimit;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer minutesToFullCharge;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isTripPlanChargingSession;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isTripPlanCharging;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isStale;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Long chargeStateTimestampSec;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer batteryRangeDistance;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer chargeRateDistancePerHour;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer chargeAddedDistance;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer chargeAddedEnergyKwh;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean useMetric;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean showEnergy;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final Float paidSessionFee;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final String paidSessionFeeCurrency;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isUsingTeslaSupercharger;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final Float paidSessionKwhRate;

        public StructuredPayload(b displayState, int i11, Integer num, double d11, Integer num2, Integer num3, boolean z11, boolean z12, boolean z13, Long l11, Integer num4, Integer num5, Integer num6, Integer num7, boolean z14, boolean z15, Float f11, String str, boolean z16, Float f12) {
            s.k(displayState, "displayState");
            this.displayState = displayState;
            this.batteryPct = i11;
            this.chargeLimitPct = num;
            this.chargePowerKw = d11;
            this.minutesToChargeLimit = num2;
            this.minutesToFullCharge = num3;
            this.isTripPlanChargingSession = z11;
            this.isTripPlanCharging = z12;
            this.isStale = z13;
            this.chargeStateTimestampSec = l11;
            this.batteryRangeDistance = num4;
            this.chargeRateDistancePerHour = num5;
            this.chargeAddedDistance = num6;
            this.chargeAddedEnergyKwh = num7;
            this.useMetric = z14;
            this.showEnergy = z15;
            this.paidSessionFee = f11;
            this.paidSessionFeeCurrency = str;
            this.isUsingTeslaSupercharger = z16;
            this.paidSessionKwhRate = f12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getBatteryPct() {
            return this.batteryPct;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getBatteryRangeDistance() {
            return this.batteryRangeDistance;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getChargeAddedDistance() {
            return this.chargeAddedDistance;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Integer getChargeAddedEnergyKwh() {
            return this.chargeAddedEnergyKwh;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Integer getChargeLimitPct() {
            return this.chargeLimitPct;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StructuredPayload)) {
                return false;
            }
            StructuredPayload structuredPayload = (StructuredPayload) other;
            return this.displayState == structuredPayload.displayState && this.batteryPct == structuredPayload.batteryPct && s.f(this.chargeLimitPct, structuredPayload.chargeLimitPct) && Double.compare(this.chargePowerKw, structuredPayload.chargePowerKw) == 0 && s.f(this.minutesToChargeLimit, structuredPayload.minutesToChargeLimit) && s.f(this.minutesToFullCharge, structuredPayload.minutesToFullCharge) && this.isTripPlanChargingSession == structuredPayload.isTripPlanChargingSession && this.isTripPlanCharging == structuredPayload.isTripPlanCharging && this.isStale == structuredPayload.isStale && s.f(this.chargeStateTimestampSec, structuredPayload.chargeStateTimestampSec) && s.f(this.batteryRangeDistance, structuredPayload.batteryRangeDistance) && s.f(this.chargeRateDistancePerHour, structuredPayload.chargeRateDistancePerHour) && s.f(this.chargeAddedDistance, structuredPayload.chargeAddedDistance) && s.f(this.chargeAddedEnergyKwh, structuredPayload.chargeAddedEnergyKwh) && this.useMetric == structuredPayload.useMetric && this.showEnergy == structuredPayload.showEnergy && s.f(this.paidSessionFee, structuredPayload.paidSessionFee) && s.f(this.paidSessionFeeCurrency, structuredPayload.paidSessionFeeCurrency) && this.isUsingTeslaSupercharger == structuredPayload.isUsingTeslaSupercharger && s.f(this.paidSessionKwhRate, structuredPayload.paidSessionKwhRate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Integer getChargeRateDistancePerHour() {
            return this.chargeRateDistancePerHour;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Long getChargeStateTimestampSec() {
            return this.chargeStateTimestampSec;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final b getDisplayState() {
            return this.displayState;
        }

        public int hashCode() {
            int iHashCode = ((this.displayState.hashCode() * 31) + Integer.hashCode(this.batteryPct)) * 31;
            Integer num = this.chargeLimitPct;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Double.hashCode(this.chargePowerKw)) * 31;
            Integer num2 = this.minutesToChargeLimit;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.minutesToFullCharge;
            int iHashCode4 = (((((((iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31) + Boolean.hashCode(this.isTripPlanChargingSession)) * 31) + Boolean.hashCode(this.isTripPlanCharging)) * 31) + Boolean.hashCode(this.isStale)) * 31;
            Long l11 = this.chargeStateTimestampSec;
            int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Integer num4 = this.batteryRangeDistance;
            int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.chargeRateDistancePerHour;
            int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.chargeAddedDistance;
            int iHashCode8 = (iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.chargeAddedEnergyKwh;
            int iHashCode9 = (((((iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31) + Boolean.hashCode(this.useMetric)) * 31) + Boolean.hashCode(this.showEnergy)) * 31;
            Float f11 = this.paidSessionFee;
            int iHashCode10 = (iHashCode9 + (f11 == null ? 0 : f11.hashCode())) * 31;
            String str = this.paidSessionFeeCurrency;
            int iHashCode11 = (((iHashCode10 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isUsingTeslaSupercharger)) * 31;
            Float f12 = this.paidSessionKwhRate;
            return iHashCode11 + (f12 != null ? f12.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Integer getMinutesToChargeLimit() {
            return this.minutesToChargeLimit;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Integer getMinutesToFullCharge() {
            return this.minutesToFullCharge;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final Float getPaidSessionFee() {
            return this.paidSessionFee;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getPaidSessionFeeCurrency() {
            return this.paidSessionFeeCurrency;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final Float getPaidSessionKwhRate() {
            return this.paidSessionKwhRate;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getShowEnergy() {
            return this.showEnergy;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final boolean getUseMetric() {
            return this.useMetric;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final boolean getIsStale() {
            return this.isStale;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final boolean getIsTripPlanCharging() {
            return this.isTripPlanCharging;
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final boolean getIsTripPlanChargingSession() {
            return this.isTripPlanChargingSession;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final boolean getIsUsingTeslaSupercharger() {
            return this.isUsingTeslaSupercharger;
        }

        public String toString() {
            return "StructuredPayload(displayState=" + this.displayState + ", batteryPct=" + this.batteryPct + ", chargeLimitPct=" + this.chargeLimitPct + ", chargePowerKw=" + this.chargePowerKw + ", minutesToChargeLimit=" + this.minutesToChargeLimit + ", minutesToFullCharge=" + this.minutesToFullCharge + ", isTripPlanChargingSession=" + this.isTripPlanChargingSession + ", isTripPlanCharging=" + this.isTripPlanCharging + ", isStale=" + this.isStale + ", chargeStateTimestampSec=" + this.chargeStateTimestampSec + ", batteryRangeDistance=" + this.batteryRangeDistance + ", chargeRateDistancePerHour=" + this.chargeRateDistancePerHour + ", chargeAddedDistance=" + this.chargeAddedDistance + ", chargeAddedEnergyKwh=" + this.chargeAddedEnergyKwh + ", useMetric=" + this.useMetric + ", showEnergy=" + this.showEnergy + ", paidSessionFee=" + this.paidSessionFee + ", paidSessionFeeCurrency=" + this.paidSessionFeeCurrency + ", isUsingTeslaSupercharger=" + this.isUsingTeslaSupercharger + ", paidSessionKwhRate=" + this.paidSessionKwhRate + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lpd0/c$c;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lpd0/c$c;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.notifications.charging.ChargingNotificationManager$buildFromPush$2", f = "ChargingNotificationManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super AbstractC2164c>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f102139n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f102140o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Context f102141p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Bundle f102142q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ PendingIntent f102143r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, Bundle bundle, PendingIntent pendingIntent, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f102141p = context;
            this.f102142q = bundle;
            this.f102143r = pendingIntent;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = new e(this.f102141p, this.f102142q, this.f102143r, continuation);
            eVar.f102140o = obj;
            return eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            o.f charging_state;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f102139n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Context applicationContext = this.f102141p.getApplicationContext();
            c cVar = c.f102111a;
            s.h(applicationContext);
            cVar.w(applicationContext);
            String string = this.f102142q.getString("vin");
            if (string != null) {
                String str = !p013kotlin.text.t.y0(string) ? string : null;
                if (str != null) {
                    if (cVar.y(this.f102142q)) {
                        cVar.o(applicationContext, str, "live_activity.event=end");
                        return AbstractC2164c.a.f102116a;
                    }
                    u5 u5VarV = cVar.v(this.f102142q.getString("vehicle_data"));
                    if (u5VarV == null) {
                        c.log.n("Skipping charging push: missing vehicle_data (vin=" + str + ")");
                        return AbstractC2164c.b.f102117a;
                    }
                    o charge_state = u5VarV.getCharge_state();
                    if (((charge_state == null || (charging_state = charge_state.getCharging_state()) == null) ? null : charging_state.getDisconnected()) != null) {
                        cVar.o(applicationContext, str, "charging_state=Disconnected");
                        return AbstractC2164c.a.f102116a;
                    }
                    String string2 = this.f102142q.getString("charge_state_timestamp");
                    StructuredPayload structuredPayloadC = cVar.C(u5VarV, string2 != null ? p013kotlin.text.t.z(string2) : null);
                    if (structuredPayloadC == null) {
                        c.log.n("Skipping charging push: malformed payload (vin=" + str + ")");
                        return AbstractC2164c.b.f102117a;
                    }
                    PendingIntent pendingIntentA = pd0.b.f102110a.a(applicationContext, (cVar.D(str, 100000) * 10) + 2012001, cVar.m(str, this.f102142q));
                    if (pendingIntentA == null) {
                        pendingIntentA = this.f102143r;
                    }
                    PendingIntent pendingIntent = pendingIntentA;
                    String strE = cVar.E(str);
                    if (strE == null) {
                        strE = this.f102142q.getString("snapshot_hash");
                    }
                    Bitmap bitmapF = cVar.F(applicationContext, str, strE);
                    String string3 = this.f102142q.getString("model");
                    return new AbstractC2164c.Notification(new NotificationPackage(cVar.x(str), a.f102108a.a(applicationContext, "charging_status_channel", structuredPayloadC, pendingIntent, Boxing.boxInt(cVar.p(string3)), bitmapF, cVar.z(string3))));
                }
            }
            c.log.n("Skipping charging push: missing or blank VIN");
            return AbstractC2164c.b.f102117a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC2164c> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    private c() {
    }

    private final Bitmap B(String path, int targetPx) {
        Object objB;
        Object objB2;
        File file = new File(path);
        if (!file.exists() || file.length() == 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(BitmapFactory.decodeFile(path, options));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        if (jn0.s.e(objB) != null || options.outWidth <= 0 || options.outHeight <= 0) {
            return null;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = f102111a.n(options.outWidth, options.outHeight, targetPx);
        try {
            objB2 = jn0.s.b(BitmapFactory.decodeFile(path, options2));
        } catch (Throwable th3) {
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            objB2 = jn0.s.b(t.a(th3));
        }
        return (Bitmap) (jn0.s.g(objB2) ? null : objB2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String E(String vin) {
        Object objB;
        Object objB2;
        Object objB3;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(be0.e.INSTANCE.a().n(vin));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        if (jn0.s.g(objB)) {
            objB = null;
        }
        String str = (String) objB;
        if (str == null) {
            return null;
        }
        try {
            objB2 = jn0.s.b(m.j().h("V_" + str));
        } catch (Throwable th3) {
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            objB2 = jn0.s.b(t.a(th3));
        }
        if (jn0.s.g(objB2)) {
            objB2 = null;
        }
        String str2 = (String) objB2;
        if (str2 == null) {
            return null;
        }
        try {
            objB3 = jn0.s.b(new JSONObject(str2).optString("snapshotConfigHash"));
        } catch (Throwable th4) {
            jn0.s.Companion companion4 = jn0.s.INSTANCE;
            objB3 = jn0.s.b(t.a(th4));
        }
        if (jn0.s.g(objB3)) {
            objB3 = null;
        }
        String str3 = (String) objB3;
        if (str3 == null || p013kotlin.text.t.y0(str3)) {
            return null;
        }
        return str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap F(Context context, String vin, String rawHash) {
        String strG = rawHash != null ? G(rawHash) : null;
        if (strG == null) {
            snapshotCache.remove(vin);
            return null;
        }
        ConcurrentHashMap<String, CachedSnapshot> concurrentHashMap = snapshotCache;
        CachedSnapshot cachedSnapshot = concurrentHashMap.get(vin);
        if (cachedSnapshot != null && s.f(cachedSnapshot.getHash(), strG)) {
            return cachedSnapshot.getBitmap();
        }
        Bitmap bitmapB = B(H(context, strG), a.f102108a.e(context));
        if (bitmapB == null) {
            concurrentHashMap.remove(vin);
            return null;
        }
        concurrentHashMap.put(vin, new CachedSnapshot(strG, bitmapB));
        return bitmapB;
    }

    private final String H(Context context, String snapshotHash) {
        return context.getFilesDir().getAbsolutePath() + "/snapshots/" + snapshotHash + "_THREEQUARTER.png";
    }

    private final Integer k(o chargeState, boolean useMetric) {
        Float battery_range = chargeState.getBattery_range();
        if (battery_range != null) {
            return Integer.valueOf(u(battery_range.floatValue(), useMetric));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bundle m(String vin, Bundle source) {
        Bundle bundle = new Bundle();
        bundle.putString("vin", vin);
        String string = source.getString("product_id_s");
        if (string != null) {
            bundle.putString("product_id_s", string);
        }
        String string2 = source.getString("alert_id");
        if (string2 != null) {
            bundle.putString("alert_id", string2);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Context context, String vin, String reason) {
        log.j("Cancelling charging notification (vin=" + vin + ", reason=" + reason + ")");
        r.e(context).b(x(vin));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r4.equals("POPPYSEED") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (r4.equals("NV35") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        return nd0.g.f93840g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r4.equals("Y") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        if (r4.equals("X") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r4.equals("S") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r4.equals("3") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0066, code lost:
    
        if (r4.equals("MODELY") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        return nd0.g.f93839f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0072, code lost:
    
        if (r4.equals("MODELX") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0077, code lost:
    
        return nd0.g.f93838e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
    
        if (r4.equals("MODELS") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0083, code lost:
    
        return nd0.g.f93837d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008a, code lost:
    
        if (r4.equals("MODEL3") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ac, code lost:
    
        return nd0.g.f93836c;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p(java.lang.String r4) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pd0.c.p(java.lang.String):int");
    }

    private final Integer q(o chargeState, boolean useMetric) {
        Float charge_miles_added_rated = chargeState.getCharge_miles_added_rated();
        if (charge_miles_added_rated != null) {
            return Integer.valueOf(u(charge_miles_added_rated.floatValue(), useMetric));
        }
        return null;
    }

    private final Integer r(o chargeState, boolean useMetric) {
        float fIntValue;
        Integer charge_rate_mph = chargeState.getCharge_rate_mph();
        Float charge_rate_mph_float = chargeState.getCharge_rate_mph_float();
        if (charge_rate_mph_float != null && (charge_rate_mph_float.floatValue() > BitmapDescriptorFactory.HUE_RED || charge_rate_mph == null || charge_rate_mph.intValue() == 0)) {
            fIntValue = charge_rate_mph_float.floatValue();
        } else {
            if (charge_rate_mph == null) {
                return null;
            }
            fIntValue = charge_rate_mph.intValue();
        }
        return Integer.valueOf(u(fIntValue, useMetric));
    }

    private final int u(float miles, boolean useMetric) {
        if (useMetric) {
            miles *= 1.609344f;
        }
        return yn0.a.d(n.e(miles, BitmapDescriptorFactory.HUE_RED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u5 v(String base64) {
        Object objB;
        if (base64 == null || p013kotlin.text.t.y0(base64)) {
            log.n("Skipping charging push: missing vehicle_data extra");
            return null;
        }
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            ProtoAdapter<u5> protoAdapter = u5.F;
            byte[] bArrDecode = Base64.decode(base64, 0);
            s.j(bArrDecode, "decode(...)");
            objB = jn0.s.b(protoAdapter.decode(bArrDecode));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            log.d("Skipping charging push: failed to decode vehicle_data proto", thE);
        }
        return (u5) (jn0.s.g(objB) ? null : objB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        v0.a();
        NotificationChannel notificationChannelA = ga.c.a("charging_status_channel", context.getString(bc0.a.f16974d), 4);
        notificationChannelA.setDescription(context.getString(bc0.a.f16971c));
        notificationChannelA.setShowBadge(false);
        notificationChannelA.setSound(null, null);
        notificationChannelA.enableVibration(false);
        notificationChannelA.enableLights(false);
        notificationChannelA.setLockscreenVisibility(1);
        notificationManager.createNotificationChannel(notificationChannelA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int x(String vin) {
        return (D(vin, 100000) * 10) + 2000001;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y(Bundle bundle) {
        Object objB;
        String string = bundle.getString("live_activity");
        if (string == null) {
            return false;
        }
        if (p013kotlin.text.t.y0(string)) {
            string = null;
        }
        if (string == null) {
            return false;
        }
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(Boolean.valueOf(s.f(new JSONObject(string).optString("event"), "end")));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(t.a(th2));
        }
        if (jn0.s.e(objB) != null) {
            objB = Boolean.FALSE;
        }
        return ((Boolean) objB).booleanValue();
    }

    public final boolean A(o chargeState) {
        s.k(chargeState, "chargeState");
        o.e fast_charger_type = chargeState.getFast_charger_type();
        o.d fast_charger_brand = chargeState.getFast_charger_brand();
        if ((fast_charger_type != null ? fast_charger_type.getSupercharger() : null) != null) {
            return true;
        }
        if ((fast_charger_brand != null ? fast_charger_brand.getTesla() : null) == null) {
            return false;
        }
        if ((fast_charger_type != null ? fast_charger_type.getGb() : null) == null) {
            if ((fast_charger_type != null ? fast_charger_type.getCombo() : null) == null) {
                return false;
            }
        }
        return true;
    }

    public final StructuredPayload C(u5 vehicleData, Long chargeStateTimestampSec) {
        b bVarI;
        x.e gui_distance_units;
        s.k(vehicleData, "vehicleData");
        o charge_state = vehicleData.getCharge_state();
        if (charge_state == null) {
            log.n("Skipping charging push: vehicle_data has no charge_state");
            return null;
        }
        o.f charging_state = charge_state.getCharging_state();
        if (charging_state == null || (bVarI = I(charging_state)) == null) {
            log.n("Skipping charging push: charging_state oneof is empty or unknown");
            return null;
        }
        Integer battery_level = charge_state.getBattery_level();
        if (battery_level == null) {
            log.n("Skipping charging push: battery_level missing");
            return null;
        }
        int iN = n.n(battery_level.intValue(), 0, 100);
        x gui_settings = vehicleData.getGui_settings();
        boolean z11 = ((gui_settings == null || (gui_distance_units = gui_settings.getGui_distance_units()) == null) ? null : gui_distance_units.getKilometersPerHour()) != null;
        boolean zT = t(gui_settings);
        Integer charge_limit_soc = charge_state.getCharge_limit_soc();
        Integer numValueOf = charge_limit_soc != null ? Integer.valueOf(n.n(charge_limit_soc.intValue(), 0, 100)) : null;
        Integer charger_power = charge_state.getCharger_power();
        double dF = charger_power != null ? n.f(charger_power.intValue(), 0) : 0.0d;
        Integer minutes_to_charge_limit = charge_state.getMinutes_to_charge_limit();
        Integer minutes_to_full_charge = charge_state.getMinutes_to_full_charge();
        Boolean supercharger_session_trip_planner = charge_state.getSupercharger_session_trip_planner();
        Boolean bool = Boolean.TRUE;
        boolean zF = s.f(supercharger_session_trip_planner, bool);
        boolean zF2 = s.f(charge_state.getTrip_charging(), bool);
        boolean zS = s(chargeStateTimestampSec);
        Integer numK = k(charge_state, z11);
        Integer numR = r(charge_state, z11);
        Integer numQ = q(charge_state, z11);
        Float charge_energy_added = charge_state.getCharge_energy_added();
        Integer numValueOf2 = charge_energy_added != null ? Integer.valueOf(yn0.a.d(n.e(charge_energy_added.floatValue(), BitmapDescriptorFactory.HUE_RED))) : null;
        Float paid_session_fee = charge_state.getPaid_session_fee();
        Float f11 = (paid_session_fee == null || paid_session_fee.floatValue() <= BitmapDescriptorFactory.HUE_RED) ? null : paid_session_fee;
        String paid_session_fee_currency = charge_state.getPaid_session_fee_currency();
        String str = (paid_session_fee_currency == null || p013kotlin.text.t.y0(paid_session_fee_currency)) ? null : paid_session_fee_currency;
        boolean zA = A(charge_state);
        Float paid_session_kwh_rate = charge_state.getPaid_session_kwh_rate();
        return new StructuredPayload(bVarI, iN, numValueOf, dF, minutes_to_charge_limit, minutes_to_full_charge, zF, zF2, zS, chargeStateTimestampSec, numK, numR, numQ, numValueOf2, z11, zT, f11, str, zA, (paid_session_kwh_rate == null || paid_session_kwh_rate.floatValue() <= BitmapDescriptorFactory.HUE_RED) ? null : paid_session_kwh_rate);
    }

    public final int D(String input, int modulus) {
        s.k(input, "input");
        return (int) ((((long) input.hashCode()) & 2147483647L) % ((long) modulus));
    }

    public final String G(String raw) throws IOException {
        s.k(raw, "raw");
        StringBuilder sb2 = new StringBuilder();
        int length = raw.length();
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = raw.charAt(i11);
            if (Character.isLetterOrDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        String string = sb2.toString();
        if (p013kotlin.text.t.y0(string) || !s.f(string, raw)) {
            return null;
        }
        return string;
    }

    public final b I(o.f fVar) {
        s.k(fVar, "<this>");
        if (fVar.getCharging() != null) {
            return b.CHARGING;
        }
        if (fVar.getCalibrating() != null) {
            return b.CHARGING;
        }
        if (fVar.getStarting() != null) {
            return b.CHARGING;
        }
        if (fVar.getComplete() != null) {
            return b.COMPLETE;
        }
        if (fVar.getStopped() != null) {
            return b.STOPPED;
        }
        if (fVar.getNoPower() != null) {
            return b.ERROR;
        }
        fVar.getUnknown();
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public final Object l(Context context, Bundle bundle, PendingIntent pendingIntent, Continuation<? super AbstractC2164c> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new e(context, bundle, pendingIntent, null), continuation);
    }

    public final int n(int srcWidth, int srcHeight, int targetPx) {
        int i11 = 1;
        if (targetPx <= 0) {
            return 1;
        }
        int i12 = srcWidth / 2;
        for (int i13 = srcHeight / 2; i12 >= targetPx && i13 >= targetPx; i13 /= 2) {
            i11 *= 2;
            i12 /= 2;
        }
        return i11;
    }

    public final boolean s(Long chargeStateTimestampSec) {
        return chargeStateTimestampSec != null && chargeStateTimestampSec.longValue() > 0 && (System.currentTimeMillis() / 1000) - chargeStateTimestampSec.longValue() > 60;
    }

    public final boolean t(x guiSettings) {
        x.a gui_charge_rate_units;
        if (guiSettings == null || (gui_charge_rate_units = guiSettings.getGui_charge_rate_units()) == null) {
            return true;
        }
        return (gui_charge_rate_units.getInvalid() == null && gui_charge_rate_units.getKilometersPerHour() == null && gui_charge_rate_units.getMilesPerHour() == null && gui_charge_rate_units.getKW() == null) || gui_charge_rate_units.getKW() != null;
    }

    public final boolean z(String key) {
        String upperCase;
        if (key != null) {
            upperCase = key.toUpperCase(Locale.ROOT);
            s.j(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        return s.f(upperCase, "CYBERTRUCK");
    }
}
