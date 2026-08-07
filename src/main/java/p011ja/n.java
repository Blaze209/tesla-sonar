package p011ja;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.core.app.TaskStackBuilder;
import androidx.p002activity.b0;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.w;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import jn0.h0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.j0;
import p013kotlin.jvm.internal.l0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.jvm.internal.u0;
import ro0.r;
import wn0.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000º\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000 ó\u00012\u00020\u0001:\u0006\u0089\u0001\u008e\u0001\u0092\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJS\u0010\u0016\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u001b\u001a\u00020\t*\n\u0012\u0006\b\u0001\u0012\u00020\r0\f2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010 \u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b \u0010!J3\u0010$\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u00012\u0006\u0010#\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\u00020\u00192\u0006\u0010#\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u00192\u0010\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000e2\u0006\u0010*\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b+\u0010,J1\u00100\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00102\u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0019H\u0002¢\u0006\u0004\b4\u00105J\u0019\u00108\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u000106H\u0003¢\u0006\u0004\b8\u00109J\u0019\u0010<\u001a\u0004\u0018\u00010&2\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u00020>*\b\u0012\u0004\u0012\u00020\u00060-H\u0002¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020&\"\b\b\u0000\u0010\"*\u00020\u00012\u0006\u0010#\u001a\u00028\u0000H\u0002¢\u0006\u0004\bA\u0010BJ5\u0010E\u001a\u00020\t2\u0006\u0010C\u001a\u00020\r2\b\u0010D\u001a\u0004\u0018\u0001062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0003¢\u0006\u0004\bE\u0010FJ!\u0010G\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\r2\b\u0010D\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bG\u0010HJ5\u0010J\u001a\u00020\u00192\u0006\u0010I\u001a\u00020\u001d2\b\u0010D\u001a\u0004\u0018\u0001062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bJ\u0010KJ;\u0010L\u001a\u00020\u00192\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010D\u001a\u0004\u0018\u0001062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\bL\u0010MJ%\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0002¢\u0006\u0004\bO\u0010PJ9\u0010T\u001a\u00020\t2\u0006\u0010C\u001a\u00020\r2\b\u0010Q\u001a\u0004\u0018\u0001062\u0006\u0010R\u001a\u00020\u00062\u000e\b\u0002\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bV\u0010WJ\u0019\u0010X\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\t2\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\t2\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b^\u0010]J\u000f\u0010_\u001a\u00020\u0019H\u0017¢\u0006\u0004\b_\u00105J!\u0010`\u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0019H\u0017¢\u0006\u0004\b`\u0010aJ)\u0010b\u001a\u00020\u00192\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\bb\u0010!J%\u0010e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00062\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\t0cH\u0000¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\tH\u0000¢\u0006\u0004\bg\u0010WJ\u0015\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0000¢\u0006\u0004\bh\u0010iJ!\u0010k\u001a\u00020\t2\u0006\u0010j\u001a\u00020>2\b\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\bk\u0010lJ\u0019\u0010o\u001a\u00020\u00192\b\u0010n\u001a\u0004\u0018\u00010mH\u0017¢\u0006\u0004\bo\u0010pJ\u001b\u0010q\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\bq\u0010rJ'\u0010t\u001a\u0004\u0018\u00010\r*\u00020\r2\b\b\u0001\u0010\u001e\u001a\u00020\u001d2\u0006\u0010s\u001a\u00020\u0019H\u0007¢\u0006\u0004\bt\u0010uJ+\u0010x\u001a\u00020\t2\u0006\u0010#\u001a\u00020&2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\t0\u0014H\u0007¢\u0006\u0004\bx\u0010yJ/\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020&2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\"\u0010zJ\u0011\u0010{\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b{\u0010|J\u0019\u0010~\u001a\u00020\t2\b\u0010}\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b~\u00109J\u001b\u0010\u0081\u0001\u001a\u00020\t2\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001c\u0010\u0085\u0001\u001a\u00020\t2\b\u0010\u0084\u0001\u001a\u00030\u0083\u0001H\u0017¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001c\u0010\u0087\u0001\u001a\u00020\u00062\b\b\u0001\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001b\u0010\u0097\u0001\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R#\u0010\u009f\u0001\u001a\f\u0012\u0005\u0012\u00030\u009c\u0001\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010¡\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010`R\u001d\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R$\u0010¨\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R,\u0010®\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0©\u00018GX\u0087\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R$\u0010°\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010§\u0001R)\u0010³\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0©\u00018\u0006¢\u0006\u0010\n\u0006\b±\u0001\u0010«\u0001\u001a\u0006\b²\u0001\u0010\u00ad\u0001R$\u0010·\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R%\u0010º\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0005\u0012\u00030¸\u00010´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010¶\u0001R&\u0010¼\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010&0´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¶\u0001R)\u0010½\u0001\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0´\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bT\u0010¶\u0001R\u001b\u0010À\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001b\u0010Ã\u0001\u001a\u0005\u0018\u00010Á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\\\u0010Â\u0001R\u001d\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00020Z0Ä\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b2\u0010Å\u0001R)\u0010Í\u0001\u001a\u00030Ç\u00018@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b4\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R\u0017\u0010Ð\u0001\u001a\u00030Î\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b+\u0010Ï\u0001R\u0017\u0010Ó\u0001\u001a\u00030Ñ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bL\u0010Ò\u0001R\u0017\u0010Ô\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010`R\u0019\u0010×\u0001\u001a\u00030Õ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bt\u0010Ö\u0001R0\u0010Ù\u0001\u001a\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\t\u0012\u00070Ø\u0001R\u00020\u00000´\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b<\u0010¶\u0001R&\u0010Û\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bA\u0010Ú\u0001R'\u0010Ü\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010Ú\u0001R$\u0010Ý\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010¶\u0001R\u0019\u0010Þ\u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010É\u0001R\u001e\u0010â\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060ß\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R!\u0010ç\u0001\u001a\u00030\u0091\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001R\u001e\u0010ë\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R#\u0010ð\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060ì\u00018\u0006¢\u0006\u0010\n\u0006\bí\u0001\u0010î\u0001\u001a\u0006\bã\u0001\u0010ï\u0001R\u0017\u0010ò\u0001\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\b\u001a\u0006\bí\u0001\u0010ñ\u0001R(\u0010j\u001a\u00020>2\u0006\u0010j\u001a\u00020>8W@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R,\u0010÷\u0001\u001a\u00030Õ\u00012\b\u0010÷\u0001\u001a\u00030Õ\u00018V@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\bú\u0001\u0010û\u0001R\u0019\u0010ý\u0001\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\b\u001a\u0006\bé\u0001\u0010ü\u0001R\u0019\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\bà\u0001\u0010þ\u0001R\u0019\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0002\u0010þ\u0001¨\u0006\u0082\u0002"}, d2 = {"Lja/n;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lja/k;", "child", "parent", "Ljn0/h0;", "R", "(Lja/k;Lja/k;)V", "Lja/d0;", "Lja/r;", "", "entries", "Lja/y;", "navOptions", "Lja/d0$a;", "navigatorExtras", "Lkotlin/Function1;", "handler", "W", "(Lja/d0;Ljava/util/List;Lja/y;Lja/d0$a;Lwn0/l;)V", "popUpTo", "", "saveState", "c0", "(Lja/d0;Lja/k;ZLwn0/l;)V", "", "destinationId", "inclusive", "d0", "(IZZ)Z", "T", PlaceTypes.ROUTE, "e0", "(Ljava/lang/Object;ZZ)Z", "", "f0", "(Ljava/lang/String;ZZ)Z", "popOperations", "foundDestination", "u", "(Ljava/util/List;Lja/r;ZZ)Z", "Lkotlin/collections/m;", "Lja/l;", "savedState", "h0", "(Lja/k;ZLkotlin/collections/m;)V", "s", "(I)Z", "t", "()Z", "Landroid/os/Bundle;", "startDestinationArgs", "X", "(Landroid/os/Bundle;)V", "", "deepLink", "y", "([I)Ljava/lang/String;", "Lja/t;", "L", "(Lkotlin/collections/m;)Lja/t;", "z", "(Ljava/lang/Object;)Ljava/lang/String;", "node", "args", "S", "(Lja/r;Landroid/os/Bundle;Lja/y;Lja/d0$a;)V", "P", "(Lja/r;Landroid/os/Bundle;)Z", "id", "m0", "(ILandroid/os/Bundle;Lja/y;Lja/d0$a;)Z", "v", "(Ljava/util/List;Landroid/os/Bundle;Lja/y;Lja/d0$a;)Z", "backStackState", Gender.OTHER, "(Lkotlin/collections/m;)Ljava/util/List;", "finalArgs", "backStackEntry", "restoredEntries", "p", "(Lja/r;Landroid/os/Bundle;Lja/k;Ljava/util/List;)V", "u0", "()V", "s0", "(Lja/k;)Lja/k;", "Lja/n$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "r", "(Lja/n$c;)V", "k0", "Y", "Z", "(IZ)Z", "a0", "Lkotlin/Function0;", "onComplete", "b0", "(Lja/k;Lwn0/a;)V", "t0", "j0", "()Ljava/util/List;", "graph", "p0", "(Lja/t;Landroid/os/Bundle;)V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, Gender.NONE, "(Landroid/content/Intent;)Z", "w", "(I)Lja/r;", "searchChildren", "x", "(Lja/r;IZ)Lja/r;", "Lja/z;", "builder", Gender.UNKNOWN, "(Ljava/lang/String;Lwn0/l;)V", "(Ljava/lang/String;Lja/y;Lja/d0$a;)V", "n0", "()Landroid/os/Bundle;", "navState", "l0", "Landroidx/lifecycle/LifecycleOwner;", "owner", "q0", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "r0", "(Landroidx/lifecycle/ViewModelStore;)V", "A", "(I)Lja/k;", "a", "Landroid/content/Context;", "B", "()Landroid/content/Context;", "Landroid/app/Activity;", "b", "Landroid/app/Activity;", "activity", "Lja/x;", "c", "Lja/x;", "inflater", DateTokenConverter.CONVERTER_KEY, "Lja/t;", "_graph", "e", "Landroid/os/Bundle;", "navigatorStateToRestore", "", "Landroid/os/Parcelable;", "f", "[Landroid/os/Parcelable;", "backStackToRestore", "g", "deepLinkHandled", "h", "Lkotlin/collections/m;", "backQueue", "Lkotlinx/coroutines/flow/MutableStateFlow;", IntegerTokenConverter.CONVERTER_KEY, "Lkotlinx/coroutines/flow/MutableStateFlow;", "_currentBackStack", "Lkotlinx/coroutines/flow/StateFlow;", "j", "Lkotlinx/coroutines/flow/StateFlow;", "C", "()Lkotlinx/coroutines/flow/StateFlow;", "currentBackStack", "k", "_visibleEntries", "l", Gender.MALE, "visibleEntries", "", "m", "Ljava/util/Map;", "childToParentEntries", "Ljava/util/concurrent/atomic/AtomicInteger;", "n", "parentToChildCount", "o", "backStackMap", "backStackStates", "q", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lja/o;", "Lja/o;", "viewModel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onDestinationChangedListeners", "Landroidx/lifecycle/Lifecycle$State;", "Landroidx/lifecycle/Lifecycle$State;", "I", "()Landroidx/lifecycle/Lifecycle$State;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/Lifecycle$State;)V", "hostLifecycleState", "Landroidx/lifecycle/w;", "Landroidx/lifecycle/w;", "lifecycleObserver", "Landroidx/activity/b0;", "Landroidx/activity/b0;", "onBackPressedCallback", "enableOnBackPressedCallback", "Lja/e0;", "Lja/e0;", "_navigatorProvider", "Lja/n$b;", "navigatorState", "Lwn0/l;", "addToBackStackHandler", "popFromBackStackHandler", "entrySavedState", "dispatchReentrantCount", "", "D", "Ljava/util/List;", "backStackEntriesToDispatch", "E", "Lkotlin/Lazy;", "getNavInflater", "()Lja/x;", "navInflater", "Lkotlinx/coroutines/flow/MutableSharedFlow;", Gender.FEMALE, "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_currentBackStackEntryFlow", "Lkotlinx/coroutines/flow/Flow;", "G", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "currentBackStackEntryFlow", "()I", "destinationCountOnBackStack", "H", "()Lja/t;", "o0", "(Lja/t;)V", "navigatorProvider", "J", "()Lja/e0;", "setNavigatorProvider", "(Lja/e0;)V", "()Lja/r;", "currentDestination", "()Lja/k;", "currentBackStackEntry", "K", "previousBackStackEntry", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class n {
    private static boolean I = true;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private wn0.l<? super p011ja.k, h0> popFromBackStackHandler;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final Map<p011ja.k, Boolean> entrySavedState;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private int dispatchReentrantCount;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final List<p011ja.k> backStackEntriesToDispatch;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Lazy navInflater;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final MutableSharedFlow<p011ja.k> _currentBackStackEntryFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final Flow<p011ja.k> currentBackStackEntryFlow;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Activity activity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private x inflater;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private t _graph;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Bundle navigatorStateToRestore;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Parcelable[] backStackToRestore;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean deepLinkHandled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p013kotlin.collections.m<p011ja.k> backQueue;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<List<p011ja.k>> _currentBackStack;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<List<p011ja.k>> currentBackStack;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<List<p011ja.k>> _visibleEntries;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<List<p011ja.k>> visibleEntries;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Map<p011ja.k, p011ja.k> childToParentEntries;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Map<p011ja.k, AtomicInteger> parentToChildCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, String> backStackMap;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Map<String, p013kotlin.collections.m<p011ja.l>> backStackStates;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private p011ja.o viewModel;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<c> onDestinationChangedListeners;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Lifecycle.State hostLifecycleState;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final w lifecycleObserver;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final b0 onBackPressedCallback;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean enableOnBackPressedCallback;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private e0 _navigatorProvider;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Map<d0<? extends r>, b> navigatorState;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private wn0.l<? super p011ja.k, h0> addToBackStackHandler;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u000bR\u001f\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lja/n$b;", "Lja/f0;", "Lja/d0;", "Lja/r;", "navigator", "<init>", "(Lja/n;Lja/d0;)V", "Lja/k;", "backStackEntry", "Ljn0/h0;", "j", "(Lja/k;)V", "n", "destination", "Landroid/os/Bundle;", "arguments", "a", "(Lja/r;Landroid/os/Bundle;)Lja/k;", "popUpTo", "", "saveState", "g", "(Lja/k;Z)V", "h", "entry", "e", IntegerTokenConverter.CONVERTER_KEY, "Lja/d0;", "getNavigator", "()Lja/d0;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class b extends f0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final d0<? extends r> navigator;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ n f83305h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p011ja.k f83307d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f83308e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p011ja.k kVar, boolean z11) {
                super(0);
                this.f83307d = kVar;
                this.f83308e = z11;
            }

            public final void b() {
                b.super.g(this.f83307d, this.f83308e);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        public b(n nVar, d0<? extends r> navigator) {
            s.k(navigator, "navigator");
            this.f83305h = nVar;
            this.navigator = navigator;
        }

        @Override // p011ja.f0
        public p011ja.k a(r destination, Bundle arguments) {
            s.k(destination, "destination");
            return p011ja.k.Companion.b(p011ja.k.INSTANCE, this.f83305h.getContext(), destination, arguments, this.f83305h.I(), this.f83305h.viewModel, null, null, 96, null);
        }

        @Override // p011ja.f0
        public void e(p011ja.k entry) {
            p011ja.o oVar;
            s.k(entry, "entry");
            boolean zF = s.f(this.f83305h.entrySavedState.get(entry), Boolean.TRUE);
            super.e(entry);
            this.f83305h.entrySavedState.remove(entry);
            if (this.f83305h.backQueue.contains(entry)) {
                if (getIsNavigating()) {
                    return;
                }
                this.f83305h.t0();
                this.f83305h._currentBackStack.tryEmit(v.p1(this.f83305h.backQueue));
                this.f83305h._visibleEntries.tryEmit(this.f83305h.j0());
                return;
            }
            this.f83305h.s0(entry);
            if (entry.getLifecycle().getState().isAtLeast(Lifecycle.State.CREATED)) {
                entry.l(Lifecycle.State.DESTROYED);
            }
            p013kotlin.collections.m mVar = this.f83305h.backQueue;
            if (mVar == null || !mVar.isEmpty()) {
                Iterator<E> it = mVar.iterator();
                while (it.hasNext()) {
                    if (s.f(((p011ja.k) it.next()).getId(), entry.getId())) {
                    }
                }
                if (!zF && (oVar = this.f83305h.viewModel) != null) {
                    oVar.g(entry.getId());
                }
            } else if (!zF) {
                oVar.g(entry.getId());
            }
            this.f83305h.t0();
            this.f83305h._visibleEntries.tryEmit(this.f83305h.j0());
        }

        @Override // p011ja.f0
        public void g(p011ja.k popUpTo, boolean saveState) {
            s.k(popUpTo, "popUpTo");
            d0 d0VarE = this.f83305h._navigatorProvider.e(popUpTo.getDestination().getNavigatorName());
            this.f83305h.entrySavedState.put(popUpTo, Boolean.valueOf(saveState));
            if (!s.f(d0VarE, this.navigator)) {
                Object obj = this.f83305h.navigatorState.get(d0VarE);
                s.h(obj);
                ((b) obj).g(popUpTo, saveState);
            } else {
                wn0.l lVar = this.f83305h.popFromBackStackHandler;
                if (lVar == null) {
                    this.f83305h.b0(popUpTo, new a(popUpTo, saveState));
                } else {
                    lVar.invoke(popUpTo);
                    super.g(popUpTo, saveState);
                }
            }
        }

        @Override // p011ja.f0
        public void h(p011ja.k popUpTo, boolean saveState) {
            s.k(popUpTo, "popUpTo");
            super.h(popUpTo, saveState);
        }

        @Override // p011ja.f0
        public void i(p011ja.k entry) {
            s.k(entry, "entry");
            super.i(entry);
            if (!this.f83305h.backQueue.contains(entry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            entry.l(Lifecycle.State.STARTED);
        }

        @Override // p011ja.f0
        public void j(p011ja.k backStackEntry) {
            s.k(backStackEntry, "backStackEntry");
            d0 d0VarE = this.f83305h._navigatorProvider.e(backStackEntry.getDestination().getNavigatorName());
            if (!s.f(d0VarE, this.navigator)) {
                Object obj = this.f83305h.navigatorState.get(d0VarE);
                if (obj != null) {
                    ((b) obj).j(backStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
            }
            wn0.l lVar = this.f83305h.addToBackStackHandler;
            if (lVar != null) {
                lVar.invoke(backStackEntry);
                n(backStackEntry);
                return;
            }
            Log.i("NavController", "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
        }

        public final void n(p011ja.k backStackEntry) {
            s.k(backStackEntry, "backStackEntry");
            super.j(backStackEntry);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lja/n$c;", "", "Lja/n;", "controller", "Lja/r;", "destination", "Landroid/os/Bundle;", "arguments", "Ljn0/h0;", "a", "(Lja/n;Lja/r;Landroid/os/Bundle;)V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {
        void a(n controller, r destination, Bundle arguments);
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/Context;", "it", "a", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements wn0.l<Context, Context> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f83309c = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            s.k(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lja/z;", "Ljn0/h0;", "a", "(Lja/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements wn0.l<z, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f83310c = new e();

        e() {
            super(1);
        }

        public final void a(z navOptions) {
            s.k(navOptions, "$this$navOptions");
            navOptions.h(true);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(z zVar) {
            a(zVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/k;", "entry", "Ljn0/h0;", "a", "(Lja/k;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements wn0.l<p011ja.k, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f83311c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j0 f83312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f83313e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f83314f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p013kotlin.collections.m<p011ja.l> f83315g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(j0 j0Var, j0 j0Var2, n nVar, boolean z11, p013kotlin.collections.m<p011ja.l> mVar) {
            super(1);
            this.f83311c = j0Var;
            this.f83312d = j0Var2;
            this.f83313e = nVar;
            this.f83314f = z11;
            this.f83315g = mVar;
        }

        public final void a(p011ja.k entry) {
            s.k(entry, "entry");
            this.f83311c.f86523a = true;
            this.f83312d.f86523a = true;
            this.f83313e.h0(entry, this.f83314f, this.f83315g);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(p011ja.k kVar) {
            a(kVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lja/r;", "destination", "a", "(Lja/r;)Lja/r;"}, k = 3, mv = {1, 8, 0})
    static final class g extends u implements wn0.l<r, r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f83316c = new g();

        g() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke(r destination) {
            s.k(destination, "destination");
            t parent = destination.getParent();
            if (parent == null || parent.getStartDestId() != destination.getId()) {
                return null;
            }
            return destination.getParent();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/r;", "destination", "", "a", "(Lja/r;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class h extends u implements wn0.l<r, Boolean> {
        h() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(r destination) {
            s.k(destination, "destination");
            return Boolean.valueOf(!n.this.backStackMap.containsKey(Integer.valueOf(destination.getId())));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lja/r;", "destination", "a", "(Lja/r;)Lja/r;"}, k = 3, mv = {1, 8, 0})
    static final class i extends u implements wn0.l<r, r> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f83318c = new i();

        i() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke(r destination) {
            s.k(destination, "destination");
            t parent = destination.getParent();
            if (parent == null || parent.getStartDestId() != destination.getId()) {
                return null;
            }
            return destination.getParent();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/r;", "destination", "", "a", "(Lja/r;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class j extends u implements wn0.l<r, Boolean> {
        j() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(r destination) {
            s.k(destination, "destination");
            return Boolean.valueOf(!n.this.backStackMap.containsKey(Integer.valueOf(destination.getId())));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/k;", "entry", "Ljn0/h0;", "a", "(Lja/k;)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends u implements wn0.l<p011ja.k, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f83320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<p011ja.k> f83321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l0 f83322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n f83323f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Bundle f83324g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(j0 j0Var, List<p011ja.k> list, l0 l0Var, n nVar, Bundle bundle) {
            super(1);
            this.f83320c = j0Var;
            this.f83321d = list;
            this.f83322e = l0Var;
            this.f83323f = nVar;
            this.f83324g = bundle;
        }

        public final void a(p011ja.k entry) {
            List<p011ja.k> listM;
            s.k(entry, "entry");
            this.f83320c.f86523a = true;
            int iIndexOf = this.f83321d.indexOf(entry);
            if (iIndexOf != -1) {
                int i11 = iIndexOf + 1;
                listM = this.f83321d.subList(this.f83322e.f86527a, i11);
                this.f83322e.f86527a = i11;
            } else {
                listM = v.m();
            }
            this.f83323f.p(entry.getDestination(), this.f83324g, entry, listM);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(p011ja.k kVar) {
            a(kVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lja/z;", "Ljn0/h0;", "a", "(Lja/z;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends u implements wn0.l<z, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r f83325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n f83326d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lja/b;", "Ljn0/h0;", "a", "(Lja/b;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements wn0.l<p011ja.b, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f83327c = new a();

            a() {
                super(1);
            }

            public final void a(p011ja.b anim) {
                s.k(anim, "$this$anim");
                anim.e(0);
                anim.f(0);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(p011ja.b bVar) {
                a(bVar);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lja/g0;", "Ljn0/h0;", "a", "(Lja/g0;)V"}, k = 3, mv = {1, 8, 0})
        static final class b extends u implements wn0.l<g0, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final b f83328c = new b();

            b() {
                super(1);
            }

            public final void a(g0 popUpTo) {
                s.k(popUpTo, "$this$popUpTo");
                popUpTo.d(true);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(g0 g0Var) {
                a(g0Var);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(r rVar, n nVar) {
            super(1);
            this.f83325c = rVar;
            this.f83326d = nVar;
        }

        public final void a(z navOptions) {
            s.k(navOptions, "$this$navOptions");
            navOptions.a(a.f83327c);
            r rVar = this.f83325c;
            if (rVar instanceof t) {
                ho0.i<r> iVarC = r.INSTANCE.c(rVar);
                n nVar = this.f83326d;
                for (r rVar2 : iVarC) {
                    r rVarF = nVar.F();
                    if (s.f(rVar2, rVarF != null ? rVarF.getParent() : null)) {
                        return;
                    }
                }
                if (n.I) {
                    navOptions.c(t.INSTANCE.b(this.f83326d.H()).getId(), b.f83328c);
                }
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(z zVar) {
            a(zVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/r;", "it", "", "a", "(Lja/r;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class m extends u implements wn0.l<r, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f83329c = new m();

        m() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(r it) {
            s.k(it, "it");
            return Integer.valueOf(it.getId());
        }
    }

    /* JADX INFO: renamed from: ja.n$n, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lja/x;", "b", "()Lja/x;"}, k = 3, mv = {1, 8, 0})
    static final class C1753n extends u implements a<x> {
        C1753n() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x invoke() {
            x xVar = n.this.inflater;
            return xVar == null ? new x(n.this.getContext(), n.this._navigatorProvider) : xVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/k;", "it", "Ljn0/h0;", "a", "(Lja/k;)V"}, k = 3, mv = {1, 8, 0})
    static final class o extends u implements wn0.l<p011ja.k, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j0 f83331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n f83332d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ r f83333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Bundle f83334f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(j0 j0Var, n nVar, r rVar, Bundle bundle) {
            super(1);
            this.f83331c = j0Var;
            this.f83332d = nVar;
            this.f83333e = rVar;
            this.f83334f = bundle;
        }

        public final void a(p011ja.k it) {
            s.k(it, "it");
            this.f83331c.f86523a = true;
            n.q(this.f83332d, this.f83333e, this.f83334f, it, null, 8, null);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(p011ja.k kVar) {
            a(kVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ja/n$p", "Landroidx/activity/b0;", "Ljn0/h0;", "handleOnBackPressed", "()V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class p extends b0 {
        p() {
            super(false);
        }

        @Override // androidx.p002activity.b0
        public void handleOnBackPressed() {
            n.this.Y();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class q extends u implements wn0.l<String, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83336c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str) {
            super(1);
            this.f83336c = str;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(s.f(str, this.f83336c));
        }
    }

    public n(Context context) {
        s.k(context, "context");
        this.context = context;
        for (Object obj : ho0.l.q(context, d.f83309c)) {
            if (((Context) obj) instanceof Activity) {
                this.activity = (Activity) obj;
                this.backQueue = new p013kotlin.collections.m<>();
                MutableStateFlow<List<p011ja.k>> MutableStateFlow = StateFlowKt.MutableStateFlow(v.m());
                this._currentBackStack = MutableStateFlow;
                this.currentBackStack = FlowKt.asStateFlow(MutableStateFlow);
                MutableStateFlow<List<p011ja.k>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(v.m());
                this._visibleEntries = MutableStateFlow2;
                this.visibleEntries = FlowKt.asStateFlow(MutableStateFlow2);
                this.childToParentEntries = new LinkedHashMap();
                this.parentToChildCount = new LinkedHashMap();
                this.backStackMap = new LinkedHashMap();
                this.backStackStates = new LinkedHashMap();
                this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
                this.hostLifecycleState = Lifecycle.State.INITIALIZED;
                this.lifecycleObserver = new androidx.p003lifecycle.u() { // from class: ja.m
                    @Override // androidx.p003lifecycle.u
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
                        n.Q(this.f83277a, lifecycleOwner, aVar);
                    }
                };
                this.onBackPressedCallback = new p();
                this.enableOnBackPressedCallback = true;
                this._navigatorProvider = new e0();
                this.navigatorState = new LinkedHashMap();
                this.entrySavedState = new LinkedHashMap();
                e0 e0Var = this._navigatorProvider;
                e0Var.b(new v(e0Var));
                this._navigatorProvider.b(new a(this.context));
                this.backStackEntriesToDispatch = new ArrayList();
                this.navInflater = jn0.m.b(new C1753n());
                MutableSharedFlow<p011ja.k> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
                this._currentBackStackEntryFlow = mutableSharedFlowMutableSharedFlow$default;
                this.currentBackStackEntryFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
            }
        }
        obj = null;
        this.activity = (Activity) obj;
        this.backQueue = new p013kotlin.collections.m<>();
        MutableStateFlow<List<p011ja.k>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(v.m());
        this._currentBackStack = MutableStateFlow3;
        this.currentBackStack = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<List<p011ja.k>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(v.m());
        this._visibleEntries = MutableStateFlow4;
        this.visibleEntries = FlowKt.asStateFlow(MutableStateFlow4);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new CopyOnWriteArrayList<>();
        this.hostLifecycleState = Lifecycle.State.INITIALIZED;
        this.lifecycleObserver = new androidx.p003lifecycle.u() { // from class: ja.m
            @Override // androidx.p003lifecycle.u
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
                n.Q(this.f83277a, lifecycleOwner, aVar);
            }
        };
        this.onBackPressedCallback = new p();
        this.enableOnBackPressedCallback = true;
        this._navigatorProvider = new e0();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        e0 e0Var2 = this._navigatorProvider;
        e0Var2.b(new v(e0Var2));
        this._navigatorProvider.b(new a(this.context));
        this.backStackEntriesToDispatch = new ArrayList();
        this.navInflater = jn0.m.b(new C1753n());
        MutableSharedFlow<p011ja.k> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this._currentBackStackEntryFlow = mutableSharedFlowMutableSharedFlow$default2;
        this.currentBackStackEntryFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    private final int G() {
        p013kotlin.collections.m<p011ja.k> mVar = this.backQueue;
        int i11 = 0;
        if (mVar != null && mVar.isEmpty()) {
            return 0;
        }
        Iterator<p011ja.k> it = mVar.iterator();
        while (it.hasNext()) {
            if (!(it.next().getDestination() instanceof t) && (i11 = i11 + 1) < 0) {
                v.w();
            }
        }
        return i11;
    }

    private final t L(p013kotlin.collections.m<p011ja.k> mVar) {
        r destination;
        p011ja.k kVarM = mVar.m();
        if (kVarM == null || (destination = kVarM.getDestination()) == null) {
            destination = this._graph;
            s.h(destination);
        }
        if (destination instanceof t) {
            return (t) destination;
        }
        t parent = destination.getParent();
        s.h(parent);
        return parent;
    }

    private final List<p011ja.k> O(p013kotlin.collections.m<p011ja.l> backStackState) {
        r rVarH;
        ArrayList arrayList = new ArrayList();
        p011ja.k kVarM = this.backQueue.m();
        if (kVarM == null || (rVarH = kVarM.getDestination()) == null) {
            rVarH = H();
        }
        if (backStackState != null) {
            for (p011ja.l lVar : backStackState) {
                r rVarX = x(rVarH, lVar.getDestinationId(), true);
                if (rVarX == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + r.INSTANCE.b(this.context, lVar.getDestinationId()) + " cannot be found from the current destination " + rVarH).toString());
                }
                arrayList.add(lVar.b(this.context, rVarX, I(), this.viewModel));
                rVarH = rVarX;
            }
        }
        return arrayList;
    }

    private final boolean P(r node, Bundle args) {
        int iNextIndex;
        r destination;
        p011ja.k kVarD = D();
        p013kotlin.collections.m<p011ja.k> mVar = this.backQueue;
        ListIterator<p011ja.k> listIterator = mVar.listIterator(mVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (listIterator.previous().getDestination() == node) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        if (node instanceof t) {
            List listC0 = ho0.l.c0(ho0.l.U(t.INSTANCE.a((t) node), m.f83329c));
            if (this.backQueue.size() - iNextIndex != listC0.size()) {
                return false;
            }
            p013kotlin.collections.m<p011ja.k> mVar2 = this.backQueue;
            List<p011ja.k> listSubList = mVar2.subList(iNextIndex, mVar2.size());
            ArrayList arrayList = new ArrayList(v.y(listSubList, 10));
            Iterator<T> it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((p011ja.k) it.next()).getDestination().getId()));
            }
            if (!s.f(arrayList, listC0)) {
                return false;
            }
        } else if (kVarD == null || (destination = kVarD.getDestination()) == null || node.getId() != destination.getId()) {
            return false;
        }
        p013kotlin.collections.m<p011ja.k> mVar3 = new p013kotlin.collections.m();
        while (v.o(this.backQueue) >= iNextIndex) {
            p011ja.k kVar = (p011ja.k) v.O(this.backQueue);
            s0(kVar);
            mVar3.addFirst(new p011ja.k(kVar, kVar.getDestination().h(args)));
        }
        for (p011ja.k kVar2 : mVar3) {
            t parent = kVar2.getDestination().getParent();
            if (parent != null) {
                R(kVar2, A(parent.getId()));
            }
            this.backQueue.add(kVar2);
        }
        for (p011ja.k kVar3 : mVar3) {
            this._navigatorProvider.e(kVar3.getDestination().getNavigatorName()).g(kVar3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(n this$0, LifecycleOwner lifecycleOwner, Lifecycle.a event) {
        s.k(this$0, "this$0");
        s.k(lifecycleOwner, "<anonymous parameter 0>");
        s.k(event, "event");
        this$0.hostLifecycleState = event.getTargetState();
        if (this$0._graph != null) {
            Iterator<p011ja.k> it = this$0.backQueue.iterator();
            while (it.hasNext()) {
                it.next().i(event);
            }
        }
    }

    private final void R(p011ja.k child, p011ja.k parent) {
        this.childToParentEntries.put(child, parent);
        if (this.parentToChildCount.get(parent) == null) {
            this.parentToChildCount.put(parent, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(parent);
        s.h(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0098  */
    private final void S(r node, Bundle args, y navOptions, d0.a navigatorExtras) {
        boolean z11;
        boolean z12;
        boolean zD0;
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).l(true);
        }
        j0 j0Var = new j0();
        if (navOptions == null) {
            z11 = false;
        } else {
            if (navOptions.getPopUpToRoute() != null) {
                String popUpToRoute = navOptions.getPopUpToRoute();
                s.h(popUpToRoute);
                zD0 = f0(popUpToRoute, navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.g() != null) {
                co0.d<?> dVarG = navOptions.g();
                s.h(dVarG);
                zD0 = d0(la.c.b(r.a(dVarG)), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.getPopUpToRouteObject() != null) {
                Object popUpToRouteObject = navOptions.getPopUpToRouteObject();
                s.h(popUpToRouteObject);
                zD0 = e0(popUpToRouteObject, navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.getPopUpToId() != -1) {
                zD0 = d0(navOptions.getPopUpToId(), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else {
                z11 = false;
            }
            z11 = zD0;
        }
        Bundle bundleH = node.h(args);
        if (navOptions != null && navOptions.getRestoreState() && this.backStackMap.containsKey(Integer.valueOf(node.getId()))) {
            j0Var.f86523a = m0(node.getId(), bundleH, navOptions, navigatorExtras);
            z12 = false;
        } else {
            z12 = navOptions != null && navOptions.getSingleTop() && P(node, args);
            if (!z12) {
                W(this._navigatorProvider.e(node.getNavigatorName()), v.e(p011ja.k.Companion.b(p011ja.k.INSTANCE, this.context, node, bundleH, I(), this.viewModel, null, null, 96, null)), navOptions, navigatorExtras, new o(j0Var, this, node, bundleH));
            }
        }
        u0();
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).l(false);
        }
        if (z11 || j0Var.f86523a || z12) {
            t();
        } else {
            t0();
        }
    }

    public static /* synthetic */ void V(n nVar, String str, y yVar, d0.a aVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i11 & 2) != 0) {
            yVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar = null;
        }
        nVar.T(str, yVar, aVar);
    }

    private final void W(d0<? extends r> d0Var, List<p011ja.k> list, y yVar, d0.a aVar, wn0.l<? super p011ja.k, h0> lVar) {
        this.addToBackStackHandler = lVar;
        d0Var.e(list, yVar, aVar);
        this.addToBackStackHandler = null;
    }

    private final void X(Bundle startDestinationArgs) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle = this.navigatorStateToRestore;
        if (bundle != null && (stringArrayList = bundle.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String name : stringArrayList) {
                e0 e0Var = this._navigatorProvider;
                s.j(name, "name");
                d0 d0VarE = e0Var.e(name);
                Bundle bundle2 = bundle.getBundle(name);
                if (bundle2 != null) {
                    d0VarE.h(bundle2);
                }
            }
        }
        Parcelable[] parcelableArr = this.backStackToRestore;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                s.i(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                p011ja.l lVar = (p011ja.l) parcelable;
                r rVarW = w(lVar.getDestinationId());
                if (rVarW == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + r.INSTANCE.b(this.context, lVar.getDestinationId()) + " cannot be found from the current destination " + F());
                }
                p011ja.k kVarB = lVar.b(this.context, rVarW, I(), this.viewModel);
                d0<? extends r> d0VarE2 = this._navigatorProvider.e(rVarW.getNavigatorName());
                Map<d0<? extends r>, b> map = this.navigatorState;
                b bVar = map.get(d0VarE2);
                if (bVar == null) {
                    bVar = new b(this, d0VarE2);
                    map.put(d0VarE2, bVar);
                }
                this.backQueue.add(kVarB);
                bVar.n(kVarB);
                t parent = kVarB.getDestination().getParent();
                if (parent != null) {
                    R(kVarB, A(parent.getId()));
                }
            }
            u0();
            this.backStackToRestore = null;
        }
        Collection<d0<? extends r>> collectionValues = this._navigatorProvider.f().values();
        ArrayList<d0<? extends r>> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((d0) obj).getIsAttached()) {
                arrayList.add(obj);
            }
        }
        for (d0<? extends r> d0Var : arrayList) {
            Map<d0<? extends r>, b> map2 = this.navigatorState;
            b bVar2 = map2.get(d0Var);
            if (bVar2 == null) {
                bVar2 = new b(this, d0Var);
                map2.put(d0Var, bVar2);
            }
            d0Var.f(bVar2);
        }
        if (this._graph == null || !this.backQueue.isEmpty()) {
            t();
            return;
        }
        if (!this.deepLinkHandled && (activity = this.activity) != null) {
            s.h(activity);
            if (N(activity.getIntent())) {
                return;
            }
        }
        t tVar = this._graph;
        s.h(tVar);
        S(tVar, startDestinationArgs, null, null);
    }

    private final void c0(d0<? extends r> d0Var, p011ja.k kVar, boolean z11, wn0.l<? super p011ja.k, h0> lVar) {
        this.popFromBackStackHandler = lVar;
        d0Var.j(kVar, z11);
        this.popFromBackStackHandler = null;
    }

    private final boolean d0(int destinationId, boolean inclusive, boolean saveState) {
        r destination;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = v.R0(this.backQueue).iterator();
        do {
            if (!it.hasNext()) {
                destination = null;
                break;
            }
            destination = ((p011ja.k) it.next()).getDestination();
            d0 d0VarE = this._navigatorProvider.e(destination.getNavigatorName());
            if (inclusive || destination.getId() != destinationId) {
                arrayList.add(d0VarE);
            }
        } while (destination.getId() != destinationId);
        if (destination != null) {
            return u(arrayList, destination, inclusive, saveState);
        }
        Log.i("NavController", "Ignoring popBackStack to destination " + r.INSTANCE.b(this.context, destinationId) + " as it was not found on the current back stack");
        return false;
    }

    private final <T> boolean e0(T route, boolean inclusive, boolean saveState) {
        return f0(z(route), inclusive, saveState);
    }

    private final boolean f0(String route, boolean inclusive, boolean saveState) {
        p011ja.k kVarPrevious;
        boolean zR;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        p013kotlin.collections.m<p011ja.k> mVar = this.backQueue;
        ListIterator<p011ja.k> listIterator = mVar.listIterator(mVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                kVarPrevious = null;
                break;
            }
            kVarPrevious = listIterator.previous();
            p011ja.k kVar = kVarPrevious;
            zR = kVar.getDestination().r(route, kVar.c());
            if (inclusive || !zR) {
                arrayList.add(this._navigatorProvider.e(kVar.getDestination().getNavigatorName()));
            }
        } while (!zR);
        p011ja.k kVar2 = kVarPrevious;
        r destination = kVar2 != null ? kVar2.getDestination() : null;
        if (destination != null) {
            return u(arrayList, destination, inclusive, saveState);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
        return false;
    }

    static /* synthetic */ boolean g0(n nVar, int i11, boolean z11, boolean z12, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i12 & 4) != 0) {
            z12 = false;
        }
        return nVar.d0(i11, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0(p011ja.k popUpTo, boolean saveState, p013kotlin.collections.m<p011ja.l> savedState) {
        p011ja.o oVar;
        StateFlow<Set<p011ja.k>> stateFlowC;
        Set<p011ja.k> value;
        p011ja.k kVarLast = this.backQueue.last();
        if (!s.f(kVarLast, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.getDestination() + ", which is not the top of the back stack (" + kVarLast.getDestination() + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        v.O(this.backQueue);
        b bVar = this.navigatorState.get(get_navigatorProvider().e(kVarLast.getDestination().getNavigatorName()));
        boolean z11 = true;
        if ((bVar == null || (stateFlowC = bVar.c()) == null || (value = stateFlowC.getValue()) == null || !value.contains(kVarLast)) && !this.parentToChildCount.containsKey(kVarLast)) {
            z11 = false;
        }
        Lifecycle.State state = kVarLast.getLifecycle().getState();
        Lifecycle.State state2 = Lifecycle.State.CREATED;
        if (state.isAtLeast(state2)) {
            if (saveState) {
                kVarLast.l(state2);
                savedState.addFirst(new p011ja.l(kVarLast));
            }
            if (z11) {
                kVarLast.l(state2);
            } else {
                kVarLast.l(Lifecycle.State.DESTROYED);
                s0(kVarLast);
            }
        }
        if (saveState || z11 || (oVar = this.viewModel) == null) {
            return;
        }
        oVar.g(kVarLast.getId());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void i0(n nVar, p011ja.k kVar, boolean z11, p013kotlin.collections.m mVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            mVar = new p013kotlin.collections.m();
        }
        nVar.h0(kVar, z11, mVar);
    }

    private final boolean m0(int id2, Bundle args, y navOptions, d0.a navigatorExtras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(id2))) {
            return false;
        }
        String str = this.backStackMap.get(Integer.valueOf(id2));
        v.J(this.backStackMap.values(), new q(str));
        return v(O((p013kotlin.collections.m) u0.d(this.backStackStates).remove(str)), args, navOptions, navigatorExtras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(r node, Bundle finalArgs, p011ja.k backStackEntry, List<p011ja.k> restoredEntries) {
        Bundle bundle;
        p013kotlin.collections.m<p011ja.k> mVar;
        r destination;
        List<p011ja.k> list;
        t tVar;
        p011ja.k kVarPrevious;
        p011ja.k kVarPrevious2;
        List<p011ja.k> list2 = restoredEntries;
        r destination2 = backStackEntry.getDestination();
        if (!(destination2 instanceof p011ja.d)) {
            while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof p011ja.d) && g0(this, this.backQueue.last().getDestination().getId(), true, false, 4, null)) {
            }
        }
        p013kotlin.collections.m mVar2 = new p013kotlin.collections.m();
        p011ja.k kVar = null;
        if (node instanceof t) {
            r rVar = destination2;
            while (true) {
                s.h(rVar);
                t parent = rVar.getParent();
                if (parent != null) {
                    ListIterator<p011ja.k> listIterator = list2.listIterator(list2.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            kVarPrevious2 = null;
                            break;
                        }
                        kVarPrevious2 = listIterator.previous();
                    } while (!s.f(kVarPrevious2.getDestination(), parent));
                    p011ja.k kVarB = kVarPrevious2;
                    if (kVarB == null) {
                        bundle = finalArgs;
                        destination = destination2;
                        kVarB = p011ja.k.Companion.b(p011ja.k.INSTANCE, this.context, parent, bundle, I(), this.viewModel, null, null, 96, null);
                    } else {
                        bundle = finalArgs;
                        destination = destination2;
                    }
                    mVar2.addFirst(kVarB);
                    if (this.backQueue.isEmpty() || this.backQueue.last().getDestination() != parent) {
                        list = restoredEntries;
                        mVar = mVar2;
                    } else {
                        list = restoredEntries;
                        mVar = mVar2;
                        i0(this, this.backQueue.last(), false, null, 6, null);
                    }
                } else {
                    bundle = finalArgs;
                    mVar = mVar2;
                    destination = destination2;
                    list = list2;
                }
                if (parent == null || parent == node) {
                    break;
                }
                list2 = list;
                rVar = parent;
                mVar2 = mVar;
                destination2 = destination;
            }
        } else {
            bundle = finalArgs;
            mVar = mVar2;
            destination = destination2;
            list = list2;
            backStackEntry = backStackEntry;
        }
        r destination3 = mVar.isEmpty() ? destination : ((p011ja.k) mVar.first()).getDestination();
        while (destination3 != null && w(destination3.getId()) != destination3) {
            t parent2 = destination3.getParent();
            if (parent2 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator<p011ja.k> listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        kVarPrevious = null;
                        break;
                    }
                    kVarPrevious = listIterator2.previous();
                } while (!s.f(kVarPrevious.getDestination(), parent2));
                p011ja.k kVarB2 = kVarPrevious;
                if (kVarB2 == null) {
                    tVar = parent2;
                    kVarB2 = p011ja.k.Companion.b(p011ja.k.INSTANCE, this.context, tVar, parent2.h(bundle2), I(), this.viewModel, null, null, 96, null);
                } else {
                    tVar = parent2;
                }
                mVar.addFirst(kVarB2);
            } else {
                tVar = parent2;
            }
            destination3 = tVar;
        }
        if (!mVar.isEmpty()) {
            destination = ((p011ja.k) mVar.first()).getDestination();
        }
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof t)) {
            r destination4 = this.backQueue.last().getDestination();
            s.i(destination4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((t) destination4).G().e(destination.getId()) != null) {
                break;
            } else {
                i0(this, this.backQueue.last(), false, null, 6, null);
            }
        }
        p011ja.k kVarK = this.backQueue.k();
        if (kVarK == null) {
            kVarK = (p011ja.k) mVar.k();
        }
        if (!s.f(kVarK != null ? kVarK.getDestination() : null, this._graph)) {
            ListIterator<p011ja.k> listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                p011ja.k kVarPrevious3 = listIterator3.previous();
                r destination5 = kVarPrevious3.getDestination();
                t tVar2 = this._graph;
                s.h(tVar2);
                if (s.f(destination5, tVar2)) {
                    kVar = kVarPrevious3;
                    break;
                }
            }
            p011ja.k kVarB3 = kVar;
            if (kVarB3 == null) {
                p011ja.k.Companion companion = p011ja.k.INSTANCE;
                Context context = this.context;
                t tVar3 = this._graph;
                s.h(tVar3);
                t tVar4 = this._graph;
                s.h(tVar4);
                kVarB3 = p011ja.k.Companion.b(companion, context, tVar3, tVar4.h(bundle), I(), this.viewModel, null, null, 96, null);
            }
            mVar.addFirst(kVarB3);
        }
        for (p011ja.k kVar2 : mVar) {
            b bVar = this.navigatorState.get(this._navigatorProvider.e(kVar2.getDestination().getNavigatorName()));
            if (bVar == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + node.getNavigatorName() + " should already be created").toString());
            }
            bVar.n(kVar2);
        }
        this.backQueue.addAll(mVar);
        this.backQueue.add(backStackEntry);
        for (p011ja.k kVar3 : v.Q0(mVar, backStackEntry)) {
            t parent3 = kVar3.getDestination().getParent();
            if (parent3 != null) {
                R(kVar3, A(parent3.getId()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void q(n nVar, r rVar, Bundle bundle, p011ja.k kVar, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i11 & 8) != 0) {
            list = v.m();
        }
        nVar.p(rVar, bundle, kVar, list);
    }

    private final boolean s(int destinationId) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).l(true);
        }
        boolean zM0 = m0(destinationId, null, Function1.a(e.f83310c), null);
        Iterator<T> it2 = this.navigatorState.values().iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).l(false);
        }
        return zM0 && d0(destinationId, true, false);
    }

    private final boolean t() {
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof t)) {
            i0(this, this.backQueue.last(), false, null, 6, null);
        }
        p011ja.k kVarM = this.backQueue.m();
        if (kVarM != null) {
            this.backStackEntriesToDispatch.add(kVarM);
        }
        this.dispatchReentrantCount++;
        t0();
        int i11 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i11;
        if (i11 == 0) {
            List<p011ja.k> listP1 = v.p1(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (p011ja.k kVar : listP1) {
                Iterator<c> it = this.onDestinationChangedListeners.iterator();
                while (it.hasNext()) {
                    it.next().a(this, kVar.getDestination(), kVar.c());
                }
                this._currentBackStackEntryFlow.tryEmit(kVar);
            }
            this._currentBackStack.tryEmit(v.p1(this.backQueue));
            this._visibleEntries.tryEmit(j0());
        }
        return kVarM != null;
    }

    private final boolean u(List<? extends d0<?>> popOperations, r foundDestination, boolean inclusive, boolean saveState) {
        n nVar;
        boolean z11;
        j0 j0Var = new j0();
        p013kotlin.collections.m<p011ja.l> mVar = new p013kotlin.collections.m<>();
        Iterator<? extends d0<?>> it = popOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                nVar = this;
                z11 = saveState;
                break;
            }
            d0<? extends r> d0Var = (d0) it.next();
            j0 j0Var2 = new j0();
            nVar = this;
            z11 = saveState;
            c0(d0Var, this.backQueue.last(), z11, new f(j0Var2, j0Var, nVar, z11, mVar));
            if (!j0Var2.f86523a) {
                break;
            }
            saveState = z11;
        }
        if (z11) {
            if (!inclusive) {
                for (r rVar : ho0.l.a0(ho0.l.q(foundDestination, g.f83316c), new h())) {
                    Map<Integer, String> map = nVar.backStackMap;
                    Integer numValueOf = Integer.valueOf(rVar.getId());
                    p011ja.l lVarK = mVar.k();
                    map.put(numValueOf, lVarK != null ? lVarK.getId() : null);
                }
            }
            if (!mVar.isEmpty()) {
                p011ja.l lVarFirst = mVar.first();
                Iterator it2 = ho0.l.a0(ho0.l.q(w(lVarFirst.getDestinationId()), i.f83318c), new j()).iterator();
                while (it2.hasNext()) {
                    nVar.backStackMap.put(Integer.valueOf(((r) it2.next()).getId()), lVarFirst.getId());
                }
                if (nVar.backStackMap.values().contains(lVarFirst.getId())) {
                    nVar.backStackStates.put(lVarFirst.getId(), mVar);
                }
            }
        }
        u0();
        return j0Var.f86523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    private final void u0() {
        boolean z11;
        b0 b0Var = this.onBackPressedCallback;
        if (this.enableOnBackPressedCallback) {
            z11 = G() > 1;
        }
        b0Var.setEnabled(z11);
    }

    private final boolean v(List<p011ja.k> entries, Bundle args, y navOptions, d0.a navigatorExtras) {
        p011ja.k kVar;
        r destination;
        ArrayList<List<p011ja.k>> arrayList = new ArrayList();
        ArrayList<p011ja.k> arrayList2 = new ArrayList();
        for (Object obj : entries) {
            if (!(((p011ja.k) obj).getDestination() instanceof t)) {
                arrayList2.add(obj);
            }
        }
        for (p011ja.k kVar2 : arrayList2) {
            List list = (List) v.C0(arrayList);
            if (s.f((list == null || (kVar = (p011ja.k) v.A0(list)) == null || (destination = kVar.getDestination()) == null) ? null : destination.getNavigatorName(), kVar2.getDestination().getNavigatorName())) {
                list.add(kVar2);
            } else {
                arrayList.add(v.s(kVar2));
            }
        }
        j0 j0Var = new j0();
        for (List<p011ja.k> list2 : arrayList) {
            W(this._navigatorProvider.e(((p011ja.k) v.o0(list2)).getDestination().getNavigatorName()), list2, navOptions, navigatorExtras, new k(j0Var, entries, new l0(), this, args));
        }
        return j0Var.f86523a;
    }

    private final String y(int[] deepLink) {
        t tVar;
        t tVar2 = this._graph;
        int length = deepLink.length;
        int i11 = 0;
        while (true) {
            r rVarC = null;
            if (i11 >= length) {
                return null;
            }
            int i12 = deepLink[i11];
            if (i11 == 0) {
                t tVar3 = this._graph;
                s.h(tVar3);
                if (tVar3.getId() == i12) {
                    rVarC = this._graph;
                }
            } else {
                s.h(tVar2);
                rVarC = tVar2.C(i12);
            }
            if (rVarC == null) {
                return r.INSTANCE.b(this.context, i12);
            }
            if (i11 != deepLink.length - 1 && (rVarC instanceof t)) {
                while (true) {
                    tVar = (t) rVarC;
                    s.h(tVar);
                    if (!(tVar.C(tVar.getStartDestId()) instanceof t)) {
                        break;
                    }
                    rVarC = tVar.C(tVar.getStartDestId());
                }
                tVar2 = tVar;
            }
            i11++;
        }
    }

    private final <T> String z(T route) {
        r rVarX = x(H(), la.c.b(r.a(o0.b(route.getClass()))), true);
        if (rVarX == null) {
            throw new IllegalArgumentException(("Destination with route " + o0.b(route.getClass()).l() + " cannot be found in navigation graph " + this._graph).toString());
        }
        Map<String, p011ja.h> mapK = rVarX.k();
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(mapK.size()));
        Iterator<T> it = mapK.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((p011ja.h) entry.getValue()).a());
        }
        return la.c.c(route, linkedHashMap);
    }

    public p011ja.k A(int destinationId) {
        p011ja.k kVarPrevious;
        p013kotlin.collections.m<p011ja.k> mVar = this.backQueue;
        ListIterator<p011ja.k> listIterator = mVar.listIterator(mVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                kVarPrevious = null;
                break;
            }
            kVarPrevious = listIterator.previous();
        } while (kVarPrevious.getDestination().getId() != destinationId);
        p011ja.k kVar = kVarPrevious;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalArgumentException(("No destination with ID " + destinationId + " is on the NavController's back stack. The current destination is " + F()).toString());
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final StateFlow<List<p011ja.k>> C() {
        return this.currentBackStack;
    }

    public p011ja.k D() {
        return this.backQueue.m();
    }

    public final Flow<p011ja.k> E() {
        return this.currentBackStackEntryFlow;
    }

    public r F() {
        p011ja.k kVarD = D();
        if (kVarD != null) {
            return kVarD.getDestination();
        }
        return null;
    }

    public t H() {
        t tVar = this._graph;
        if (tVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        s.i(tVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return tVar;
    }

    public final Lifecycle.State I() {
        return this.lifecycleOwner == null ? Lifecycle.State.CREATED : this.hostLifecycleState;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public e0 get_navigatorProvider() {
        return this._navigatorProvider;
    }

    public p011ja.k K() {
        Object next;
        Iterator it = v.R0(this.backQueue).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ho0.l.h(it).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((p011ja.k) next).getDestination() instanceof t)) {
                return (p011ja.k) next;
            }
        }
        next = null;
        return (p011ja.k) next;
    }

    public final StateFlow<List<p011ja.k>> M() {
        return this.visibleEntries;
    }

    public boolean N(Intent intent) {
        int[] intArray;
        t tVarL;
        r.b bVarK;
        r rVarC;
        t tVar;
        Bundle bundle;
        int i11 = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
            } catch (Exception e11) {
                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e11);
                intArray = null;
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if ((intArray == null || intArray.length == 0) && (bVarK = (tVarL = L(this.backQueue)).K(new p011ja.q(intent), true, true, tVarL)) != null) {
            r destination = bVarK.getDestination();
            int[] iArrJ = r.j(destination, null, 1, null);
            Bundle bundleH = destination.h(bVarK.getMatchingArgs());
            if (bundleH != null) {
                bundle2.putAll(bundleH);
            }
            intArray = iArrJ;
            parcelableArrayList = null;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strY = y(intArray);
        if (strY != null) {
            Log.i("NavController", "Could not find destination " + strY + " in the navigation graph, ignoring the deep link from " + intent);
            return false;
        }
        bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i12 = 0; i12 < length; i12++) {
            Bundle bundle4 = new Bundle();
            bundle4.putAll(bundle2);
            if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i12)) != null) {
                bundle4.putAll(bundle);
            }
            bundleArr[i12] = bundle4;
        }
        int flags = intent.getFlags();
        int i13 = 268435456 & flags;
        if (i13 != 0 && (flags & 32768) == 0) {
            intent.addFlags(32768);
            TaskStackBuilder taskStackBuilderB = TaskStackBuilder.f(this.context).b(intent);
            s.j(taskStackBuilderB, "create(context).addNextI…ntWithParentStack(intent)");
            taskStackBuilderB.g();
            Activity activity = this.activity;
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            return true;
        }
        if (i13 != 0) {
            if (!this.backQueue.isEmpty()) {
                t tVar2 = this._graph;
                s.h(tVar2);
                g0(this, tVar2.getId(), true, false, 4, null);
            }
            while (i11 < intArray.length) {
                int i14 = intArray[i11];
                int i15 = i11 + 1;
                Bundle bundle5 = bundleArr[i11];
                r rVarW = w(i14);
                if (rVarW == null) {
                    throw new IllegalStateException("Deep Linking failed: destination " + r.INSTANCE.b(this.context, i14) + " cannot be found from the current destination " + F());
                }
                S(rVarW, bundle5, Function1.a(new l(rVarW, this)), null);
                i11 = i15;
            }
            this.deepLinkHandled = true;
            return true;
        }
        t tVar3 = this._graph;
        int length2 = intArray.length;
        for (int i16 = 0; i16 < length2; i16++) {
            int i17 = intArray[i16];
            Bundle bundle6 = bundleArr[i16];
            if (i16 == 0) {
                rVarC = this._graph;
            } else {
                s.h(tVar3);
                rVarC = tVar3.C(i17);
            }
            if (rVarC == null) {
                throw new IllegalStateException("Deep Linking failed: destination " + r.INSTANCE.b(this.context, i17) + " cannot be found in graph " + tVar3);
            }
            if (i16 == intArray.length - 1) {
                y.a aVar = new y.a();
                t tVar4 = this._graph;
                s.h(tVar4);
                S(rVarC, bundle6, y.a.k(aVar, tVar4.getId(), true, false, 4, null).b(0).c(0).a(), null);
            } else if (rVarC instanceof t) {
                while (true) {
                    tVar = (t) rVarC;
                    s.h(tVar);
                    if (!(tVar.C(tVar.getStartDestId()) instanceof t)) {
                        break;
                    }
                    rVarC = tVar.C(tVar.getStartDestId());
                }
                tVar3 = tVar;
            }
        }
        this.deepLinkHandled = true;
        return true;
    }

    public final void T(String route, y navOptions, d0.a navigatorExtras) {
        s.k(route, "route");
        if (this._graph == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + CoreConstants.DOT).toString());
        }
        t tVarL = L(this.backQueue);
        r.b bVarL = tVarL.L(route, true, true, tVarL);
        if (bVarL == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + route + " cannot be found in the navigation graph " + this._graph);
        }
        r destination = bVarL.getDestination();
        Bundle bundleH = destination.h(bVarL.getMatchingArgs());
        if (bundleH == null) {
            bundleH = new Bundle();
        }
        r destination2 = bVarL.getDestination();
        Intent intent = new Intent();
        Uri uri = Uri.parse(r.INSTANCE.a(destination.getRoute()));
        s.g(uri, "Uri.parse(this)");
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleH.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        S(destination2, bundleH, navOptions, navigatorExtras);
    }

    public final void U(String route, wn0.l<? super z, h0> builder) {
        s.k(route, "route");
        s.k(builder, "builder");
        V(this, route, Function1.a(builder), null, 4, null);
    }

    public boolean Y() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        r rVarF = F();
        s.h(rVarF);
        return Z(rVarF.getId(), true);
    }

    public boolean Z(int destinationId, boolean inclusive) {
        return a0(destinationId, inclusive, false);
    }

    public boolean a0(int destinationId, boolean inclusive, boolean saveState) {
        return d0(destinationId, inclusive, saveState) && t();
    }

    public final void b0(p011ja.k popUpTo, a<h0> onComplete) {
        s.k(popUpTo, "popUpTo");
        s.k(onComplete, "onComplete");
        int iIndexOf = this.backQueue.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i11 = iIndexOf + 1;
        if (i11 != this.backQueue.size()) {
            d0(this.backQueue.get(i11).getDestination().getId(), true, false);
        }
        i0(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        u0();
        t();
    }

    public final List<p011ja.k> j0() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Set<p011ja.k> value = ((b) it.next()).c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                p011ja.k kVar = (p011ja.k) obj;
                if (!arrayList.contains(kVar) && !kVar.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            v.E(arrayList, arrayList2);
        }
        p013kotlin.collections.m<p011ja.k> mVar = this.backQueue;
        ArrayList arrayList3 = new ArrayList();
        for (p011ja.k kVar2 : mVar) {
            p011ja.k kVar3 = kVar2;
            if (!arrayList.contains(kVar3) && kVar3.getMaxLifecycle().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(kVar2);
            }
        }
        v.E(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((p011ja.k) obj2).getDestination() instanceof t)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public void k0(c listener) {
        s.k(listener, "listener");
        this.onDestinationChangedListeners.remove(listener);
    }

    public void l0(Bundle navState) {
        if (navState == null) {
            return;
        }
        navState.setClassLoader(this.context.getClassLoader());
        this.navigatorStateToRestore = navState.getBundle("android-support-nav:controller:navigatorState");
        this.backStackToRestore = navState.getParcelableArray("android-support-nav:controller:backStack");
        this.backStackStates.clear();
        int[] intArray = navState.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = navState.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                this.backStackMap.put(Integer.valueOf(intArray[i11]), stringArrayList.get(i12));
                i11++;
                i12++;
            }
        }
        ArrayList<String> stringArrayList2 = navState.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String id2 : stringArrayList2) {
                Parcelable[] parcelableArray = navState.getParcelableArray("android-support-nav:controller:backStackStates:" + id2);
                if (parcelableArray != null) {
                    Map<String, p013kotlin.collections.m<p011ja.l>> map = this.backStackStates;
                    s.j(id2, "id");
                    p013kotlin.collections.m<p011ja.l> mVar = new p013kotlin.collections.m<>(parcelableArray.length);
                    Iterator itA = p013kotlin.jvm.internal.c.a(parcelableArray);
                    while (itA.hasNext()) {
                        Parcelable parcelable = (Parcelable) itA.next();
                        s.i(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        mVar.add((p011ja.l) parcelable);
                    }
                    map.put(id2, mVar);
                }
            }
        }
        this.deepLinkHandled = navState.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public Bundle n0() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, d0<? extends r>> entry : this._navigatorProvider.f().entrySet()) {
            String key = entry.getKey();
            Bundle bundleI = entry.getValue().i();
            if (bundleI != null) {
                arrayList.add(key);
                bundle2.putBundle(key, bundleI);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        if (!this.backQueue.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.backQueue.size()];
            Iterator<p011ja.k> it = this.backQueue.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                parcelableArr[i11] = new p011ja.l(it.next());
                i11++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i12 = 0;
            for (Map.Entry<Integer, String> entry2 : this.backStackMap.entrySet()) {
                int iIntValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i12] = iIntValue;
                arrayList2.add(value);
                i12++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, p013kotlin.collections.m<p011ja.l>> entry3 : this.backStackStates.entrySet()) {
                String key2 = entry3.getKey();
                p013kotlin.collections.m<p011ja.l> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i13 = 0;
                for (p011ja.l lVar : value2) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        v.x();
                    }
                    parcelableArr2[i13] = lVar;
                    i13 = i14;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + key2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.deepLinkHandled) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.deepLinkHandled);
        }
        return bundle;
    }

    public void o0(t graph) {
        s.k(graph, "graph");
        p0(graph, null);
    }

    public void p0(t graph, Bundle startDestinationArgs) {
        n nVar;
        s.k(graph, "graph");
        if (!s.f(this._graph, graph)) {
            t tVar = this._graph;
            if (tVar != null) {
                for (Integer id2 : new ArrayList(this.backStackMap.keySet())) {
                    s.j(id2, "id");
                    s(id2.intValue());
                }
                nVar = this;
                g0(nVar, tVar.getId(), true, false, 4, null);
            } else {
                nVar = this;
            }
            nVar._graph = graph;
            X(startDestinationArgs);
            return;
        }
        int iL = graph.G().l();
        for (int i11 = 0; i11 < iL; i11++) {
            r rVarM = graph.G().m(i11);
            t tVar2 = this._graph;
            s.h(tVar2);
            int iH = tVar2.G().h(i11);
            t tVar3 = this._graph;
            s.h(tVar3);
            tVar3.G().k(iH, rVarM);
        }
        for (p011ja.k kVar : this.backQueue) {
            List<r> listV = v.V(ho0.l.c0(r.INSTANCE.c(kVar.getDestination())));
            r rVarC = this._graph;
            s.h(rVarC);
            for (r rVar : listV) {
                if (!s.f(rVar, this._graph) || !s.f(rVarC, graph)) {
                    if (rVarC instanceof t) {
                        rVarC = ((t) rVarC).C(rVar.getId());
                        s.h(rVarC);
                    }
                }
            }
            kVar.k(rVarC);
        }
    }

    public void q0(LifecycleOwner owner) {
        Lifecycle lifecycle;
        s.k(owner, "owner");
        if (s.f(owner, this.lifecycleOwner)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.lifecycleOwner;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.d(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycle().a(this.lifecycleObserver);
    }

    public void r(c listener) {
        s.k(listener, "listener");
        this.onDestinationChangedListeners.add(listener);
        if (this.backQueue.isEmpty()) {
            return;
        }
        p011ja.k kVarLast = this.backQueue.last();
        listener.a(this, kVarLast.getDestination(), kVarLast.c());
    }

    public void r0(ViewModelStore viewModelStore) {
        s.k(viewModelStore, "viewModelStore");
        p011ja.o oVar = this.viewModel;
        p011ja.o.Companion bVar = p011ja.o.INSTANCE;
        if (s.f(oVar, bVar.a(viewModelStore))) {
            return;
        }
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.viewModel = bVar.a(viewModelStore);
    }

    public final p011ja.k s0(p011ja.k child) {
        s.k(child, "child");
        p011ja.k kVarRemove = this.childToParentEntries.remove(child);
        if (kVarRemove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.parentToChildCount.get(kVarRemove);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            b bVar = this.navigatorState.get(this._navigatorProvider.e(kVarRemove.getDestination().getNavigatorName()));
            if (bVar != null) {
                bVar.e(kVarRemove);
            }
            this.parentToChildCount.remove(kVarRemove);
        }
        return kVarRemove;
    }

    public final void t0() {
        AtomicInteger atomicInteger;
        StateFlow<Set<p011ja.k>> stateFlowC;
        Set<p011ja.k> value;
        List<p011ja.k> listP1 = v.p1(this.backQueue);
        if (listP1.isEmpty()) {
            return;
        }
        r destination = ((p011ja.k) v.A0(listP1)).getDestination();
        ArrayList arrayList = new ArrayList();
        if (destination instanceof p011ja.d) {
            Iterator it = v.R0(listP1).iterator();
            while (it.hasNext()) {
                r destination2 = ((p011ja.k) it.next()).getDestination();
                arrayList.add(destination2);
                if (!(destination2 instanceof p011ja.d) && !(destination2 instanceof t)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (p011ja.k kVar : v.R0(listP1)) {
            Lifecycle.State maxLifecycle = kVar.getMaxLifecycle();
            r destination3 = kVar.getDestination();
            if (destination != null && destination3.getId() == destination.getId()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (maxLifecycle != state) {
                    b bVar = this.navigatorState.get(get_navigatorProvider().e(kVar.getDestination().getNavigatorName()));
                    if (s.f((bVar == null || (stateFlowC = bVar.c()) == null || (value = stateFlowC.getValue()) == null) ? null : Boolean.valueOf(value.contains(kVar)), Boolean.TRUE) || ((atomicInteger = this.parentToChildCount.get(kVar)) != null && atomicInteger.get() == 0)) {
                        map.put(kVar, Lifecycle.State.STARTED);
                    } else {
                        map.put(kVar, state);
                    }
                }
                r rVar = (r) v.q0(arrayList);
                if (rVar != null && rVar.getId() == destination3.getId()) {
                    v.M(arrayList);
                }
                destination = destination.getParent();
            } else if (arrayList.isEmpty() || destination3.getId() != ((r) v.o0(arrayList)).getId()) {
                kVar.l(Lifecycle.State.CREATED);
            } else {
                r rVar2 = (r) v.M(arrayList);
                if (maxLifecycle == Lifecycle.State.RESUMED) {
                    kVar.l(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (maxLifecycle != state2) {
                        map.put(kVar, state2);
                    }
                }
                t parent = rVar2.getParent();
                if (parent != null && !arrayList.contains(parent)) {
                    arrayList.add(parent);
                }
            }
        }
        for (p011ja.k kVar2 : listP1) {
            Lifecycle.State state3 = (Lifecycle.State) map.get(kVar2);
            if (state3 != null) {
                kVar2.l(state3);
            } else {
                kVar2.m();
            }
        }
    }

    public final r w(int destinationId) {
        r destination;
        t tVar = this._graph;
        if (tVar == null) {
            return null;
        }
        s.h(tVar);
        if (tVar.getId() == destinationId) {
            return this._graph;
        }
        p011ja.k kVarM = this.backQueue.m();
        if (kVarM == null || (destination = kVarM.getDestination()) == null) {
            destination = this._graph;
            s.h(destination);
        }
        return x(destination, destinationId, false);
    }

    public final r x(r rVar, int i11, boolean z11) {
        t tVar;
        s.k(rVar, "<this>");
        if (rVar.getId() == i11) {
            return rVar;
        }
        if (rVar instanceof t) {
            tVar = (t) rVar;
        } else {
            t parent = rVar.getParent();
            s.h(parent);
            tVar = parent;
        }
        return tVar.F(i11, tVar, z11);
    }
}
