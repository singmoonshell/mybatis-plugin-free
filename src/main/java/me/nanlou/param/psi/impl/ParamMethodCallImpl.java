// This is a generated file. Not intended for manual editing.
package me.nanlou.param.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static me.nanlou.param.psi.ParamTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import me.nanlou.param.psi.*;
import me.nanlou.param.ParamPsiImplUtil;

public class ParamMethodCallImpl extends ASTWrapperPsiElement implements ParamMethodCall {

  public ParamMethodCallImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull ParamVisitor visitor) {
    visitor.visitMethodCall(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ParamVisitor) accept((ParamVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ParamClassName getClassName() {
    return findNotNullChildByClass(ParamClassName.class);
  }

  @Override
  @NotNull
  public ParamMethodName getMethodName() {
    return findNotNullChildByClass(ParamMethodName.class);
  }

  @Override
  @Nullable
  public ParamParamList getParamList() {
    return findChildByClass(ParamParamList.class);
  }

}
