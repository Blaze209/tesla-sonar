package com.withpersona.sdk2.inquiry.internal;

import aj0.e5;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import bh0.j2;
import bh0.t2;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.fourthline.analytics.internal.AnalyticsContext;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.VideoCaptureConfig;
import com.withpersona.sdk2.inquiry.network.core.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPositionKt;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import hh0.InquiryAttributes;
import hi0.InquirySessionConfig;
import ig0.r2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import pg0.IdConfig;
import pg0.g3;
import rh0.SandboxScreen;
import th0.a1;
import th0.b0;
import th0.d2;
import th0.d6;
import th0.e2;
import th0.m1;
import y20.Snapshot;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b4\b\u0000\u0018\u0000 °\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\b\u0086\u0001\u008a\u0001\u0088\u0001\u008c\u0001B±\u0001\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J;\u00106\u001a\u00020\u00052\u0006\u00103\u001a\u0002022\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b6\u00107JA\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0005092\u0006\u00108\u001a\u00020\u00052\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010=\u001a\u00020<2\u0006\u00108\u001a\u00020\u00052\u0006\u00103\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010>JC\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00032\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bA\u0010BJQ\u0010F\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00022\u0006\u00103\u001a\u00020C2\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020@0DH\u0002¢\u0006\u0004\bF\u0010GJQ\u0010I\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00022\u0006\u00103\u001a\u00020H2\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020@0DH\u0002¢\u0006\u0004\bI\u0010JJQ\u0010L\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00022\u0006\u00103\u001a\u00020K2\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020@0DH\u0002¢\u0006\u0004\bL\u0010MJ[\u0010R\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00022\u0006\u0010O\u001a\u00020N2\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\b\u0010Q\u001a\u0004\u0018\u00010P2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020@0DH\u0002¢\u0006\u0004\bR\u0010SJI\u0010U\u001a\u00020\u00052\u0006\u00103\u001a\u00020T2\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020@0DH\u0002¢\u0006\u0004\bU\u0010VJQ\u0010X\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00022\u0006\u00103\u001a\u00020W2\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020@0DH\u0002¢\u0006\u0004\bX\u0010YJQ\u0010[\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00022\u0006\u00103\u001a\u00020Z2\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020@0DH\u0002¢\u0006\u0004\b[\u0010\\JC\u0010^\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00022\u0006\u00103\u001a\u00020]2\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\b^\u0010_JQ\u0010a\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00022\u0006\u00103\u001a\u00020`2\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020@0DH\u0002¢\u0006\u0004\ba\u0010bJQ\u0010d\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00022\u0006\u00103\u001a\u00020c2\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010E\u001a\b\u0012\u0004\u0012\u00020@0DH\u0002¢\u0006\u0004\bd\u0010eJC\u0010g\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00022\u0006\u00103\u001a\u00020f2\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bg\u0010hJ;\u0010j\u001a\u00020\u00052\u0006\u00103\u001a\u00020i2\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002¢\u0006\u0004\bj\u0010kJ\u0013\u0010n\u001a\u00020m*\u00020lH\u0002¢\u0006\u0004\bn\u0010oJ\u0017\u0010r\u001a\u00020C2\u0006\u0010q\u001a\u00020pH\u0002¢\u0006\u0004\br\u0010sJG\u0010z\u001a\u00020@*\u00180tR\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040u2\b\u0010w\u001a\u0004\u0018\u00010v2\u0006\u0010x\u001a\u00020l2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010vH\u0002¢\u0006\u0004\bz\u0010{J\"\u0010\u007f\u001a\u00020\u00032\u0006\u0010|\u001a\u00020\u00022\b\u0010~\u001a\u0004\u0018\u00010}H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001JF\u0010\u0081\u0001\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00032\"\u00105\u001a\u001e04R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u001b\u0010\u0084\u0001\u001a\u00020}2\u0007\u0010\u0083\u0001\u001a\u00020\u0003H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0016\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001¨\u0006±\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m;", "Ly20/k;", "Lcom/withpersona/sdk2/inquiry/internal/m$c;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "Lcom/withpersona/sdk2/inquiry/internal/m$b;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/internal/c$a;", "createInquiryWorker", "Lcom/withpersona/sdk2/inquiry/internal/a$a;", "inquirySessionWorker", "Lcom/withpersona/sdk2/inquiry/internal/p$b;", "pollingWorker", "Lcom/withpersona/sdk2/inquiry/internal/t$a;", "transitionBackWorker", "Lcom/withpersona/sdk2/inquiry/internal/w$a;", "transitionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/z$a;", "updateInquirySessionWorkerFactory", "Lcom/withpersona/sdk2/inquiry/internal/f$a;", "exchangeOneTimeCodeWorkerFactory", "Lpg0/g3;", "governmentIdWorkflow", "Lth0/d6;", "selfieWorkflow", "Laj0/e5;", "uiWorkflow", "Lig0/r2;", "documentWorkflow", "Lah0/r;", "integrationWorkflow", "Lrh0/c;", "sandboxFlags", "Lei0/e;", "externalInquiryController", "Lii0/b;", "navigationStateManager", "Lei0/c;", "externalEventLogger", "Lbh0/t2;", "uiStepSavedStateHelper", "Lcom/withpersona/sdk2/inquiry/internal/r$a;", "restoreUiStepStateWorkerFactory", "Log0/c$a;", "featureFlagWorkerFactory", "Lng0/b;", "featureFlagManager", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/c$a;Lcom/withpersona/sdk2/inquiry/internal/a$a;Lcom/withpersona/sdk2/inquiry/internal/p$b;Lcom/withpersona/sdk2/inquiry/internal/t$a;Lcom/withpersona/sdk2/inquiry/internal/w$a;Lcom/withpersona/sdk2/inquiry/internal/z$a;Lcom/withpersona/sdk2/inquiry/internal/f$a;Lpg0/g3;Lth0/d6;Laj0/e5;Lig0/r2;Lah0/r;Lrh0/c;Lei0/e;Lii0/b;Lei0/c;Lbh0/t2;Lcom/withpersona/sdk2/inquiry/internal/r$a;Log0/c$a;Lng0/b;)V", "Lcom/withpersona/sdk2/inquiry/internal/l$a;", "renderState", "Ly20/k$a;", CoreConstants.CONTEXT_SCOPE_VALUE, "v0", "(Lcom/withpersona/sdk2/inquiry/internal/l$a;Ly20/k$a;)Ljava/lang/Object;", AnalyticsContext.Screen, "Lrh0/i;", "N1", "(Ljava/lang/Object;Ly20/k$a;)Lrh0/i;", "Lki0/k;", "T1", "(Ljava/lang/Object;Lcom/withpersona/sdk2/inquiry/internal/l;)Lki0/k;", "renderProps", "Ljn0/h0;", "x1", "(Lcom/withpersona/sdk2/inquiry/internal/m$c;Lcom/withpersona/sdk2/inquiry/internal/l;Ly20/k$a;)V", "Lcom/withpersona/sdk2/inquiry/internal/l$k;", "Lkotlin/Function0;", "backAction", "k1", "(Lcom/withpersona/sdk2/inquiry/internal/m$c;Lcom/withpersona/sdk2/inquiry/internal/l$k;Ly20/k$a;Lwn0/a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/l$b;", "w0", "(Lcom/withpersona/sdk2/inquiry/internal/m$c;Lcom/withpersona/sdk2/inquiry/internal/l$b;Ly20/k$a;Lwn0/a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/l$i;", "d1", "(Lcom/withpersona/sdk2/inquiry/internal/m$c;Lcom/withpersona/sdk2/inquiry/internal/l$i;Ly20/k$a;Lwn0/a;)Ljava/lang/Object;", "Lhh0/d;", "attributes", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "R0", "(Lcom/withpersona/sdk2/inquiry/internal/m$c;Lhh0/d;Ly20/k$a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lwn0/a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/l$h;", "a1", "(Lcom/withpersona/sdk2/inquiry/internal/l$h;Ly20/k$a;Lwn0/a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/l$c;", "x0", "(Lcom/withpersona/sdk2/inquiry/internal/m$c;Lcom/withpersona/sdk2/inquiry/internal/l$c;Ly20/k$a;Lwn0/a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/l$e;", "H0", "(Lcom/withpersona/sdk2/inquiry/internal/m$c;Lcom/withpersona/sdk2/inquiry/internal/l$e;Ly20/k$a;Lwn0/a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/l$f;", "L0", "(Lcom/withpersona/sdk2/inquiry/internal/m$c;Lcom/withpersona/sdk2/inquiry/internal/l$f;Ly20/k$a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/l$j;", "e1", "(Lcom/withpersona/sdk2/inquiry/internal/m$c;Lcom/withpersona/sdk2/inquiry/internal/l$j;Ly20/k$a;Lwn0/a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/l$l;", "l1", "(Lcom/withpersona/sdk2/inquiry/internal/m$c;Lcom/withpersona/sdk2/inquiry/internal/l$l;Ly20/k$a;Lwn0/a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/l$g;", "V0", "(Lcom/withpersona/sdk2/inquiry/internal/m$c;Lcom/withpersona/sdk2/inquiry/internal/l$g;Ly20/k$a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/internal/l$d;", "B0", "(Lcom/withpersona/sdk2/inquiry/internal/l$d;Ly20/k$a;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "", "q0", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Z", "Lbh0/r2;", "stepState", "w1", "(Lbh0/r2;)Lcom/withpersona/sdk2/inquiry/internal/l$k;", "Ly20/r$c;", "Ly20/r;", "", "sessionToken", AnalyticsAttribute.Error, "errorMessage", "K1", "(Ly20/r$c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Ljava/lang/String;)V", "props", "Ly20/i;", "snapshot", "p0", "(Lcom/withpersona/sdk2/inquiry/internal/m$c;Ly20/i;)Lcom/withpersona/sdk2/inquiry/internal/l;", "r0", "(Lcom/withpersona/sdk2/inquiry/internal/m$c;Lcom/withpersona/sdk2/inquiry/internal/l;Ly20/k$a;)Ljava/lang/Object;", "state", "M1", "(Lcom/withpersona/sdk2/inquiry/internal/l;)Ly20/i;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/internal/c$a;", "c", "Lcom/withpersona/sdk2/inquiry/internal/a$a;", DateTokenConverter.CONVERTER_KEY, "Lcom/withpersona/sdk2/inquiry/internal/p$b;", "e", "Lcom/withpersona/sdk2/inquiry/internal/t$a;", "f", "Lcom/withpersona/sdk2/inquiry/internal/w$a;", "g", "Lcom/withpersona/sdk2/inquiry/internal/z$a;", "h", "Lcom/withpersona/sdk2/inquiry/internal/f$a;", IntegerTokenConverter.CONVERTER_KEY, "Lpg0/g3;", "j", "Lth0/d6;", "k", "Laj0/e5;", "l", "Lig0/r2;", "m", "Lah0/r;", "n", "Lrh0/c;", "o", "Lei0/e;", "p", "Lii0/b;", "q", "Lei0/c;", "r", "Lbh0/t2;", "s", "Lcom/withpersona/sdk2/inquiry/internal/r$a;", "t", "Log0/c$a;", "u", "Lng0/b;", "v", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m extends y20.k<c, l, b, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context applicationContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.internal.c.a createInquiryWorker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a.InterfaceC1175a inquirySessionWorker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p.b pollingWorker;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t.a transitionBackWorker;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final w.a transitionWorkerFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final z.a updateInquirySessionWorkerFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final com.withpersona.sdk2.inquiry.internal.f.a exchangeOneTimeCodeWorkerFactory;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final g3 governmentIdWorkflow;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final d6 selfieWorkflow;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final e5 uiWorkflow;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final r2 documentWorkflow;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ah0.r integrationWorkflow;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final rh0.c sandboxFlags;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final ei0.e externalInquiryController;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ii0.b navigationStateManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final ei0.c externalEventLogger;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final t2 uiStepSavedStateHelper;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final r.a restoreUiStepStateWorkerFactory;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final og0.c.a featureFlagWorkerFactory;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final ng0.b featureFlagManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$d;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/m$d$a;", "Lcom/withpersona/sdk2/inquiry/internal/m$d$b;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class d {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$d$a;", "Lcom/withpersona/sdk2/inquiry/internal/m$d;", "<init>", "()V", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends d {
            public a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$d$b;", "Lcom/withpersona/sdk2/inquiry/internal/m$d;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "", "useBasicSpinner", "Lkotlin/Function0;", "Ljn0/h0;", "onBack", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLwn0/a;)V", "a", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "b", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "Z", "c", "()Z", "Lwn0/a;", "()Lwn0/a;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final StepStyle styles;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final boolean useBasicSpinner;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final wn0.a<h0> onBack;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(StepStyle stepStyle, boolean z11, wn0.a<h0> onBack) {
                super(null);
                p013kotlin.jvm.internal.s.k(onBack, "onBack");
                this.styles = stepStyle;
                this.useBasicSpinner = z11;
                this.onBack = onBack;
            }

            public final wn0.a<h0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final StepStyle getStyles() {
                return this.styles;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getUseBasicSpinner() {
                return this.useBasicSpinner;
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f57971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f57972c;

        static {
            int[] iArr = new int[NextStep.Selfie.CaptureMethod.values().length];
            try {
                iArr[NextStep.Selfie.CaptureMethod.ONLY_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.PROFILE_AND_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.CONFIGURABLE_POSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f57970a = iArr;
            int[] iArr2 = new int[j2.values().length];
            try {
                iArr2[j2.Background.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[j2.Blocking.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f57971b = iArr2;
            int[] iArr3 = new int[NextStep.Document.StartPage.values().length];
            try {
                iArr3[NextStep.Document.StartPage.PROMPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[NextStep.Document.StartPage.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f57972c = iArr3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$render$1", f = "InquiryWorkflow.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57973n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ y20.k<c, l, b, Object>.a f57975p;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ y20.k<c, l, b, Object>.a f57976a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f57977b;

            /* JADX WARN: Multi-variable type inference failed */
            a(y20.k<? super c, l, ? extends b, ? extends Object>.a aVar, m mVar) {
                this.f57976a = aVar;
                this.f57977b = mVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(ei0.a aVar, Continuation<? super h0> continuation) {
                if (!(aVar instanceof ei0.a.CancelRequest)) {
                    throw new NoWhenBranchMatchedException();
                }
                m.t0(this.f57976a, this.f57977b, ((ei0.a.CancelRequest) aVar).getForce());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(y20.k<? super c, l, ? extends b, ? extends Object>.a aVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f57975p = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return m.this.new f(this.f57975p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57973n;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow<ei0.a> flowC = m.this.externalInquiryController.c();
                a aVar = new a(this.f57975p, m.this);
                this.f57973n = 1;
                if (flowC.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$render$2", f = "InquiryWorkflow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57978n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y20.k<c, l, b, Object>.a f57979o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ m f57980p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(y20.k<? super c, l, ? extends b, ? extends Object>.a aVar, m mVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f57979o = aVar;
            this.f57980p = mVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new g(this.f57979o, this.f57980p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f57978n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            m.t0(this.f57979o, this.f57980p, true);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$renderComplete$1", f = "InquiryWorkflow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57981n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y20.k<c, l, b, Object>.a f57982o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ m f57983p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ l.Complete f57984q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(y20.k<? super c, l, ? extends b, ? extends Object>.a aVar, m mVar, l.Complete complete, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f57982o = aVar;
            this.f57983p = mVar;
            this.f57984q = complete;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 b(l.Complete complete, y20.r.c cVar) {
            cVar.d(new b.Complete(complete.getInquiryId(), complete.getInquiryStatus(), complete.i(), complete.getSessionToken()));
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new h(this.f57982o, this.f57983p, this.f57984q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f57981n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            y20.h<y20.r<? super c, l, ? extends b>> hVarC = this.f57982o.c();
            m mVar = this.f57983p;
            final l.Complete complete = this.f57984q;
            hVarC.b(y20.z.d(mVar, null, new wn0.l() { // from class: com.withpersona.sdk2.inquiry.internal.n
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return m.h.b(complete, (y20.r.c) obj2);
                }
            }, 1, null));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$renderUiStep$2", f = "InquiryWorkflow.kt", i = {}, l = {1045}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f57985n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ y20.k<c, l, b, Object>.a f57986o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ m f57987p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(y20.k<? super c, l, ? extends b, ? extends Object>.a aVar, m mVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f57986o = aVar;
            this.f57987p = mVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 b(y20.r.c cVar) {
            Object objC = cVar.c();
            l.UiStepRunning uiStepRunning = objC instanceof l.UiStepRunning ? (l.UiStepRunning) objC : null;
            if (uiStepRunning == null) {
                return h0.f84049a;
            }
            cVar.e(l.UiStepRunning.h(uiStepRunning, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, 229375, null));
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new i(this.f57986o, this.f57987p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f57985n;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f57985n = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            this.f57986o.c().b(y20.z.d(this.f57987p, null, new wn0.l() { // from class: com.withpersona.sdk2.inquiry.internal.o
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return m.i.b((y20.r.c) obj2);
                }
            }, 1, null));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public m(Context applicationContext, com.withpersona.sdk2.inquiry.internal.c.a createInquiryWorker, a.InterfaceC1175a inquirySessionWorker, p.b pollingWorker, t.a transitionBackWorker, w.a transitionWorkerFactory, z.a updateInquirySessionWorkerFactory, com.withpersona.sdk2.inquiry.internal.f.a exchangeOneTimeCodeWorkerFactory, g3 governmentIdWorkflow, d6 selfieWorkflow, e5 uiWorkflow, r2 documentWorkflow, ah0.r integrationWorkflow, rh0.c sandboxFlags, ei0.e externalInquiryController, ii0.b navigationStateManager, ei0.c externalEventLogger, t2 uiStepSavedStateHelper, r.a restoreUiStepStateWorkerFactory, og0.c.a featureFlagWorkerFactory, ng0.b featureFlagManager) {
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        p013kotlin.jvm.internal.s.k(createInquiryWorker, "createInquiryWorker");
        p013kotlin.jvm.internal.s.k(inquirySessionWorker, "inquirySessionWorker");
        p013kotlin.jvm.internal.s.k(pollingWorker, "pollingWorker");
        p013kotlin.jvm.internal.s.k(transitionBackWorker, "transitionBackWorker");
        p013kotlin.jvm.internal.s.k(transitionWorkerFactory, "transitionWorkerFactory");
        p013kotlin.jvm.internal.s.k(updateInquirySessionWorkerFactory, "updateInquirySessionWorkerFactory");
        p013kotlin.jvm.internal.s.k(exchangeOneTimeCodeWorkerFactory, "exchangeOneTimeCodeWorkerFactory");
        p013kotlin.jvm.internal.s.k(governmentIdWorkflow, "governmentIdWorkflow");
        p013kotlin.jvm.internal.s.k(selfieWorkflow, "selfieWorkflow");
        p013kotlin.jvm.internal.s.k(uiWorkflow, "uiWorkflow");
        p013kotlin.jvm.internal.s.k(documentWorkflow, "documentWorkflow");
        p013kotlin.jvm.internal.s.k(integrationWorkflow, "integrationWorkflow");
        p013kotlin.jvm.internal.s.k(sandboxFlags, "sandboxFlags");
        p013kotlin.jvm.internal.s.k(externalInquiryController, "externalInquiryController");
        p013kotlin.jvm.internal.s.k(navigationStateManager, "navigationStateManager");
        p013kotlin.jvm.internal.s.k(externalEventLogger, "externalEventLogger");
        p013kotlin.jvm.internal.s.k(uiStepSavedStateHelper, "uiStepSavedStateHelper");
        p013kotlin.jvm.internal.s.k(restoreUiStepStateWorkerFactory, "restoreUiStepStateWorkerFactory");
        p013kotlin.jvm.internal.s.k(featureFlagWorkerFactory, "featureFlagWorkerFactory");
        p013kotlin.jvm.internal.s.k(featureFlagManager, "featureFlagManager");
        this.applicationContext = applicationContext;
        this.createInquiryWorker = createInquiryWorker;
        this.inquirySessionWorker = inquirySessionWorker;
        this.pollingWorker = pollingWorker;
        this.transitionBackWorker = transitionBackWorker;
        this.transitionWorkerFactory = transitionWorkerFactory;
        this.updateInquirySessionWorkerFactory = updateInquirySessionWorkerFactory;
        this.exchangeOneTimeCodeWorkerFactory = exchangeOneTimeCodeWorkerFactory;
        this.governmentIdWorkflow = governmentIdWorkflow;
        this.selfieWorkflow = selfieWorkflow;
        this.uiWorkflow = uiWorkflow;
        this.documentWorkflow = documentWorkflow;
        this.integrationWorkflow = integrationWorkflow;
        this.sandboxFlags = sandboxFlags;
        this.externalInquiryController = externalInquiryController;
        this.navigationStateManager = navigationStateManager;
        this.externalEventLogger = externalEventLogger;
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
        this.restoreUiStepStateWorkerFactory = restoreUiStepStateWorkerFactory;
        this.featureFlagWorkerFactory = featureFlagWorkerFactory;
        this.featureFlagManager = featureFlagManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 A0(m mVar, l.CreateInquirySession createInquirySession, com.withpersona.sdk2.inquiry.internal.network.b bVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        L1(mVar, action, createInquirySession.getSessionToken(), ((com.withpersona.sdk2.inquiry.internal.network.b.Error) bVar).getCause(), null, 4, null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r A1(final m mVar, final String str, final v vVar, final com.withpersona.sdk2.inquiry.internal.network.i it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.i.Error) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.r1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.B1(this.f17341a, str, it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(it, com.withpersona.sdk2.inquiry.internal.network.i.b.f58192a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.s1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.C1(vVar, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object B0(final l.DocumentStepRunning renderState, y20.k<? super c, l, ? extends b, ? extends Object>.a context) {
        r2.e bVar;
        String documentId = renderState.getDocumentStep().getConfig().getDocumentId();
        int i11 = e.f57972c[renderState.getDocumentStep().getConfig().getStartPage().ordinal()];
        if (i11 == 1) {
            bVar = r2.e.a.f77926a;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = documentId != null ? new r2.e.Review(documentId) : r2.e.a.f77926a;
        }
        r2.e eVar = bVar;
        String fromStep = renderState.getFromStep();
        r2 r2Var = this.documentWorkflow;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromStep2 = renderState.getFromStep();
        String fromComponent = renderState.getFromComponent();
        String title = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getTitle();
        String prompt = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getPrompt();
        String disclaimer = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getDisclaimer();
        String btnSubmit = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getBtnSubmit();
        String title2 = renderState.getDocumentStep().getConfig().getLocalizations().getPendingPage().getTitle();
        String description = renderState.getDocumentStep().getConfig().getLocalizations().getPendingPage().getDescription();
        String fieldKeyDocument = renderState.getDocumentStep().getConfig().getFieldKeyDocument();
        String kind = renderState.getDocumentStep().getConfig().getKind();
        int documentFileLimit = renderState.getDocumentStep().getConfig().getDocumentFileLimit();
        Boolean backStepEnabled = renderState.getDocumentStep().getConfig().getBackStepEnabled();
        boolean zBooleanValue = backStepEnabled != null ? backStepEnabled.booleanValue() : false;
        Boolean cancelButtonEnabled = renderState.getDocumentStep().getConfig().getCancelButtonEnabled();
        boolean zBooleanValue2 = cancelButtonEnabled != null ? cancelButtonEnabled.booleanValue() : true;
        String cameraPermissionsTitle = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getCameraPermissionsTitle();
        String cameraPermissionsPrompt = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getCameraPermissionsPrompt();
        String cameraPermissionsAllowButtonText = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getCameraPermissionsAllowButtonText();
        String cameraPermissionsCancelButtonText = renderState.getDocumentStep().getConfig().getLocalizations().getPromptPage().getCameraPermissionsCancelButtonText();
        StepStyles.DocumentStepStyle styles = renderState.getStyles();
        ig0.l pages = renderState.getPages();
        NextStep.Document.AssetConfig assetConfig = renderState.getAssetConfig();
        if (assetConfig == null) {
            assetConfig = new NextStep.Document.AssetConfig(null, null, 3, null);
        }
        PendingPageTextPosition pendingPageTextVerticalPosition = renderState.getDocumentStep().getConfig().getPendingPageTextVerticalPosition();
        if (pendingPageTextVerticalPosition == null) {
            pendingPageTextVerticalPosition = PendingPageTextPositionKt.getDEFAULT_PROCESSING_TEXT_POSITION();
        }
        return new ih0.d(context.d(r2Var, new r2.Input(sessionToken, inquiryId, fromStep2, fromComponent, title, prompt, disclaimer, btnSubmit, title2, description, fieldKeyDocument, kind, documentId, eVar, pages, documentFileLimit, zBooleanValue, zBooleanValue2, cameraPermissionsTitle, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, styles, assetConfig, pendingPageTextVerticalPosition), fromStep, new wn0.l() { // from class: bh0.k0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.C0(this.f17281a, renderState, (ig0.r2.c) obj);
            }
        }), !p013kotlin.jvm.internal.s.f(renderState.getTransitionStatus(), v.c.f58239a), renderState.getFromStep());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 B1(m mVar, String str, com.withpersona.sdk2.inquiry.internal.network.i iVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        L1(mVar, action, str, ((com.withpersona.sdk2.inquiry.internal.network.i.Error) iVar).getCause(), null, 4, null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r C0(final m mVar, final l.DocumentStepRunning documentStepRunning, final r2.c it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (p013kotlin.jvm.internal.s.f(it, r2.c.b.f77894a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.z0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.D0(documentStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(it, r2.c.a.f77893a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.a1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.E0(documentStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof r2.c.Errored) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.b1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.F0(this.f17205a, it, documentStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(it, r2.c.d.f77896a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.c1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.G0(documentStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 C1(v vVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        v.UpdateInquirySession updateInquirySession = (v.UpdateInquirySession) vVar;
        if (updateInquirySession.getNextStep() != null) {
            action.e(updateInquirySession.getNextStep());
        } else {
            action.e(((l) action.c()).f(new v.CheckingForNextState(null, updateInquirySession.getCanReuseWorkflow(), 1, null)));
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 D0(l.DocumentStepRunning documentStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        String inquiryId = documentStepRunning.getInquiryId();
        String sessionToken = documentStepRunning.getSessionToken();
        StepStyles.DocumentStepStyle styles = documentStepRunning.getStyles();
        NextStep.CancelDialog cancelDialog = documentStepRunning.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = documentStepRunning.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = documentStepRunning.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = documentStepRunning.getCancelDialog();
        action.d(new b.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, 128, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r D1(m mVar, final v vVar, l lVar, String str, final p.c it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof p.c.Success) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.t0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.E1(it, vVar, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof p.c.Error) {
            return y1(mVar, lVar, str, ((p.c.Error) it).getCause());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 E0(l.DocumentStepRunning documentStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(l.DocumentStepRunning.h(documentStepRunning, null, null, v.c.f58239a, null, null, null, null, null, null, null, 1019, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 E1(p.c cVar, v vVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(((p.c.Success) cVar).a((l) action.c(), ((v.CheckingForNextState) vVar).getCanReuseWorkflow()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 F0(m mVar, r2.c cVar, l.DocumentStepRunning documentStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        r2.c.Errored c1644c = (r2.c.Errored) cVar;
        if (mVar.q0(c1644c.getCause())) {
            action.e(mVar.w1(documentStepRunning));
        } else {
            L1(mVar, action, documentStepRunning.getSessionToken(), c1644c.getCause(), null, 4, null);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r F1(final m mVar, final l lVar, final String str, final com.withpersona.sdk2.inquiry.internal.network.h it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.h.Success) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.a2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.G1(it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.h.Error) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.b2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.H1(this.f17208a, it, lVar, str, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 G0(l.DocumentStepRunning documentStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(l.DocumentStepRunning.h(documentStepRunning, null, null, new v.CheckingForNextState(null, false, 3, null), null, null, null, null, null, null, null, 1019, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 G1(com.withpersona.sdk2.inquiry.internal.network.h hVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        com.withpersona.sdk2.inquiry.internal.network.h.Success success = (com.withpersona.sdk2.inquiry.internal.network.h.Success) hVar;
        success.getNextState().e(true);
        action.e(success.getNextState());
        return h0.f84049a;
    }

    private final Object H0(c renderProps, final l.ExchangeOneTimeCode renderState, y20.k<? super c, l, ? extends b, ? extends Object>.a context, wn0.a<h0> backAction) {
        ii0.b.d(this.navigationStateManager, false, false, false, 4, null);
        y20.w.l(context, this.exchangeOneTimeCodeWorkerFactory.a(renderState.getOneTimeLinkCode()), o0.o(com.withpersona.sdk2.inquiry.internal.f.class), "", new wn0.l() { // from class: bh0.n0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.I0(this.f17302a, renderState, (com.withpersona.sdk2.inquiry.internal.network.d) obj);
            }
        });
        return new d.b(renderState.getStyles(), true, backAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final h0 H1(m mVar, com.withpersona.sdk2.inquiry.internal.network.h hVar, l lVar, String str, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        com.withpersona.sdk2.inquiry.internal.network.h.Error error = (com.withpersona.sdk2.inquiry.internal.network.h.Error) hVar;
        if (mVar.q0(error.getCause()) && (lVar instanceof bh0.r2)) {
            action.e(mVar.w1((bh0.r2) lVar));
        } else {
            L1(mVar, action, str, error.getCause(), null, 4, null);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r I0(final m mVar, final l.ExchangeOneTimeCode exchangeOneTimeCode, final com.withpersona.sdk2.inquiry.internal.network.d it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.d.Success) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.w0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.J0(it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.d.Error) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.x0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.K0(this.f17400a, exchangeOneTimeCode, it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r I1(m mVar, l lVar, String str, final w.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof w.b.Error) {
            return y1(mVar, lVar, str, ((w.b.Error) it).getCause());
        }
        if (it instanceof w.b.Success) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.t1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.J1(it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 J0(com.withpersona.sdk2.inquiry.internal.network.d dVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        com.withpersona.sdk2.inquiry.internal.network.d.Success success = (com.withpersona.sdk2.inquiry.internal.network.d.Success) dVar;
        if (success.getSessionToken() == null) {
            action.e(new l.CreateInquirySession(success.getInquiryId()));
        } else {
            action.e(new l.ShowLoadingSpinner(success.getSessionToken(), new v.CheckingForNextState(null, false, 3, null), success.getInquiryId(), null, true, InquirySessionConfig.INSTANCE.a()));
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 J1(w.b bVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(((l) action.c()).f(new v.UpdateInquirySession(((w.b.Success) bVar).getNextState(), false)));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 K0(m mVar, l.ExchangeOneTimeCode exchangeOneTimeCode, com.withpersona.sdk2.inquiry.internal.network.d dVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        L1(mVar, action, exchangeOneTimeCode.getSessionToken(), ((com.withpersona.sdk2.inquiry.internal.network.d.Error) dVar).getCause(), null, 4, null);
        return h0.f84049a;
    }

    private final void K1(y20.r<? super c, l, ? extends b>.c cVar, String str, InternalErrorInfo internalErrorInfo, String str2) {
        if (str2 == null) {
            str2 = bh0.r.b(internalErrorInfo);
        }
        cVar.d(new b.Error(str2, bh0.r.a(internalErrorInfo), internalErrorInfo, str));
    }

    private final Object L0(c renderProps, final l.GovernmentIdStepRunning renderState, y20.k<? super c, l, ? extends b, ? extends Object>.a context) {
        String fromStep = renderState.getFromStep();
        g3 g3Var = this.governmentIdWorkflow;
        String sessionToken = renderState.getSessionToken();
        String countryCode = renderState.getCountryCode();
        List<Id> listW = renderState.w();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listW.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Id id2 = (Id) it.next();
            String countryCode2 = renderState.getCountryCode();
            IdConfig idConfigO = pg0.z.o(id2, countryCode2 != null ? countryCode2 : "US", renderState.getManualCaptureButtonDelayMs());
            if (idConfigO != null) {
                arrayList.add(idConfigO);
            }
        }
        String inquiryId = renderState.getInquiryId();
        String fromStep2 = renderState.getFromStep();
        String fromComponent = renderState.getFromComponent();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        List<CaptureOptionNativeMobile> listV = renderState.v();
        StepStyles.GovernmentIdStepStyle styles = renderState.getStyles();
        int imageCaptureCount = renderState.getImageCaptureCount();
        String fieldKeyDocument = renderState.getFieldKeyDocument();
        String fieldKeyIdClass = renderState.getFieldKeyIdClass();
        NextStep.GovernmentId.Localizations localizations = renderState.getLocalizations();
        String countryCode3 = renderState.getCountryCode();
        String str = countryCode3 != null ? countryCode3 : "US";
        List<NextStep.GovernmentId.LocalizationOverride> listD = renderState.D();
        g3.a.C2175a c2175aJ = hh0.a.j(localizations, str, listD != null ? p013kotlin.collections.v.Z0(listD) : null);
        long manualCaptureButtonDelayMs = renderState.getManualCaptureButtonDelayMs();
        Integer theme = renderProps.getTheme();
        boolean shouldSkipReviewScreen = renderState.getShouldSkipReviewScreen();
        List<NextStep.GovernmentId.CaptureFileType> listU = renderState.u();
        List<NextStep.GovernmentId.VideoCaptureMethod> listN = renderState.N();
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(listN, 10));
        Iterator<T> it2 = listN.iterator();
        while (it2.hasNext()) {
            arrayList2.add(fg0.a.valueOf(((NextStep.GovernmentId.VideoCaptureMethod) it2.next()).toString()));
        }
        VideoCaptureConfig videoCaptureConfig = new VideoCaptureConfig(0L, listU, arrayList2, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null);
        NextStep.GovernmentId.AssetConfig assetConfig = renderState.getAssetConfig();
        return context.d(g3Var, new g3.a(sessionToken, countryCode, arrayList, inquiryId, fromStep2, fromComponent, backStepEnabled, cancelButtonEnabled, listV, styles, c2175aJ, imageCaptureCount, fieldKeyDocument, fieldKeyIdClass, manualCaptureButtonDelayMs, shouldSkipReviewScreen, theme, videoCaptureConfig, assetConfig == null ? new NextStep.GovernmentId.AssetConfig(null, null, null, null, null, 31, null) : assetConfig, !p013kotlin.jvm.internal.s.f(renderState.getTransitionStatus(), v.c.f58239a), renderState.getAutoClassificationConfig(), renderState.getReviewCaptureButtonsAxis(), renderState.getPendingPageTextVerticalPosition(), renderState.getDigitalIdConfig()), fromStep, new wn0.l() { // from class: bh0.h0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.M0(this.f17266a, renderState, (g3.b) obj);
            }
        });
    }

    static /* synthetic */ void L1(m mVar, y20.r.c cVar, String str, InternalErrorInfo internalErrorInfo, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        mVar.K1(cVar, str, internalErrorInfo, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r M0(final m mVar, final l.GovernmentIdStepRunning governmentIdStepRunning, final g3.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (p013kotlin.jvm.internal.s.f(it, g3.b.C2176b.f102421a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.v1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.N0(governmentIdStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof g3.b.c) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.w1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.O0(this.f17396a, it, governmentIdStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(it, g3.b.d.f102423a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.x1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.P0(governmentIdStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(it, g3.b.a.f102420a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.y1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.Q0(governmentIdStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 N0(l.GovernmentIdStepRunning governmentIdStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        String inquiryId = governmentIdStepRunning.getInquiryId();
        String sessionToken = governmentIdStepRunning.getSessionToken();
        StepStyles.GovernmentIdStepStyle styles = governmentIdStepRunning.getStyles();
        NextStep.CancelDialog cancelDialog = governmentIdStepRunning.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = governmentIdStepRunning.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = governmentIdStepRunning.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = governmentIdStepRunning.getCancelDialog();
        action.d(new b.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, 128, null));
        return h0.f84049a;
    }

    private final SandboxScreen<Object> N1(Object screen, final y20.k<? super c, l, ? extends b, ? extends Object>.a context) {
        return new SandboxScreen<>(screen, new wn0.a() { // from class: bh0.e0
            @Override // wn0.a
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.internal.m.O1(this.f17227a, context);
            }
        }, new wn0.a() { // from class: bh0.f0
            @Override // wn0.a
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.internal.m.Q1(this.f17233a);
            }
        }, this.sandboxFlags.b(), new wn0.l() { // from class: bh0.g0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.R1(this.f17258a, context, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 O0(m mVar, g3.b bVar, l.GovernmentIdStepRunning governmentIdStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        g3.b.c cVar = (g3.b.c) bVar;
        if (mVar.q0(cVar.getCause())) {
            action.e(mVar.w1(governmentIdStepRunning));
        } else {
            L1(mVar, action, governmentIdStepRunning.getSessionToken(), cVar.getCause(), null, 4, null);
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 O1(m mVar, y20.k.a aVar) {
        mVar.sandboxFlags.f();
        aVar.c().b(y20.z.d(mVar, null, new wn0.l() { // from class: bh0.z1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.P1((y20.r.c) obj);
            }
        }, 1, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 P0(l.GovernmentIdStepRunning governmentIdStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(l.GovernmentIdStepRunning.h(governmentIdStepRunning, null, null, new v.CheckingForNextState(null, false, 3, null), null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, 268435451, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 P1(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 Q0(l.GovernmentIdStepRunning governmentIdStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(l.GovernmentIdStepRunning.h(governmentIdStepRunning, null, null, v.c.f58239a, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, 268435451, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rh0.c.b Q1(m mVar) {
        return mVar.sandboxFlags.getDebugForcedStatus();
    }

    private final Object R0(c renderProps, final InquiryAttributes attributes, y20.k<? super c, l, ? extends b, ? extends Object>.a context, StepStyle styles, wn0.a<h0> backAction) {
        ii0.b.d(this.navigationStateManager, false, false, false, 4, null);
        y20.w.l(context, this.createInquiryWorker.a(attributes), o0.o(com.withpersona.sdk2.inquiry.internal.c.class), "", new wn0.l() { // from class: bh0.g2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.S0(this.f17261a, attributes, (com.withpersona.sdk2.inquiry.internal.network.a) obj);
            }
        });
        return new d.b(styles, true, backAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 R1(m mVar, y20.k.a aVar, boolean z11) {
        mVar.sandboxFlags.e(z11);
        aVar.c().b(y20.z.d(mVar, null, new wn0.l() { // from class: bh0.h1
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.S1((y20.r.c) obj);
            }
        }, 1, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r S0(final m mVar, final InquiryAttributes inquiryAttributes, final com.withpersona.sdk2.inquiry.internal.network.a it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.a.Success) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.l1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.T0(it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.a.Error) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.m1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.U0(this.f17297a, inquiryAttributes, it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 S1(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 T0(com.withpersona.sdk2.inquiry.internal.network.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        com.withpersona.sdk2.inquiry.internal.network.a.Success success = (com.withpersona.sdk2.inquiry.internal.network.a.Success) aVar;
        if (yh0.h.e(success.getInquiryId())) {
            action.d(new b.ReinitializeWithFallbackMode(success.getInquiryId(), success.getFallbackSessionToken()));
        } else {
            action.e(new l.CreateInquirySession(success.getInquiryId()));
        }
        return h0.f84049a;
    }

    private final ki0.k T1(Object screen, l renderState) {
        return new ki0.k(screen, renderState.getDidGoBack() ? ki0.j.SLIDE_OUT : ki0.j.SLIDE_IN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 U0(m mVar, InquiryAttributes inquiryAttributes, com.withpersona.sdk2.inquiry.internal.network.a aVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        com.withpersona.sdk2.inquiry.internal.network.a.Error error = (com.withpersona.sdk2.inquiry.internal.network.a.Error) aVar;
        mVar.K1(action, inquiryAttributes.getSessionToken(), error.getCause(), error.getDebugMessage());
        return h0.f84049a;
    }

    private final Object V0(c renderProps, final l.IntegrationStepRunning renderState, y20.k<? super c, l, ? extends b, ? extends Object>.a context) {
        boolean z11;
        String fromStep = renderState.getFromStep();
        ah0.r rVar = this.integrationWorkflow;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String strM = renderState.m();
        String type = renderState.getType();
        String flowUrl = renderState.getFlowUrl();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        InquirySessionConfig inquirySessionConfig = renderState.getInquirySessionConfig();
        StepStyles.IntegrationStepStyle styles = renderState.getStyles();
        InternalErrorInfo transitionError = renderState.getTransitionError();
        ah0.e integrationPage = renderState.getIntegrationPage();
        v transitionStatus = renderState.getTransitionStatus();
        if (transitionStatus instanceof v.CheckingForNextState) {
            int i11 = e.f57971b[((v.CheckingForNextState) renderState.getTransitionStatus()).getPollingMode().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z11 = true;
            } else {
                z11 = false;
            }
        } else if ((transitionStatus instanceof v.Transitioning) || p013kotlin.jvm.internal.s.f(transitionStatus, v.c.f58239a) || (transitionStatus instanceof v.UpdateInquirySession)) {
            z11 = true;
        } else {
            if (transitionStatus != null) {
                throw new NoWhenBranchMatchedException();
            }
            z11 = false;
        }
        return new ih0.d(context.d(rVar, new ah0.r.Input(inquiryId, sessionToken, strM, type, flowUrl, backStepEnabled, cancelButtonEnabled, inquirySessionConfig, styles, transitionError, integrationPage, z11), fromStep, new wn0.l() { // from class: bh0.j0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.W0(this.f17276a, renderState, (ah0.r.c) obj);
            }
        }), true ^ p013kotlin.jvm.internal.s.f(renderState.getTransitionStatus(), v.c.f58239a), renderState.getFromStep());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r W0(m mVar, final l.IntegrationStepRunning integrationStepRunning, ah0.r.c it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (p013kotlin.jvm.internal.s.f(it, ah0.r.c.b.f1107a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.e1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.X0((y20.r.c) obj);
                }
            }, 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(it, ah0.r.c.C0040c.f1108a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.f1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.Y0(integrationStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(it, ah0.r.c.a.f1106a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.g1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.Z0(integrationStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 X0(y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 Y0(l.IntegrationStepRunning integrationStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(l.IntegrationStepRunning.h(integrationStepRunning, null, null, new v.UpdateInquirySession(null, false), null, null, null, null, null, null, null, false, false, null, null, null, null, 65531, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 Z0(l.IntegrationStepRunning integrationStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(l.IntegrationStepRunning.h(integrationStepRunning, null, null, v.c.f58239a, null, null, null, null, null, null, null, false, false, null, null, null, null, 65531, null));
        return h0.f84049a;
    }

    private final Object a1(final l.LoadFeatureFlagSession renderState, y20.k<? super c, l, ? extends b, ? extends Object>.a context, wn0.a<h0> backAction) {
        ii0.b.d(this.navigationStateManager, false, false, false, 4, null);
        y20.w.l(context, this.featureFlagWorkerFactory.a(renderState.getSessionToken()), o0.o(og0.c.class), "", new wn0.l() { // from class: bh0.l0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.b1(this.f17286a, renderState, (og0.c.b) obj);
            }
        });
        return new d.b(renderState.getStyles(), true, backAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r b1(m mVar, final l.LoadFeatureFlagSession loadFeatureFlagSession, og0.c.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if ((it instanceof og0.c.b.Success) || (it instanceof og0.c.b.a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.d1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.c1(loadFeatureFlagSession, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 c1(l.LoadFeatureFlagSession loadFeatureFlagSession, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(new l.ShowLoadingSpinner(loadFeatureFlagSession.getSessionToken(), null, loadFeatureFlagSession.getInquiryId(), null, true, loadFeatureFlagSession.getInquirySessionConfig(), 2, null));
        return h0.f84049a;
    }

    private final Object d1(c renderProps, l.ResumeFallbackInquiry renderState, y20.k<? super c, l, ? extends b, ? extends Object>.a context, wn0.a<h0> backAction) {
        return R0(renderProps, new InquiryAttributes(null, null, renderState.getFallbackInquiryId(), renderState.getFallbackSessionToken(), renderProps.getEnvironment(), null, null, null, null, null, null, 2019, null), context, renderState.getStyles(), backAction);
    }

    private final Object e1(c renderProps, final l.SelfieStepRunning renderState, y20.k<? super c, l, ? extends b, ? extends Object>.a context, wn0.a<h0> backAction) {
        String str;
        String str2;
        List listE;
        String str3;
        String fromStep = renderState.getFromStep();
        d6 d6Var = this.selfieWorkflow;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromComponent = renderState.getFromComponent();
        String fromStep2 = renderState.getFromStep();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        String fieldKeySelfie = renderState.getFieldKeySelfie();
        boolean requireStrictSelfieCapture = renderState.getRequireStrictSelfieCapture();
        boolean skipPromptPage = renderState.getSkipPromptPage();
        d6.Input.Strings aVarK = hh0.a.k(renderState.getLocalizations(), renderState.getSelfieType() == NextStep.Selfie.CaptureMethod.ONLY_CENTER);
        d2 d2VarA = e2.a(renderState.getSelfieType());
        List<NextStep.Selfie.SelfiePose> listW = renderState.w();
        if (listW == null || listW.isEmpty()) {
            str = sessionToken;
            str2 = inquiryId;
            int i11 = e.f57970a[renderState.getSelfieType().ordinal()];
            if (i11 == 1) {
                listE = p013kotlin.collections.v.e(a1.b.Center);
            } else {
                if (i11 != 2 && i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                listE = p013kotlin.collections.v.p(a1.b.Center, a1.b.Left, a1.b.Right);
            }
        } else {
            List<NextStep.Selfie.SelfiePose> listW2 = renderState.w();
            str = sessionToken;
            str2 = inquiryId;
            listE = new ArrayList(p013kotlin.collections.v.y(listW2, 10));
            Iterator<T> it = listW2.iterator();
            while (it.hasNext()) {
                listE.add(m1.c((NextStep.Selfie.SelfiePose) it.next()));
            }
        }
        String cameraPermissionsTitle = renderState.getLocalizations().getPromptPage().getCameraPermissionsTitle();
        String cameraPermissionsPrompt = renderState.getLocalizations().getPromptPage().getCameraPermissionsPrompt();
        String cameraPermissionsAllowButtonText = renderState.getLocalizations().getPromptPage().getCameraPermissionsAllowButtonText();
        String cameraPermissionsCancelButtonText = renderState.getLocalizations().getPromptPage().getCameraPermissionsCancelButtonText();
        String microphonePermissionsTitle = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsTitle();
        String microphonePermissionsPrompt = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsPrompt();
        String microphonePermissionsBtnContinueMobile = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsBtnContinueMobile();
        String microphonePermissionsBtnCancel = renderState.getLocalizations().getPromptPage().getMicrophonePermissionsBtnCancel();
        StepStyles.SelfieStepStyle styles = renderState.getStyles();
        NextStep.Selfie.AssetConfig assetConfig = renderState.getAssetConfig();
        if (assetConfig == null) {
            assetConfig = new NextStep.Selfie.AssetConfig(null, null, 3, null);
            str3 = cameraPermissionsTitle;
        } else {
            str3 = cameraPermissionsTitle;
        }
        PendingPageTextPosition pendingPageTextVerticalPosition = renderState.getPendingPageTextVerticalPosition();
        List<NextStep.Selfie.CaptureFileType> listM = renderState.m();
        List<NextStep.Selfie.VideoCaptureMethod> listF = renderState.F();
        String str4 = str;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listF, 10));
        Iterator<T> it2 = listF.iterator();
        while (it2.hasNext()) {
            arrayList.add(fg0.a.valueOf(((NextStep.Selfie.VideoCaptureMethod) it2.next()).toString()));
        }
        return new ih0.d(context.d(d6Var, new d6.Input(str4, str2, fromComponent, fromStep2, backStepEnabled, cancelButtonEnabled, fieldKeySelfie, requireStrictSelfieCapture, skipPromptPage, aVarK, d2VarA, listE, str3, cameraPermissionsPrompt, cameraPermissionsAllowButtonText, cameraPermissionsCancelButtonText, microphonePermissionsTitle, microphonePermissionsPrompt, microphonePermissionsBtnContinueMobile, microphonePermissionsBtnCancel, styles, new com.withpersona.sdk2.inquiry.selfie.video_capture.VideoCaptureConfig(0L, listM, arrayList, renderState.getWebRtcJwt(), renderState.getAudioEnabled(), 1, null), assetConfig, pendingPageTextVerticalPosition, renderState.getPoseConfigs(), this.featureFlagManager.b(ng0.g.f95005a) ? b0.V1 : b0.V0), fromStep, new wn0.l() { // from class: bh0.i0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.f1(this.f17270a, renderState, (d6.c) obj);
            }
        }), !p013kotlin.jvm.internal.s.f(renderState.getTransitionStatus(), v.c.f58239a), renderState.getFromStep());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r f1(final m mVar, final l.SelfieStepRunning selfieStepRunning, final d6.c it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (p013kotlin.jvm.internal.s.f(it, d6.c.b.f113700a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.n1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.g1(selfieStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(it, d6.c.d.f113702a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.o1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.h1(selfieStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (p013kotlin.jvm.internal.s.f(it, d6.c.a.f113699a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.p1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.i1(selfieStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof d6.c.Error) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.q1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.j1(this.f17336a, it, selfieStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 g1(l.SelfieStepRunning selfieStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        String inquiryId = selfieStepRunning.getInquiryId();
        String sessionToken = selfieStepRunning.getSessionToken();
        StepStyles.SelfieStepStyle styles = selfieStepRunning.getStyles();
        NextStep.CancelDialog cancelDialog = selfieStepRunning.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = selfieStepRunning.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = selfieStepRunning.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = selfieStepRunning.getCancelDialog();
        action.d(new b.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, 128, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 h1(l.SelfieStepRunning selfieStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(l.SelfieStepRunning.h(selfieStepRunning, null, null, new v.CheckingForNextState(null, false, 3, null), null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, false, null, 4194299, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 i1(l.SelfieStepRunning selfieStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(l.SelfieStepRunning.h(selfieStepRunning, null, null, v.c.f58239a, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, false, null, 4194299, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 j1(m mVar, d6.c cVar, l.SelfieStepRunning selfieStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        d6.c.Error c2424c = (d6.c.Error) cVar;
        if (mVar.q0(c2424c.getCause())) {
            action.e(mVar.w1(selfieStepRunning));
        } else {
            L1(mVar, action, selfieStepRunning.getSessionToken(), c2424c.getCause(), null, 4, null);
        }
        return h0.f84049a;
    }

    private final Object k1(c renderProps, l.ShowLoadingSpinner renderState, y20.k<? super c, l, ? extends b, ? extends Object>.a context, wn0.a<h0> backAction) {
        ii0.b.d(this.navigationStateManager, false, false, false, 4, null);
        return new d.b(renderState.getStyles(), renderState.getUseBasicSpinner(), backAction);
    }

    private final Object l1(c renderProps, final l.UiStepRunning renderState, y20.k<? super c, l, ? extends b, ? extends Object>.a context, wn0.a<h0> backAction) {
        NextStep.Ui.PromptPage promptPage;
        NextStep.Ui.PromptPage promptPage2;
        NextStep.Ui.PromptPage promptPage3;
        NextStep.Ui.PromptPage promptPage4;
        NextStep.Ui.PromptPage promptPage5;
        NextStep.Ui.PromptPage promptPage6;
        NextStep.Ui.PromptPage promptPage7;
        String clientSideKey = renderState.getClientSideKey();
        e5 e5Var = this.uiWorkflow;
        String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        List<UiComponentConfig> components = renderState.getComponents();
        String strW = renderState.w();
        boolean backStepEnabled = renderState.getBackStepEnabled();
        boolean cancelButtonEnabled = renderState.getCancelButtonEnabled();
        boolean finalStep = renderState.getFinalStep();
        InquirySessionConfig inquirySessionConfig = renderState.getInquirySessionConfig();
        NextStep.Ui.Localizations localizations = renderState.getLocalizations();
        String gpsPermissionsTitle = (localizations == null || (promptPage7 = localizations.getPromptPage()) == null) ? null : promptPage7.getGpsPermissionsTitle();
        NextStep.Ui.Localizations localizations2 = renderState.getLocalizations();
        String gpsPermissionsPrompt = (localizations2 == null || (promptPage6 = localizations2.getPromptPage()) == null) ? null : promptPage6.getGpsPermissionsPrompt();
        NextStep.Ui.Localizations localizations3 = renderState.getLocalizations();
        String gpsPermissionsAllowButtonText = (localizations3 == null || (promptPage5 = localizations3.getPromptPage()) == null) ? null : promptPage5.getGpsPermissionsAllowButtonText();
        NextStep.Ui.Localizations localizations4 = renderState.getLocalizations();
        String gpsPermissionsBtnCancel = (localizations4 == null || (promptPage4 = localizations4.getPromptPage()) == null) ? null : promptPage4.getGpsPermissionsBtnCancel();
        NextStep.Ui.Localizations localizations5 = renderState.getLocalizations();
        String gpsFeatureTitle = (localizations5 == null || (promptPage3 = localizations5.getPromptPage()) == null) ? null : promptPage3.getGpsFeatureTitle();
        NextStep.Ui.Localizations localizations6 = renderState.getLocalizations();
        String gpsFeaturePrompt = (localizations6 == null || (promptPage2 = localizations6.getPromptPage()) == null) ? null : promptPage2.getGpsFeaturePrompt();
        NextStep.Ui.Localizations localizations7 = renderState.getLocalizations();
        String gpsFeatureTurnOnText = (localizations7 == null || (promptPage = localizations7.getPromptPage()) == null) ? null : promptPage.getGpsFeatureTurnOnText();
        StepStyles.UiStepStyle styles = renderState.getStyles();
        List<UiComponentError> listV = renderState.v();
        v transitionStatus = renderState.getTransitionStatus();
        String str = gpsPermissionsTitle;
        boolean z11 = false;
        if (transitionStatus instanceof v.CheckingForNextState) {
            int i11 = e.f57971b[((v.CheckingForNextState) renderState.getTransitionStatus()).getPollingMode().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z11 = true;
            }
        } else if ((transitionStatus instanceof v.Transitioning) || p013kotlin.jvm.internal.s.f(transitionStatus, v.c.f58239a) || (transitionStatus instanceof v.UpdateInquirySession)) {
            z11 = true;
        } else if (transitionStatus != null) {
            throw new NoWhenBranchMatchedException();
        }
        ih0.d dVar = new ih0.d(new a30.n(context.d(e5Var, new e5.Input(sessionToken, inquiryId, components, strW, backStepEnabled, cancelButtonEnabled, finalStep, inquirySessionConfig, str, gpsPermissionsPrompt, gpsFeatureTurnOnText, gpsPermissionsBtnCancel, gpsFeatureTitle, gpsFeaturePrompt, gpsPermissionsAllowButtonText, styles, listV, z11, renderState.getTransitionError(), renderState.getIsRestoringState()), clientSideKey, new wn0.l() { // from class: bh0.y0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.m1(this.f17405a, renderState, (e5.c) obj);
            }
        }), renderState.getClientSideKey()), !p013kotlin.jvm.internal.s.f(renderState.getTransitionStatus(), v.c.f58239a), renderState.getClientSideKey());
        if (renderState.getIsRestoringState()) {
            y20.w.l(context, this.restoreUiStepStateWorkerFactory.a(renderState.getSessionToken(), renderState.getInquiryId(), renderState.w()), o0.o(r.class), "", new wn0.l() { // from class: bh0.j1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.t1(this.f17278a, renderState, (com.withpersona.sdk2.inquiry.internal.r.b) obj);
                }
            });
            return new d.b(renderState.getStyles(), true, backAction);
        }
        if (renderState.getTransitionError() != null) {
            context.a(bh0.r.a(renderState.getTransitionError()).name(), new i(context, this, null));
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r m1(final m mVar, final l.UiStepRunning uiStepRunning, final e5.c it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (p013kotlin.jvm.internal.s.f(it, e5.c.b.f1299a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.m0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.n1(uiStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof e5.c.d) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.o0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.o1(this.f17318a, it, uiStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof e5.c.FinishedWithoutTransition) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.p0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.p1(uiStepRunning, it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof e5.c.FinishedWithTransition) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.q0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.q1(uiStepRunning, it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof e5.c.a) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.r0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.r1(uiStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof e5.c.C0046c) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.s0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.s1(uiStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 n1(l.UiStepRunning uiStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        String inquiryId = uiStepRunning.getInquiryId();
        String sessionToken = uiStepRunning.getSessionToken();
        StepStyles.UiStepStyle styles = uiStepRunning.getStyles();
        NextStep.CancelDialog cancelDialog = uiStepRunning.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = uiStepRunning.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = uiStepRunning.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = uiStepRunning.getCancelDialog();
        action.d(new b.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, false, 128, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 o1(m mVar, e5.c cVar, l.UiStepRunning uiStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        e5.c.d dVar = (e5.c.d) cVar;
        if (mVar.q0(dVar.getCause())) {
            action.e(mVar.w1(uiStepRunning));
        } else {
            mVar.K1(action, uiStepRunning.getSessionToken(), dVar.getCause(), dVar.getMessage());
        }
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 p1(l.UiStepRunning uiStepRunning, e5.c cVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        e5.c.FinishedWithoutTransition fVar = (e5.c.FinishedWithoutTransition) cVar;
        action.e(l.UiStepRunning.h(uiStepRunning, null, null, new v.Transitioning(new w.TransitionData(fVar.getFromComponent(), fVar.a(), fVar.getFromStep())), null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, 262139, null));
        return h0.f84049a;
    }

    private final boolean q0(InternalErrorInfo internalErrorInfo) {
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            return false;
        }
        InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
        return (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.InconsistentTransitionError) || (networkErrorInfo.getResponseError() instanceof ErrorResponse.Error.TransitionFromTerminalStateError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 q1(l.UiStepRunning uiStepRunning, e5.c cVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(l.UiStepRunning.h(uiStepRunning, null, null, new v.UpdateInquirySession(null, ((e5.c.FinishedWithTransition) cVar).getCanReuseWorkflow()), null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, 262139, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 r1(l.UiStepRunning uiStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.e(l.UiStepRunning.h(uiStepRunning, null, null, v.c.f58239a, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, 262139, null));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 s0(y20.k.a aVar, m mVar) {
        t0(aVar, mVar, false);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 s1(l.UiStepRunning uiStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        action.d(new b.Complete(uiStepRunning.getInquiryId(), uiStepRunning.getInquiryStatus(), uiStepRunning.l(), uiStepRunning.getSessionToken()));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(y20.k<? super c, l, ? extends b, ? extends Object>.a aVar, m mVar, final boolean z11) {
        aVar.c().b(y20.z.d(mVar, null, new wn0.l() { // from class: bh0.h2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.u0(z11, (y20.r.c) obj);
            }
        }, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r t1(final m mVar, final l.UiStepRunning uiStepRunning, final r.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (p013kotlin.jvm.internal.s.f(it, r.b.a.f58221a)) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.i1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.u1(this.f17272a, uiStepRunning, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof r.b.C1188b) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.k1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.v1(it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 u0(boolean z11, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        l lVar = (l) action.c();
        String inquiryId = lVar.getInquiryId();
        String sessionToken = lVar.getSessionToken();
        StepStyle styles = lVar.getStyles();
        NextStep.CancelDialog cancelDialog = lVar.getCancelDialog();
        String title = cancelDialog != null ? cancelDialog.getTitle() : null;
        NextStep.CancelDialog cancelDialog2 = lVar.getCancelDialog();
        String prompt = cancelDialog2 != null ? cancelDialog2.getPrompt() : null;
        NextStep.CancelDialog cancelDialog3 = lVar.getCancelDialog();
        String btnResume = cancelDialog3 != null ? cancelDialog3.getBtnResume() : null;
        NextStep.CancelDialog cancelDialog4 = lVar.getCancelDialog();
        action.d(new b.Cancel(inquiryId, sessionToken, styles, title, prompt, btnResume, cancelDialog4 != null ? cancelDialog4.getBtnSubmit() : null, z11));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 u1(m mVar, l.UiStepRunning uiStepRunning, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        if (!(action.c() instanceof l.UiStepRunning)) {
            return h0.f84049a;
        }
        action.e(mVar.w1(uiStepRunning));
        return h0.f84049a;
    }

    private final Object v0(l.Complete renderState, y20.k<? super c, l, ? extends b, ? extends Object>.a context) {
        context.a("complete", new h(context, this, renderState, null));
        return new d.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 v1(r.b bVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        Object objC = action.c();
        l.UiStepRunning uiStepRunning = objC instanceof l.UiStepRunning ? (l.UiStepRunning) objC : null;
        if (uiStepRunning == null) {
            return h0.f84049a;
        }
        action.e(l.UiStepRunning.h(uiStepRunning, null, null, null, null, null, null, null, null, ((r.b.C1188b) bVar).a(), false, false, false, null, null, null, null, null, false, 130815, null));
        return h0.f84049a;
    }

    private final Object w0(c renderProps, l.CreateInquiryFromTemplate renderState, y20.k<? super c, l, ? extends b, ? extends Object>.a context, wn0.a<h0> backAction) {
        return R0(renderProps, new InquiryAttributes(renderState.getTemplateId(), renderState.getTemplateVersion(), renderState.getInquiryId(), renderState.getSessionToken(), renderProps.getEnvironment(), renderState.getEnvironmentId(), renderState.getAccountId(), renderState.getReferenceId(), null, renderState.i(), renderState.getThemeSetId(), 256, null), context, renderState.getStyles(), backAction);
    }

    private final l.ShowLoadingSpinner w1(bh0.r2 stepState) {
        return new l.ShowLoadingSpinner(stepState.o(), null, stepState.q(), stepState.getStyles(), true, stepState.getInquirySessionConfig(), 2, null);
    }

    private final Object x0(c renderProps, final l.CreateInquirySession renderState, y20.k<? super c, l, ? extends b, ? extends Object>.a context, wn0.a<h0> backAction) {
        ii0.b.d(this.navigationStateManager, false, false, false, 4, null);
        y20.w.l(context, this.inquirySessionWorker.a(renderState.getInquiryId()), o0.o(a.class), "", new wn0.l() { // from class: bh0.d0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.y0(this.f17221a, renderState, (com.withpersona.sdk2.inquiry.internal.network.b) obj);
            }
        });
        return new d.b(renderState.getStyles(), true, backAction);
    }

    private final void x1(c renderProps, final l renderState, y20.k<? super c, l, ? extends b, ? extends Object>.a context) {
        final String sessionToken = renderState.getSessionToken();
        String inquiryId = renderState.getInquiryId();
        String fromStep = renderState.getFromStep();
        final v transitionStatus = renderState.getTransitionStatus();
        if (transitionStatus instanceof v.Transitioning) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            y20.w.l(context, this.transitionWorkerFactory.a(sessionToken, inquiryId, renderState.getInquirySessionConfig(), ((v.Transitioning) transitionStatus).getTransitionData()), o0.o(w.class), "", new wn0.l() { // from class: bh0.u1
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.I1(this.f17384a, renderState, sessionToken, (com.withpersona.sdk2.inquiry.internal.w.b) obj);
                }
            });
            return;
        }
        if (transitionStatus instanceof v.UpdateInquirySession) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            y20.w.l(context, this.updateInquirySessionWorkerFactory.a(sessionToken, inquiryId, renderState.getInquirySessionConfig()), o0.o(z.class), "", new wn0.l() { // from class: bh0.d2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.A1(this.f17224a, sessionToken, transitionStatus, (com.withpersona.sdk2.inquiry.internal.network.i) obj);
                }
            });
            return;
        }
        if (transitionStatus instanceof v.CheckingForNextState) {
            if (sessionToken == null || inquiryId == null) {
                return;
            }
            v.CheckingForNextState checkingForNextState = (v.CheckingForNextState) transitionStatus;
            y20.w.l(context, this.pollingWorker.a(sessionToken, inquiryId, checkingForNextState.getPollingMode(), renderState.getInquirySessionConfig(), checkingForNextState.getCanReuseWorkflow()), o0.o(p.class), "", new wn0.l() { // from class: bh0.e2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.D1(this.f17229a, transitionStatus, renderState, sessionToken, (com.withpersona.sdk2.inquiry.internal.p.c) obj);
                }
            });
            return;
        }
        if (!p013kotlin.jvm.internal.s.f(transitionStatus, v.c.f58239a)) {
            if (transitionStatus != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (sessionToken == null || inquiryId == null || fromStep == null) {
                return;
            }
            y20.w.l(context, this.transitionBackWorker.a(sessionToken, inquiryId, fromStep, renderState.getInquirySessionConfig()), o0.o(t.class), "", new wn0.l() { // from class: bh0.f2
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.F1(this.f17235a, renderState, sessionToken, (com.withpersona.sdk2.inquiry.internal.network.h) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y20.r y0(final m mVar, final l.CreateInquirySession createInquirySession, final com.withpersona.sdk2.inquiry.internal.network.b it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.b.Success) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.u0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.z0(createInquirySession, it, mVar, (y20.r.c) obj);
                }
            }, 1, null);
        }
        if (it instanceof com.withpersona.sdk2.inquiry.internal.network.b.Error) {
            return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.v0
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return com.withpersona.sdk2.inquiry.internal.m.A0(this.f17389a, createInquirySession, it, (y20.r.c) obj);
                }
            }, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final y20.r<c, l, b> y1(final m mVar, final l lVar, final String str, final InternalErrorInfo internalErrorInfo) {
        return y20.z.d(mVar, null, new wn0.l() { // from class: bh0.c2
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return com.withpersona.sdk2.inquiry.internal.m.z1(internalErrorInfo, lVar, mVar, str, (y20.r.c) obj);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 z0(l.CreateInquirySession createInquirySession, com.withpersona.sdk2.inquiry.internal.network.b bVar, m mVar, y20.r.c action) {
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        com.withpersona.sdk2.inquiry.internal.network.b.Success success = (com.withpersona.sdk2.inquiry.internal.network.b.Success) bVar;
        action.e(new l.LoadFeatureFlagSession(createInquirySession.getInquiryId(), success.getSessionToken(), success.getInquirySessionConfig()));
        mVar.externalEventLogger.b(new zg0.c.StartEvent(createInquirySession.getInquiryId(), com.withpersona.sdk2.inquiry.internal.h.INSTANCE.a(success.getSessionToken())));
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v0, types: [com.withpersona.sdk2.inquiry.internal.l] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.withpersona.sdk2.inquiry.internal.l$l] */
    public static final h0 z1(InternalErrorInfo internalErrorInfo, l lVar, m mVar, String str, y20.r.c action) {
        Collection<UiComponentError> collectionValues;
        p013kotlin.jvm.internal.s.k(action, "$this$action");
        if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
            InternalErrorInfo.NetworkErrorInfo networkErrorInfo = (InternalErrorInfo.NetworkErrorInfo) internalErrorInfo;
            ErrorResponse.Error responseError = networkErrorInfo.getResponseError();
            Object objM1 = null;
            if (responseError instanceof ErrorResponse.Error.InvalidFieldValueError) {
                Object objC = action.c();
                l.UiStepRunning uiStepRunning = objC instanceof l.UiStepRunning ? (l.UiStepRunning) objC : null;
                if (uiStepRunning == null) {
                    return h0.f84049a;
                }
                Map<String, UiComponentError> details = ((ErrorResponse.Error.InvalidFieldValueError) responseError).getDetails();
                if (details != null && (collectionValues = details.values()) != null) {
                    objM1 = p013kotlin.collections.v.m1(collectionValues);
                }
                action.e(l.UiStepRunning.h(uiStepRunning, null, null, null, null, null, null, null, null, null, false, false, false, null, null, objM1, null, null, false, 245755, null));
            } else if (responseError instanceof ErrorResponse.Error.InconsistentTransitionError) {
                if (lVar instanceof bh0.r2) {
                    action.e(mVar.w1((bh0.r2) lVar));
                } else {
                    L1(mVar, action, str, internalErrorInfo, null, 4, null);
                }
            } else {
                if (!(responseError instanceof ErrorResponse.Error.FieldNotFoundError) && !(responseError instanceof ErrorResponse.Error.InactiveTemplateError) && !(responseError instanceof ErrorResponse.Error.InvalidConfigError) && !(responseError instanceof ErrorResponse.Error.RateLimitExceededError) && !(responseError instanceof ErrorResponse.Error.TransitionFromTerminalStateError) && !(responseError instanceof ErrorResponse.Error.UnauthenticatedError) && !(responseError instanceof ErrorResponse.Error.UnknownError) && responseError != null) {
                    throw new NoWhenBranchMatchedException();
                }
                if (networkErrorInfo.isRecoverable()) {
                    Object objC2 = action.c();
                    ?? r11 = objC2 instanceof l.UiStepRunning ? (l.UiStepRunning) objC2 : null;
                    if (r11 == 0) {
                        return h0.f84049a;
                    }
                    action.e(l.UiStepRunning.h(r11, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, networkErrorInfo, null, false, 229371, null));
                } else {
                    L1(mVar, action, str, internalErrorInfo, null, 4, null);
                }
            }
        } else {
            if (!(internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.InvalidOneTimeLinkCode)) {
                throw new NoWhenBranchMatchedException();
            }
            L1(mVar, action, str, internalErrorInfo, null, 4, null);
        }
        return h0.f84049a;
    }

    @Override // y20.k
    /* JADX INFO: renamed from: M1, reason: merged with bridge method [inline-methods] */
    public Snapshot g(l state) {
        p013kotlin.jvm.internal.s.k(state, "state");
        if (!(state instanceof l.UiStepRunning)) {
            return a30.s.a(state);
        }
        l.UiStepRunning uiStepRunning = (l.UiStepRunning) state;
        this.uiStepSavedStateHelper.e(uiStepRunning.getSessionToken(), uiStepRunning.getInquiryId(), uiStepRunning.w(), uiStepRunning.getComponents());
        return a30.s.a(l.UiStepRunning.h(uiStepRunning, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, 261887, null));
    }

    @Override // y20.k
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public l d(c props, Snapshot snapshot) {
        l lVar;
        Parcelable parcelable;
        p013kotlin.jvm.internal.s.k(props, "props");
        if (snapshot != null) {
            okio.k kVarB = snapshot.b();
            if (kVarB.D() <= 0) {
                kVarB = null;
            }
            if (kVarB == null) {
                parcelable = null;
            } else {
                Parcel parcelObtain = Parcel.obtain();
                p013kotlin.jvm.internal.s.j(parcelObtain, "obtain()");
                byte[] bArrJ = kVarB.J();
                parcelObtain.unmarshall(bArrJ, 0, bArrJ.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                p013kotlin.jvm.internal.s.h(parcelable);
                p013kotlin.jvm.internal.s.j(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            lVar = (l) parcelable;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return lVar instanceof l.UiStepRunning ? l.UiStepRunning.h((l.UiStepRunning) lVar, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, true, 131071, null) : lVar;
        }
        if (props instanceof c.TemplateProps) {
            c.TemplateProps templateProps = (c.TemplateProps) props;
            return new l.CreateInquiryFromTemplate(templateProps.getTemplateId(), templateProps.getTemplateVersion(), templateProps.getAccountId(), templateProps.getEnvironmentId(), templateProps.getReferenceId(), templateProps.c(), templateProps.getThemeSetId(), templateProps.getStaticInquiryTemplate());
        }
        if (props instanceof c.OneTimeCodeProps) {
            return new l.ExchangeOneTimeCode(((c.OneTimeCodeProps) props).getOneTimeLinkCode());
        }
        if (!(props instanceof c.InquiryProps)) {
            throw new NoWhenBranchMatchedException();
        }
        c.InquiryProps inquiryProps = (c.InquiryProps) props;
        if (yh0.h.e(inquiryProps.getInquiryId()) && inquiryProps.getSessionToken() != null) {
            return new l.ResumeFallbackInquiry(inquiryProps.getInquiryId(), inquiryProps.getSessionToken());
        }
        String sessionToken = inquiryProps.getSessionToken();
        if (sessionToken == null || sessionToken.length() == 0) {
            return new l.CreateInquirySession(inquiryProps.getInquiryId());
        }
        return new l.ShowLoadingSpinner(inquiryProps.getSessionToken(), new v.CheckingForNextState(null, false, 3, null), inquiryProps.getInquiryId(), null, true, InquirySessionConfig.INSTANCE.a());
    }

    @Override // y20.k
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public Object f(c renderProps, l renderState, final y20.k<? super c, l, ? extends b, ? extends Object>.a context) {
        Object objA1;
        p013kotlin.jvm.internal.s.k(renderProps, "renderProps");
        p013kotlin.jvm.internal.s.k(renderState, "renderState");
        p013kotlin.jvm.internal.s.k(context, "context");
        x1(renderProps, renderState, context);
        this.navigationStateManager.e(p013kotlin.jvm.internal.s.f(renderState.getTransitionStatus(), v.c.f58239a));
        wn0.a<h0> aVar = new wn0.a() { // from class: bh0.c0
            @Override // wn0.a
            public final Object invoke() {
                return com.withpersona.sdk2.inquiry.internal.m.s0(context, this);
            }
        };
        context.a("controllerRequestCollector", new f(context, null));
        if (renderProps.getIsCancelled()) {
            context.a("cancel_inquiry", new g(context, this, null));
        }
        if (renderState instanceof l.CreateInquiryFromTemplate) {
            objA1 = w0(renderProps, (l.CreateInquiryFromTemplate) renderState, context, aVar);
        } else if (renderState instanceof l.ResumeFallbackInquiry) {
            objA1 = d1(renderProps, (l.ResumeFallbackInquiry) renderState, context, aVar);
        } else if (renderState instanceof l.CreateInquirySession) {
            objA1 = x0(renderProps, (l.CreateInquirySession) renderState, context, aVar);
        } else if (renderState instanceof l.ExchangeOneTimeCode) {
            objA1 = H0(renderProps, (l.ExchangeOneTimeCode) renderState, context, aVar);
        } else if (renderState instanceof l.ShowLoadingSpinner) {
            objA1 = k1(renderProps, (l.ShowLoadingSpinner) renderState, context, aVar);
        } else if (renderState instanceof l.GovernmentIdStepRunning) {
            objA1 = L0(renderProps, (l.GovernmentIdStepRunning) renderState, context);
        } else if (renderState instanceof l.SelfieStepRunning) {
            objA1 = e1(renderProps, (l.SelfieStepRunning) renderState, context, aVar);
        } else if (renderState instanceof l.UiStepRunning) {
            objA1 = l1(renderProps, (l.UiStepRunning) renderState, context, aVar);
        } else if (renderState instanceof l.DocumentStepRunning) {
            objA1 = B0((l.DocumentStepRunning) renderState, context);
        } else if (renderState instanceof l.Complete) {
            objA1 = v0((l.Complete) renderState, context);
        } else if (renderState instanceof l.IntegrationStepRunning) {
            objA1 = V0(renderProps, (l.IntegrationStepRunning) renderState, context);
        } else {
            if (!(renderState instanceof l.LoadFeatureFlagSession)) {
                throw new NoWhenBranchMatchedException();
            }
            objA1 = a1((l.LoadFeatureFlagSession) renderState, context, aVar);
        }
        ki0.k kVarT1 = T1(objA1, renderState);
        return this.sandboxFlags.getIsSandboxModeEnabled() ? N1(kVarT1, context) : kVarT1;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$c;", "Landroid/os/Parcelable;", "Lbh0/f;", "J", "()Lbh0/f;", AnalyticsAttribute.Environment, "", "getTheme", "()Ljava/lang/Integer;", "theme", "", "isCancelled", "()Z", "c", "a", "b", "Lcom/withpersona/sdk2/inquiry/internal/m$c$a;", "Lcom/withpersona/sdk2/inquiry/internal/m$c$b;", "Lcom/withpersona/sdk2/inquiry/internal/m$c$c;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c extends Parcelable {
        /* JADX INFO: renamed from: J */
        bh0.f getEnvironment();

        Integer getTheme();

        /* JADX INFO: renamed from: isCancelled */
        boolean getIsCancelled();

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$c$b, reason: from toString */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\t\u0010'¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$c$b;", "Lcom/withpersona/sdk2/inquiry/internal/m$c;", "", "oneTimeLinkCode", "Lbh0/f;", AnalyticsAttribute.Environment, "", "theme", "", "isCancelled", "<init>", "(Ljava/lang/String;Lbh0/f;Ljava/lang/Integer;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lbh0/f;", "J", "()Lbh0/f;", "c", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class OneTimeCodeProps implements c {
            public static final Parcelable.Creator<OneTimeCodeProps> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String oneTimeLinkCode;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final bh0.f environment;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer theme;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isCancelled;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$c$b$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<OneTimeCodeProps> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OneTimeCodeProps createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new OneTimeCodeProps(parcel.readString(), bh0.f.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final OneTimeCodeProps[] newArray(int i11) {
                    return new OneTimeCodeProps[i11];
                }
            }

            public OneTimeCodeProps(String oneTimeLinkCode, bh0.f environment, Integer num, boolean z11) {
                p013kotlin.jvm.internal.s.k(oneTimeLinkCode, "oneTimeLinkCode");
                p013kotlin.jvm.internal.s.k(environment, "environment");
                this.oneTimeLinkCode = oneTimeLinkCode;
                this.environment = environment;
                this.theme = num;
                this.isCancelled = z11;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.m.c
            /* JADX INFO: renamed from: J, reason: from getter */
            public bh0.f getEnvironment() {
                return this.environment;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getOneTimeLinkCode() {
                return this.oneTimeLinkCode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OneTimeCodeProps)) {
                    return false;
                }
                OneTimeCodeProps oneTimeCodeProps = (OneTimeCodeProps) other;
                return p013kotlin.jvm.internal.s.f(this.oneTimeLinkCode, oneTimeCodeProps.oneTimeLinkCode) && this.environment == oneTimeCodeProps.environment && p013kotlin.jvm.internal.s.f(this.theme, oneTimeCodeProps.theme) && this.isCancelled == oneTimeCodeProps.isCancelled;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.m.c
            public Integer getTheme() {
                return this.theme;
            }

            public int hashCode() {
                int iHashCode = ((this.oneTimeLinkCode.hashCode() * 31) + this.environment.hashCode()) * 31;
                Integer num = this.theme;
                return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isCancelled);
            }

            @Override // com.withpersona.sdk2.inquiry.internal.m.c
            /* JADX INFO: renamed from: isCancelled, reason: from getter */
            public boolean getIsCancelled() {
                return this.isCancelled;
            }

            public String toString() {
                return "OneTimeCodeProps(oneTimeLinkCode=" + this.oneTimeLinkCode + ", environment=" + this.environment + ", theme=" + this.theme + ", isCancelled=" + this.isCancelled + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                int iIntValue;
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeString(this.oneTimeLinkCode);
                dest.writeString(this.environment.name());
                Integer num = this.theme;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    dest.writeInt(1);
                    iIntValue = num.intValue();
                }
                dest.writeInt(iIntValue);
                dest.writeInt(this.isCancelled ? 1 : 0);
            }

            public /* synthetic */ OneTimeCodeProps(String str, bh0.f fVar, Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, fVar, num, (i11 & 8) != 0 ? false : z11);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$c$a, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u000b\u0010-¨\u0006."}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$c$a;", "Lcom/withpersona/sdk2/inquiry/internal/m$c;", "", "inquiryId", "sessionToken", "environmentId", "Lbh0/f;", AnalyticsAttribute.Environment, "", "theme", "", "isCancelled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbh0/f;Ljava/lang/Integer;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "o", "c", "getEnvironmentId", DateTokenConverter.CONVERTER_KEY, "Lbh0/f;", "J", "()Lbh0/f;", "e", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "f", "Z", "()Z", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class InquiryProps implements c {
            public static final Parcelable.Creator<InquiryProps> CREATOR = new C1183a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String inquiryId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String sessionToken;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String environmentId;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final bh0.f environment;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer theme;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isCancelled;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C1183a implements Parcelable.Creator<InquiryProps> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final InquiryProps createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new InquiryProps(parcel.readString(), parcel.readString(), parcel.readString(), bh0.f.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final InquiryProps[] newArray(int i11) {
                    return new InquiryProps[i11];
                }
            }

            public InquiryProps(String inquiryId, String str, String str2, bh0.f environment, Integer num, boolean z11) {
                p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
                p013kotlin.jvm.internal.s.k(environment, "environment");
                this.inquiryId = inquiryId;
                this.sessionToken = str;
                this.environmentId = str2;
                this.environment = environment;
                this.theme = num;
                this.isCancelled = z11;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.m.c
            /* JADX INFO: renamed from: J, reason: from getter */
            public bh0.f getEnvironment() {
                return this.environment;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getInquiryId() {
                return this.inquiryId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof InquiryProps)) {
                    return false;
                }
                InquiryProps inquiryProps = (InquiryProps) other;
                return p013kotlin.jvm.internal.s.f(this.inquiryId, inquiryProps.inquiryId) && p013kotlin.jvm.internal.s.f(this.sessionToken, inquiryProps.sessionToken) && p013kotlin.jvm.internal.s.f(this.environmentId, inquiryProps.environmentId) && this.environment == inquiryProps.environment && p013kotlin.jvm.internal.s.f(this.theme, inquiryProps.theme) && this.isCancelled == inquiryProps.isCancelled;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.m.c
            public Integer getTheme() {
                return this.theme;
            }

            public int hashCode() {
                int iHashCode = this.inquiryId.hashCode() * 31;
                String str = this.sessionToken;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.environmentId;
                int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.environment.hashCode()) * 31;
                Integer num = this.theme;
                return ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCancelled);
            }

            @Override // com.withpersona.sdk2.inquiry.internal.m.c
            /* JADX INFO: renamed from: isCancelled, reason: from getter */
            public boolean getIsCancelled() {
                return this.isCancelled;
            }

            /* JADX INFO: renamed from: o, reason: from getter */
            public final String getSessionToken() {
                return this.sessionToken;
            }

            public String toString() {
                return "InquiryProps(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", environmentId=" + this.environmentId + ", environment=" + this.environment + ", theme=" + this.theme + ", isCancelled=" + this.isCancelled + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                int iIntValue;
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeString(this.inquiryId);
                dest.writeString(this.sessionToken);
                dest.writeString(this.environmentId);
                dest.writeString(this.environment.name());
                Integer num = this.theme;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    dest.writeInt(1);
                    iIntValue = num.intValue();
                }
                dest.writeInt(iIntValue);
                dest.writeInt(this.isCancelled ? 1 : 0);
            }

            public /* synthetic */ InquiryProps(String str, String str2, String str3, bh0.f fVar, Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, fVar, num, (i11 & 32) != 0 ? false : z11);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$c$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010#\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b%\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b+\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b(\u0010\u001fR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010-\u001a\u0004\b*\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b/\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b,\u00101R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b\u0013\u0010<¨\u0006="}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$c$c;", "Lcom/withpersona/sdk2/inquiry/internal/m$c;", "", "templateId", "templateVersion", "accountId", "referenceId", "environmentId", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "themeSetId", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "Lbh0/f;", AnalyticsAttribute.Environment, "", "theme", "", "isCancelled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;Lbh0/f;Ljava/lang/Integer;Z)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "g", "c", DateTokenConverter.CONVERTER_KEY, "e", "Ljava/util/Map;", "()Ljava/util/Map;", "h", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", IntegerTokenConverter.CONVERTER_KEY, "Lbh0/f;", "J", "()Lbh0/f;", "j", "Ljava/lang/Integer;", "getTheme", "()Ljava/lang/Integer;", "k", "Z", "()Z", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TemplateProps implements c {
            public static final Parcelable.Creator<TemplateProps> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String templateId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String templateVersion;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String accountId;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String referenceId;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String environmentId;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Map<String, InquiryField> fields;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final String themeSetId;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final StaticInquiryTemplate staticInquiryTemplate;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final bh0.f environment;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final Integer theme;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isCancelled;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$c$c$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<TemplateProps> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final TemplateProps createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    Integer numValueOf;
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        numValueOf = null;
                        linkedHashMap = null;
                    } else {
                        int i11 = parcel.readInt();
                        linkedHashMap = new LinkedHashMap(i11);
                        for (int i12 = 0; i12 != i11; i12++) {
                            linkedHashMap.put(parcel.readString(), parcel.readParcelable(TemplateProps.class.getClassLoader()));
                        }
                        numValueOf = null;
                    }
                    String string6 = parcel.readString();
                    StaticInquiryTemplate staticInquiryTemplate = (StaticInquiryTemplate) parcel.readParcelable(TemplateProps.class.getClassLoader());
                    bh0.f fVarValueOf = bh0.f.valueOf(parcel.readString());
                    if (parcel.readInt() != 0) {
                        numValueOf = Integer.valueOf(parcel.readInt());
                    }
                    return new TemplateProps(string, string2, string3, string4, string5, linkedHashMap, string6, staticInquiryTemplate, fVarValueOf, numValueOf, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final TemplateProps[] newArray(int i11) {
                    return new TemplateProps[i11];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public TemplateProps(String str, String str2, String str3, String str4, String str5, Map<String, ? extends InquiryField> map, String str6, StaticInquiryTemplate staticInquiryTemplate, bh0.f environment, Integer num, boolean z11) {
                p013kotlin.jvm.internal.s.k(environment, "environment");
                this.templateId = str;
                this.templateVersion = str2;
                this.accountId = str3;
                this.referenceId = str4;
                this.environmentId = str5;
                this.fields = map;
                this.themeSetId = str6;
                this.staticInquiryTemplate = staticInquiryTemplate;
                this.environment = environment;
                this.theme = num;
                this.isCancelled = z11;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.m.c
            /* JADX INFO: renamed from: J, reason: from getter */
            public bh0.f getEnvironment() {
                return this.environment;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAccountId() {
                return this.accountId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getEnvironmentId() {
                return this.environmentId;
            }

            public final Map<String, InquiryField> c() {
                return this.fields;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getReferenceId() {
                return this.referenceId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final StaticInquiryTemplate getStaticInquiryTemplate() {
                return this.staticInquiryTemplate;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TemplateProps)) {
                    return false;
                }
                TemplateProps templateProps = (TemplateProps) other;
                return p013kotlin.jvm.internal.s.f(this.templateId, templateProps.templateId) && p013kotlin.jvm.internal.s.f(this.templateVersion, templateProps.templateVersion) && p013kotlin.jvm.internal.s.f(this.accountId, templateProps.accountId) && p013kotlin.jvm.internal.s.f(this.referenceId, templateProps.referenceId) && p013kotlin.jvm.internal.s.f(this.environmentId, templateProps.environmentId) && p013kotlin.jvm.internal.s.f(this.fields, templateProps.fields) && p013kotlin.jvm.internal.s.f(this.themeSetId, templateProps.themeSetId) && p013kotlin.jvm.internal.s.f(this.staticInquiryTemplate, templateProps.staticInquiryTemplate) && this.environment == templateProps.environment && p013kotlin.jvm.internal.s.f(this.theme, templateProps.theme) && this.isCancelled == templateProps.isCancelled;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getTemplateId() {
                return this.templateId;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getTemplateVersion() {
                return this.templateVersion;
            }

            @Override // com.withpersona.sdk2.inquiry.internal.m.c
            public Integer getTheme() {
                return this.theme;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getThemeSetId() {
                return this.themeSetId;
            }

            public int hashCode() {
                String str = this.templateId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.templateVersion;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.accountId;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.referenceId;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.environmentId;
                int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                Map<String, InquiryField> map = this.fields;
                int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
                String str6 = this.themeSetId;
                int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
                int iHashCode8 = (((iHashCode7 + (staticInquiryTemplate == null ? 0 : staticInquiryTemplate.hashCode())) * 31) + this.environment.hashCode()) * 31;
                Integer num = this.theme;
                return ((iHashCode8 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isCancelled);
            }

            @Override // com.withpersona.sdk2.inquiry.internal.m.c
            /* JADX INFO: renamed from: isCancelled, reason: from getter */
            public boolean getIsCancelled() {
                return this.isCancelled;
            }

            public String toString() {
                return "TemplateProps(templateId=" + this.templateId + ", templateVersion=" + this.templateVersion + ", accountId=" + this.accountId + ", referenceId=" + this.referenceId + ", environmentId=" + this.environmentId + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ", staticInquiryTemplate=" + this.staticInquiryTemplate + ", environment=" + this.environment + ", theme=" + this.theme + ", isCancelled=" + this.isCancelled + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeString(this.templateId);
                dest.writeString(this.templateVersion);
                dest.writeString(this.accountId);
                dest.writeString(this.referenceId);
                dest.writeString(this.environmentId);
                Map<String, InquiryField> map = this.fields;
                if (map == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(map.size());
                    for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                        dest.writeString(entry.getKey());
                        dest.writeParcelable(entry.getValue(), flags);
                    }
                }
                dest.writeString(this.themeSetId);
                dest.writeParcelable(this.staticInquiryTemplate, flags);
                dest.writeString(this.environment.name());
                Integer num = this.theme;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(num.intValue());
                }
                dest.writeInt(this.isCancelled ? 1 : 0);
            }

            public /* synthetic */ TemplateProps(String str, String str2, String str3, String str4, String str5, Map map, String str6, StaticInquiryTemplate staticInquiryTemplate, bh0.f fVar, Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, str4, str5, map, str6, staticInquiryTemplate, fVar, num, (i11 & 1024) != 0 ? false : z11);
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$b;", "Landroid/os/Parcelable;", "", "o", "()Ljava/lang/String;", "sessionToken", "b", DateTokenConverter.CONVERTER_KEY, "a", "c", "Lcom/withpersona/sdk2/inquiry/internal/m$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/m$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/m$b$c;", "Lcom/withpersona/sdk2/inquiry/internal/m$b$d;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b extends Parcelable {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001c\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u0015¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/m$b;", "", "inquiryId", "inquiryStatus", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "sessionToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/Map;", "()Ljava/util/Map;", DateTokenConverter.CONVERTER_KEY, "o", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Complete implements b {
            public static final Parcelable.Creator<Complete> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String inquiryId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String inquiryStatus;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Map<String, InquiryField> fields;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String sessionToken;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$b$b$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Complete> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Complete createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    int i11 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(Complete.class.getClassLoader()));
                    }
                    return new Complete(string, string2, linkedHashMap, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Complete[] newArray(int i11) {
                    return new Complete[i11];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Complete(String inquiryId, String inquiryStatus, Map<String, ? extends InquiryField> fields, String str) {
                p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
                p013kotlin.jvm.internal.s.k(inquiryStatus, "inquiryStatus");
                p013kotlin.jvm.internal.s.k(fields, "fields");
                this.inquiryId = inquiryId;
                this.inquiryStatus = inquiryStatus;
                this.fields = fields;
                this.sessionToken = str;
            }

            public final Map<String, InquiryField> a() {
                return this.fields;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getInquiryId() {
                return this.inquiryId;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getInquiryStatus() {
                return this.inquiryStatus;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Complete)) {
                    return false;
                }
                Complete complete = (Complete) other;
                return p013kotlin.jvm.internal.s.f(this.inquiryId, complete.inquiryId) && p013kotlin.jvm.internal.s.f(this.inquiryStatus, complete.inquiryStatus) && p013kotlin.jvm.internal.s.f(this.fields, complete.fields) && p013kotlin.jvm.internal.s.f(this.sessionToken, complete.sessionToken);
            }

            public int hashCode() {
                int iHashCode = ((((this.inquiryId.hashCode() * 31) + this.inquiryStatus.hashCode()) * 31) + this.fields.hashCode()) * 31;
                String str = this.sessionToken;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // com.withpersona.sdk2.inquiry.internal.m.b
            /* JADX INFO: renamed from: o, reason: from getter */
            public String getSessionToken() {
                return this.sessionToken;
            }

            public String toString() {
                return "Complete(inquiryId=" + this.inquiryId + ", inquiryStatus=" + this.inquiryStatus + ", fields=" + this.fields + ", sessionToken=" + this.sessionToken + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeString(this.inquiryId);
                dest.writeString(this.inquiryStatus);
                Map<String, InquiryField> map = this.fields;
                dest.writeInt(map.size());
                for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeParcelable(entry.getValue(), flags);
                }
                dest.writeString(this.sessionToken);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u001c\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u0015¨\u0006&"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$b$c;", "Lcom/withpersona/sdk2/inquiry/internal/m$b;", "", "debugMessage", "Lzi0/d;", "errorCode", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "sessionToken", "<init>", "(Ljava/lang/String;Lzi0/d;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lzi0/d;", "c", "()Lzi0/d;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", DateTokenConverter.CONVERTER_KEY, "o", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements b {
            public static final Parcelable.Creator<Error> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String debugMessage;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final zi0.d errorCode;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final InternalErrorInfo cause;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String sessionToken;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$b$c$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Error> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Error createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Error(parcel.readString(), (zi0.d) parcel.readParcelable(Error.class.getClassLoader()), (InternalErrorInfo) parcel.readParcelable(Error.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Error[] newArray(int i11) {
                    return new Error[i11];
                }
            }

            public Error(String str, zi0.d errorCode, InternalErrorInfo cause, String str2) {
                p013kotlin.jvm.internal.s.k(errorCode, "errorCode");
                p013kotlin.jvm.internal.s.k(cause, "cause");
                this.debugMessage = str;
                this.errorCode = errorCode;
                this.cause = cause;
                this.sessionToken = str2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getDebugMessage() {
                return this.debugMessage;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final zi0.d getErrorCode() {
                return this.errorCode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return p013kotlin.jvm.internal.s.f(this.debugMessage, error.debugMessage) && this.errorCode == error.errorCode && p013kotlin.jvm.internal.s.f(this.cause, error.cause) && p013kotlin.jvm.internal.s.f(this.sessionToken, error.sessionToken);
            }

            public int hashCode() {
                String str = this.debugMessage;
                int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.errorCode.hashCode()) * 31) + this.cause.hashCode()) * 31;
                String str2 = this.sessionToken;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.withpersona.sdk2.inquiry.internal.m.b
            /* JADX INFO: renamed from: o, reason: from getter */
            public String getSessionToken() {
                return this.sessionToken;
            }

            public String toString() {
                return "Error(debugMessage=" + this.debugMessage + ", errorCode=" + this.errorCode + ", cause=" + this.cause + ", sessionToken=" + this.sessionToken + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeString(this.debugMessage);
                dest.writeParcelable(this.errorCode, flags);
                dest.writeParcelable(this.cause, flags);
                dest.writeString(this.sessionToken);
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$b$d, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$b$d;", "Lcom/withpersona/sdk2/inquiry/internal/m$b;", "", "inquiryId", "sessionToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "o", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ReinitializeWithFallbackMode implements b {
            public static final Parcelable.Creator<ReinitializeWithFallbackMode> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String inquiryId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String sessionToken;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$b$d$a */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ReinitializeWithFallbackMode> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ReinitializeWithFallbackMode createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new ReinitializeWithFallbackMode(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ReinitializeWithFallbackMode[] newArray(int i11) {
                    return new ReinitializeWithFallbackMode[i11];
                }
            }

            public ReinitializeWithFallbackMode(String inquiryId, String str) {
                p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
                this.inquiryId = inquiryId;
                this.sessionToken = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getInquiryId() {
                return this.inquiryId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReinitializeWithFallbackMode)) {
                    return false;
                }
                ReinitializeWithFallbackMode reinitializeWithFallbackMode = (ReinitializeWithFallbackMode) other;
                return p013kotlin.jvm.internal.s.f(this.inquiryId, reinitializeWithFallbackMode.inquiryId) && p013kotlin.jvm.internal.s.f(this.sessionToken, reinitializeWithFallbackMode.sessionToken);
            }

            public int hashCode() {
                int iHashCode = this.inquiryId.hashCode() * 31;
                String str = this.sessionToken;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // com.withpersona.sdk2.inquiry.internal.m.b
            /* JADX INFO: renamed from: o, reason: from getter */
            public String getSessionToken() {
                return this.sessionToken;
            }

            public String toString() {
                return "ReinitializeWithFallbackMode(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeString(this.inquiryId);
                dest.writeString(this.sessionToken);
            }
        }

        /* JADX INFO: renamed from: o */
        String getSessionToken();

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0017J\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b'\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b)\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b\"\u0010,¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/m$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/m$b;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "title", "message", "resumeButtonText", "cancelButtonText", "", "force", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "o", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "f", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", DateTokenConverter.CONVERTER_KEY, "g", "e", "h", "Z", "()Z", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Cancel implements b {
            public static final Parcelable.Creator<Cancel> CREATOR = new C1181a();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String inquiryId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String sessionToken;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final StepStyle styles;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String title;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String message;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final String resumeButtonText;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final String cancelButtonText;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean force;

            /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.m$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class C1181a implements Parcelable.Creator<Cancel> {
                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Cancel createFromParcel(Parcel parcel) {
                    p013kotlin.jvm.internal.s.k(parcel, "parcel");
                    return new Cancel(parcel.readString(), parcel.readString(), (StepStyle) parcel.readParcelable(Cancel.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Cancel[] newArray(int i11) {
                    return new Cancel[i11];
                }
            }

            public Cancel(String str, String str2, StepStyle stepStyle, String str3, String str4, String str5, String str6, boolean z11) {
                this.inquiryId = str;
                this.sessionToken = str2;
                this.styles = stepStyle;
                this.title = str3;
                this.message = str4;
                this.resumeButtonText = str5;
                this.cancelButtonText = str6;
                this.force = z11;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getCancelButtonText() {
                return this.cancelButtonText;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getForce() {
                return this.force;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getInquiryId() {
                return this.inquiryId;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getResumeButtonText() {
                return this.resumeButtonText;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Cancel)) {
                    return false;
                }
                Cancel cancel = (Cancel) other;
                return p013kotlin.jvm.internal.s.f(this.inquiryId, cancel.inquiryId) && p013kotlin.jvm.internal.s.f(this.sessionToken, cancel.sessionToken) && p013kotlin.jvm.internal.s.f(this.styles, cancel.styles) && p013kotlin.jvm.internal.s.f(this.title, cancel.title) && p013kotlin.jvm.internal.s.f(this.message, cancel.message) && p013kotlin.jvm.internal.s.f(this.resumeButtonText, cancel.resumeButtonText) && p013kotlin.jvm.internal.s.f(this.cancelButtonText, cancel.cancelButtonText) && this.force == cancel.force;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final StepStyle getStyles() {
                return this.styles;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                String str = this.inquiryId;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.sessionToken;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                StepStyle stepStyle = this.styles;
                int iHashCode3 = (iHashCode2 + (stepStyle == null ? 0 : stepStyle.hashCode())) * 31;
                String str3 = this.title;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.message;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.resumeButtonText;
                int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.cancelButtonText;
                return ((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + Boolean.hashCode(this.force);
            }

            @Override // com.withpersona.sdk2.inquiry.internal.m.b
            /* JADX INFO: renamed from: o, reason: from getter */
            public String getSessionToken() {
                return this.sessionToken;
            }

            public String toString() {
                return "Cancel(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", styles=" + this.styles + ", title=" + this.title + ", message=" + this.message + ", resumeButtonText=" + this.resumeButtonText + ", cancelButtonText=" + this.cancelButtonText + ", force=" + this.force + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                p013kotlin.jvm.internal.s.k(dest, "dest");
                dest.writeString(this.inquiryId);
                dest.writeString(this.sessionToken);
                dest.writeParcelable(this.styles, flags);
                dest.writeString(this.title);
                dest.writeString(this.message);
                dest.writeString(this.resumeButtonText);
                dest.writeString(this.cancelButtonText);
                dest.writeInt(this.force ? 1 : 0);
            }

            public /* synthetic */ Cancel(String str, String str2, StepStyle stepStyle, String str3, String str4, String str5, String str6, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, stepStyle, str3, str4, str5, str6, (i11 & 128) != 0 ? false : z11);
            }
        }
    }
}
