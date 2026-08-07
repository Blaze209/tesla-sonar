package h20;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.google.android.gms.common.internal.ImagesContract;
import ezvcard.property.Gender;
import ezvcard.property.Kind;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.s;
import s20.PlatformContextRetriever;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 t2\u00020\u0001:\u0001=B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0014J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b$\u0010#J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b)\u0010#J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b*\u0010#J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b+\u0010#J\u000f\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000f¢\u0006\u0004\b/\u0010\u0014J\u0017\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b1\u00102J\r\u00103\u001a\u00020\u000f¢\u0006\u0004\b3\u0010\u0014J\r\u00104\u001a\u00020\u000f¢\u0006\u0004\b4\u0010\u0014J\r\u00105\u001a\u00020\u000f¢\u0006\u0004\b5\u0010\u0014J\u0015\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u0004¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010>\u001a\u0004\bA\u0010@\"\u0004\bB\u0010<R\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0015R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010ER\u0014\u0010H\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010GR$\u0010K\u001a\u00020\u00042\u0006\u0010I\u001a\u00020\u00048\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b$\u0010>\"\u0004\bJ\u0010<R\u0014\u0010N\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010MR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR*\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010`\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010h\u001a\u0004\u0018\u00010a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR*\u0010o\u001a\u00020C2\u0006\u0010i\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010\u0015\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010v\u001a\u00020p8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR*\u0010\u007f\u001a\u00020w2\u0006\u0010x\u001a\u00020w8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R3\u0010\u0087\u0001\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bd\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R3\u0010\u008a\u0001\u001a\u00030\u0080\u00012\b\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u0019\u0010\u0082\u0001\u001a\u0006\b\u0088\u0001\u0010\u0084\u0001\"\u0006\b\u0089\u0001\u0010\u0086\u0001R3\u0010\u0092\u0001\u001a\u00030\u008b\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b\u0016\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R-\u0010\u0095\u0001\u001a\u00020C2\u0007\u0010\u0093\u0001\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0013\n\u0004\b\u0018\u0010\u0015\u001a\u0004\bZ\u0010l\"\u0005\b\u0094\u0001\u0010nR-\u0010\u0097\u0001\u001a\u00020C2\u0007\u0010\u0093\u0001\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0013\n\u0004\b\u0017\u0010\u0015\u001a\u0004\bS\u0010l\"\u0005\b\u0096\u0001\u0010nR-\u0010\u0099\u0001\u001a\u00020C2\u0007\u0010\u0093\u0001\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0013\n\u0004\b3\u0010\u0015\u001a\u0004\bj\u0010l\"\u0005\b\u0098\u0001\u0010nR-\u0010\u009a\u0001\u001a\u00020C2\u0007\u0010\u0093\u0001\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0013\n\u0004\b5\u0010\u0015\u001a\u0004\bb\u0010l\"\u0005\b\u0082\u0001\u0010nR-\u0010\u009c\u0001\u001a\u00020C2\u0007\u0010\u0093\u0001\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0013\n\u0004\b \u0010\u0015\u001a\u0004\by\u0010l\"\u0005\b\u009b\u0001\u0010nR.\u0010\u009d\u0001\u001a\u00020C2\u0007\u0010\u009d\u0001\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b\u0013\u0010\u0015\u001a\u0005\b\u009e\u0001\u0010l\"\u0005\b\u009f\u0001\u0010nR.\u0010 \u0001\u001a\u00020C2\u0007\u0010 \u0001\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b;\u0010\u0015\u001a\u0005\b¡\u0001\u0010l\"\u0005\b¢\u0001\u0010nR2\u0010¦\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010£\u0001\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b4\u0010>\u001a\u0005\b¤\u0001\u0010@\"\u0005\b¥\u0001\u0010<RF\u0010°\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¨\u00010§\u00012\u0011\u0010©\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¨\u00010§\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R.\u0010±\u0001\u001a\u00020C2\u0007\u0010±\u0001\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b\"\u0010\u0015\u001a\u0005\b²\u0001\u0010l\"\u0005\b³\u0001\u0010nR/\u0010·\u0001\u001a\u00020C2\u0007\u0010´\u0001\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0089\u0001\u0010\u0015\u001a\u0005\bµ\u0001\u0010l\"\u0005\b¶\u0001\u0010nR.\u0010»\u0001\u001a\u00020C2\u0007\u0010¸\u0001\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\bm\u0010\u0015\u001a\u0005\b¹\u0001\u0010l\"\u0005\bº\u0001\u0010nR/\u0010¿\u0001\u001a\u00020C2\u0007\u0010¼\u0001\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b½\u0001\u0010\u0015\u001a\u0005\b¾\u0001\u0010l\"\u0005\bª\u0001\u0010nR/\u0010À\u0001\u001a\u00020C2\u0007\u0010À\u0001\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0096\u0001\u0010\u0015\u001a\u0005\bÁ\u0001\u0010l\"\u0005\b½\u0001\u0010nR/\u0010Â\u0001\u001a\u00020C2\u0007\u0010Â\u0001\u001a\u00020C8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010\u0015\u001a\u0005\bÃ\u0001\u0010l\"\u0005\bÄ\u0001\u0010nR,\u0010Ë\u0001\u001a\u0005\u0018\u00010Å\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R8\u0010Ó\u0001\u001a\u0005\u0018\u00010Ì\u00012\n\u0010Í\u0001\u001a\u0005\u0018\u00010Ì\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010Ö\u0001\u001a\u00030Ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010Õ\u0001R\u0018\u0010×\u0001\u001a\u00030Ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010Õ\u0001R\u0018\u0010Ø\u0001\u001a\u00030Ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010Õ\u0001R\u0017\u0010Ù\u0001\u001a\u00030Ô\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b}\u0010Õ\u0001R\u0018\u0010Ú\u0001\u001a\u00030Ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Õ\u0001R\u0012\u0010Û\u0001\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bP\u0010l¨\u0006Ü\u0001"}, d2 = {"Lh20/o;", "", "Lz10/c;", "emitter", "", "namespace", "appId", "", "Lk20/f;", "platformContextProperties", "Ls20/e;", "platformContextRetriever", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "Ljn0/h0;", "builder", "<init>", "(Lz10/c;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ls20/e;Landroid/content/Context;Lwn0/l;)V", "w", "()V", "Z", "q", "s", "r", "p", "Lo20/f;", "event", "a0", "(Lo20/f;)Ljava/util/List;", "Lh20/r;", "Lr20/a;", "v", "(Lh20/r;)Lr20/a;", "A", "(Lh20/r;)V", "f", StatusResponse.PAYLOAD, "c", "(Lr20/a;Lh20/r;)V", "b0", "c0", "b", "e", "Le20/a;", "m", "()Le20/a;", "g", "Ljava/util/UUID;", "X", "(Lo20/f;)Ljava/util/UUID;", "t", "y", "u", "Lg20/i;", "stateMachine", DateTokenConverter.CONVERTER_KEY, "(Lg20/i;)V", "identifier", "x", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getNamespace", "()Ljava/lang/String;", "getAppId", "setAppId", "", "builderFinished", "Landroid/content/Context;", "Lg20/k;", "Lg20/k;", "stateManager", "version", Gender.UNKNOWN, "trackerVersion", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_dataCollection", "Lh20/h;", "h", "Lh20/h;", "platformContextManager", IntegerTokenConverter.CONVERTER_KEY, "Lz10/c;", "getEmitter", "()Lz10/c;", "setEmitter", "(Lz10/c;)V", "Lh20/l;", "j", "Lh20/l;", "getSubject", "()Lh20/l;", "T", "(Lh20/l;)V", "subject", "Lf20/d;", "k", "Lf20/d;", "o", "()Lf20/d;", "setSession", "(Lf20/d;)V", "session", "base64", "l", "getBase64Encoded", "()Z", "C", "(Z)V", "base64Encoded", "Ls20/a;", "Ls20/a;", "getPlatform", "()Ls20/a;", Gender.NONE, "(Ls20/a;)V", "platform", "Ls20/c;", "level", "n", "Ls20/c;", "getLogLevel", "()Ls20/c;", "L", "(Ls20/c;)V", "logLevel", "", "timeout", "J", "getForegroundTimeout", "()J", "G", "(J)V", "foregroundTimeout", "getBackgroundTimeout", "B", "backgroundTimeout", "Ljava/util/concurrent/TimeUnit;", "timeunit", "Ljava/util/concurrent/TimeUnit;", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "setTimeUnit", "(Ljava/util/concurrent/TimeUnit;)V", "timeUnit", "willTrack", Gender.FEMALE, "exceptionAutotracking", "E", "diagnosticAutotracking", "K", "lifecycleAutotracking", "installAutotracking", "R", "screenViewAutotracking", "screenEngagementAutotracking", "getScreenEngagementAutotracking", "Q", "userAnonymisation", "getUserAnonymisation", "W", "suffix", "getTrackerVersionSuffix", "V", "trackerVersionSuffix", "", "Ljava/lang/Runnable;", "callbacksArray", "z", "[Ljava/lang/Runnable;", "getSessionCallbacks", "()[Ljava/lang/Runnable;", "setSessionCallbacks", "([Ljava/lang/Runnable;)V", "sessionCallbacks", "sessionContext", "getSessionContext", "S", "geolocation", "getGeoLocationContext", "I", "geoLocationContext", "mobile", "getPlatformContextEnabled", Gender.OTHER, "platformContextEnabled", Kind.APPLICATION, "D", "getApplicationContext", "applicationContext", "deepLinkContext", "getDeepLinkContext", "screenContext", "getScreenContext", "P", "Lb20/a;", "Lb20/a;", "getGdprContext", "()Lb20/a;", "H", "(Lb20/a;)V", "gdprContext", "Ls20/d;", "delegate", "Ls20/d;", "getLoggerDelegate", "()Ls20/d;", Gender.MALE, "(Ls20/d;)V", "loggerDelegate", "Li20/b$a;", "Li20/b$a;", "receiveLifecycleNotification", "receiveScreenViewNotification", "receiveInstallNotification", "receiveDiagnosticNotification", "receiveCrashReportingNotification", "dataCollection", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o {
    private static final String O = o.class.getSimpleName();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean sessionContext;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean geoLocationContext;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean platformContextEnabled;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean applicationContext;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean deepLinkContext;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private boolean screenContext;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private b20.a gdprContext;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private s20.d loggerDelegate;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final i20.b.a receiveLifecycleNotification;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final i20.b.a receiveScreenViewNotification;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final i20.b.a receiveInstallNotification;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final i20.b.a receiveDiagnosticNotification;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final i20.b.a receiveCrashReportingNotification;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String namespace;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String appId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean builderFinished;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g20.k stateManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String trackerVersion;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean _dataCollection;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h platformContextManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private z10.c emitter;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private l subject;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private f20.d session;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean base64Encoded;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private s20.a platform;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private s20.c logLevel;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long foregroundTimeout;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long backgroundTimeout;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private TimeUnit timeUnit;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean exceptionAutotracking;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean diagnosticAutotracking;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean lifecycleAutotracking;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean installAutotracking;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean screenViewAutotracking;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean screenEngagementAutotracking;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean userAnonymisation;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private String trackerVersionSuffix;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Runnable[] sessionCallbacks;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"h20/o$b", "Li20/b$a;", "", "", "", "data", "Ljn0/h0;", "a", "(Ljava/util/Map;)V", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends i20.b.a {
        b() {
        }

        @Override // i20.b.a
        public void a(Map<String, ? extends Object> data) {
            s.k(data, "data");
            if (o.this.getExceptionAutotracking()) {
                Object obj = data.get("event");
                o20.f fVar = obj instanceof o20.f ? (o20.f) obj : null;
                if (fVar != null) {
                    o.this.X(fVar);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"h20/o$c", "Li20/b$a;", "", "", "", "data", "Ljn0/h0;", "a", "(Ljava/util/Map;)V", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends i20.b.a {
        c() {
        }

        @Override // i20.b.a
        public void a(Map<String, ? extends Object> data) {
            s.k(data, "data");
            if (o.this.getDiagnosticAutotracking()) {
                Object obj = data.get("event");
                o20.f fVar = obj instanceof o20.f ? (o20.f) obj : null;
                if (fVar != null) {
                    o.this.X(fVar);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"h20/o$d", "Li20/b$a;", "", "", "", "data", "Ljn0/h0;", "a", "(Ljava/util/Map;)V", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends i20.b.a {
        d() {
        }

        @Override // i20.b.a
        public void a(Map<String, ? extends Object> data) {
            s.k(data, "data");
            if (o.this.getInstallAutotracking()) {
                Object obj = data.get("event");
                o20.f fVar = obj instanceof o20.f ? (o20.f) obj : null;
                if (fVar != null) {
                    o.this.X(fVar);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"h20/o$e", "Li20/b$a;", "", "", "", "data", "Ljn0/h0;", "a", "(Ljava/util/Map;)V", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends i20.b.a {
        e() {
        }

        @Override // i20.b.a
        public void a(Map<String, ? extends Object> data) {
            s.k(data, "data");
            f20.d session = o.this.getSession();
            if (session == null || !o.this.getLifecycleAutotracking()) {
                return;
            }
            Object obj = data.get("isForeground");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                if (session.m() == (!zBooleanValue)) {
                    return;
                }
                if (zBooleanValue) {
                    o.this.X(new o20.g().g(Integer.valueOf(session.getForegroundIndex() + 1)));
                } else {
                    o.this.X(new o20.d().g(Integer.valueOf(session.getBackgroundIndex() + 1)));
                }
                session.n(!zBooleanValue);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"h20/o$f", "Li20/b$a;", "", "", "", "data", "Ljn0/h0;", "a", "(Ljava/util/Map;)V", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f extends i20.b.a {
        f() {
        }

        @Override // i20.b.a
        public void a(Map<String, ? extends Object> data) {
            s.k(data, "data");
            if (o.this.getScreenViewAutotracking()) {
                Object obj = data.get("event");
                o20.j jVar = obj instanceof o20.j ? (o20.j) obj : null;
                if (jVar != null) {
                    e20.a aVarM = o.this.m();
                    if (aVarM == null) {
                        o.this.X(jVar);
                        return;
                    }
                    String strL = jVar.getActivityClassName();
                    if (strL == null || strL.length() == 0 || !s.f(jVar.getActivityClassName(), aVarM.getActivityClassName()) || !s.f(jVar.getActivityTag(), aVarM.getActivityTag())) {
                        o.this.X(jVar);
                    }
                }
            }
        }
    }

    public o(z10.c emitter, String namespace, String appId, List<? extends k20.f> list, PlatformContextRetriever eVar, Context context, wn0.l<? super o, h0> lVar) {
        boolean z11;
        s.k(emitter, "emitter");
        s.k(namespace, "namespace");
        s.k(appId, "appId");
        s.k(context, "context");
        this.namespace = namespace;
        this.appId = appId;
        this.stateManager = new g20.k();
        this.trackerVersion = "andr-6.0.3";
        this._dataCollection = new AtomicBoolean(true);
        this.platformContextManager = new h(0L, 0L, null, list, eVar == null ? new PlatformContextRetriever(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null) : eVar, context, 7, null);
        this.emitter = emitter;
        q qVar = q.f70530a;
        this.base64Encoded = qVar.c();
        this.platform = qVar.e();
        this.logLevel = qVar.l();
        this.foregroundTimeout = qVar.h();
        this.backgroundTimeout = qVar.b();
        this.timeUnit = qVar.r();
        this.exceptionAutotracking = qVar.g();
        this.diagnosticAutotracking = qVar.f();
        this.lifecycleAutotracking = qVar.k();
        this.installAutotracking = qVar.j();
        this.screenViewAutotracking = qVar.p();
        this.userAnonymisation = qVar.s();
        this.sessionCallbacks = new Runnable[]{null, null, null, null};
        this.sessionContext = qVar.q();
        this.geoLocationContext = qVar.i();
        this.platformContextEnabled = qVar.m();
        this.applicationContext = qVar.a();
        this.receiveLifecycleNotification = new e();
        this.receiveScreenViewNotification = new f();
        this.receiveInstallNotification = new d();
        this.receiveDiagnosticNotification = new c();
        this.receiveCrashReportingNotification = new b();
        this.context = context;
        if (lVar != null) {
            lVar.invoke(this);
        }
        emitter.h();
        String str = this.trackerVersionSuffix;
        if (str != null) {
            String strJ = new p013kotlin.text.q("[^A-Za-z0-9.-]").j(str, "");
            if (strJ.length() > 0) {
                U(this.trackerVersion + ' ' + strJ);
            }
        }
        if (this.diagnosticAutotracking && this.logLevel == s20.c.OFF) {
            L(s20.c.ERROR);
        }
        g.i(this.logLevel);
        if (this.sessionContext) {
            Runnable[] runnableArr = {null, null, null, null};
            Runnable[] runnableArr2 = this.sessionCallbacks;
            z11 = true;
            this.session = f20.d.INSTANCE.b(context, this.foregroundTimeout, this.backgroundTimeout, this.timeUnit, namespace, runnableArr2.length == 4 ? runnableArr2 : runnableArr);
        } else {
            z11 = true;
        }
        w();
        p();
        q();
        s();
        r();
        y();
        this.builderFinished = z11;
        String TAG = O;
        s.j(TAG, "TAG");
        g.j(TAG, "Tracker created successfully.", new Object[0]);
    }

    private final void A(r event) {
        if (event.getSchema() == null || !s.f(event.getSchema(), "iglu:com.snowplowanalytics.mobile/application_install/jsonschema/1-0-0")) {
            return;
        }
        Long lG = event.getTrueTimestamp();
        if (lG != null) {
            event.o(lG.longValue());
        }
        event.p(null);
    }

    private final void U(String str) {
        if (this.builderFinished) {
            return;
        }
        this.trackerVersion = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(n0 trackerEvents, o this$0) {
        h0 h0Var;
        s.k(trackerEvents, "$trackerEvents");
        s.k(this$0, "this$0");
        for (Pair pair : (Iterable) trackerEvents.f86529a) {
            o20.f fVar = (o20.f) pair.a();
            r rVar = (r) pair.b();
            r20.a aVarV = this$0.v(rVar);
            if (aVarV != null) {
                String TAG = O;
                s.j(TAG, "TAG");
                g.j(TAG, "Adding new payload to event storage: %s", aVarV);
                this$0.emitter.c(aVarV);
                fVar.c(this$0);
                this$0.stateManager.e(rVar);
                h0Var = h0.f84049a;
            } else {
                h0Var = null;
            }
            if (h0Var == null) {
                String TAG2 = O;
                s.j(TAG2, "TAG");
                g.a(TAG2, "Event not tracked due to filtering: %s", rVar.getEventId());
                fVar.c(this$0);
            }
        }
    }

    private final void Z() {
        i20.b.c(this.receiveDiagnosticNotification);
        i20.b.c(this.receiveScreenViewNotification);
        i20.b.c(this.receiveLifecycleNotification);
        i20.b.c(this.receiveInstallNotification);
        i20.b.c(this.receiveCrashReportingNotification);
    }

    private final List<o20.f> a0(o20.f event) {
        return v.P0(this.stateManager.h(event), v.e(event));
    }

    private final void b(r event) {
        r20.b bVarG;
        r20.b bVarD;
        r20.b bVarD2;
        if (this.applicationContext && (bVarD2 = i20.c.d(this.context)) != null) {
            event.b(bVarD2);
        }
        if (this.platformContextEnabled && (bVarD = this.platformContextManager.d(this.userAnonymisation)) != null) {
            event.b(bVarD);
        }
        if (event.getIsService()) {
            return;
        }
        if (this.geoLocationContext && (bVarG = i20.c.g(this.context)) != null) {
            event.b(bVarG);
        }
        b20.a aVar = this.gdprContext;
        if (aVar != null) {
            event.b(aVar.a());
        }
    }

    private final void b0(r20.a payload, r event) {
        String strE;
        String strF = null;
        if (!s.f(event.getSchema(), "iglu:com.snowplowanalytics.mobile/deep_link_received/jsonschema/1-0-0")) {
            if (!s.f(event.getSchema(), "iglu:com.snowplowanalytics.mobile/screen_view/jsonschema/1-0-0")) {
                strE = null;
                break;
            }
            Iterator<r20.b> it = event.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    strE = null;
                    break;
                }
                r20.b next = it.next();
                if (next instanceof n20.b) {
                    n20.b bVar = (n20.b) next;
                    strF = bVar.f();
                    strE = bVar.e();
                    break;
                }
            }
        } else {
            Object obj = event.e().get(ImagesContract.URL);
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = event.e().get("referrer");
            strE = obj2 instanceof String ? (String) obj2 : null;
            strF = str;
        }
        if (strF != null) {
            payload.d(ImagesContract.URL, i20.c.f75571a.q(strF));
        }
        if (strE != null) {
            payload.d("refr", i20.c.f75571a.q(strE));
        }
    }

    private final void c(r20.a payload, r event) {
        payload.d("eid", event.getEventId().toString());
        payload.d("dtm", String.valueOf(event.getTimestamp()));
        Long lG = event.getTrueTimestamp();
        if (lG != null) {
            payload.d("ttm", String.valueOf(lG.longValue()));
        }
        payload.d("aid", this.appId);
        payload.d("tna", this.namespace);
        payload.d("tv", this.trackerVersion);
        l lVar = this.subject;
        if (lVar != null) {
            payload.c(new HashMap(lVar.a(this.userAnonymisation)));
        }
        payload.d("p", this.platform.getValue());
        if (event.getIsPrimitive()) {
            payload.d("e", event.getName());
        } else {
            payload.d("e", "ue");
        }
    }

    private final void c0(r event) {
        if (event.getIsService() || !this.sessionContext) {
            return;
        }
        String string = event.getEventId().toString();
        s.j(string, "event.eventId.toString()");
        long jF = event.getTimestamp();
        f20.d dVar = this.session;
        if (dVar == null) {
            String TAG = O;
            s.j(TAG, "TAG");
            g.h(TAG, "Session not ready or method getHasLoadedFromFile returned false with eventId: %s", string);
        } else {
            r20.b bVarK = dVar.k(string, jF, this.userAnonymisation);
            if (bVarK != null) {
                event.c().add(bVarK);
            }
        }
    }

    private final void e(r event) {
        Iterator<r20.b> it = this.stateManager.g(event).iterator();
        while (it.hasNext()) {
            event.b(it.next());
        }
    }

    private final void f(r event) {
        this.stateManager.c(event);
    }

    private final void p() {
        if (!this.exceptionAutotracking || (Thread.getDefaultUncaughtExceptionHandler() instanceof h20.e)) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new h20.e());
    }

    private final void q() {
        if (this.installAutotracking) {
            h20.c.INSTANCE.f(this.context);
        }
    }

    private final void r() {
        if (this.lifecycleAutotracking) {
            f20.b.INSTANCE.b(this.context);
            d(new g20.d());
        }
    }

    private final void s() {
        if (this.screenViewAutotracking) {
            a.INSTANCE.a(this.context);
        }
    }

    private final r20.a v(r event) {
        r20.c cVar = new r20.c();
        A(event);
        c(cVar, event);
        f(event);
        b(event);
        e(event);
        event.r(cVar, this.base64Encoded);
        event.q(cVar, this.base64Encoded);
        if (!this.stateManager.i(event)) {
            return null;
        }
        if (!event.getIsPrimitive()) {
            b0(cVar, event);
        }
        return cVar;
    }

    private final void w() {
        i20.b.a("SnowplowTrackerDiagnostic", this.receiveDiagnosticNotification);
        i20.b.a("SnowplowScreenView", this.receiveScreenViewNotification);
        i20.b.a("SnowplowLifecycleTracking", this.receiveLifecycleNotification);
        i20.b.a("SnowplowInstallTracking", this.receiveInstallNotification);
        i20.b.a("SnowplowCrashReporting", this.receiveCrashReportingNotification);
    }

    public final void B(long j11) {
        if (this.builderFinished) {
            return;
        }
        this.backgroundTimeout = j11;
    }

    public final void C(boolean z11) {
        if (this.builderFinished) {
            return;
        }
        this.base64Encoded = z11;
    }

    public final void D(boolean z11) {
        this.deepLinkContext = z11;
        if (z11) {
            d(new g20.b());
        } else {
            x(g20.b.INSTANCE.a());
        }
    }

    public final void E(boolean z11) {
        if (this.builderFinished) {
            return;
        }
        this.diagnosticAutotracking = z11;
    }

    public final void F(boolean z11) {
        if (this.builderFinished) {
            return;
        }
        this.exceptionAutotracking = z11;
    }

    public final void G(long j11) {
        if (this.builderFinished) {
            return;
        }
        this.foregroundTimeout = j11;
    }

    public final void H(b20.a aVar) {
        this.gdprContext = aVar;
    }

    public final void I(boolean z11) {
        if (this.builderFinished) {
            return;
        }
        this.geoLocationContext = z11;
    }

    public final void J(boolean z11) {
        if (this.builderFinished) {
            return;
        }
        this.installAutotracking = z11;
    }

    public final void K(boolean z11) {
        if (this.builderFinished) {
            return;
        }
        this.lifecycleAutotracking = z11;
    }

    public final void L(s20.c level) {
        s.k(level, "level");
        if (this.builderFinished) {
            return;
        }
        this.logLevel = level;
    }

    public final void M(s20.d dVar) {
        if (this.builderFinished) {
            return;
        }
        this.loggerDelegate = dVar;
        g.f70421a.f(dVar);
    }

    public final void N(s20.a aVar) {
        s.k(aVar, "<set-?>");
        this.platform = aVar;
    }

    public final void O(boolean z11) {
        if (this.builderFinished) {
            return;
        }
        this.platformContextEnabled = z11;
    }

    public final void P(boolean z11) {
        this.screenContext = z11;
        if (z11) {
            d(new e20.b());
        } else {
            x(e20.b.INSTANCE.a());
        }
    }

    public final void Q(boolean z11) {
        this.screenEngagementAutotracking = z11;
        if (z11) {
            d(new e20.d());
        } else {
            x(e20.d.INSTANCE.a());
        }
    }

    public final void R(boolean z11) {
        if (this.builderFinished) {
            return;
        }
        this.screenViewAutotracking = z11;
    }

    public final synchronized void S(boolean z11) {
        try {
            this.sessionContext = z11;
            f20.d dVar = this.session;
            if (dVar != null && !z11) {
                u();
                this.session = null;
            } else if (dVar == null && z11) {
                Runnable[] runnableArr = {null, null, null, null};
                Runnable[] runnableArr2 = this.sessionCallbacks;
                this.session = f20.d.INSTANCE.b(this.context, this.foregroundTimeout, this.backgroundTimeout, this.timeUnit, this.namespace, runnableArr2.length == 4 ? runnableArr2 : runnableArr);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void T(l lVar) {
        this.subject = lVar;
    }

    public final void V(String str) {
        if (this.builderFinished) {
            return;
        }
        this.trackerVersionSuffix = str;
    }

    public final void W(boolean z11) {
        boolean z12 = this.builderFinished;
        if (!z12) {
            this.userAnonymisation = z11;
            return;
        }
        if (this.userAnonymisation == z11 || !z12) {
            return;
        }
        this.userAnonymisation = z11;
        f20.d dVar = this.session;
        if (dVar != null) {
            dVar.r();
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.ArrayList, java.util.Collection] */
    public final UUID X(o20.f event) {
        s.k(event, "event");
        if (!h()) {
            return null;
        }
        List<o20.f> listA0 = a0(event);
        Iterator<o20.f> it = listA0.iterator();
        while (it.hasNext()) {
            it.next().d(this);
        }
        final n0 n0Var = new n0();
        synchronized (this) {
            try {
                List<o20.f> list = listA0;
                ?? arrayList = new ArrayList(v.y(list, 10));
                for (o20.f fVar : list) {
                    r rVar = new r(fVar, this.stateManager.m(fVar));
                    c0(rVar);
                    arrayList.add(new Pair(fVar, rVar));
                }
                n0Var.f86529a = arrayList;
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10.g.e(!(event instanceof o20.m), O, new Runnable() { // from class: h20.n
            @Override // java.lang.Runnable
            public final void run() {
                o.Y(n0Var, this);
            }
        });
        return ((r) ((Pair) v.A0((List) n0Var.f86529a)).f()).getEventId();
    }

    public final void d(g20.i stateMachine) {
        s.k(stateMachine, "stateMachine");
        this.stateManager.b(stateMachine);
    }

    public final void g() {
        Z();
        u();
        this.emitter.K();
    }

    public final boolean h() {
        return this._dataCollection.get();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getDiagnosticAutotracking() {
        return this.diagnosticAutotracking;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getExceptionAutotracking() {
        return this.exceptionAutotracking;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getInstallAutotracking() {
        return this.installAutotracking;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getLifecycleAutotracking() {
        return this.lifecycleAutotracking;
    }

    public final e20.a m() {
        g20.f fVarA = this.stateManager.getTrackerState().a(e20.b.INSTANCE.a());
        if (fVarA instanceof e20.a) {
            return (e20.a) fVarA;
        }
        return null;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getScreenViewAutotracking() {
        return this.screenViewAutotracking;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final f20.d getSession() {
        return this.session;
    }

    public final void t() {
        if (this._dataCollection.compareAndSet(true, false)) {
            u();
            this.emitter.K();
        }
    }

    public final void u() {
        f20.d dVar = this.session;
        if (dVar != null) {
            dVar.o(true);
            String TAG = O;
            s.j(TAG, "TAG");
            g.a(TAG, "Session checking has been paused.", new Object[0]);
        }
    }

    public final void x(String identifier) {
        s.k(identifier, "identifier");
        this.stateManager.l(identifier);
    }

    public final void y() {
        f20.d dVar = this.session;
        if (dVar != null) {
            dVar.o(false);
            String TAG = O;
            s.j(TAG, "TAG");
            g.a(TAG, "Session checking has been resumed.", new Object[0]);
        }
    }

    public final void z(boolean z11) {
        if (this.builderFinished) {
            return;
        }
        this.applicationContext = z11;
    }
}
