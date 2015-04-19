package MangoBox.panorama.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelIcicleBlade extends ModelBase
{
  //fields
    ModelRenderer Main_Blade;
    ModelRenderer Secondary_Blade;
    ModelRenderer Hand_Guard_Middle;
    ModelRenderer Hand_Guard_Left;
    ModelRenderer Hand_Guard_Right;
    ModelRenderer Sword_Point;
    ModelRenderer Sword_Handle;
    ModelRenderer Sword_Hilt_Middle;
    ModelRenderer Sword_Hilt_Right;
    ModelRenderer Sword_Hilt_Left;
    ModelRenderer IciclePart1;
    ModelRenderer IciclePart2;
    ModelRenderer IciclePart3;
    ModelRenderer IciclePart4;
    ModelRenderer IciclePart5;
    ModelRenderer Sword_Chip;
    ModelRenderer MainBlade2;
  
  public ModelIcicleBlade()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Main_Blade = new ModelRenderer(this, 0, 0);
      Main_Blade.addBox(0F, 0F, 0F, 12, 3, 1);
      Main_Blade.setRotationPoint(0F, 0F, 0F);
      Main_Blade.setTextureSize(64, 32);
      Main_Blade.mirror = true;
      setRotation(Main_Blade, 0F, 0F, 0F);
      Secondary_Blade = new ModelRenderer(this, 0, 4);
      Secondary_Blade.addBox(0F, 1F, -0.5F, 21, 1, 2);
      Secondary_Blade.setRotationPoint(0F, 0F, 0F);
      Secondary_Blade.setTextureSize(64, 32);
      Secondary_Blade.mirror = true;
      setRotation(Secondary_Blade, 0.0174533F, 0F, 0F);
      Hand_Guard_Middle = new ModelRenderer(this, 4, 7);
      Hand_Guard_Middle.addBox(-1F, -1F, 0F, 1, 5, 1);
      Hand_Guard_Middle.setRotationPoint(0F, 0F, 0F);
      Hand_Guard_Middle.setTextureSize(64, 32);
      Hand_Guard_Middle.mirror = true;
      setRotation(Hand_Guard_Middle, 0F, 0F, 0F);
      Hand_Guard_Left = new ModelRenderer(this, 0, 7);
      Hand_Guard_Left.addBox(-1F, 0F, 1F, 1, 3, 1);
      Hand_Guard_Left.setRotationPoint(0F, 0F, 0F);
      Hand_Guard_Left.setTextureSize(64, 32);
      Hand_Guard_Left.mirror = true;
      setRotation(Hand_Guard_Left, 0F, 0F, 0F);
      Hand_Guard_Right = new ModelRenderer(this, 8, 7);
      Hand_Guard_Right.addBox(-1F, 0F, -1F, 1, 3, 1);
      Hand_Guard_Right.setRotationPoint(0F, 0F, 0F);
      Hand_Guard_Right.setTextureSize(64, 32);
      Hand_Guard_Right.mirror = true;
      setRotation(Hand_Guard_Right, 0F, 0F, 0F);
      Sword_Point = new ModelRenderer(this, 0, 11);
      Sword_Point.addBox(22F, 1F, 0F, 1, 1, 1);
      Sword_Point.setRotationPoint(0F, 0F, 0F);
      Sword_Point.setTextureSize(64, 32);
      Sword_Point.mirror = true;
      setRotation(Sword_Point, 0F, 0F, 0F);
      Sword_Handle = new ModelRenderer(this, 0, 13);
      Sword_Handle.addBox(-4F, 1F, 0F, 3, 1, 1);
      Sword_Handle.setRotationPoint(0F, 0F, 0F);
      Sword_Handle.setTextureSize(64, 32);
      Sword_Handle.mirror = true;
      setRotation(Sword_Handle, 0F, 0F, 0F);
      Sword_Hilt_Middle = new ModelRenderer(this, 24, 7);
      Sword_Hilt_Middle.addBox(-5F, 0F, 0F, 1, 3, 1);
      Sword_Hilt_Middle.setRotationPoint(0F, 0F, 0F);
      Sword_Hilt_Middle.setTextureSize(64, 32);
      Sword_Hilt_Middle.mirror = true;
      setRotation(Sword_Hilt_Middle, 0F, 0F, 0F);
      Sword_Hilt_Right = new ModelRenderer(this, 28, 7);
      Sword_Hilt_Right.addBox(-5F, 1F, -1F, 1, 1, 1);
      Sword_Hilt_Right.setRotationPoint(0F, 0F, 0F);
      Sword_Hilt_Right.setTextureSize(64, 32);
      Sword_Hilt_Right.mirror = true;
      setRotation(Sword_Hilt_Right, 0F, 0F, 0F);
      Sword_Hilt_Left = new ModelRenderer(this, 20, 7);
      Sword_Hilt_Left.addBox(-5F, 1F, 1F, 1, 1, 1);
      Sword_Hilt_Left.setRotationPoint(0F, 0F, 0F);
      Sword_Hilt_Left.setTextureSize(64, 32);
      Sword_Hilt_Left.mirror = true;
      setRotation(Sword_Hilt_Left, 0F, 0F, 0F);
      IciclePart1 = new ModelRenderer(this, 0, 17);
      IciclePart1.addBox(4F, -1F, 0F, 2, 1, 1);
      IciclePart1.setRotationPoint(0F, 0F, 0F);
      IciclePart1.setTextureSize(64, 32);
      IciclePart1.mirror = true;
      setRotation(IciclePart1, 0F, 0F, 0F);
      IciclePart2 = new ModelRenderer(this, 0, 19);
      IciclePart2.addBox(4F, -2F, 0F, 1, 1, 1);
      IciclePart2.setRotationPoint(0F, 0F, 0F);
      IciclePart2.setTextureSize(64, 32);
      IciclePart2.mirror = true;
      setRotation(IciclePart2, 0F, 0F, 0F);
      IciclePart3 = new ModelRenderer(this, 0, 21);
      IciclePart3.addBox(8F, -1F, 0F, 1, 1, 1);
      IciclePart3.setRotationPoint(0F, 0F, 0F);
      IciclePart3.setTextureSize(64, 32);
      IciclePart3.mirror = true;
      setRotation(IciclePart3, 0F, 0F, 0F);
      IciclePart4 = new ModelRenderer(this, 0, 23);
      IciclePart4.addBox(14F, -1F, 0F, 3, 1, 1);
      IciclePart4.setRotationPoint(0F, 0F, 0F);
      IciclePart4.setTextureSize(64, 32);
      IciclePart4.mirror = true;
      setRotation(IciclePart4, 0F, 0F, 0F);
      IciclePart5 = new ModelRenderer(this, 0, 25);
      IciclePart5.addBox(14F, -2F, 0F, 2, 1, 1);
      IciclePart5.setRotationPoint(0F, 0F, 0F);
      IciclePart5.setTextureSize(64, 32);
      IciclePart5.mirror = true;
      setRotation(IciclePart5, 0F, 0F, 0F);
      Sword_Chip = new ModelRenderer(this, 0, 27);
      Sword_Chip.addBox(12F, 1F, 0F, 1, 2, 1);
      Sword_Chip.setRotationPoint(0F, 0F, 0F);
      Sword_Chip.setTextureSize(64, 32);
      Sword_Chip.mirror = true;
      setRotation(Sword_Chip, 0F, 0F, 0F);
      MainBlade2 = new ModelRenderer(this, 44, 0);
      MainBlade2.addBox(13F, 0F, 0F, 9, 3, 1);
      MainBlade2.setRotationPoint(0F, 0F, 0F);
      MainBlade2.setTextureSize(64, 32);
      MainBlade2.mirror = true;
      setRotation(MainBlade2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Main_Blade.render(f5);
    Secondary_Blade.render(f5);
    Hand_Guard_Middle.render(f5);
    Hand_Guard_Left.render(f5);
    Hand_Guard_Right.render(f5);
    Sword_Point.render(f5);
    Sword_Handle.render(f5);
    Sword_Hilt_Middle.render(f5);
    Sword_Hilt_Right.render(f5);
    Sword_Hilt_Left.render(f5);
    IciclePart1.render(f5);
    IciclePart2.render(f5);
    IciclePart3.render(f5);
    IciclePart4.render(f5);
    IciclePart5.render(f5);
    Sword_Chip.render(f5);
    MainBlade2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
