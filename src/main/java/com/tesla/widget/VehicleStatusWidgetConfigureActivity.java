package com.tesla.widget;

import android.annotation.SuppressLint;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p003lifecycle.x;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.tesla.widget.VehicleStatusWidgetConfigureActivity;
import java.io.File;
import java.util.List;
import jn0.h0;
import jn0.m;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import me0.WidgetBuilderConfig;
import me0.a0;
import me0.b0;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wb0.e;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/tesla/widget/VehicleStatusWidgetConfigureActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Ljn0/h0;", "A", "Lxc0/a;", "vehicle", "B", "(Lxc0/a;)V", "Landroid/os/Bundle;", "icicle", "onCreate", "(Landroid/os/Bundle;)V", "", "f", "I", "appWidgetId", "Lpe0/b;", "g", "Lpe0/b;", "binding", "Loe0/e;", "h", "Lkotlin/Lazy;", "x", "()Loe0/e;", "vehicleRepo", "Lme0/s;", IntegerTokenConverter.CONVERTER_KEY, "y", "()Lme0/s;", "widgetBuilder", "Lqe0/a;", "j", "z", "()Lqe0/a;", "widgetDependencies", "a", "b", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VehicleStatusWidgetConfigureActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int appWidgetId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private pe0.b binding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy vehicleRepo = m.b(new wn0.a() { // from class: me0.o
        @Override // wn0.a
        public final Object invoke() {
            return VehicleStatusWidgetConfigureActivity.C();
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Lazy widgetBuilder = m.b(new wn0.a() { // from class: me0.p
        @Override // wn0.a
        public final Object invoke() {
            return VehicleStatusWidgetConfigureActivity.D();
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Lazy widgetDependencies = m.b(new wn0.a() { // from class: me0.q
        @Override // wn0.a
        public final Object invoke() {
            return VehicleStatusWidgetConfigureActivity.E();
        }
    });

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00112\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/tesla/widget/VehicleStatusWidgetConfigureActivity$a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/tesla/widget/VehicleStatusWidgetConfigureActivity$b;", "Lcom/tesla/widget/VehicleStatusWidgetConfigureActivity;", "", "Lxc0/a;", "vehicles", "<init>", "(Lcom/tesla/widget/VehicleStatusWidgetConfigureActivity;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "c", "(Landroid/view/ViewGroup;I)Lcom/tesla/widget/VehicleStatusWidgetConfigureActivity$b;", "holder", "position", "Ljn0/h0;", "b", "(Lcom/tesla/widget/VehicleStatusWidgetConfigureActivity$b;I)V", "getItemCount", "()I", "a", "Ljava/util/List;", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class a extends RecyclerView.h<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List<xc0.a> vehicles;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VehicleStatusWidgetConfigureActivity f56584b;

        public a(VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity, List<xc0.a> vehicles) {
            s.k(vehicles, "vehicles");
            this.f56584b = vehicleStatusWidgetConfigureActivity;
            this.vehicles = vehicles;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity, a aVar, b bVar, View view) {
            vehicleStatusWidgetConfigureActivity.B(aVar.vehicles.get(bVar.getAdapterPosition()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(b holder, int position) {
            s.k(holder, "holder");
            holder.a(this.vehicles.get(position));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(ViewGroup parent, int viewType) {
            s.k(parent, "parent");
            VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity = this.f56584b;
            pe0.a aVarC = pe0.a.c(LayoutInflater.from(parent.getContext()), parent, false);
            s.j(aVarC, "inflate(...)");
            final b bVar = new b(vehicleStatusWidgetConfigureActivity, aVarC);
            final VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity2 = this.f56584b;
            bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: me0.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VehicleStatusWidgetConfigureActivity.a.d(vehicleStatusWidgetConfigureActivity2, this, bVar, view);
                }
            });
            return bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.vehicles.size();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u001c\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/tesla/widget/VehicleStatusWidgetConfigureActivity$b;", "Landroidx/recyclerview/widget/RecyclerView$g0;", "Lpe0/a;", "vehicleBinding", "<init>", "(Lcom/tesla/widget/VehicleStatusWidgetConfigureActivity;Lpe0/a;)V", "Lxc0/a;", "vehicle", "Ljn0/h0;", "a", "(Lxc0/a;)V", "Lpe0/a;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final pe0.a vehicleBinding;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ VehicleStatusWidgetConfigureActivity f56587c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity, pe0.a vehicleBinding) {
            super(vehicleBinding.getRoot());
            s.k(vehicleBinding, "vehicleBinding");
            this.f56587c = vehicleStatusWidgetConfigureActivity;
            this.vehicleBinding = vehicleBinding;
            this.context = this.itemView.getContext();
        }

        @SuppressLint({"SetTextI18n"})
        public final void a(xc0.a vehicle) {
            s.k(vehicle, "vehicle");
            int iE = b0.e(vehicle);
            Context context = this.context;
            s.j(context, "context");
            String strD = b0.d(vehicle, context);
            if (strD != null) {
                File file = new File(strD);
                if (file.exists()) {
                    s.h(com.bumptech.glide.c.D(this.vehicleBinding.f102173b).mo76load(file).error(iE).placeholder(iE).fallback(iE).into(this.vehicleBinding.f102173b));
                } else {
                    this.vehicleBinding.f102173b.setImageResource(iE);
                }
            } else {
                this.vehicleBinding.f102173b.setImageResource(iE);
            }
            this.vehicleBinding.f102174c.setText(e.k(vehicle));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.widget.VehicleStatusWidgetConfigureActivity$onCreate$1", f = "VehicleStatusWidgetConfigureActivity.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56588n;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lxc0/a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.tesla.widget.VehicleStatusWidgetConfigureActivity$onCreate$1$vehicles$1", f = "VehicleStatusWidgetConfigureActivity.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super List<? extends xc0.a>>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f56590n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ VehicleStatusWidgetConfigureActivity f56591o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f56591o = vehicleStatusWidgetConfigureActivity;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f56591o, continuation);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends xc0.a>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<xc0.a>>) continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f56590n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                oe0.e eVarX = this.f56591o.x();
                this.f56590n = 1;
                Object objE = eVarX.e(this);
                return objE == coroutine_suspended ? coroutine_suspended : objE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<xc0.a>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return VehicleStatusWidgetConfigureActivity.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56588n;
            pe0.b bVar = null;
            if (i11 == 0) {
                t.b(obj);
                pe0.b bVar2 = VehicleStatusWidgetConfigureActivity.this.binding;
                if (bVar2 == null) {
                    s.B("binding");
                    bVar2 = null;
                }
                bVar2.f102176b.h();
                if (!VehicleStatusWidgetConfigureActivity.this.z().a()) {
                    VehicleStatusWidgetConfigureActivity.this.A();
                    return h0.f84049a;
                }
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(VehicleStatusWidgetConfigureActivity.this, null);
                this.f56588n = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            List list = (List) obj;
            if (list.isEmpty()) {
                VehicleStatusWidgetConfigureActivity.this.A();
                return h0.f84049a;
            }
            pe0.b bVar3 = VehicleStatusWidgetConfigureActivity.this.binding;
            if (bVar3 == null) {
                s.B("binding");
                bVar3 = null;
            }
            bVar3.f102177c.setAdapter(new a(VehicleStatusWidgetConfigureActivity.this, list));
            pe0.b bVar4 = VehicleStatusWidgetConfigureActivity.this.binding;
            if (bVar4 == null) {
                s.B("binding");
            } else {
                bVar = bVar4;
            }
            bVar.f102176b.e();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.tesla.widget.VehicleStatusWidgetConfigureActivity$onWidgetVehicleSelected$1", f = "VehicleStatusWidgetConfigureActivity.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56592n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ xc0.a f56594p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.tesla.widget.VehicleStatusWidgetConfigureActivity$onWidgetVehicleSelected$1$1", f = "VehicleStatusWidgetConfigureActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f56595n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ xc0.a f56596o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ VehicleStatusWidgetConfigureActivity f56597p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(xc0.a aVar, VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f56596o = aVar;
                this.f56597p = vehicleStatusWidgetConfigureActivity;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f56596o, this.f56597p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String vin;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f56595n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                xc0.a aVar = this.f56596o;
                if (aVar == null || (vin = aVar.getVin()) == null) {
                    return null;
                }
                VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity = this.f56597p;
                vehicleStatusWidgetConfigureActivity.x().d(vehicleStatusWidgetConfigureActivity.appWidgetId, vin);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(xc0.a aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f56594p = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return VehicleStatusWidgetConfigureActivity.this.new d(this.f56594p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f56592n;
            if (i11 == 0) {
                t.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(this.f56594p, VehicleStatusWidgetConfigureActivity.this, null);
                this.f56592n = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity = VehicleStatusWidgetConfigureActivity.this;
            AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(vehicleStatusWidgetConfigureActivity).getAppWidgetInfo(VehicleStatusWidgetConfigureActivity.this.appWidgetId);
            if (appWidgetInfo != null) {
                VehicleStatusWidgetConfigureActivity vehicleStatusWidgetConfigureActivity2 = VehicleStatusWidgetConfigureActivity.this;
                String className = appWidgetInfo.provider.getClassName();
                if (s.f(className, VehicleStatusWidget.class.getName())) {
                    vehicleStatusWidgetConfigureActivity2.y().q(vehicleStatusWidgetConfigureActivity, new WidgetBuilderConfig(vehicleStatusWidgetConfigureActivity2.appWidgetId, a0.NORMAL, false, null, 12, null));
                } else if (s.f(className, VehicleStatusSquareWidget.class.getName())) {
                    vehicleStatusWidgetConfigureActivity2.y().q(vehicleStatusWidgetConfigureActivity, new WidgetBuilderConfig(vehicleStatusWidgetConfigureActivity2.appWidgetId, a0.SQUARE, false, null, 12, null));
                }
            }
            Intent intent = new Intent();
            intent.putExtra("appWidgetId", VehicleStatusWidgetConfigureActivity.this.appWidgetId);
            VehicleStatusWidgetConfigureActivity.this.setResult(-1, intent);
            if (VehicleStatusWidgetConfigureActivity.this.getIntent().getBooleanExtra("com.teslamotors.tesla.key-from-widget", false)) {
                VehicleStatusWidgetConfigureActivity.this.moveTaskToBack(true);
            }
            VehicleStatusWidgetConfigureActivity.this.finish();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        B(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(xc0.a vehicle) {
        BuildersKt__Builders_commonKt.launch$default(x.a(this), null, null, new d(vehicle, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oe0.e C() {
        return qe0.c.f105355a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final me0.s D() {
        return qe0.c.f105355a.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qe0.a E() {
        return qe0.c.f105355a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oe0.e x() {
        return (oe0.e) this.vehicleRepo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final me0.s y() {
        return (me0.s) this.widgetBuilder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qe0.a z() {
        return (qe0.a) this.widgetDependencies.getValue();
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setResult(0);
        pe0.b bVarC = pe0.b.c(getLayoutInflater());
        this.binding = bVarC;
        if (bVarC == null) {
            s.B("binding");
            bVarC = null;
        }
        setContentView(bVarC.getRoot());
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.appWidgetId = extras.getInt("appWidgetId", 0);
        }
        if (this.appWidgetId == 0) {
            finish();
        } else {
            BuildersKt__Builders_commonKt.launch$default(x.a(this), null, null, new c(null), 3, null);
        }
    }
}
