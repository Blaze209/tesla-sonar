package androidx.p002activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.l;
import androidx.core.app.s;
import androidx.core.app.t;
import androidx.core.app.w;
import androidx.core.util.Consumer;
import androidx.core.view.MenuProvider;
import androidx.core.view.o;
import androidx.core.view.r;
import androidx.p002activity.contextaware.OnContextAvailableListener;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.ActivityResultRegistry;
import androidx.p002activity.result.contract.ActivityResultContract;
import androidx.p003lifecycle.C2797h1;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.n;
import androidx.p003lifecycle.q0;
import androidx.p003lifecycle.u;
import androidx.p003lifecycle.v0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import androidx.p003lifecycle.y;
import androidx.p003lifecycle.y0;
import androidx.savedstate.SavedStateRegistry;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ezvcard.property.Gender;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import jn0.h0;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 Ý\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\u00022\u00020\f2\u00020\r2\u00020\u00022\u00020\u000e2\u00020\u000f:\nÞ\u0001ß\u0001à\u0001á\u0001â\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001eH\u0015¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b&\u0010%J\u0019\u0010(\u001a\u00020\u00152\b\b\u0001\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0014J\u0019\u0010(\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b(\u0010+J#\u0010(\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b(\u0010.J#\u0010/\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0015H\u0017¢\u0006\u0004\b0\u0010\u0011J\u0011\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00152\u0006\u00105\u001a\u000204¢\u0006\u0004\b8\u00107J)\u0010=\u001a\u00020<2\u0006\u00109\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020<2\u0006\u00109\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020<2\u0006\u00109\u001a\u00020\u00122\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u00152\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010I\u001a\u00020\u00152\u0006\u0010H\u001a\u00020G2\u0006\u0010K\u001a\u00020\u0003H\u0016¢\u0006\u0004\bI\u0010LJ'\u0010I\u001a\u00020\u00152\u0006\u0010H\u001a\u00020G2\u0006\u0010K\u001a\u00020\u00032\u0006\u0010N\u001a\u00020MH\u0017¢\u0006\u0004\bI\u0010OJ\u0017\u0010P\u001a\u00020\u00152\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bP\u0010JJ\u000f\u0010Q\u001a\u00020\u0015H\u0016¢\u0006\u0004\bQ\u0010\u0011J\u000f\u0010R\u001a\u00020\u0015H\u0017¢\u0006\u0004\bR\u0010\u0011J\u001f\u0010V\u001a\u00020\u00152\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u0012H\u0017¢\u0006\u0004\bV\u0010WJ)\u0010V\u001a\u00020\u00152\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u00122\b\u0010X\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\bV\u0010YJA\u0010_\u001a\u00020\u00152\u0006\u0010T\u001a\u00020Z2\u0006\u0010U\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010S2\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0017¢\u0006\u0004\b_\u0010`JK\u0010_\u001a\u00020\u00152\u0006\u0010T\u001a\u00020Z2\u0006\u0010U\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010S2\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\b\u0010X\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b_\u0010aJ)\u0010d\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00122\u0006\u0010b\u001a\u00020\u00122\b\u0010c\u001a\u0004\u0018\u00010SH\u0015¢\u0006\u0004\bd\u0010eJ-\u0010k\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00122\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0f2\u0006\u0010j\u001a\u00020iH\u0017¢\u0006\u0004\bk\u0010lJI\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000u\"\u0004\b\u0000\u0010m\"\u0004\b\u0001\u0010n2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010o2\u0006\u0010r\u001a\u00020q2\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00010s¢\u0006\u0004\bv\u0010wJA\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000u\"\u0004\b\u0000\u0010m\"\u0004\b\u0001\u0010n2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010o2\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00010s¢\u0006\u0004\bv\u0010xJ\u0017\u0010{\u001a\u00020\u00152\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0004\b{\u0010|J\u001b\u0010~\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020y0}¢\u0006\u0004\b~\u0010\u007fJ\u001d\u0010\u0080\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020y0}¢\u0006\u0005\b\u0080\u0001\u0010\u007fJ\u001a\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0081\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0082\u0001\u0010\u0014J\u001d\u0010\u0083\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120}¢\u0006\u0005\b\u0083\u0001\u0010\u007fJ\u001d\u0010\u0084\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120}¢\u0006\u0005\b\u0084\u0001\u0010\u007fJ\u001a\u0010\u0085\u0001\u001a\u00020\u00152\u0006\u0010T\u001a\u00020SH\u0015¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001d\u0010\u0087\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020S0}¢\u0006\u0005\b\u0087\u0001\u0010\u007fJ\u001d\u0010\u0088\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020S0}¢\u0006\u0005\b\u0088\u0001\u0010\u007fJ\u001b\u0010\u008a\u0001\u001a\u00020\u00152\u0007\u0010\u0089\u0001\u001a\u00020<H\u0017¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J#\u0010\u008a\u0001\u001a\u00020\u00152\u0007\u0010\u0089\u0001\u001a\u00020<2\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0006\b\u008a\u0001\u0010\u008c\u0001J\u001e\u0010\u008e\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010}¢\u0006\u0005\b\u008e\u0001\u0010\u007fJ\u001e\u0010\u008f\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010}¢\u0006\u0005\b\u008f\u0001\u0010\u007fJ\u001b\u0010\u0091\u0001\u001a\u00020\u00152\u0007\u0010\u0090\u0001\u001a\u00020<H\u0017¢\u0006\u0006\b\u0091\u0001\u0010\u008b\u0001J#\u0010\u0091\u0001\u001a\u00020\u00152\u0007\u0010\u0090\u0001\u001a\u00020<2\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0006\b\u0091\u0001\u0010\u008c\u0001J\u001e\u0010\u0093\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010}¢\u0006\u0005\b\u0093\u0001\u0010\u007fJ\u001e\u0010\u0094\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u0092\u00010}¢\u0006\u0005\b\u0094\u0001\u0010\u007fJ\u0011\u0010\u0095\u0001\u001a\u00020\u0015H\u0015¢\u0006\u0005\b\u0095\u0001\u0010\u0011J\u0019\u0010\u0097\u0001\u001a\u00020\u00152\u0007\u00105\u001a\u00030\u0096\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0019\u0010\u0099\u0001\u001a\u00020\u00152\u0007\u00105\u001a\u00030\u0096\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u0098\u0001J\u0011\u0010\u009a\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u009a\u0001\u0010\u0011R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001f\u0010¢\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¢\u0001\u0010£\u0001\u0012\u0005\b¤\u0001\u0010\u0011R\u001c\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0017\u0010¨\u0001\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R!\u0010¯\u0001\u001a\u00030ª\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010mR\u0018\u0010±\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u001c\u0010³\u0001\u001a\u00020q8\u0006¢\u0006\u0010\n\u0006\b³\u0001\u0010´\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R$\u0010¸\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R$\u0010º\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010¹\u0001R$\u0010»\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¹\u0001R%\u0010¼\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008d\u00010}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010¹\u0001R%\u0010½\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0092\u00010}0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¹\u0001R\u001f\u0010¾\u0001\u001a\n\u0012\u0005\u0012\u00030\u0096\u00010·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¹\u0001R\u0019\u0010¿\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0019\u0010Á\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010À\u0001R!\u0010Æ\u0001\u001a\u00030Â\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÃ\u0001\u0010¬\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R'\u0010Ë\u0001\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\u0017\n\u0006\bÇ\u0001\u0010¬\u0001\u0012\u0005\bÊ\u0001\u0010\u0011\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Í\u0001\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010%R\u0018\u0010Ñ\u0001\u001a\u00030Î\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0018\u0010Ô\u0001\u001a\u00030¥\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0018\u0010Ø\u0001\u001a\u00030Õ\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001R\u0015\u0010Ü\u0001\u001a\u00030Ù\u00018F¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Û\u0001¨\u0006ã\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/f1;", "Landroidx/lifecycle/n;", "Lxa/d;", "Landroidx/activity/e0;", "Lh/d;", "Lh/b;", "Landroidx/core/content/d;", "Landroidx/core/content/e;", "Landroidx/core/app/s;", "Landroidx/core/app/t;", "Landroidx/core/view/o;", "Landroidx/activity/a0;", "<init>", "()V", "", "contentLayoutId", "(I)V", "Ljn0/h0;", "ensureViewModelStore", "Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "addObserverForBackInvoker", "(Landroidx/activity/OnBackPressedDispatcher;)V", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "createFullyDrawnExecutor", "()Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Landroidx/activity/contextaware/OnContextAvailableListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnContextAvailableListener", "(Landroidx/activity/contextaware/OnContextAvailableListener;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Landroidx/core/view/MenuProvider;", "provider", "addMenuProvider", "(Landroidx/core/view/MenuProvider;)V", "owner", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/Lifecycle$State;", "state", "(Landroidx/core/view/MenuProvider;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", StatusResponse.RESULT_CODE, "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", Gender.OTHER, "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "registerForActivityResult", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultRegistry;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroidx/core/util/Consumer;", "addOnConfigurationChangedListener", "(Landroidx/core/util/Consumer;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Landroidx/core/app/l;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroidx/core/app/w;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Lg/a;", "contextAwareHelper", "Lg/a;", "Landroidx/core/view/r;", "menuHostHelper", "Landroidx/core/view/r;", "Lxa/c;", "savedStateRegistryController", "Lxa/c;", "getSavedStateRegistryController$annotations", "Landroidx/lifecycle/ViewModelStore;", "_viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "reportFullyDrawnExecutor", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter$delegate", "Lkotlin/Lazy;", "getFullyDrawnReporter", "()Landroidx/activity/FullyDrawnReporter;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Landroidx/activity/result/ActivityResultRegistry;", "getActivityResultRegistry", "()Landroidx/activity/result/ActivityResultRegistry;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelCreationExtras", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "Companion", "b", "c", DateTokenConverter.CONVERTER_KEY, "ReportFullyDrawnExecutor", "e", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ComponentActivity extends androidx.core.app.ComponentActivity implements LifecycleOwner, f1, n, xa.d, e0, h.d, h.b, androidx.core.content.d, androidx.core.content.e, s, t, o, a0 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final c Companion = new c(null);
    private ViewModelStore _viewModelStore;
    private final ActivityResultRegistry activityResultRegistry;
    private int contentLayoutId;
    private final g.a contextAwareHelper;

    /* JADX INFO: renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    private final Lazy defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    private final Lazy fullyDrawnReporter;
    private final r menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final Lazy onBackPressedDispatcher;
    private final CopyOnWriteArrayList<Consumer<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<Consumer<l>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<Consumer<w>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final ReportFullyDrawnExecutor reportFullyDrawnExecutor;
    private final xa.c savedStateRegistryController;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Ljava/util/concurrent/Executor;", "Landroid/view/View;", "view", "Ljn0/h0;", "n", "(Landroid/view/View;)V", "o", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private interface ReportFullyDrawnExecutor extends Executor {
        void n(View view);

        void o();
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/activity/ComponentActivity$a", "Landroidx/lifecycle/u;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$a;", "event", "Ljn0/h0;", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$a;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements u {
        a() {
        }

        @Override // androidx.p003lifecycle.u
        public void onStateChanged(LifecycleOwner source, Lifecycle.a event) {
            p013kotlin.jvm.internal.s.k(source, "source");
            p013kotlin.jvm.internal.s.k(event, "event");
            ComponentActivity.this.ensureViewModelStore();
            ComponentActivity.this.getLifecycle().d(this);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/activity/ComponentActivity$b;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/window/OnBackInvokedDispatcher;", "a", "(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f1840a = new b();

        private b() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            p013kotlin.jvm.internal.s.k(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            p013kotlin.jvm.internal.s.j(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/activity/ComponentActivity$c;", "", "<init>", "()V", "", "ACTIVITY_RESULT_TAG", "Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/activity/ComponentActivity$d;", "", "<init>", "()V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "c", "(Ljava/lang/Object;)V", "custom", "Landroidx/lifecycle/ViewModelStore;", "b", "Landroidx/lifecycle/ViewModelStore;", "()Landroidx/lifecycle/ViewModelStore;", DateTokenConverter.CONVERTER_KEY, "(Landroidx/lifecycle/ViewModelStore;)V", "viewModelStore", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Object custom;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private ViewModelStore viewModelStore;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getCustom() {
            return this.custom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ViewModelStore getViewModelStore() {
            return this.viewModelStore;
        }

        public final void c(Object obj) {
            this.custom = obj;
        }

        public final void d(ViewModelStore viewModelStore) {
            this.viewModelStore = viewModelStore;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u000fR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/activity/ComponentActivity$e;", "Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/View;", "view", "Ljn0/h0;", "n", "(Landroid/view/View;)V", "o", "()V", "runnable", "execute", "(Ljava/lang/Runnable;)V", "onDraw", "run", "", "a", "J", "getEndWatchTimeMillis", "()J", "endWatchTimeMillis", "b", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "currentRunnable", "", "c", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "onDrawScheduled", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    final class e implements ReportFullyDrawnExecutor, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long endWatchTimeMillis = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Runnable currentRunnable;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean onDrawScheduled;

        public e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(e eVar) {
            Runnable runnable = eVar.currentRunnable;
            if (runnable != null) {
                p013kotlin.jvm.internal.s.h(runnable);
                runnable.run();
                eVar.currentRunnable = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            p013kotlin.jvm.internal.s.k(runnable, "runnable");
            this.currentRunnable = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            p013kotlin.jvm.internal.s.j(decorView, "window.decorView");
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.e.b(this.f1908a);
                    }
                });
            } else if (p013kotlin.jvm.internal.s.f(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void n(View view) {
            p013kotlin.jvm.internal.s.k(view, "view");
            if (this.onDrawScheduled) {
                return;
            }
            this.onDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.ReportFullyDrawnExecutor
        public void o() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.currentRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                    this.onDrawScheduled = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            if (ComponentActivity.this.getFullyDrawnReporter().c()) {
                this.onDrawScheduled = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/activity/ComponentActivity$f", "Landroidx/activity/result/ActivityResultRegistry;", "I", Gender.OTHER, "", "requestCode", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/core/app/d;", "options", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/d;)V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f extends ActivityResultRegistry {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(f fVar, int i11, ActivityResultContract.a aVar) {
            fVar.f(i11, aVar.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(f fVar, int i11, IntentSender.SendIntentException sendIntentException) {
            fVar.e(i11, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // androidx.p002activity.result.ActivityResultRegistry
        public <I, O> void i(final int requestCode, ActivityResultContract<I, O> contract, I input, androidx.core.app.d options) {
            Bundle bundleB;
            final int i11;
            p013kotlin.jvm.internal.s.k(contract, "contract");
            ComponentActivity componentActivity = ComponentActivity.this;
            final ActivityResultContract.a<O> synchronousResult = contract.getSynchronousResult(componentActivity, input);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.f.s(this.f1909a, requestCode, synchronousResult);
                    }
                });
                return;
            }
            Intent intentCreateIntent = contract.createIntent(componentActivity, input);
            if (intentCreateIntent.getExtras() != null) {
                Bundle extras = intentCreateIntent.getExtras();
                p013kotlin.jvm.internal.s.h(extras);
                if (extras.getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
                }
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleB = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleB = options != null ? options.b() : null;
            }
            Bundle bundle = bundleB;
            if (p013kotlin.jvm.internal.s.f("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.f(componentActivity, stringArrayExtra, requestCode);
                return;
            }
            if (!p013kotlin.jvm.internal.s.f("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentCreateIntent.getAction())) {
                androidx.core.app.b.j(componentActivity, intentCreateIntent, requestCode, bundle);
                return;
            }
            h.e eVar = (h.e) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                p013kotlin.jvm.internal.s.h(eVar);
                i11 = requestCode;
                try {
                    androidx.core.app.b.k(componentActivity, eVar.getIntentSender(), i11, eVar.getFillInIntent(), eVar.getFlagsMask(), eVar.getFlagsValues(), 0, bundle);
                } catch (IntentSender.SendIntentException e11) {
                    e = e11;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentActivity.f.t(this.f1912a, i11, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e12) {
                e = e12;
                i11 = requestCode;
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/y0;", "b", "()Landroidx/lifecycle/y0;"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.a<y0> {
        g() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y0 invoke() {
            Application application = ComponentActivity.this.getApplication();
            ComponentActivity componentActivity = ComponentActivity.this;
            return new y0(application, componentActivity, componentActivity.getIntent() != null ? ComponentActivity.this.getIntent().getExtras() : null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/FullyDrawnReporter;", "b", "()Landroidx/activity/FullyDrawnReporter;"}, k = 3, mv = {1, 8, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.a<FullyDrawnReporter> {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ComponentActivity f1850c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ComponentActivity componentActivity) {
                super(0);
                this.f1850c = componentActivity;
            }

            public final void b() {
                this.f1850c.reportFullyDrawn();
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        h() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FullyDrawnReporter invoke() {
            return new FullyDrawnReporter(ComponentActivity.this.reportFullyDrawnExecutor, new a(ComponentActivity.this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "c", "()Landroidx/activity/OnBackPressedDispatcher;"}, k = 3, mv = {1, 8, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.a<OnBackPressedDispatcher> {
        i() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(ComponentActivity componentActivity) {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e11) {
                if (!p013kotlin.jvm.internal.s.f(e11.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e11;
                }
            } catch (NullPointerException e12) {
                if (!p013kotlin.jvm.internal.s.f(e12.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e12;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
            componentActivity.addObserverForBackInvoker(onBackPressedDispatcher);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final OnBackPressedDispatcher invoke() {
            final ComponentActivity componentActivity = ComponentActivity.this;
            final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.m
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity.i.e(componentActivity);
                }
            });
            final ComponentActivity componentActivity2 = ComponentActivity.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!p013kotlin.jvm.internal.s.f(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentActivity.i.f(componentActivity2, onBackPressedDispatcher);
                        }
                    });
                    return onBackPressedDispatcher;
                }
                componentActivity2.addObserverForBackInvoker(onBackPressedDispatcher);
            }
            return onBackPressedDispatcher;
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new g.a();
        this.menuHostHelper = new r(new Runnable() { // from class: androidx.activity.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f1892a.invalidateMenu();
            }
        });
        xa.c cVarA = xa.c.INSTANCE.a(this);
        this.savedStateRegistryController = cVarA;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = m.b(new h());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new u() { // from class: androidx.activity.e
            @Override // androidx.p003lifecycle.u
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
                ComponentActivity._init_$lambda$2(this.f1894a, lifecycleOwner, aVar);
            }
        });
        getLifecycle().a(new u() { // from class: androidx.activity.f
            @Override // androidx.p003lifecycle.u
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
                ComponentActivity._init_$lambda$3(this.f1895a, lifecycleOwner, aVar);
            }
        });
        getLifecycle().a(new a());
        cVarA.c();
        v0.c(this);
        getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new SavedStateRegistry.c() { // from class: androidx.activity.g
            @Override // androidx.savedstate.SavedStateRegistry.c
            public final Bundle a() {
                return ComponentActivity._init_$lambda$4(this.f1898a);
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.activity.h
            @Override // androidx.p002activity.contextaware.OnContextAvailableListener
            public final void a(Context context) {
                ComponentActivity._init_$lambda$5(this.f1905a, context);
            }
        });
        this.defaultViewModelProviderFactory = m.b(new g());
        this.onBackPressedDispatcher = m.b(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.a event) {
        Window window;
        View viewPeekDecorView;
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "<anonymous parameter 0>");
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event != Lifecycle.a.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.a event) {
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "<anonymous parameter 0>");
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event == Lifecycle.a.ON_DESTROY) {
            componentActivity.contextAwareHelper.b();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        componentActivity.activityResultRegistry.k(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        Bundle bundleB = componentActivity.getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (bundleB != null) {
            componentActivity.activityResultRegistry.j(bundleB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final OnBackPressedDispatcher dispatcher) {
        getLifecycle().a(new u() { // from class: androidx.activity.i
            @Override // androidx.p003lifecycle.u
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
                ComponentActivity.addObserverForBackInvoker$lambda$7(dispatcher, this, lifecycleOwner, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, Lifecycle.a event) {
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "<anonymous parameter 0>");
        p013kotlin.jvm.internal.s.k(event, "event");
        if (event == Lifecycle.a.ON_CREATE) {
            onBackPressedDispatcher.p(b.f1840a.a(componentActivity));
        }
    }

    private final ReportFullyDrawnExecutor createFullyDrawnExecutor() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this._viewModelStore = dVar.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        p013kotlin.jvm.internal.s.j(decorView, "window.decorView");
        reportFullyDrawnExecutor.n(decorView);
        super.addContentView(view, params);
    }

    @Override // androidx.core.view.o
    public void addMenuProvider(MenuProvider provider) {
        p013kotlin.jvm.internal.s.k(provider, "provider");
        this.menuHostHelper.c(provider);
    }

    @Override // androidx.core.content.d
    public final void addOnConfigurationChangedListener(Consumer<Configuration> listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(OnContextAvailableListener listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    @Override // androidx.core.app.s
    public final void addOnMultiWindowModeChangedListener(Consumer<l> listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(Consumer<Intent> listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // androidx.core.app.t
    public final void addOnPictureInPictureModeChangedListener(Consumer<w> listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // androidx.core.content.e
    public final void addOnTrimMemoryListener(Consumer<Integer> listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // h.d
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.p003lifecycle.n
    public CreationExtras getDefaultViewModelCreationExtras() {
        androidx.p003lifecycle.viewmodel.a aVar = new androidx.p003lifecycle.viewmodel.a(null, 1, null);
        if (getApplication() != null) {
            CreationExtras.b<Application> bVar = ViewModelProvider.a.f8735h;
            Application application = getApplication();
            p013kotlin.jvm.internal.s.j(application, "application");
            aVar.c(bVar, application);
        }
        aVar.c(v0.f8920a, this);
        aVar.c(v0.f8921b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            aVar.c(v0.f8922c, extras);
        }
        return aVar;
    }

    @Override // androidx.p003lifecycle.n
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider.Factory) this.defaultViewModelProviderFactory.getValue();
    }

    public FullyDrawnReporter getFullyDrawnReporter() {
        return (FullyDrawnReporter) this.fullyDrawnReporter.getValue();
    }

    @jn0.e
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.getCustom();
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.p003lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // androidx.p002activity.e0
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher.getValue();
    }

    @Override // xa.d
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.p003lifecycle.f1
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        ViewModelStore viewModelStore = this._viewModelStore;
        p013kotlin.jvm.internal.s.h(viewModelStore);
        return viewModelStore;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        p013kotlin.jvm.internal.s.j(decorView, "window.decorView");
        androidx.p003lifecycle.View.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        p013kotlin.jvm.internal.s.j(decorView2, "window.decorView");
        C2797h1.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        p013kotlin.jvm.internal.s.j(decorView3, "window.decorView");
        xa.e.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        p013kotlin.jvm.internal.s.j(decorView4, "window.decorView");
        C2796i0.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        p013kotlin.jvm.internal.s.j(decorView5, "window.decorView");
        View.a(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @jn0.e
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.e(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    @jn0.e
    public void onBackPressed() {
        getOnBackPressedDispatcher().m();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        p013kotlin.jvm.internal.s.k(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<Consumer<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.d(savedInstanceState);
        this.contextAwareHelper.c(this);
        super.onCreate(savedInstanceState);
        q0.INSTANCE.c(this);
        int i11 = this.contentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        p013kotlin.jvm.internal.s.k(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        this.menuHostHelper.f(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        p013kotlin.jvm.internal.s.k(item, "item");
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.h(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @jn0.e
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<l>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new l(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        p013kotlin.jvm.internal.s.k(menu, "menu");
        this.menuHostHelper.g(menu);
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    @jn0.e
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<w>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new w(isInPictureInPictureMode));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        p013kotlin.jvm.internal.s.k(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        this.menuHostHelper.i(menu);
        return true;
    }

    @Override // android.app.Activity
    @jn0.e
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        p013kotlin.jvm.internal.s.k(permissions, "permissions");
        p013kotlin.jvm.internal.s.k(grantResults, "grantResults");
        if (this.activityResultRegistry.e(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @jn0.e
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            viewModelStore = dVar.getViewModelStore();
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.c(objOnRetainCustomNonConfigurationInstance);
        dVar2.d(viewModelStore);
        return dVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        p013kotlin.jvm.internal.s.k(outState, "outState");
        if (getLifecycle() instanceof y) {
            Lifecycle lifecycle = getLifecycle();
            p013kotlin.jvm.internal.s.i(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((y) lifecycle).o(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<Consumer<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String();
    }

    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> contract, ActivityResultRegistry registry, ActivityResultCallback<O> callback) {
        p013kotlin.jvm.internal.s.k(contract, "contract");
        p013kotlin.jvm.internal.s.k(registry, "registry");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        return registry.m("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // androidx.core.view.o
    public void removeMenuProvider(MenuProvider provider) {
        p013kotlin.jvm.internal.s.k(provider, "provider");
        this.menuHostHelper.j(provider);
    }

    @Override // androidx.core.content.d
    public final void removeOnConfigurationChangedListener(Consumer<Configuration> listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(OnContextAvailableListener listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.contextAwareHelper.e(listener);
    }

    @Override // androidx.core.app.s
    public final void removeOnMultiWindowModeChangedListener(Consumer<l> listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(Consumer<Intent> listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // androidx.core.app.t
    public final void removeOnPictureInPictureModeChangedListener(Consumer<w> listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // androidx.core.content.e
    public final void removeOnTrimMemoryListener(Consumer<Integer> listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (eb.a.h()) {
                eb.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
        } finally {
            eb.a.f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        p013kotlin.jvm.internal.s.j(decorView, "window.decorView");
        reportFullyDrawnExecutor.n(decorView);
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    @jn0.e
    public void startActivityForResult(Intent intent, int requestCode) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @jn0.e
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void addMenuProvider(MenuProvider provider, LifecycleOwner owner) {
        p013kotlin.jvm.internal.s.k(provider, "provider");
        p013kotlin.jvm.internal.s.k(owner, "owner");
        this.menuHostHelper.d(provider, owner);
    }

    @Override // android.app.Activity
    @jn0.e
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @jn0.e
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        p013kotlin.jvm.internal.s.k(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(MenuProvider provider, LifecycleOwner owner, Lifecycle.State state) {
        p013kotlin.jvm.internal.s.k(provider, "provider");
        p013kotlin.jvm.internal.s.k(owner, "owner");
        p013kotlin.jvm.internal.s.k(state, "state");
        this.menuHostHelper.e(provider, owner, state);
    }

    @Override // h.b
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> contract, ActivityResultCallback<O> callback) {
        p013kotlin.jvm.internal.s.k(contract, "contract");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        p013kotlin.jvm.internal.s.k(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<l>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new l(isInMultiWindowMode, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        p013kotlin.jvm.internal.s.k(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<w>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new w(isInPictureInPictureMode, newConfig));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        p013kotlin.jvm.internal.s.j(decorView, "window.decorView");
        reportFullyDrawnExecutor.n(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        p013kotlin.jvm.internal.s.j(decorView, "window.decorView");
        reportFullyDrawnExecutor.n(decorView);
        super.setContentView(view, params);
    }

    public ComponentActivity(int i11) {
        this();
        this.contentLayoutId = i11;
    }
}
