package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g extends x {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    private ArrayList<RecyclerView.g0> mPendingRemovals = new ArrayList<>();
    private ArrayList<RecyclerView.g0> mPendingAdditions = new ArrayList<>();
    private ArrayList<j> mPendingMoves = new ArrayList<>();
    private ArrayList<i> mPendingChanges = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.g0>> mAdditionsList = new ArrayList<>();
    ArrayList<ArrayList<j>> mMovesList = new ArrayList<>();
    ArrayList<ArrayList<i>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.g0> mAddAnimations = new ArrayList<>();
    ArrayList<RecyclerView.g0> mMoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.g0> mRemoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.g0> mChangeAnimations = new ArrayList<>();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f13390a;

        a(ArrayList arrayList) {
            this.f13390a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f13390a) {
                g.this.animateMoveImpl(jVar.f13424a, jVar.f13425b, jVar.f13426c, jVar.f13427d, jVar.f13428e);
            }
            this.f13390a.clear();
            g.this.mMovesList.remove(this.f13390a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f13392a;

        b(ArrayList arrayList) {
            this.f13392a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f13392a.iterator();
            while (it.hasNext()) {
                g.this.animateChangeImpl((i) it.next());
            }
            this.f13392a.clear();
            g.this.mChangesList.remove(this.f13392a);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f13394a;

        c(ArrayList arrayList) {
            this.f13394a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f13394a.iterator();
            while (it.hasNext()) {
                g.this.animateAddImpl((RecyclerView.g0) it.next());
            }
            this.f13394a.clear();
            g.this.mAdditionsList.remove(this.f13394a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.g0 f13396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f13398c;

        d(RecyclerView.g0 g0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13396a = g0Var;
            this.f13397b = viewPropertyAnimator;
            this.f13398c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13397b.setListener(null);
            this.f13398c.setAlpha(1.0f);
            g.this.dispatchRemoveFinished(this.f13396a);
            g.this.mRemoveAnimations.remove(this.f13396a);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchRemoveStarting(this.f13396a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.g0 f13400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f13401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13402c;

        e(RecyclerView.g0 g0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f13400a = g0Var;
            this.f13401b = view;
            this.f13402c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13401b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13402c.setListener(null);
            g.this.dispatchAddFinished(this.f13400a);
            g.this.mAddAnimations.remove(this.f13400a);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchAddStarting(this.f13400a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.g0 f13404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f13405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f13406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13408e;

        f(RecyclerView.g0 g0Var, int i11, View view, int i12, ViewPropertyAnimator viewPropertyAnimator) {
            this.f13404a = g0Var;
            this.f13405b = i11;
            this.f13406c = view;
            this.f13407d = i12;
            this.f13408e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f13405b != 0) {
                this.f13406c.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            }
            if (this.f13407d != 0) {
                this.f13406c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13408e.setListener(null);
            g.this.dispatchMoveFinished(this.f13404a);
            g.this.mMoveAnimations.remove(this.f13404a);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchMoveStarting(this.f13404a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.g$g, reason: collision with other inner class name */
    class C0220g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f13410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f13412c;

        C0220g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13410a = iVar;
            this.f13411b = viewPropertyAnimator;
            this.f13412c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13411b.setListener(null);
            this.f13412c.setAlpha(1.0f);
            this.f13412c.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            this.f13412c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            g.this.dispatchChangeFinished(this.f13410a.f13418a, true);
            g.this.mChangeAnimations.remove(this.f13410a.f13418a);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchChangeStarting(this.f13410a.f13418a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f13414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f13415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f13416c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f13414a = iVar;
            this.f13415b = viewPropertyAnimator;
            this.f13416c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13415b.setListener(null);
            this.f13416c.setAlpha(1.0f);
            this.f13416c.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            this.f13416c.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            g.this.dispatchChangeFinished(this.f13414a.f13419b, false);
            g.this.mChangeAnimations.remove(this.f13414a.f13419b);
            g.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            g.this.dispatchChangeStarting(this.f13414a.f13419b, false);
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.g0 f13424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13426c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13427d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13428e;

        j(RecyclerView.g0 g0Var, int i11, int i12, int i13, int i14) {
            this.f13424a = g0Var;
            this.f13425b = i11;
            this.f13426c = i12;
            this.f13427d = i13;
            this.f13428e = i14;
        }
    }

    private void animateRemoveImpl(RecyclerView.g0 g0Var) {
        View view = g0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mRemoveAnimations.add(g0Var);
        viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new d(g0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    private void endChangeAnimation(List<i> list, RecyclerView.g0 g0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (endChangeAnimationIfNecessary(iVar, g0Var) && iVar.f13418a == null && iVar.f13419b == null) {
                list.remove(iVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(i iVar) {
        RecyclerView.g0 g0Var = iVar.f13418a;
        if (g0Var != null) {
            endChangeAnimationIfNecessary(iVar, g0Var);
        }
        RecyclerView.g0 g0Var2 = iVar.f13419b;
        if (g0Var2 != null) {
            endChangeAnimationIfNecessary(iVar, g0Var2);
        }
    }

    private void resetAnimation(RecyclerView.g0 g0Var) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        g0Var.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(g0Var);
    }

    @Override // androidx.recyclerview.widget.x
    @SuppressLint({"UnknownNullness"})
    public boolean animateAdd(RecyclerView.g0 g0Var) {
        resetAnimation(g0Var);
        g0Var.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.mPendingAdditions.add(g0Var);
        return true;
    }

    void animateAddImpl(RecyclerView.g0 g0Var) {
        View view = g0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mAddAnimations.add(g0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(getAddDuration()).setListener(new e(g0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.x
    @SuppressLint({"UnknownNullness"})
    public boolean animateChange(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2, int i11, int i12, int i13, int i14) {
        if (g0Var == g0Var2) {
            return animateMove(g0Var, i11, i12, i13, i14);
        }
        float translationX = g0Var.itemView.getTranslationX();
        float translationY = g0Var.itemView.getTranslationY();
        float alpha = g0Var.itemView.getAlpha();
        resetAnimation(g0Var);
        int i15 = (int) ((i13 - i11) - translationX);
        int i16 = (int) ((i14 - i12) - translationY);
        g0Var.itemView.setTranslationX(translationX);
        g0Var.itemView.setTranslationY(translationY);
        g0Var.itemView.setAlpha(alpha);
        if (g0Var2 != null) {
            resetAnimation(g0Var2);
            g0Var2.itemView.setTranslationX(-i15);
            g0Var2.itemView.setTranslationY(-i16);
            g0Var2.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        this.mPendingChanges.add(new i(g0Var, g0Var2, i11, i12, i13, i14));
        return true;
    }

    void animateChangeImpl(i iVar) {
        RecyclerView.g0 g0Var = iVar.f13418a;
        View view = g0Var == null ? null : g0Var.itemView;
        RecyclerView.g0 g0Var2 = iVar.f13419b;
        View view2 = g0Var2 != null ? g0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(iVar.f13418a);
            duration.translationX(iVar.f13422e - iVar.f13420c);
            duration.translationY(iVar.f13423f - iVar.f13421d);
            duration.alpha(BitmapDescriptorFactory.HUE_RED).setListener(new C0220g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.mChangeAnimations.add(iVar.f13419b);
            viewPropertyAnimatorAnimate.translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(getChangeDuration()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.x
    @SuppressLint({"UnknownNullness"})
    public boolean animateMove(RecyclerView.g0 g0Var, int i11, int i12, int i13, int i14) {
        View view = g0Var.itemView;
        int translationX = i11 + ((int) view.getTranslationX());
        int translationY = i12 + ((int) g0Var.itemView.getTranslationY());
        resetAnimation(g0Var);
        int i15 = i13 - translationX;
        int i16 = i14 - translationY;
        if (i15 == 0 && i16 == 0) {
            dispatchMoveFinished(g0Var);
            return false;
        }
        if (i15 != 0) {
            view.setTranslationX(-i15);
        }
        if (i16 != 0) {
            view.setTranslationY(-i16);
        }
        this.mPendingMoves.add(new j(g0Var, translationX, translationY, i13, i14));
        return true;
    }

    void animateMoveImpl(RecyclerView.g0 g0Var, int i11, int i12, int i13, int i14) {
        View view = g0Var.itemView;
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        if (i15 != 0) {
            view.animate().translationX(BitmapDescriptorFactory.HUE_RED);
        }
        if (i16 != 0) {
            view.animate().translationY(BitmapDescriptorFactory.HUE_RED);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mMoveAnimations.add(g0Var);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new f(g0Var, i15, view, i16, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.x
    @SuppressLint({"UnknownNullness"})
    public boolean animateRemove(RecyclerView.g0 g0Var) {
        resetAnimation(g0Var);
        this.mPendingRemovals.add(g0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.g0 g0Var, @NonNull List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(g0Var, list);
    }

    void cancelAll(List<RecyclerView.g0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    @SuppressLint({"UnknownNullness"})
    public void endAnimation(RecyclerView.g0 g0Var) {
        View view = g0Var.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.mPendingMoves.get(size).f13424a == g0Var) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                dispatchMoveFinished(g0Var);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, g0Var);
        if (this.mPendingRemovals.remove(g0Var)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(g0Var);
        }
        if (this.mPendingAdditions.remove(g0Var)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(g0Var);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, g0Var);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.mMovesList.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f13424a == g0Var) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    dispatchMoveFinished(g0Var);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.mMovesList.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.g0> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(g0Var)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(g0Var);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(g0Var);
        this.mAddAnimations.remove(g0Var);
        this.mChangeAnimations.remove(g0Var);
        this.mMoveAnimations.remove(g0Var);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.mPendingMoves.get(size);
            View view = jVar.f13424a.itemView;
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            dispatchMoveFinished(jVar.f13424a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.g0 g0Var = this.mPendingAdditions.get(size3);
            g0Var.itemView.setAlpha(1.0f);
            dispatchAddFinished(g0Var);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f13424a.itemView;
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    dispatchMoveFinished(jVar2.f13424a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.g0> arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.g0 g0Var2 = arrayList2.get(size8);
                    g0Var2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(g0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void runPendingAnimations() {
        boolean zIsEmpty = this.mPendingRemovals.isEmpty();
        boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
        boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
        boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.g0> it = this.mPendingRemovals.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.mPendingRemovals.clear();
        if (!zIsEmpty2) {
            ArrayList<j> arrayList = new ArrayList<>();
            arrayList.addAll(this.mPendingMoves);
            this.mMovesList.add(arrayList);
            this.mPendingMoves.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                ViewCompat.i0(arrayList.get(0).f13424a.itemView, aVar, getRemoveDuration());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.mPendingChanges);
            this.mChangesList.add(arrayList2);
            this.mPendingChanges.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                ViewCompat.i0(arrayList2.get(0).f13418a.itemView, bVar, getRemoveDuration());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.g0> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.mPendingAdditions);
        this.mAdditionsList.add(arrayList3);
        this.mPendingAdditions.clear();
        c cVar = new c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            ViewCompat.i0(arrayList3.get(0).itemView, cVar, (!zIsEmpty ? getRemoveDuration() : 0L) + Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration()));
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.g0 f13418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.g0 f13419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13423f;

        private i(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2) {
            this.f13418a = g0Var;
            this.f13419b = g0Var2;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f13418a + ", newHolder=" + this.f13419b + ", fromX=" + this.f13420c + ", fromY=" + this.f13421d + ", toX=" + this.f13422e + ", toY=" + this.f13423f + CoreConstants.CURLY_RIGHT;
        }

        i(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2, int i11, int i12, int i13, int i14) {
            this(g0Var, g0Var2);
            this.f13420c = i11;
            this.f13421d = i12;
            this.f13422e = i13;
            this.f13423f = i14;
        }
    }

    private boolean endChangeAnimationIfNecessary(i iVar, RecyclerView.g0 g0Var) {
        boolean z11 = false;
        if (iVar.f13419b == g0Var) {
            iVar.f13419b = null;
        } else {
            if (iVar.f13418a != g0Var) {
                return false;
            }
            iVar.f13418a = null;
            z11 = true;
        }
        g0Var.itemView.setAlpha(1.0f);
        g0Var.itemView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        g0Var.itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        dispatchChangeFinished(g0Var, z11);
        return true;
    }
}
