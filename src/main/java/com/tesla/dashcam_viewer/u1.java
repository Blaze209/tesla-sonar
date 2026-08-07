package com.tesla.dashcam_viewer;

import android.content.ContentValues;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import ezvcard.property.Gender;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import sb0.SEIMetadataProcessed;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 >2\u00020\u0001:\u0001eB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0014H\u0002¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\u0011H\u0002¢\u0006\u0004\b(\u0010#J\u000f\u0010)\u001a\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010%J3\u0010-\u001a\u00020\u00142\"\u0010,\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170*j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017`+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0011H\u0002¢\u0006\u0004\b/\u0010#J\u000f\u00100\u001a\u00020\u0011H\u0002¢\u0006\u0004\b0\u0010#J\u000f\u00101\u001a\u00020\u0014H\u0002¢\u0006\u0004\b1\u0010%J\u000f\u00103\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0011H\u0002¢\u0006\u0004\b5\u0010#J\u0017\u00107\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u000fH\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0014H\u0002¢\u0006\u0004\b9\u0010%J\u000f\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b:\u0010#J3\u0010<\u001a\u00020\u00142\"\u0010;\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170*j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017`+H\u0002¢\u0006\u0004\b<\u0010.J\u0019\u0010>\u001a\u00020\u00142\b\u0010=\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00142\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0015\u0010F\u001a\u00020\u00142\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0015\u0010J\u001a\u00020\u00142\u0006\u0010I\u001a\u00020H¢\u0006\u0004\bJ\u0010KJ'\u0010O\u001a\u00020\u00142\u0006\u0010L\u001a\u00020@2\u0006\u0010M\u001a\u00020@2\b\u0010N\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bO\u0010PJ\r\u0010Q\u001a\u00020\u0014¢\u0006\u0004\bQ\u0010%J\r\u0010R\u001a\u00020\u0014¢\u0006\u0004\bR\u0010%JM\u0010Z\u001a\u00020\u00142\u0006\u0010S\u001a\u00020@2\u0006\u0010T\u001a\u00020\u000f2\u0006\u0010U\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020H2\u0006\u0010X\u001a\u00020H2\u0006\u0010M\u001a\u00020@2\u0006\u0010Y\u001a\u00020\u0011¢\u0006\u0004\bZ\u0010[J%\u0010]\u001a\u00020\u00142\u0006\u0010L\u001a\u00020@2\u0006\u0010M\u001a\u00020@2\u0006\u0010\\\u001a\u00020\u0011¢\u0006\u0004\b]\u0010^J\r\u0010_\u001a\u00020\u0014¢\u0006\u0004\b_\u0010%J\r\u0010`\u001a\u00020\u0014¢\u0006\u0004\b`\u0010%J\u000f\u0010a\u001a\u0004\u0018\u00010H¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u00020\u0014¢\u0006\u0004\bc\u0010%J\u000f\u0010d\u001a\u0004\u0018\u00010H¢\u0006\u0004\bd\u0010bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010lR\u0014\u0010o\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010nR\u0016\u0010q\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010'R\u0016\u0010r\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010s\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010'R\"\u0010z\u001a\u00020t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0016\u0010|\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010{R\u0016\u0010}\u001a\u00020@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010{R\u0016\u0010Y\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010'R\u0016\u0010T\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0017\u0010U\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u007fR\u0017\u0010V\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u007fR\u0018\u0010\u0083\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u007fR\u0017\u0010\u0084\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\u007fR\u0017\u0010W\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b]\u0010\u0085\u0001R\u0017\u0010X\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bv\u0010\u0085\u0001R\u0018\u0010\u0086\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b(\u0010\u0085\u0001R\u001a\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bR\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bQ\u0010\u0085\u0001R\u0018\u0010\u008a\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b)\u0010\u0085\u0001R\u0019\u0010\u008b\u0001\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010{R\u0019\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010\u008c\u0001R\u001b\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bc\u0010\u008e\u0001R\u001c\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R \u0010\u0095\u0001\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010\u0094\u0001R!\u0010\u0096\u0001\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0094\u0001R\u001b\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b:\u0010\u0098\u0001R\u001b\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bJ\u0010\u009b\u0001R\u0019\u0010\u009e\u0001\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bO\u0010\u009d\u0001R\u0017\u0010\u009f\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010'R\u001a\u0010 \u0001\u001a\u00030\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009d\u0001R\u0017\u0010¡\u0001\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010uR\u0018\u0010£\u0001\u001a\u00020t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010uR\u0016\u0010¥\u0001\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¤\u0001\u0010uR\u0016\u0010§\u0001\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¦\u0001\u0010uR\"\u0010¬\u0001\u001a\r ©\u0001*\u0005\u0018\u00010¨\u00010¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\"\u0010®\u0001\u001a\r ©\u0001*\u0005\u0018\u00010¨\u00010¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010«\u0001R!\u0010¯\u0001\u001a\r ©\u0001*\u0005\u0018\u00010¨\u00010¨\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bB\u0010«\u0001RI\u0010´\u0001\u001a#\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010°\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bF\u0010±\u0001\u001a\u0006\b\u0080\u0001\u0010²\u0001\"\u0006\b¢\u0001\u0010³\u0001R1\u0010¹\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010µ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0015\u0010¶\u0001\u001a\u0006\b\u0082\u0001\u0010·\u0001\"\u0006\b\u00ad\u0001\u0010¸\u0001R7\u0010¿\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010º\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0005\b~\u0010½\u0001\"\u0006\b\u009d\u0001\u0010¾\u0001R8\u0010Á\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010º\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÀ\u0001\u0010¼\u0001\u001a\u0006\b\u0081\u0001\u0010½\u0001\"\u0006\bª\u0001\u0010¾\u0001R6\u0010Ã\u0001\u001a\u0011\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u0014\u0018\u00010º\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b$\u0010¼\u0001\u001a\u0006\bÂ\u0001\u0010½\u0001\"\u0005\b\u007f\u0010¾\u0001RC\u0010É\u0001\u001a\u001d\u0012\u0004\u0012\u00020H\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u0014\u0018\u00010Ä\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\"\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\b¦\u0001\u0010È\u0001R1\u0010Ë\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010µ\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b0\u0010¶\u0001\u001a\u0006\bÊ\u0001\u0010·\u0001\"\u0006\b¤\u0001\u0010¸\u0001R\u001b\u0010Î\u0001\u001a\u0005\u0018\u00010Ì\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b7\u0010Í\u0001R\u0017\u0010Ï\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010'R\u0017\u0010Ð\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010'R\u0019\u0010Ó\u0001\u001a\u00030Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b5\u0010Ò\u0001R\u001b\u0010Ö\u0001\u001a\u0005\u0018\u00010Ô\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b`\u0010Õ\u0001¨\u0006×\u0001"}, d2 = {"Lcom/tesla/dashcam_viewer/u1;", "", "Lcom/tesla/dashcam_viewer/t;", "streamingCache", "downloadCache", "Lcom/tesla/dashcam_viewer/v;", "previewFrameCache", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/ViewGroup;", "parentView", "<init>", "(Lcom/tesla/dashcam_viewer/t;Lcom/tesla/dashcam_viewer/t;Lcom/tesla/dashcam_viewer/v;Landroid/content/Context;Landroid/view/ViewGroup;)V", "k", "()Lcom/tesla/dashcam_viewer/t;", "Ljn0/c0;", "timeEpochMs", "", "clearLastRequestedEndTime", "isSaving", "Ljn0/h0;", "R", "(JZZ)V", "", "", "nalUnit", "z", "(Ljava/util/List;Z)Ljava/util/List;", "f", "(Z)V", "currentTimeEpochMs", "snapToDuration", "Y", "(JJ)J", "V", "()Z", Gender.UNKNOWN, "()V", "h", "Z", "u", "x", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "spsPpsFrameNalUnits", "j", "(Ljava/util/ArrayList;)V", IntegerTokenConverter.CONVERTER_KEY, "W", "C", "Ljava/io/File;", "r", "()Ljava/io/File;", "a0", "clipStartEpochMs", "X", "(J)Z", "y", "E", "frameNalUnits", "d0", "correctedPTS", "c0", "(Ljn0/c0;)V", "", AnalyticsAttribute.Reason, "P", "(Ljava/lang/String;)V", "Landroid/view/SurfaceHolder;", "surfaceHolder", "Q", "(Landroid/view/SurfaceHolder;)V", "", "percent", Gender.FEMALE, "(D)V", "eventPath", "camera", "targetTimeMs", "G", "(Ljava/lang/String;Ljava/lang/String;Ljn0/c0;)V", "w", "v", "eventName", "videoDurationMs", "videoStartTimeEpochMs", "eventTimeEpochMs", OrcaKeys.LATITUDE, OrcaKeys.LONGITUDE, "isSentry", "H", "(Ljava/lang/String;JJJDDLjava/lang/String;Z)V", "includeMetadata", "s", "(Ljava/lang/String;Ljava/lang/String;Z)V", "e", "b0", "m", "()Ljava/lang/Double;", "A", "l", "a", "Lcom/tesla/dashcam_viewer/t;", "b", "c", "Lcom/tesla/dashcam_viewer/v;", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "Landroid/view/ViewGroup;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "g", "isBuffering", "wasPlayingPriorToBuffer", "requireIFrame", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "t", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setDragging", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "isDragging", "Ljava/lang/String;", "currentEventPath", "currentCamera", "n", "J", "o", "p", "q", "saveClipStartTimeEpochMs", "saveClipEndTimeEpochMs", "D", "currentPresentationTimeEpochUs", "Ljn0/c0;", "latestPtsRelativeMs", "timeAlreadyQueuedToEpochS", "lastRequestedNextFramesEndTimeEpochS", "lastRequestedNextFramesCamera", "Landroid/view/SurfaceHolder;", "Landroid/media/MediaCodec;", "Landroid/media/MediaCodec;", "mediaCodec", "Landroid/media/MediaFormat;", "B", "Landroid/media/MediaFormat;", "mediaFormat", "Ljava/util/List;", "sps", "pps", "Landroid/media/MediaMuxer;", "Landroid/media/MediaMuxer;", "mediaMuxer", "", "Ljava/lang/Integer;", "trackIndex", "I", "framesWritten", "firstIFrameQueued", "previousPercent", "mediaMuxerStarted", "K", "mediaCodecStarted", "L", "shouldRunDecoderForDisplay", Gender.MALE, "shouldRunDecoderForSaving", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", Gender.NONE, "Ljava/util/concurrent/ExecutorService;", "mediaQueue", Gender.OTHER, "decodeQueueForDisplay", "decodeQueueForSaving", "Lkotlin/Function4;", "Lwn0/r;", "()Lwn0/r;", "(Lwn0/r;)V", "onMetadataSetCallback", "Lkotlin/Function0;", "Lwn0/a;", "()Lwn0/a;", "(Lwn0/a;)V", "onSwitchCameraCallback", "Lkotlin/Function1;", "S", "Lwn0/l;", "()Lwn0/l;", "(Lwn0/l;)V", "onBufferingStatusChangeCallback", "T", "onSavingStatusChangeCallback", "getOnFrameDecodedCallback", "onFrameDecodedCallback", "Lkotlin/Function2;", "Lwn0/p;", "getOnSEINalCallback", "()Lwn0/p;", "(Lwn0/p;)V", "onSEINalCallback", "getOnResetSEILatchCallback", "onResetSEILatchCallback", "Lcom/tesla/dashcam_viewer/s;", "Lcom/tesla/dashcam_viewer/s;", "frameProcessor", "includeMetadataBar", "hasReceivedSEIData", "Lsb0/c;", "Lsb0/c;", "latestSEIMetadata", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "cachedSEIView", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u1 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private MediaCodec mediaCodec;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private MediaFormat mediaFormat;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private List<Byte> sps;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private List<Byte> pps;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private MediaMuxer mediaMuxer;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private Integer trackIndex;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private int framesWritten;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean firstIFrameQueued;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private int previousPercent;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private AtomicBoolean mediaMuxerStarted;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private AtomicBoolean mediaCodecStarted;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final AtomicBoolean shouldRunDecoderForDisplay;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final AtomicBoolean shouldRunDecoderForSaving;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final ExecutorService mediaQueue;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final ExecutorService decodeQueueForDisplay;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final ExecutorService decodeQueueForSaving;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private wn0.r<? super jn0.c0, ? super jn0.c0, ? super jn0.c0, ? super jn0.c0, jn0.h0> onMetadataSetCallback;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private wn0.a<jn0.h0> onSwitchCameraCallback;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private wn0.l<? super Boolean, jn0.h0> onBufferingStatusChangeCallback;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private wn0.l<? super Boolean, jn0.h0> onSavingStatusChangeCallback;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private wn0.l<? super Double, jn0.h0> onFrameDecodedCallback;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private wn0.p<? super Double, ? super List<Byte>, jn0.h0> onSEINalCallback;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private wn0.a<jn0.h0> onResetSEILatchCallback;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private s frameProcessor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private boolean includeMetadataBar;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private boolean hasReceivedSEIData;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t streamingCache;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private SEIMetadataProcessed latestSEIMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t downloadCache;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private LinearLayout cachedSEIView;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v previewFrameCache;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ViewGroup parentView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.logging.g logger;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isBuffering;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean wasPlayingPriorToBuffer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean requireIFrame;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private AtomicBoolean isDragging;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private String currentEventPath;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String currentCamera;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean isSentry;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long videoDurationMs;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long videoStartTimeEpochMs;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long eventTimeEpochMs;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private long saveClipStartTimeEpochMs;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long saveClipEndTimeEpochMs;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private double latitude;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private double longitude;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private double currentPresentationTimeEpochUs;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private jn0.c0 latestPtsRelativeMs;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private double timeAlreadyQueuedToEpochS;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private double lastRequestedNextFramesEndTimeEpochS;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private String lastRequestedNextFramesCamera;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private SurfaceHolder surfaceHolder;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.VideoPlayer$clearSavingStatus$1", f = "VideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56091n;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u1.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f56091n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            wn0.l<Boolean, jn0.h0> lVarP = u1.this.p();
            if (lVarP != null) {
                lVarP.invoke(Boxing.boxBoolean(false));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.VideoPlayer$processMediaDataForDisplay$1", f = "VideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56093n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u1.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f56093n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            wn0.l<Boolean, jn0.h0> lVarN = u1.this.n();
            if (lVarN != null) {
                lVarN.invoke(Boxing.boxBoolean(false));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.VideoPlayer$processMediaDataForDisplay$2", f = "VideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56095n;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u1.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f56095n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            wn0.l<Boolean, jn0.h0> lVarN = u1.this.n();
            if (lVarN != null) {
                lVarN.invoke(Boxing.boxBoolean(true));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.VideoPlayer$selectEvent$3$1", f = "VideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56097n;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u1.this.new e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f56097n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            wn0.a<jn0.h0> aVarQ = u1.this.q();
            if (aVarQ != null) {
                aVarQ.invoke();
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.VideoPlayer$setEventMetadata$2", f = "VideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56099n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f56101p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ long f56102q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f56103r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ long f56104s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j11, long j12, long j13, long j14, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f56101p = j11;
            this.f56102q = j12;
            this.f56103r = j13;
            this.f56104s = j14;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u1.this.new f(this.f56101p, this.f56102q, this.f56103r, this.f56104s, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f56099n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            wn0.r<jn0.c0, jn0.c0, jn0.c0, jn0.c0, jn0.h0> rVarO = u1.this.o();
            if (rVarO != null) {
                rVarO.invoke(jn0.c0.a(this.f56101p), jn0.c0.a(this.f56102q), jn0.c0.a(this.f56103r), jn0.c0.a(this.f56104s));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.VideoPlayer$setupMediaMuxer$1", f = "VideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56105n;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u1.this.new g(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f56105n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            wn0.l<Boolean, jn0.h0> lVarP = u1.this.p();
            if (lVarP != null) {
                lVarP.invoke(Boxing.boxBoolean(true));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.dashcam_viewer.VideoPlayer$updateStatusAndCheckStopWritingIfNeeded$1$1", f = "VideoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56107n;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return u1.this.new h(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f56107n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            wn0.l<Boolean, jn0.h0> lVarP = u1.this.p();
            if (lVarP != null) {
                lVarP.invoke(Boxing.boxBoolean(false));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/tesla/dashcam_viewer/u1$i", "Ljava/util/TimerTask;", "Ljn0/h0;", "run", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class i extends TimerTask {
        public i() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            RNH264Stream.INSTANCE.setSaveClipStatus(new DashcamViewerSaveClipStatus("finished", null, null, null, null, 30, null));
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, u1.this.new h(null), 3, null);
        }
    }

    public u1(t streamingCache, t downloadCache, v previewFrameCache, Context context, ViewGroup viewGroup) {
        p013kotlin.jvm.internal.s.k(streamingCache, "streamingCache");
        p013kotlin.jvm.internal.s.k(downloadCache, "downloadCache");
        p013kotlin.jvm.internal.s.k(previewFrameCache, "previewFrameCache");
        p013kotlin.jvm.internal.s.k(context, "context");
        this.streamingCache = streamingCache;
        this.downloadCache = downloadCache;
        this.previewFrameCache = previewFrameCache;
        this.context = context;
        this.parentView = viewGroup;
        this.logger = com.tesla.logging.g.INSTANCE.a("DashcamViewer_VideoPlayer");
        this.requireIFrame = true;
        this.isDragging = new AtomicBoolean(false);
        this.currentEventPath = "";
        this.currentCamera = "";
        this.lastRequestedNextFramesEndTimeEpochS = -1.0d;
        this.mediaMuxerStarted = new AtomicBoolean(false);
        this.mediaCodecStarted = new AtomicBoolean(false);
        this.shouldRunDecoderForDisplay = new AtomicBoolean(false);
        this.shouldRunDecoderForSaving = new AtomicBoolean(false);
        this.mediaQueue = Executors.newSingleThreadExecutor();
        this.decodeQueueForDisplay = Executors.newSingleThreadExecutor();
        this.decodeQueueForSaving = Executors.newSingleThreadExecutor();
        this.latestSEIMetadata = SEIMetadataProcessed.INSTANCE.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(u1 u1Var) throws InterruptedException {
        u1Var.x();
    }

    private final void C() {
        if (this.shouldRunDecoderForSaving.get()) {
            this.logger.j("skip resume saving clip, already running");
            return;
        }
        this.logger.j("resume saving clip");
        this.shouldRunDecoderForSaving.set(true);
        this.decodeQueueForSaving.execute(new Runnable() { // from class: com.tesla.dashcam_viewer.s1
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                u1.D(this.f56007a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(u1 u1Var) throws InterruptedException {
        u1Var.y();
    }

    private final boolean E() {
        OutputStream outputStreamOpenOutputStream;
        try {
            this.logger.j("saveToPhotoAlbum begin");
            File fileR = r();
            if (Build.VERSION.SDK_INT >= 29) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", fileR.getName());
                contentValues.put("mime_type", "video/mp4");
                contentValues.put("relative_path", Environment.DIRECTORY_MOVIES + "/Tesla");
                contentValues.put(OrcaKeys.LATITUDE, Double.valueOf(this.latitude));
                contentValues.put(OrcaKeys.LONGITUDE, Double.valueOf(this.longitude));
                this.logger.j("MediaStore values: " + contentValues);
                Uri uriInsert = this.context.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (uriInsert != null && (outputStreamOpenOutputStream = this.context.getContentResolver().openOutputStream(uriInsert)) != null) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(fileR);
                        try {
                            sn0.a.b(fileInputStream, outputStreamOpenOutputStream, 0, 2, null);
                            this.logger.j("MediaStore saved outputMP4File: " + fileR.getName() + " to photo album");
                            jn0.h0 h0Var = jn0.h0.f84049a;
                            sn0.b.a(fileInputStream, null);
                            sn0.b.a(outputStreamOpenOutputStream, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                sn0.b.a(fileInputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            sn0.b.a(outputStreamOpenOutputStream, th4);
                            throw th5;
                        }
                    }
                }
            } else {
                MediaScannerConnection.scanFile(this.context, new String[]{fileR.getAbsolutePath()}, new String[]{"video/mp4"}, null);
                this.logger.j("MediaScanner saved outputMP4File: " + fileR.getName() + " to photo album");
            }
            fileR.delete();
            this.logger.j("clear saves clip, outputMP4File: " + fileR.getName() + " deleted");
            return true;
        } catch (Exception e11) {
            com.tesla.logging.g gVar = this.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("error saving to photo album: " + e11);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return false;
        }
    }

    private final void P(String reason) {
        String upperCase = reason.toUpperCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(upperCase, "toUpperCase(...)");
        String str = "ERROR_" + p013kotlin.text.t.V(upperCase, " ", "_", false, 4, null) + "_" + (System.currentTimeMillis() % ((long) 10000));
        this.logger.j("setting saveClipStatus to error, reason: " + reason + ", errorKey: " + str);
        if (this.mediaMuxer != null || this.frameProcessor != null) {
            this.logger.j("setSaveClipStatusError: cleaning up via stopAndReleaseMediaMuxer()");
            a0();
            this.latestSEIMetadata = SEIMetadataProcessed.INSTANCE.a();
        }
        try {
            File fileR = r();
            if (fileR.exists()) {
                boolean zDelete = fileR.delete();
                this.logger.j("setSaveClipStatusError: deleted corrupted output file: " + zDelete);
            }
        } catch (Exception e11) {
            com.tesla.logging.g gVar = this.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("setSaveClipStatusError: error deleting output file: " + e11);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
        o1.f55932a.u(false);
        h();
        RNH264Stream.INSTANCE.setSaveClipStatus(new DashcamViewerSaveClipStatus(AnalyticsAttribute.Error, null, null, null, str, 14, null));
    }

    private final void R(final long timeEpochMs, final boolean clearLastRequestedEndTime, final boolean isSaving) {
        this.mediaQueue.execute(new Runnable() { // from class: com.tesla.dashcam_viewer.r1
            @Override // java.lang.Runnable
            public final void run() {
                u1.T(isSaving, this, timeEpochMs, clearLastRequestedEndTime);
            }
        });
    }

    static /* synthetic */ void S(u1 u1Var, long j11, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        u1Var.R(j11, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(boolean z11, u1 u1Var, long j11, boolean z12) {
        if (!z11) {
            u1Var.logger.j("calling stopAndReleaseMediaCodec in setting time");
            u1Var.Z();
        }
        u1Var.requireIFrame = true;
        u1Var.k().n(u1Var.videoStartTimeEpochMs, j11, u1Var.currentCamera);
        double dE = jn0.j0.e(j11) / 1000.0d;
        u1Var.timeAlreadyQueuedToEpochS = dE;
        u1Var.lastRequestedNextFramesEndTimeEpochS = z12 ? -1.0d : u1Var.lastRequestedNextFramesEndTimeEpochS;
        u1Var.currentPresentationTimeEpochUs = (dE + 1.0E-4d) * ((double) 1000000);
        u1Var.logger.j("setTime timeMs: " + jn0.c0.f(j11) + ", timeAlreadyQueuedToEpochS: " + u1Var.timeAlreadyQueuedToEpochS + ", currentPresentationTimeEpochUs: " + u1Var.currentPresentationTimeEpochUs);
        if (u1Var.mediaCodecStarted.get() || z11) {
            return;
        }
        u1Var.logger.j("mediaCodec not started, calling play after setting time");
        u1Var.U();
    }

    private final void U() {
        if (V()) {
            A();
            return;
        }
        com.tesla.logging.g gVar = this.logger;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g("skip processMediaDataForDisplay in setupCodecAndPlay, mediaCodec not started");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
    }

    private final boolean V() {
        try {
            if (this.surfaceHolder == null) {
                com.tesla.logging.g gVar = this.logger;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("skip setupDecoder, surface holder is null");
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                return false;
            }
            this.mediaCodec = MediaCodec.createDecoderByType("video/avc");
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", 724, 470);
            p013kotlin.jvm.internal.s.j(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
            mediaFormatCreateVideoFormat.setInteger("frame-rate", 24);
            MediaCodec mediaCodec = this.mediaCodec;
            if (mediaCodec != null) {
                SurfaceHolder surfaceHolder = this.surfaceHolder;
                mediaCodec.configure(mediaFormatCreateVideoFormat, surfaceHolder != null ? surfaceHolder.getSurface() : null, (MediaCrypto) null, 0);
            }
            MediaCodec mediaCodec2 = this.mediaCodec;
            if (mediaCodec2 != null) {
                mediaCodec2.start();
            }
            if (this.mediaCodec != null) {
                this.mediaCodecStarted.set(true);
                this.logger.a("mediaCodec configured with format: " + mediaFormatCreateVideoFormat);
                return true;
            }
            com.tesla.logging.g gVar2 = this.logger;
            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
            String tag2 = gVar2.getTag();
            String strG2 = gVar2.g("mediaCodec is null");
            zb0.a aVar2 = zb0.a.f128044a;
            Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : mapF2.entrySet()) {
                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics2.recordException(new Exception(strG2));
            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
            vr0.a.INSTANCE.a(strG2, new Object[0]);
            return false;
        } catch (Exception e11) {
            this.logger.d("error setting up mediaCodec", e11);
            return false;
        }
    }

    private final boolean W() {
        MediaFormat mediaFormatL;
        s sVar;
        try {
            if (this.mediaFormat == null) {
                com.tesla.logging.g gVar = this.logger;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("skip setupMediaMuxer, mediaFormat is null");
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                return false;
            }
            this.framesWritten = 0;
            this.previousPercent = 0;
            this.trackIndex = null;
            File fileR = r();
            this.mediaMuxer = new MediaMuxer(fileR.getAbsolutePath(), 0);
            if (!this.includeMetadataBar || (sVar = this.frameProcessor) == null) {
                mediaFormatL = this.mediaFormat;
                p013kotlin.jvm.internal.s.h(mediaFormatL);
            } else if (sVar == null || (mediaFormatL = sVar.l()) == null) {
                mediaFormatL = this.mediaFormat;
                p013kotlin.jvm.internal.s.h(mediaFormatL);
            }
            MediaMuxer mediaMuxer = this.mediaMuxer;
            p013kotlin.jvm.internal.s.h(mediaMuxer);
            this.trackIndex = Integer.valueOf(mediaMuxer.addTrack(mediaFormatL));
            MediaMuxer mediaMuxer2 = this.mediaMuxer;
            p013kotlin.jvm.internal.s.h(mediaMuxer2);
            mediaMuxer2.start();
            this.mediaMuxerStarted.set(true);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new g(null), 3, null);
            this.logger.j("mediaMuxer configured and started with outputMP4File: " + fileR.getName() + ", trackIndex: " + this.trackIndex + ", includeMetadataBar=" + this.includeMetadataBar);
            return true;
        } catch (Exception e11) {
            com.tesla.logging.g gVar2 = this.logger;
            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
            String tag2 = gVar2.getTag();
            String strG2 = gVar2.g("error setting up mediaMuxer: " + e11);
            zb0.a aVar2 = zb0.a.f128044a;
            Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : mapF2.entrySet()) {
                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics2.recordException(new Exception(strG2));
            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
            vr0.a.INSTANCE.a(strG2, new Object[0]);
            return false;
        }
    }

    private final boolean X(long clipStartEpochMs) {
        this.previousPercent = 0;
        if (this.includeMetadataBar) {
            if (this.frameProcessor == null && !i()) {
                com.tesla.logging.g gVar = this.logger;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("Failed to create FrameProcessor");
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                return false;
            }
            this.logger.j("setupMuxerAndWrite: Using FrameProcessor, delaying muxer setup until codec config available");
        } else if (!W()) {
            com.tesla.logging.g gVar2 = this.logger;
            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
            String tag2 = gVar2.getTag();
            String strG2 = gVar2.g("skip processMediaDataForSaving in setupCodecAndPlay, mediaCodec not started");
            zb0.a aVar2 = zb0.a.f128044a;
            Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : mapF2.entrySet()) {
                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics2.recordException(new Exception(strG2));
            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
            vr0.a.INSTANCE.a(strG2, new Object[0]);
            return false;
        }
        C();
        S(this, clipStartEpochMs, false, true, 2, null);
        return true;
    }

    private final long Y(long currentTimeEpochMs, long snapToDuration) {
        long j11 = this.videoStartTimeEpochMs;
        return jn0.c0.b(this.videoStartTimeEpochMs + jn0.c0.b(u.a(jn0.c0.b(mn0.h.a(j11, mn0.h.b(currentTimeEpochMs, jn0.c0.b(this.videoDurationMs + j11))) - this.videoStartTimeEpochMs), snapToDuration) * snapToDuration));
    }

    private final void Z() {
        try {
            this.shouldRunDecoderForDisplay.set(false);
            MediaCodec mediaCodec = this.mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
            MediaCodec mediaCodec2 = this.mediaCodec;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
            this.mediaCodec = null;
            this.mediaCodecStarted.set(false);
            this.logger.j("mediaCodec stopped and released");
        } catch (Exception e11) {
            com.tesla.logging.g gVar = this.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("error stop and release mediaCodec: " + e11);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
    }

    private final boolean a0() {
        try {
            this.logger.j("stopAndReleaseMediaMuxer: starting, mediaMuxerStarted=" + this.mediaMuxerStarted.get() + ", framesWritten=" + this.framesWritten);
            this.shouldRunDecoderForSaving.set(false);
            boolean z11 = true;
            if (this.mediaMuxerStarted.compareAndSet(true, false)) {
                this.logger.j("stopAndReleaseMediaMuxer: about to call stop() with " + this.framesWritten + " frames written");
                try {
                    MediaMuxer mediaMuxer = this.mediaMuxer;
                    if (mediaMuxer != null) {
                        mediaMuxer.stop();
                    }
                    this.logger.j("stopAndReleaseMediaMuxer: stop() succeeded");
                } catch (Exception e11) {
                    com.tesla.logging.g gVar = this.logger;
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar.getTag();
                    String strG = gVar.g("stopAndReleaseMediaMuxer: stop() threw exception: " + e11);
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                    e11.printStackTrace();
                    z11 = false;
                }
            } else {
                this.logger.j("mediaMuxer already stopped (another thread beat us), skipping stop()");
            }
            this.logger.j("stopAndReleaseMediaMuxer: about to call release()");
            MediaMuxer mediaMuxer2 = this.mediaMuxer;
            if (mediaMuxer2 != null) {
                mediaMuxer2.release();
            }
            this.mediaMuxer = null;
            this.logger.j("stopAndReleaseMediaMuxer: release() succeeded");
            this.logger.j("stopAndReleaseMediaMuxer: about to cleanup FrameProcessor");
            s sVar = this.frameProcessor;
            if (sVar != null) {
                sVar.f();
            }
            this.frameProcessor = null;
            this.includeMetadataBar = false;
            this.logger.j("stopAndReleaseMediaMuxer: FrameProcessor cleanup succeeded");
            this.trackIndex = null;
            this.framesWritten = 0;
            this.firstIFrameQueued = false;
            this.logger.j("mediaMuxer released, stopSucceeded=" + z11);
            return z11;
        } catch (Exception e12) {
            com.tesla.logging.g gVar2 = this.logger;
            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
            String tag2 = gVar2.getTag();
            String strG2 = gVar2.g("error stopAndReleaseMediaMuxer: " + e12);
            zb0.a aVar2 = zb0.a.f128044a;
            Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : mapF2.entrySet()) {
                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics2.recordException(new Exception(strG2));
            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
            vr0.a.INSTANCE.a(strG2, new Object[0]);
            e12.printStackTrace();
            return false;
        }
    }

    private final void c0(jn0.c0 correctedPTS) {
        long jB;
        if (correctedPTS == null && this.latestPtsRelativeMs == null) {
            com.tesla.logging.g gVar = this.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("Cannot calculate timestamp: both correctedPTS and latestPtsRelativeMs are null!");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return;
        }
        if (correctedPTS != null) {
            jB = correctedPTS.getData();
        } else {
            long j11 = this.videoStartTimeEpochMs;
            jn0.c0 c0Var = this.latestPtsRelativeMs;
            p013kotlin.jvm.internal.s.h(c0Var);
            jB = jn0.c0.b(j11 + c0Var.getData());
        }
        int iE = (int) ((jn0.j0.e(jn0.c0.b(jB - this.saveClipStartTimeEpochMs)) / jn0.j0.e(jn0.c0.b(this.saveClipEndTimeEpochMs - this.saveClipStartTimeEpochMs))) * ((double) 100));
        boolean z11 = Long.compare(jB ^ Long.MIN_VALUE, this.saveClipEndTimeEpochMs ^ Long.MIN_VALUE) > 0;
        if (iE != this.previousPercent) {
            RNH264Stream.INSTANCE.setSaveClipStatus(new DashcamViewerSaveClipStatus("saving", Integer.valueOf(z11 ? 100 : iE), null, null, null, 28, null));
            this.previousPercent = iE;
        }
        if (z11) {
            int i11 = this.framesWritten;
            if (i11 > 0) {
                this.logger.j("calling stopAndReleaseMediaMuxer in updateStatusAndCheckStopWritingIfNeeded, saveToPhoto true");
                if (!a0()) {
                    P("stopAndReleaseMediaMuxer got error");
                    return;
                }
                this.logger.j("media muxer stopped, saving mp4 to photo album");
                if (!E()) {
                    P("saveToPhotoAlbum got error");
                    return;
                }
                this.logger.j("saveToPhotoAlbum success, setting saveClipStatus to succeeded");
                o1.f55932a.u(false);
                RNH264Stream.INSTANCE.setSaveClipStatus(new DashcamViewerSaveClipStatus("succeeded", null, null, null, null, 30, null));
                new Timer().schedule(new i(), 1000L);
                return;
            }
            com.tesla.logging.g gVar2 = this.logger;
            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
            String tag2 = gVar2.getTag();
            String strG2 = gVar2.g("ABORTING SAVE: No frames written (framesWritten=" + i11 + ")");
            zb0.a aVar2 = zb0.a.f128044a;
            Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry2 : mapF2.entrySet()) {
                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics2.recordException(new Exception(strG2));
            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
            vr0.a.INSTANCE.a(strG2, new Object[0]);
            com.tesla.logging.g gVar3 = this.logger;
            TeslaLog teslaLog3 = TeslaLog.INSTANCE;
            String tag3 = gVar3.getTag();
            String strG3 = gVar3.g("This indicates the download failed but timestamps advanced anyway");
            zb0.a aVar3 = zb0.a.f128044a;
            Map mapF3 = p013kotlin.collections.v0.f(jn0.x.a(tag3, strG3));
            FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry3 : mapF3.entrySet()) {
                zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
            }
            firebaseCrashlytics3.recordException(new Exception(strG3));
            TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
            vr0.a.INSTANCE.a(strG3, new Object[0]);
            P("no frames written");
        }
    }

    private final void d0(ArrayList<List<Byte>> frameNalUnits) {
        List<s.EncodedFrame> listM;
        boolean z11;
        s sVar;
        jn0.c0 c0Var = this.latestPtsRelativeMs;
        if (c0Var == null) {
            com.tesla.logging.g gVar = this.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("skip writeNalUnit, latestPtsRelativeMs is null");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return;
        }
        try {
            p013kotlin.jvm.internal.s.h(c0Var);
            long jB = jn0.c0.b(c0Var.getData() * jn0.c0.b(((long) 1000) & 4294967295L));
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            boolean z12 = true;
            if (!this.includeMetadataBar || this.frameProcessor == null) {
                Iterator<List<Byte>> it = frameNalUnits.iterator();
                p013kotlin.jvm.internal.s.j(it, "iterator(...)");
                while (it.hasNext()) {
                    List<Byte> next = it.next();
                    p013kotlin.jvm.internal.s.j(next, "next(...)");
                    List<Byte> list = next;
                    boolean zF = p013kotlin.jvm.internal.s.f(o.d(list), Boolean.TRUE);
                    if (this.framesWritten > 0 || zF) {
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(p013kotlin.collections.v.g1(list));
                        bufferInfo.offset = 0;
                        bufferInfo.size = list.size();
                        bufferInfo.presentationTimeUs = jB;
                        bufferInfo.flags = zF ? 1 : 0;
                        Integer num = this.trackIndex;
                        if (num != null) {
                            MediaMuxer mediaMuxer = this.mediaMuxer;
                            if (mediaMuxer != null) {
                                p013kotlin.jvm.internal.s.h(num);
                                mediaMuxer.writeSampleData(num.intValue(), byteBufferWrap, bufferInfo);
                            }
                            this.framesWritten++;
                            c0(null);
                        }
                    } else {
                        this.logger.n("skip writing, first frame is not I frame (REGULAR path)");
                    }
                }
                return;
            }
            Iterator<List<Byte>> it2 = frameNalUnits.iterator();
            p013kotlin.jvm.internal.s.j(it2, "iterator(...)");
            while (it2.hasNext()) {
                List<Byte> next2 = it2.next();
                p013kotlin.jvm.internal.s.j(next2, "next(...)");
                List<Byte> list2 = next2;
                boolean zF2 = p013kotlin.jvm.internal.s.f(o.d(list2), Boolean.TRUE);
                if (this.firstIFrameQueued || zF2) {
                    byte[] bArrG1 = p013kotlin.collections.v.g1(list2);
                    if (zF2) {
                        this.firstIFrameQueued = z12;
                    }
                    s sVar2 = this.frameProcessor;
                    if (sVar2 == null || (listM = sVar2.r(bArrG1, jB, zF2, this.latestSEIMetadata)) == null) {
                        listM = p013kotlin.collections.v.m();
                    }
                    if (!listM.isEmpty()) {
                        for (s.EncodedFrame bVar : listM) {
                            ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bVar.getData());
                            bufferInfo.offset = 0;
                            bufferInfo.size = bVar.getData().length;
                            bufferInfo.presentationTimeUs = bVar.getPresentationTimeUs();
                            bufferInfo.flags = bVar.getFlags();
                            if (this.trackIndex != null || (sVar = this.frameProcessor) == null || sVar.getHasCodecConfig() != z12 || W()) {
                                z11 = z12;
                                Integer num2 = this.trackIndex;
                                if (num2 != null) {
                                    MediaMuxer mediaMuxer2 = this.mediaMuxer;
                                    if (mediaMuxer2 != null) {
                                        p013kotlin.jvm.internal.s.h(num2);
                                        mediaMuxer2.writeSampleData(num2.intValue(), byteBufferWrap2, bufferInfo);
                                    }
                                    this.framesWritten++;
                                    c0(null);
                                }
                            } else {
                                com.tesla.logging.g gVar2 = this.logger;
                                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                                String tag2 = gVar2.getTag();
                                String strG2 = gVar2.g("Failed to set up muxer with encoder codec config");
                                zb0.a aVar2 = zb0.a.f128044a;
                                Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
                                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                                for (Map.Entry entry2 : mapF2.entrySet()) {
                                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                                    z12 = z12;
                                }
                                z11 = z12;
                                firebaseCrashlytics2.recordException(new Exception(strG2));
                                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                                vr0.a.INSTANCE.a(strG2, new Object[0]);
                            }
                            z12 = z11;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            com.tesla.logging.g gVar3 = this.logger;
            TeslaLog teslaLog3 = TeslaLog.INSTANCE;
            String tag3 = gVar3.getTag();
            String strG3 = gVar3.g("error writing nal unit: " + e11);
            zb0.a aVar3 = zb0.a.f128044a;
            Map mapF3 = p013kotlin.collections.v0.f(jn0.x.a(tag3, strG3));
            FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry3 : mapF3.entrySet()) {
                zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
            }
            firebaseCrashlytics3.recordException(new Exception(strG3));
            TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
            vr0.a.INSTANCE.a(strG3, new Object[0]);
            if (this.shouldRunDecoderForSaving.get()) {
                P("writeNalUnit got error");
            } else {
                this.logger.j("writeNalUnit failed during cancellation, ignoring error");
            }
        }
    }

    private final void f(final boolean isSaving) {
        this.mediaQueue.execute(new Runnable() { // from class: com.tesla.dashcam_viewer.t1
            @Override // java.lang.Runnable
            public final void run() {
                u1.g(this.f56023a, isSaving);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0084  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cd A[LOOP:0: B:21:0x00c7->B:23:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:28:0x0114  */
    /* JADX WARN: Code duplicated, block: B:31:0x0156 A[LOOP:1: B:29:0x0150->B:31:0x0156, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0181  */
    /* JADX WARN: Code duplicated, block: B:41:0x01ab  */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0084, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0114, please report this as an issue */
    public static final void g(u1 u1Var, boolean z11) {
        double d11;
        long jB;
        long jB2;
        long jA;
        long j11 = u1Var.videoStartTimeEpochMs;
        if (j11 == 0 || u1Var.timeAlreadyQueuedToEpochS < jn0.j0.e(j11) / 1000.0d) {
            com.tesla.logging.g gVar = u1Var.logger;
            String str = "skip checkRequestNextFrames, videoStartTimeEpochMs is 0 or timeAlreadyQueuedToEpochS: " + u1Var.timeAlreadyQueuedToEpochS + " < videoStartTimeEpochMs: " + jn0.c0.f(u1Var.videoStartTimeEpochMs);
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return;
        }
        long jA2 = jn0.j0.a(u1Var.timeAlreadyQueuedToEpochS * ((double) 1000));
        Double dL = u1Var.l();
        if (dL == null) {
            u1Var.logger.j("skip checkRequestNextFrames, no currentTimeEpochS");
            return;
        }
        if (!z11) {
            if (u1Var.isDragging.get()) {
                jA2 = u1Var.Y(jA2, 30000L);
                jB = jn0.c0.b(30000 + jA2);
            } else {
                d11 = 1000.0d;
                jB = mn0.h.b(mn0.h.b(jn0.j0.a((dL.doubleValue() + 10.0d) * 1000.0d), jn0.j0.a((u1Var.timeAlreadyQueuedToEpochS + 10.0d) * 1000.0d)), jn0.c0.b(jn0.c0.b(u1Var.videoStartTimeEpochMs + u1Var.videoDurationMs) + 1000));
            }
            if (Long.compare(jB ^ Long.MIN_VALUE, jA2 ^ Long.MIN_VALUE) <= 0) {
                com.tesla.logging.g gVar2 = u1Var.logger;
                String str2 = "skip checkRequestNextFrames, nextFramesEndTimeEpochMs: " + jn0.c0.f(jB) + " <= nextFrameStartTimeEpochMs: " + jn0.c0.f(jA2);
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = gVar2.getTag();
                String strG2 = gVar2.g(str2);
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : mapF2.entrySet()) {
                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
                return;
            }
            jB2 = jn0.c0.b(jB - jA2);
            jA = jn0.j0.a((jn0.j0.c(24) * jn0.j0.e(jB2)) / d11);
            if (Long.compare(jA ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0) {
                com.tesla.logging.g gVar3 = u1Var.logger;
                String str3 = "skip checkRequestNextFrames, frameCount: " + jn0.c0.f(jA) + " <= 0";
                TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                String tag3 = gVar3.getTag();
                String strG3 = gVar3.g(str3);
                zb0.a aVar3 = zb0.a.f128044a;
                Map mapF3 = p013kotlin.collections.v0.f(jn0.x.a(tag3, strG3));
                FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry3 : mapF3.entrySet()) {
                    zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
                }
                firebaseCrashlytics3.recordException(new Exception(strG3));
                TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
                vr0.a.INSTANCE.a(strG3, new Object[0]);
                return;
            }
            if (u1Var.lastRequestedNextFramesEndTimeEpochS - u1Var.timeAlreadyQueuedToEpochS > ((double) 1) / jn0.j0.c(24) || !p013kotlin.jvm.internal.s.f(u1Var.currentCamera, u1Var.lastRequestedNextFramesCamera)) {
                u1Var.lastRequestedNextFramesEndTimeEpochS = jn0.j0.e(jB) / d11;
                if (u1Var.currentCamera.length() > 0) {
                    u1Var.lastRequestedNextFramesCamera = u1Var.currentCamera;
                }
                long jB3 = jn0.c0.b(jA2 - u1Var.videoStartTimeEpochMs);
                u1Var.logger.j("requesting next frames startTimestampRelativeMs=" + jn0.c0.f(jB3) + " requestDurationMs=" + jn0.c0.f(jB2) + " frameCount=" + jn0.c0.f(jA) + " nextFrameStartTimeEpochMs=" + jn0.c0.f(jA2) + " nextFramesEndTimeEpochMs=" + jn0.c0.f(jB) + " videoStartTimeEpochMs=" + jn0.c0.f(u1Var.videoStartTimeEpochMs));
                o1.f55932a.p(u1Var.currentEventPath, jB3, jB2, u1Var.currentCamera, u1Var.isDragging.get());
            }
            return;
        }
        jB = u1Var.saveClipEndTimeEpochMs;
        d11 = 1000.0d;
        if (Long.compare(jB ^ Long.MIN_VALUE, jA2 ^ Long.MIN_VALUE) <= 0) {
            com.tesla.logging.g gVar4 = u1Var.logger;
            String str4 = "skip checkRequestNextFrames, nextFramesEndTimeEpochMs: " + jn0.c0.f(jB) + " <= nextFrameStartTimeEpochMs: " + jn0.c0.f(jA2);
            TeslaLog teslaLog4 = TeslaLog.INSTANCE;
            String tag4 = gVar4.getTag();
            String strG4 = gVar4.g(str4);
            zb0.a aVar4 = zb0.a.f128044a;
            Map mapF4 = p013kotlin.collections.v0.f(jn0.x.a(tag4, strG4));
            FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
            while (r1.hasNext()) {
                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            firebaseCrashlytics4.recordException(new Exception(strG4));
            TeslaLog.setTag$default(teslaLog4, tag4, false, 2, null);
            vr0.a.INSTANCE.a(strG4, new Object[0]);
            return;
        }
        jB2 = jn0.c0.b(jB - jA2);
        jA = jn0.j0.a((jn0.j0.c(24) * jn0.j0.e(jB2)) / d11);
        if (Long.compare(jA ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0) {
            com.tesla.logging.g gVar5 = u1Var.logger;
            String str5 = "skip checkRequestNextFrames, frameCount: " + jn0.c0.f(jA) + " <= 0";
            TeslaLog teslaLog5 = TeslaLog.INSTANCE;
            String tag5 = gVar5.getTag();
            String strG5 = gVar5.g(str5);
            zb0.a aVar5 = zb0.a.f128044a;
            Map mapF5 = p013kotlin.collections.v0.f(jn0.x.a(tag5, strG5));
            FirebaseCrashlytics firebaseCrashlytics5 = FirebaseCrashlytics.getInstance();
            while (r1.hasNext()) {
                zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
            }
            firebaseCrashlytics5.recordException(new Exception(strG5));
            TeslaLog.setTag$default(teslaLog5, tag5, false, 2, null);
            vr0.a.INSTANCE.a(strG5, new Object[0]);
            return;
        }
        if (u1Var.lastRequestedNextFramesEndTimeEpochS - u1Var.timeAlreadyQueuedToEpochS > ((double) 1) / jn0.j0.c(24)) {
        }
        u1Var.lastRequestedNextFramesEndTimeEpochS = jn0.j0.e(jB) / d11;
        if (u1Var.currentCamera.length() > 0) {
            u1Var.lastRequestedNextFramesCamera = u1Var.currentCamera;
        }
        long jB4 = jn0.c0.b(jA2 - u1Var.videoStartTimeEpochMs);
        u1Var.logger.j("requesting next frames startTimestampRelativeMs=" + jn0.c0.f(jB4) + " requestDurationMs=" + jn0.c0.f(jB2) + " frameCount=" + jn0.c0.f(jA) + " nextFrameStartTimeEpochMs=" + jn0.c0.f(jA2) + " nextFramesEndTimeEpochMs=" + jn0.c0.f(jB) + " videoStartTimeEpochMs=" + jn0.c0.f(u1Var.videoStartTimeEpochMs));
        o1.f55932a.p(u1Var.currentEventPath, jB4, jB2, u1Var.currentCamera, u1Var.isDragging.get());
    }

    private final void h() {
        this.logger.j("resumePlaybackFromSaving, setting saveClipStatus to finished");
        o1.f55932a.u(false);
        RNH264Stream.INSTANCE.setSaveClipStatus(new DashcamViewerSaveClipStatus("finished", null, null, null, null, 30, null));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new b(null), 3, null);
    }

    private final boolean i() {
        List<Byte> list = this.sps;
        if (list == null || this.pps == null) {
            com.tesla.logging.g gVar = this.logger;
            String str = "createFrameProcessor: sps or pps is null (sps=" + (list != null) + ", pps=" + (this.pps != null) + ")";
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return false;
        }
        this.logger.j("createFrameProcessor: sps and pps available, creating FrameProcessor...");
        int iF = o1.f55932a.f();
        List<Byte> list2 = this.sps;
        p013kotlin.jvm.internal.s.h(list2);
        byte[] bArrG1 = p013kotlin.collections.v.g1(list2);
        List<Byte> list3 = this.pps;
        p013kotlin.jvm.internal.s.h(list3);
        byte[] bArrG2 = p013kotlin.collections.v.g1(list3);
        this.logger.j("createFrameProcessor: spsArray size=" + bArrG1.length + ", ppsArray size=" + bArrG2.length + ", bitrate=" + iF + ", dimensions=724x470, fps=24");
        if (this.cachedSEIView == null) {
            this.logger.j("createFrameProcessor: Inflating SEI view for metadata bar rendering");
            View viewInflate = LayoutInflater.from(this.context).inflate(f0.f55839a, this.parentView, false);
            p013kotlin.jvm.internal.s.i(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) viewInflate;
            this.cachedSEIView = (LinearLayout) viewGroup.findViewById(e0.f55825q);
            ViewGroup viewGroup2 = this.parentView;
            viewGroup.measure(View.MeasureSpec.makeMeasureSpec(viewGroup2 != null ? viewGroup2.getMeasuredWidth() : 724, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            LinearLayout linearLayout = this.cachedSEIView;
            p013kotlin.jvm.internal.s.h(linearLayout);
            if (linearLayout.getMeasuredWidth() <= 0 || linearLayout.getMeasuredHeight() <= 0) {
                com.tesla.logging.g gVar2 = this.logger;
                String str2 = "SEI view not properly measured: width=" + linearLayout.getMeasuredWidth() + ", height=" + linearLayout.getMeasuredHeight();
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = gVar2.getTag();
                String strG2 = gVar2.g(str2);
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : mapF2.entrySet()) {
                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
                return false;
            }
            this.logger.j("SEI view measured: " + linearLayout.getMeasuredWidth() + "x" + linearLayout.getMeasuredHeight());
        }
        LinearLayout linearLayout2 = this.cachedSEIView;
        p013kotlin.jvm.internal.s.h(linearLayout2);
        this.frameProcessor = new s(724, 470, 24, iF, linearLayout2);
        this.logger.j("createFrameProcessor: FrameProcessor object created, calling initialize()...");
        s sVar = this.frameProcessor;
        boolean zP = sVar != null ? sVar.p(bArrG1, bArrG2) : false;
        this.logger.j("createFrameProcessor: initialize() returned: " + zP + ", frameProcessor=" + (this.frameProcessor != null));
        if (zP) {
            this.logger.j("createFrameProcessor: FrameProcessor initialized, waiting for encoder codec config");
            return true;
        }
        com.tesla.logging.g gVar3 = this.logger;
        TeslaLog teslaLog3 = TeslaLog.INSTANCE;
        String tag3 = gVar3.getTag();
        String strG3 = gVar3.g("createFrameProcessor: Failed to initialize FrameProcessor");
        zb0.a aVar3 = zb0.a.f128044a;
        Map mapF3 = p013kotlin.collections.v0.f(jn0.x.a(tag3, strG3));
        FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry3 : mapF3.entrySet()) {
            zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
        }
        firebaseCrashlytics3.recordException(new Exception(strG3));
        TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
        vr0.a.INSTANCE.a(strG3, new Object[0]);
        this.frameProcessor = null;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    private final void j(ArrayList<List<Byte>> spsPpsFrameNalUnits) {
        long j11;
        ?? r11;
        ByteBuffer inputBuffer;
        jn0.c0 c0Var = this.latestPtsRelativeMs;
        Integer num = null;
        int i11 = 0;
        if (c0Var == null) {
            com.tesla.logging.g gVar = this.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("skip enqueueAndRenderNalUnit, latestPtsRelativeMs is null");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return;
        }
        p013kotlin.jvm.internal.s.h(c0Var);
        long j12 = ((long) 1000) & 4294967295L;
        long jB = jn0.c0.b(c0Var.getData() * jn0.c0.b(j12));
        Iterator<List<Byte>> it = spsPpsFrameNalUnits.iterator();
        p013kotlin.jvm.internal.s.j(it, "iterator(...)");
        while (it.hasNext()) {
            List<Byte> next = it.next();
            p013kotlin.jvm.internal.s.j(next, "next(...)");
            List<Byte> list = next;
            try {
                MediaCodec mediaCodec = this.mediaCodec;
                Integer numValueOf = mediaCodec != null ? Integer.valueOf(mediaCodec.dequeueInputBuffer(10000L)) : num;
                if (numValueOf == null) {
                    com.tesla.logging.g gVar2 = this.logger;
                    TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                    String tag2 = gVar2.getTag();
                    String strG2 = gVar2.g("enqueueAndRenderNalUnit skip enqueue, inputBufferIndex is null");
                    zb0.a aVar2 = zb0.a.f128044a;
                    Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
                    FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry2 : mapF2.entrySet()) {
                        zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                    }
                    firebaseCrashlytics2.recordException(new Exception(strG2));
                    TeslaLog.setTag$default(teslaLog2, tag2, i11, 2, num);
                    vr0.a.INSTANCE.a(strG2, new Object[i11]);
                } else {
                    if (numValueOf.intValue() >= 0) {
                        MediaCodec mediaCodec2 = this.mediaCodec;
                        if (mediaCodec2 != null) {
                            inputBuffer = mediaCodec2.getInputBuffer(numValueOf.intValue());
                        } else {
                            r11 = num;
                        }
                        if (r11 != 0) {
                            r11 = inputBuffer;
                            r11.clear();
                        }
                        if (r11 != 0) {
                            r11.put(p013kotlin.collections.v.g1(list));
                        }
                        MediaCodec mediaCodec3 = this.mediaCodec;
                        if (mediaCodec3 != null) {
                            j11 = 10000;
                            mediaCodec3.queueInputBuffer(numValueOf.intValue(), 0, list.size(), jB, 0);
                        } else {
                            j11 = 10000;
                        }
                    } else {
                        j11 = 10000;
                    }
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    MediaCodec mediaCodec4 = this.mediaCodec;
                    Integer numValueOf2 = mediaCodec4 != null ? Integer.valueOf(mediaCodec4.dequeueOutputBuffer(bufferInfo, j11)) : null;
                    if (numValueOf2 != null) {
                        while (true) {
                            p013kotlin.jvm.internal.s.h(numValueOf2);
                            if (numValueOf2.intValue() < 0) {
                                break;
                            }
                            MediaCodec mediaCodec5 = this.mediaCodec;
                            if (mediaCodec5 != null) {
                                mediaCodec5.releaseOutputBuffer(numValueOf2.intValue(), true);
                            }
                            MediaCodec mediaCodec6 = this.mediaCodec;
                            numValueOf2 = mediaCodec6 != null ? Integer.valueOf(mediaCodec6.dequeueOutputBuffer(bufferInfo, j11)) : null;
                            double dE = jn0.j0.e(jn0.c0.b(this.videoStartTimeEpochMs * jn0.c0.b(j12))) + bufferInfo.presentationTimeUs;
                            this.currentPresentationTimeEpochUs = dE;
                            wn0.l<? super Double, jn0.h0> lVar = this.onFrameDecodedCallback;
                            if (lVar != null) {
                                lVar.invoke(Double.valueOf(dE));
                            }
                        }
                    } else {
                        com.tesla.logging.g gVar3 = this.logger;
                        TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                        String tag3 = gVar3.getTag();
                        String strG3 = gVar3.g("enqueueAndRenderNalUnit skip rendering, outputBufferIndex is null");
                        zb0.a aVar3 = zb0.a.f128044a;
                        Map mapF3 = p013kotlin.collections.v0.f(jn0.x.a(tag3, strG3));
                        FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                        for (Map.Entry entry3 : mapF3.entrySet()) {
                            zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
                        }
                        firebaseCrashlytics3.recordException(new Exception(strG3));
                        TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
                        vr0.a.INSTANCE.a(strG3, new Object[0]);
                    }
                    num = null;
                    i11 = 0;
                }
            } catch (Exception e11) {
                com.tesla.logging.g gVar4 = this.logger;
                TeslaLog teslaLog4 = TeslaLog.INSTANCE;
                String tag4 = gVar4.getTag();
                String strG4 = gVar4.g("error enqueueing and rendering mediaCodec: " + e11);
                zb0.a aVar4 = zb0.a.f128044a;
                Map mapF4 = p013kotlin.collections.v0.f(jn0.x.a(tag4, strG4));
                FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry4 : mapF4.entrySet()) {
                    zb0.a.f128044a.a((String) entry4.getKey(), (String) entry4.getValue());
                }
                firebaseCrashlytics4.recordException(new Exception(strG4));
                TeslaLog.setTag$default(teslaLog4, tag4, false, 2, null);
                vr0.a.INSTANCE.a(strG4, new Object[0]);
                num = null;
                i11 = 0;
            }
        }
    }

    private final t k() {
        if (o1.f55932a.m() && x.f56132a.d()) {
            return this.downloadCache;
        }
        return this.isDragging.get() ? this.previewFrameCache : this.streamingCache;
    }

    private final File r() {
        File file = new File(this.context.getExternalFilesDir(Environment.DIRECTORY_MOVIES), "Tesla");
        if (!file.exists()) {
            file.mkdirs();
        }
        String str = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.getDefault()).format(new Date(this.saveClipStartTimeEpochMs)) + ".mp4";
        this.logger.j("getOutputMP4File: " + str);
        return new File(file, str);
    }

    private final boolean u() {
        Double dL = l();
        if (dL != null) {
            return this.timeAlreadyQueuedToEpochS - dL.doubleValue() < 5.0d;
        }
        return true;
    }

    private final void x() throws InterruptedException {
        if (l() == null) {
            this.logger.j("skip processMediaDataForDisplay, no currentTime");
            return;
        }
        t tVar = this.isDragging.get() ? this.previewFrameCache : this.streamingCache;
        while (this.shouldRunDecoderForDisplay.get()) {
            ArrayList<ArrayList<Byte>> arrayListL = tVar.l(this.currentCamera);
            if (arrayListL != null) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new c(null), 3, null);
                this.latestPtsRelativeMs = null;
                if (arrayListL.isEmpty()) {
                    this.logger.j("processMediaDataForDisplay no nal units");
                } else {
                    ArrayList<List<Byte>> arrayList = new ArrayList<>();
                    Iterator<ArrayList<Byte>> it = arrayListL.iterator();
                    p013kotlin.jvm.internal.s.j(it, "iterator(...)");
                    while (it.hasNext()) {
                        ArrayList<Byte> next = it.next();
                        p013kotlin.jvm.internal.s.j(next, "next(...)");
                        List<Byte> listZ = z(next, false);
                        if (listZ != null) {
                            arrayList.add(listZ);
                        }
                    }
                    if (this.latestPtsRelativeMs == null) {
                        com.tesla.logging.g gVar = this.logger;
                        TeslaLog teslaLog = TeslaLog.INSTANCE;
                        String tag = gVar.getTag();
                        String strG = gVar.g("processMediaDataForDisplay unexpected null latestPtsRelativeMs, continue to next frame");
                        zb0.a aVar = zb0.a.f128044a;
                        Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                        for (Map.Entry entry : mapF.entrySet()) {
                            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                        }
                        firebaseCrashlytics.recordException(new Exception(strG));
                        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                        vr0.a.INSTANCE.a(strG, new Object[0]);
                    } else {
                        double dE = jn0.j0.e(this.videoStartTimeEpochMs);
                        jn0.c0 c0Var = this.latestPtsRelativeMs;
                        p013kotlin.jvm.internal.s.h(c0Var);
                        this.timeAlreadyQueuedToEpochS = (dE + jn0.j0.e(c0Var.getData())) / 1000.0d;
                        if (!this.mediaCodecStarted.get()) {
                            com.tesla.logging.g gVar2 = this.logger;
                            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                            String tag2 = gVar2.getTag();
                            String strG2 = gVar2.g("processMediaDataForDisplay skip enqueue and rendering, mediaCodec not started");
                            zb0.a aVar2 = zb0.a.f128044a;
                            Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
                            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                            for (Map.Entry entry2 : mapF2.entrySet()) {
                                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                            }
                            firebaseCrashlytics2.recordException(new Exception(strG2));
                            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                            vr0.a.INSTANCE.a(strG2, new Object[0]);
                            return;
                        }
                        j(arrayList);
                        if (u()) {
                            f(false);
                        }
                    }
                }
            } else {
                this.logger.j("processMediaDataForDisplay no nal units, calling checkRequestNextFrames then sleep for 500ms");
                f(false);
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new d(null), 3, null);
                Thread.sleep(500L);
            }
        }
    }

    private final void y() throws InterruptedException {
        t tVar = x.f56132a.d() ? this.downloadCache : this.streamingCache;
        while (this.shouldRunDecoderForSaving.get()) {
            ArrayList<ArrayList<Byte>> arrayListL = tVar.l(this.currentCamera);
            int i11 = 1;
            if (arrayListL != null) {
                this.latestPtsRelativeMs = null;
                if (!arrayListL.isEmpty()) {
                    ArrayList<List<Byte>> arrayList = new ArrayList<>();
                    Iterator<ArrayList<Byte>> it = arrayListL.iterator();
                    p013kotlin.jvm.internal.s.j(it, "iterator(...)");
                    while (it.hasNext()) {
                        ArrayList<Byte> next = it.next();
                        p013kotlin.jvm.internal.s.j(next, "next(...)");
                        ArrayList<Byte> arrayList2 = next;
                        if (!this.shouldRunDecoderForSaving.get()) {
                            this.logger.j("Cancellation detected during NAL processing, exiting loop");
                            break;
                        } else {
                            List<Byte> listZ = z(arrayList2, true);
                            if (listZ != null) {
                                arrayList.add(listZ);
                            }
                        }
                    }
                    if (this.latestPtsRelativeMs == null) {
                        com.tesla.logging.g gVar = this.logger;
                        TeslaLog teslaLog = TeslaLog.INSTANCE;
                        String tag = gVar.getTag();
                        String strG = gVar.g("processMediaDataForSaving unexpected null latestPtsRelativeMs, continue to next frame");
                        zb0.a aVar = zb0.a.f128044a;
                        Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                        for (Map.Entry entry : mapF.entrySet()) {
                            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                        }
                        firebaseCrashlytics.recordException(new Exception(strG));
                        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                        vr0.a.INSTANCE.a(strG, new Object[0]);
                    } else {
                        double dE = jn0.j0.e(this.videoStartTimeEpochMs);
                        jn0.c0 c0Var = this.latestPtsRelativeMs;
                        p013kotlin.jvm.internal.s.h(c0Var);
                        this.timeAlreadyQueuedToEpochS = (dE + jn0.j0.e(c0Var.getData())) / 1000.0d;
                        if (!this.mediaMuxerStarted.get() && !this.includeMetadataBar) {
                            this.logger.j("processMediaDataForSaving skip saving clip, mediaMuxer not started (not using FrameProcessor)");
                            return;
                        }
                        d0(arrayList);
                    }
                } else if (this.framesWritten > 0) {
                    this.logger.j("processMediaDataForSaving no nal units");
                    long jB = jn0.c0.b(this.videoStartTimeEpochMs + jn0.c0.b(tVar.getCurrentIndex() * jn0.c0.b(((long) jn0.a0.b(p1.a(1000, 24) + 1)) & 4294967295L)));
                    this.logger.j("processMediaDataForSaving got gap frame, correctedPTS: " + jn0.c0.f(jB));
                    c0(jn0.c0.a(jB));
                }
            } else {
                s sVar = this.frameProcessor;
                if (this.includeMetadataBar && sVar != null) {
                    double d11 = this.timeAlreadyQueuedToEpochS;
                    if (d11 > 0.0d) {
                        long jA = jn0.j0.a(d11 * ((double) 1000));
                        if (Long.compare(jA ^ Long.MIN_VALUE, this.saveClipEndTimeEpochMs ^ Long.MIN_VALUE) >= 0) {
                            if (!this.shouldRunDecoderForSaving.get()) {
                                this.logger.j("Cancellation detected before finish(), exiting");
                                return;
                            }
                            this.logger.j("Reached end of clip time, draining FrameProcessor");
                            List<s.EncodedFrame> listK = sVar.k();
                            this.logger.j("FrameProcessor finish() returned " + listK.size() + " remaining frames");
                            int size = listK.size();
                            int i12 = 0;
                            while (i12 < size) {
                                if (!this.shouldRunDecoderForSaving.get()) {
                                    this.logger.j("Cancellation detected while writing remaining frames, stopping at frame " + i12);
                                    break;
                                }
                                s.EncodedFrame bVar = listK.get(i12);
                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bVar.getData());
                                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                                bufferInfo.offset = 0;
                                bufferInfo.size = bVar.getData().length;
                                bufferInfo.presentationTimeUs = bVar.getPresentationTimeUs();
                                bufferInfo.flags = bVar.getFlags();
                                Integer num = this.trackIndex;
                                if (num != null) {
                                    MediaMuxer mediaMuxer = this.mediaMuxer;
                                    if (mediaMuxer != null) {
                                        p013kotlin.jvm.internal.s.h(num);
                                        mediaMuxer.writeSampleData(num.intValue(), byteBufferWrap, bufferInfo);
                                    }
                                    this.framesWritten += i11;
                                } else {
                                    com.tesla.logging.g gVar2 = this.logger;
                                    TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                                    String tag2 = gVar2.getTag();
                                    String strG2 = gVar2.g("finish() frame dropped: muxer never started (trackIndex=null)");
                                    zb0.a aVar2 = zb0.a.f128044a;
                                    Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
                                    FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                                    for (Map.Entry entry2 : mapF2.entrySet()) {
                                        zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                                    }
                                    firebaseCrashlytics2.recordException(new Exception(strG2));
                                    TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                                    vr0.a.INSTANCE.a(strG2, new Object[0]);
                                }
                                i12++;
                                i11 = 1;
                            }
                            this.logger.j("Wrote " + listK.size() + " remaining frames from finish()");
                            this.logger.j("Calling updateStatusAndCheckStopWritingIfNeeded to finalize");
                            c0(jn0.c0.a(jA));
                            return;
                        }
                    }
                }
                this.logger.j("processMediaDataForSaving no nal units, calling checkRequestNextFrames then sleep for 500ms");
                f(true);
                Thread.sleep(500L);
            }
        }
    }

    private final List<Byte> z(List<Byte> nalUnit, boolean isSaving) {
        if (!o.c(nalUnit)) {
            com.tesla.logging.g gVar = this.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("skip processNalUnit, invalid nal start code");
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return null;
        }
        Integer numB = o.b(nalUnit);
        if ((numB != null && numB.intValue() == 7) || (numB != null && numB.intValue() == 8)) {
            if (this.sps == null && numB != null && numB.intValue() == 7) {
                this.sps = nalUnit;
            }
            if (this.pps == null && numB != null && numB.intValue() == 8) {
                this.pps = nalUnit;
            }
            if (this.sps != null && this.pps != null && this.mediaFormat == null) {
                MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", 724, 470);
                p013kotlin.jvm.internal.s.j(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
                mediaFormatCreateVideoFormat.setInteger("frame-rate", 24);
                List<Byte> list = this.sps;
                p013kotlin.jvm.internal.s.h(list);
                mediaFormatCreateVideoFormat.setByteBuffer("csd-0", ByteBuffer.wrap(p013kotlin.collections.v.g1(list)));
                List<Byte> list2 = this.pps;
                p013kotlin.jvm.internal.s.h(list2);
                mediaFormatCreateVideoFormat.setByteBuffer("csd-1", ByteBuffer.wrap(p013kotlin.collections.v.g1(list2)));
                this.mediaFormat = mediaFormatCreateVideoFormat;
            }
            if (isSaving) {
                return null;
            }
        } else if ((numB == null || numB.intValue() != 5) && (numB == null || numB.intValue() != 1)) {
            if ((numB != null && numB.intValue() == 31) || (numB != null && numB.intValue() == 28)) {
                if (nalUnit.size() == (x.f56132a.d() ? 34 : 30)) {
                    this.latestPtsRelativeMs = jn0.c0.a(o.g(nalUnit, 21, 29));
                    return null;
                }
                this.logger.n("processNalUnit unexpected 1F/1C NAL unit size: " + nalUnit.size());
                return null;
            }
            if (numB == null || numB.intValue() != 6) {
                com.tesla.logging.g gVar2 = this.logger;
                String str = "processNalUnit unknown NAL unit type: " + numB;
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = gVar2.getTag();
                String strG2 = gVar2.g(str);
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF2 = p013kotlin.collections.v0.f(jn0.x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : mapF2.entrySet()) {
                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
                return null;
            }
            jn0.c0 c0Var = this.latestPtsRelativeMs;
            if (c0Var != null) {
                double dE = (jn0.j0.e(this.videoStartTimeEpochMs) + jn0.j0.e(c0Var.getData())) * 1000.0d;
                if (isSaving || !this.hasReceivedSEIData) {
                    try {
                        SEIMetadataProcessed sEIMetadataProcessedA = sb0.e.f111038a.a(nalUnit);
                        if (sEIMetadataProcessedA.getHasData()) {
                            this.hasReceivedSEIData = true;
                            if (isSaving) {
                                this.latestSEIMetadata = sEIMetadataProcessedA;
                            }
                        }
                    } catch (Exception e11) {
                        if (isSaving) {
                            com.tesla.logging.g gVar3 = this.logger;
                            String str2 = "processNalUnit SEI parse failed: " + e11.getMessage();
                            TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                            String tag3 = gVar3.getTag();
                            String strG3 = gVar3.g(str2);
                            zb0.a aVar3 = zb0.a.f128044a;
                            Map mapF3 = p013kotlin.collections.v0.f(jn0.x.a(tag3, strG3));
                            FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                            for (Map.Entry entry3 : mapF3.entrySet()) {
                                zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
                            }
                            firebaseCrashlytics3.recordException(new Exception(strG3));
                            TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
                            vr0.a.INSTANCE.a(strG3, new Object[0]);
                        }
                    }
                }
                wn0.p<? super Double, ? super List<Byte>, jn0.h0> pVar = this.onSEINalCallback;
                if (pVar != null) {
                    pVar.invoke(Double.valueOf(dE), nalUnit);
                }
            }
            return null;
        }
        return nalUnit;
    }

    public final void A() {
        if (this.shouldRunDecoderForDisplay.get()) {
            this.logger.j("skip resume playback, already running");
            return;
        }
        this.logger.j("resume playback");
        this.shouldRunDecoderForDisplay.set(true);
        this.decodeQueueForDisplay.execute(new Runnable() { // from class: com.tesla.dashcam_viewer.q1
            @Override // java.lang.Runnable
            public final void run() throws InterruptedException {
                u1.B(this.f55966a);
            }
        });
    }

    public final void F(double percent) {
        long jB = jn0.c0.b(this.videoStartTimeEpochMs + jn0.j0.a(jn0.j0.e(this.videoDurationMs) * percent));
        this.logger.j("seekToPercent targetTimeEpochMs: " + jn0.c0.f(jB) + ", videoStartTimeEpochMs: " + jn0.c0.f(this.videoStartTimeEpochMs) + ", videoDurationMs: " + jn0.c0.f(this.videoDurationMs));
        S(this, jB, false, false, 6, null);
    }

    public final void G(String eventPath, String camera, jn0.c0 targetTimeMs) {
        p013kotlin.jvm.internal.s.k(eventPath, "eventPath");
        p013kotlin.jvm.internal.s.k(camera, "camera");
        o1 o1Var = o1.f55932a;
        o1Var.u(false);
        this.hasReceivedSEIData = false;
        if (eventPath.length() == 0 && camera.length() == 0) {
            this.logger.j("select event with empty eventPath and camera, calling stopPlayback");
            b0();
            wn0.a<jn0.h0> aVar = this.onResetSEILatchCallback;
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            if (!p013kotlin.jvm.internal.s.f(this.currentEventPath, eventPath)) {
                this.logger.j("select event with new eventPath, requesting metadata: " + eventPath);
                o1Var.q(p013kotlin.collections.v.e(eventPath));
                return;
            }
            if (camera.length() == 0) {
                com.tesla.logging.g gVar = this.logger;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("skip select event, camera is empty");
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
                return;
            }
            Double dL = l();
            jn0.c0 c0VarA = dL != null ? jn0.c0.a(jn0.j0.a(dL.doubleValue() * 1000.0d)) : null;
            if (targetTimeMs != null) {
                c0VarA = jn0.c0.a(targetTimeMs.getData());
            }
            if (c0VarA != null) {
                long data = c0VarA.getData();
                this.logger.j("select event with same eventPath, setting camera to: " + camera + ", time to " + c0VarA);
                S(this, data, false, false, 6, null);
                this.currentCamera = camera;
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new e(null), 3, null);
            }
        }
    }

    public final void H(String eventName, long videoDurationMs, long videoStartTimeEpochMs, long eventTimeEpochMs, double latitude, double longitude, String camera, boolean isSentry) {
        wn0.a<jn0.h0> aVar;
        p013kotlin.jvm.internal.s.k(eventName, "eventName");
        p013kotlin.jvm.internal.s.k(camera, "camera");
        this.logger.j("setEventMetadata eventName=" + eventName + " videoDurationMs=" + jn0.c0.f(videoDurationMs) + " videoStartTimeEpochMs=" + jn0.c0.f(videoStartTimeEpochMs) + " eventTimeEpochMs=" + jn0.c0.f(eventTimeEpochMs) + " camera=" + camera + " isSentry=" + isSentry);
        this.videoDurationMs = videoDurationMs;
        this.videoStartTimeEpochMs = videoStartTimeEpochMs;
        this.eventTimeEpochMs = eventTimeEpochMs;
        this.latitude = latitude;
        this.longitude = longitude;
        this.isSentry = isSentry;
        if (!p013kotlin.jvm.internal.s.f(this.currentEventPath, eventName) || this.currentCamera.length() == 0) {
            this.logger.a("setEventMetadata - first call, seeking to event time");
            if (!p013kotlin.jvm.internal.s.f(this.currentEventPath, eventName) && (aVar = this.onResetSEILatchCallback) != null) {
                aVar.invoke();
            }
            this.currentEventPath = eventName;
            long j11 = p013kotlin.text.t.b0(eventName, "SentryClips/", false, 2, null) ? DeviceOrientationRequest.OUTPUT_PERIOD_FAST : 10000L;
            this.wasPlayingPriorToBuffer = true;
            this.isBuffering = true;
            this.currentCamera = camera;
            long jA = mn0.h.a(this.videoStartTimeEpochMs, jn0.c0.b(this.eventTimeEpochMs - j11));
            this.logger.j("setting time to adjustedEpochTimeMs: " + jn0.c0.f(jA));
            S(this, jA, false, false, 6, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new f(jA, eventTimeEpochMs, videoStartTimeEpochMs, videoDurationMs, null), 3, null);
        }
    }

    public final void I(wn0.l<? super Boolean, jn0.h0> lVar) {
        this.onBufferingStatusChangeCallback = lVar;
    }

    public final void J(wn0.l<? super Double, jn0.h0> lVar) {
        this.onFrameDecodedCallback = lVar;
    }

    public final void K(wn0.r<? super jn0.c0, ? super jn0.c0, ? super jn0.c0, ? super jn0.c0, jn0.h0> rVar) {
        this.onMetadataSetCallback = rVar;
    }

    public final void L(wn0.a<jn0.h0> aVar) {
        this.onResetSEILatchCallback = aVar;
    }

    public final void M(wn0.p<? super Double, ? super List<Byte>, jn0.h0> pVar) {
        this.onSEINalCallback = pVar;
    }

    public final void N(wn0.l<? super Boolean, jn0.h0> lVar) {
        this.onSavingStatusChangeCallback = lVar;
    }

    public final void O(wn0.a<jn0.h0> aVar) {
        this.onSwitchCameraCallback = aVar;
    }

    public final void Q(SurfaceHolder surfaceHolder) {
        p013kotlin.jvm.internal.s.k(surfaceHolder, "surfaceHolder");
        this.surfaceHolder = surfaceHolder;
    }

    public final void b0() {
        this.logger.j("stop playback, current event path & camera set to empty");
        Z();
        this.currentEventPath = "";
        this.currentCamera = "";
    }

    public final void e() {
        this.logger.j("cancelDownload called, mediaMuxerStarted=" + this.mediaMuxerStarted.get());
        this.shouldRunDecoderForSaving.set(false);
        if (this.mediaMuxer == null && this.frameProcessor == null) {
            this.logger.j("cancelDownload: no muxer or frameProcessor to cleanup");
        } else {
            a0();
        }
        try {
            File fileR = r();
            if (fileR.exists()) {
                boolean zDelete = fileR.delete();
                this.logger.j("cancelDownload: deleted partial output file: " + zDelete);
            }
        } catch (Exception e11) {
            com.tesla.logging.g gVar = this.logger;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g("cancelDownload: error deleting output file: " + e11);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
        }
        o1.f55932a.u(false);
        h();
    }

    public final Double l() {
        double d11 = this.currentPresentationTimeEpochUs;
        if (d11 <= 0.0d) {
            return null;
        }
        return Double.valueOf(d11 / 1000000.0d);
    }

    public final Double m() {
        Double dL = l();
        if (dL != null) {
            return Double.valueOf((dL.doubleValue() - (jn0.j0.e(this.videoStartTimeEpochMs) / 1000.0d)) / (jn0.j0.e(this.videoDurationMs) / 1000.0d));
        }
        return null;
    }

    public final wn0.l<Boolean, jn0.h0> n() {
        return this.onBufferingStatusChangeCallback;
    }

    public final wn0.r<jn0.c0, jn0.c0, jn0.c0, jn0.c0, jn0.h0> o() {
        return this.onMetadataSetCallback;
    }

    public final wn0.l<Boolean, jn0.h0> p() {
        return this.onSavingStatusChangeCallback;
    }

    public final wn0.a<jn0.h0> q() {
        return this.onSwitchCameraCallback;
    }

    public final void s(String eventPath, String camera, boolean includeMetadata) {
        p013kotlin.jvm.internal.s.k(eventPath, "eventPath");
        p013kotlin.jvm.internal.s.k(camera, "camera");
        if (!p013kotlin.jvm.internal.s.f(this.currentEventPath, eventPath) || !p013kotlin.jvm.internal.s.f(this.currentCamera, camera)) {
            com.tesla.logging.g gVar = this.logger;
            String str = "skip initiateDownload, wrong eventPath: " + eventPath + " or camera: " + camera + " - currentEventPath: " + this.currentEventPath + " currentCamera: " + this.currentCamera;
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = p013kotlin.collections.v0.f(jn0.x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return;
        }
        if (this.mediaFormat == null) {
            this.logger.n("skip initiateDownload, mediaFormat is null");
            return;
        }
        Double dL = l();
        jn0.c0 c0VarA = dL != null ? jn0.c0.a(jn0.j0.a(dL.doubleValue() * 1000.0d)) : null;
        if (c0VarA == null) {
            this.logger.j("skip initiateDownload, currentPTSEpochMs is null");
            return;
        }
        o1 o1Var = o1.f55932a;
        if (o1Var.m()) {
            this.logger.n("initiateDownload: save already in progress, ignoring duplicate request");
            return;
        }
        this.latestPtsRelativeMs = null;
        this.timeAlreadyQueuedToEpochS = 0.0d;
        o1Var.u(true);
        this.includeMetadataBar = includeMetadata && this.hasReceivedSEIData;
        if (includeMetadata && !this.hasReceivedSEIData) {
            this.logger.j("initiateDownload: metadata requested but no SEI data received, using passthrough path");
        }
        long jA = mn0.h.a(this.videoStartTimeEpochMs, jn0.c0.b(c0VarA.getData() - 15000));
        long jB = mn0.h.b(jn0.c0.b(this.videoStartTimeEpochMs + this.videoDurationMs), jn0.c0.b(c0VarA.getData() + 15000));
        this.logger.j("initiateDownload includeMetadataBar=" + this.includeMetadataBar);
        RNH264Stream.INSTANCE.setSaveClipStatus(new DashcamViewerSaveClipStatus("saving", 0, Double.valueOf(jn0.j0.e(jA)), Double.valueOf(jn0.j0.e(jB)), null, 16, null));
        w();
        this.logger.j("initiateDownload clipStartEpochMs: " + jn0.c0.f(jA) + ", clipEndEpochMs: " + jn0.c0.f(jB) + ", latitude: " + this.latitude + ", longitude: " + this.longitude);
        this.saveClipStartTimeEpochMs = jA;
        this.saveClipEndTimeEpochMs = jB;
        if (X(jA)) {
            return;
        }
        P("setupMuxer failed");
        o1Var.u(false);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final AtomicBoolean getIsDragging() {
        return this.isDragging;
    }

    public final void v() {
        long j11 = this.isSentry ? 3000L : 10000L;
        long jB = mn0.h.b(jn0.c0.b(this.eventTimeEpochMs - j11), jn0.c0.b(jn0.c0.b(this.videoStartTimeEpochMs + this.videoDurationMs) - j11));
        long jA = mn0.h.a(this.videoStartTimeEpochMs, jB);
        this.logger.j("jumpToEvent adjustment: " + jn0.c0.f(j11) + ", proposedTime: " + jn0.c0.f(jB) + ", calculatedEventTimeMs: " + jn0.c0.f(jA));
        G(this.currentEventPath, this.currentCamera, jn0.c0.a(jA));
    }

    public final void w() {
        this.logger.j("pause playback");
        this.shouldRunDecoderForDisplay.set(false);
    }
}
