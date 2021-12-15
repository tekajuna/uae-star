// Coding up a UAE blade
package macro;
import java.util.*;
import star.common.*;
import star.base.neo.*;
import star.cadmodeler.*;
import star.vis.*;
public class uaetest extends StarMacro{
   public void execute(){
      importBlade();
      //execute0();
      //execute1();
      //execute2();
   }

   private void importBlade() {
      //This function, if used immediately after opening a new .sim file, imports the blade geometry
      String geopath = "/lustre/scratch/usr/tekajuna/ATLANTIS/star/shortSliding/geom/";
      String bladeFileName = "blade0.igs";
      String bladeFile = geopath+bladeFileName;
      Simulation simulation_0 = 
         getActiveSimulation();
      Scene scene_0 = 
         simulation_0.getSceneManager().createScene("3D-CAD View");
      scene_0.initializeAndWait();
      
      CadModel cadModel_0 = 
         simulation_0.get(SolidModelManager.class).createSolidModel(scene_0);
      
      cadModel_0.resetSystemOptions();

      ImportCadFileFeature importCadFileFeature_0 = 
        cadModel_0.importCadFile(resolvePath(bladeFile), true, false, false, false, true, false, false, true, false, false, NeoProperty.fromString("{\'STEP\': 0, \'NX\': 0, \'CATIAV5\': 0, \'SE\': 0, \'JT\': 0}"));
   
      star.cadmodeler.Body cadmodelerBody_0 = 
        ((star.cadmodeler.Body) importCadFileFeature_0.getBodyByIndex(1));
  

      // This is the part where we close up the root. Success!
      Face face_0 = 
        ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.1342203898327811, 0.06282857617321425, 3.148999968942829})));
  
      Edge edge_0 = 
        ((Edge) cadModel_0.getEdgeByLocation(face_0,new DoubleVector(new double[] {0.194040238879, 0.009318364384039999, 0.508, 0.08038350773854595, 0.1115926784685944, 0.508, -0.023753382498499998, -6.47929713504E-4, 0.508})));
  
      Face face_1 = 
        ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.14178339473479024, -0.05069026328718468, 3.148999968942829})));
  
      Edge edge_1 = 
        ((Edge) cadModel_0.getEdgeByLocation(face_1,new DoubleVector(new double[] {0.194240959541, 0.00298259205574, 0.508, 0.08718135532034405, -0.1062827769549357, 0.508, -0.023753382498499998, -6.47929713504E-4, 0.508})));
  
      Face face_2 = 
        ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.45550578972005196, 0.023712995610485933, 3.1489999689428294})));
  
      Edge edge_2 = 
        ((Edge) cadModel_0.getEdgeByLocation(face_2,new DoubleVector(new double[] {0.194240959541, 0.00298259205574, 0.508, 0.19414059921, 0.0061504782198899995, 0.508, 0.194040238879, 0.009318364384039999, 0.508})));
  
      FillFeature fillFeature_0 = 
        cadModel_0.getFeatureManager().createFillFeature(new NeoObjectVector(new Object[] {edge_0, edge_1, edge_2}), new NeoObjectVector(new Object[] {}));
  
      fillFeature_0.setContinuityData(new IntVector(new int[] {0, 0, 0}));
  
      cadModel_0.allowMakingPartDirty(false);
  
      fillFeature_0.setEdges(new NeoObjectVector(new Object[] {edge_0, edge_1, edge_2}));
  
      fillFeature_0.setCadFilters(new NeoObjectVector(new Object[] {}));
  
      fillFeature_0.setIsAllEdgesTangent(false);
  
      fillFeature_0.setContinuityData(new IntVector(new int[] {0, 0, 0}));
  
      fillFeature_0.setGuideSketches(Collections.<CurveFeature>emptyList());
  
      fillFeature_0.setProfileSketches(Collections.<CurveFeature>emptyList());
  
      fillFeature_0.setColorVector(new IntVector(new int[] {-16711936, -16776961, -14336}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      fillFeature_0.setEdges(new NeoObjectVector(new Object[] {edge_0, edge_1, edge_2}));
  
      fillFeature_0.setCadFilters(new NeoObjectVector(new Object[] {}));
  
      fillFeature_0.setIsAllEdgesTangent(false);
  
      fillFeature_0.setContinuityData(new IntVector(new int[] {0, 0, 0}));
  
      fillFeature_0.setGuideSketches(Collections.<CurveFeature>emptyList());
  
      fillFeature_0.setProfileSketches(Collections.<CurveFeature>emptyList());
  
      fillFeature_0.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().execute(fillFeature_0);
   
      // Make reference point from face center
      Face face_3 = 
        ((Face) fillFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.08855328562561882, 0.018382443857779318, 0.508000000000002})));
  
      ReferencePointFromEntityCenter startRootCenter = 
        cadModel_0.getFeatureManager().createPointFromEntityCenter(face_3);
  
      cadModel_0.allowMakingPartDirty(false);
  
      startRootCenter.setColorVector(new IntVector(new int[] {-16711936}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      startRootCenter.setEntity(face_3);
  
      startRootCenter.setCenterPointType(0);
  
      startRootCenter.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().execute(startRootCenter);

      //TEST Try to get info on Point 1
      ReferencePointFromEntityCenter P1 = 
      ((ReferencePointFromEntityCenter) cadModel_0.getFeature("Point 1"));
      
      //Object.keys(P1).forEach((prop)=> console.log(prop));
      // console.log(Object.keys(P1));
      // console.log("Hello World");
      sim.println("Hello World");

      //Move blade such that it is now centered on (0 0 0)

      MoveBodyFeature moveBodyFeature_0 = 
        cadModel_0.getFeatureManager().createMoveBodyFeature();
  
      cadModel_0.allowMakingPartDirty(false);
  
      Units units_0 = 
        simulation_0.getUnitsManager().getPreferredUnits(new IntVector(new int[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
  
      moveBodyFeature_0.setIsBodyGroupCreation(false);
  
      moveBodyFeature_0.setColorVector(new IntVector(new int[] {-16711936, -65536, -65536}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      moveBodyFeature_0.setDirectionOption(0);
  
      moveBodyFeature_0.setCoordinateSystemSourceOption(1);
  
      CanonicalReferenceCoordinateSystem canonicalReferenceCoordinateSystem_0 = 
        ((CanonicalReferenceCoordinateSystem) cadModel_0.getFeature("Lab Coordinate System"));
  
      moveBodyFeature_0.setReferenceCoordinateSystem(canonicalReferenceCoordinateSystem_0);
  
      LabCoordinateSystem labCoordinateSystem_0 = 
        simulation_0.getCoordinateSystemManager().getLabCoordinateSystem();
  
      moveBodyFeature_0.setImportedCoordinateSystem(labCoordinateSystem_0);
  
      moveBodyFeature_0.getTranslationVector().setCoordinateSystem(labCoordinateSystem_0);
  
      moveBodyFeature_0.getTranslationVector().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {-0.08538299661646141, -0.0027048856593682464, 0.0}));
  
      moveBodyFeature_0.setCopyOption(0);
  
      moveBodyFeature_0.setBodies(new NeoObjectVector(new Object[] {cadmodelerBody_0}));
  
      moveBodyFeature_0.setBodyGroups(new NeoObjectVector(new Object[] {}));
  
      moveBodyFeature_0.setCadFilters(new NeoObjectVector(new Object[] {}));
  
      moveBodyFeature_0.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().execute(moveBodyFeature_0);


   }

   private void boilerplate(){
      // This is boilerplate code needed to modify an existing simulation, probably
      Simulation simulation_0 =  //same as in ex0 
        getActiveSimulation(); 
  
      Scene scene_0 = //same as in ex0, but ex0 "creates" the scene
        simulation_0.getSceneManager().getScene("3D-CAD View 1");

      CadModel cadModel_0 = //similarly nearly-same, cuz not CREATING
        ((CadModel) simulation_0.get(SolidModelManager.class).getObject("3D-CAD Model 1"));
  
      ImportCadFileFeature importCadFileFeature_0 = //Not sure when it gets named (probably auto)
        ((ImportCadFileFeature) cadModel_0.getFeature("ImportCad 1"));
  
      star.cadmodeler.Body cadmodelerBody_0 = 
        ((star.cadmodeler.Body) importCadFileFeature_0.getBodyByIndex(1));
  

   }

   private void execute0() {

      // The active simulation
      Simulation simulation_0 = 
        getActiveSimulation();
      
      // Create CAD scene, probably
      Scene scene_0 = 
        simulation_0.getSceneManager().createScene("3D-CAD View");
  
      scene_0.initializeAndWait();
  
      CadModel cadModel_0 = 
        simulation_0.get(SolidModelManager.class).createSolidModel(scene_0);
  
      cadModel_0.resetSystemOptions();

  
      ImportCadFileFeature importCadFileFeature_0 = 
        cadModel_0.importCadFile(resolvePath("/lustre/scratch/usr/tekajuna/ATLANTIS/star/shortSliding/geom/blade0.igs"), true, false, false, false, true, false, false, true, false, false, NeoProperty.fromString("{\'STEP\': 0, \'NX\': 0, \'CATIAV5\': 0, \'SE\': 0, \'JT\': 0}"));
  
  
      star.cadmodeler.Body cadmodelerBody_0 = 
        ((star.cadmodeler.Body) importCadFileFeature_0.getBodyByIndex(1));
  
      Face face_0 = 
        ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.1342203898327811, 0.06282857617321425, 3.148999968942829})));
  
      Edge edge_0 = 
        ((Edge) cadModel_0.getEdgeByLocation(face_0,new DoubleVector(new double[] {0.194040238879, 0.009318364384039999, 0.508, 0.08038350773854595, 0.1115926784685944, 0.508, -0.023753382498499998, -6.47929713504E-4, 0.508})));
  
      Face face_1 = 
        ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.14178339473479024, -0.05069026328718468, 3.148999968942829})));
  
      Edge edge_1 = 
        ((Edge) cadModel_0.getEdgeByLocation(face_1,new DoubleVector(new double[] {0.194240959541, 0.00298259205574, 0.508, 0.08718135532034405, -0.1062827769549357, 0.508, -0.023753382498499998, -6.47929713504E-4, 0.508})));
  
      Face face_2 = 
        ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.45550578972005196, 0.023712995610485933, 3.1489999689428294})));
  
      Edge edge_2 = 
        ((Edge) cadModel_0.getEdgeByLocation(face_2,new DoubleVector(new double[] {0.194240959541, 0.00298259205574, 0.508, 0.19414059921, 0.0061504782198899995, 0.508, 0.194040238879, 0.009318364384039999, 0.508})));
  
      FillFeature fillFeature_0 = 
        cadModel_0.getFeatureManager().createFillFeature(new NeoObjectVector(new Object[] {edge_0, edge_1, edge_2}), new NeoObjectVector(new Object[] {}));
  
      fillFeature_0.setContinuityData(new IntVector(new int[] {0, 0, 0}));
  
      cadModel_0.allowMakingPartDirty(false);
  
      fillFeature_0.setEdges(new NeoObjectVector(new Object[] {edge_0, edge_1, edge_2}));
  
      fillFeature_0.setCadFilters(new NeoObjectVector(new Object[] {}));
  
      fillFeature_0.setIsAllEdgesTangent(false);
  
      fillFeature_0.setContinuityData(new IntVector(new int[] {0, 0, 0}));
  
      fillFeature_0.setGuideSketches(Collections.<CurveFeature>emptyList());
  
      fillFeature_0.setProfileSketches(Collections.<CurveFeature>emptyList());
  
      fillFeature_0.setColorVector(new IntVector(new int[] {-16711936, -16776961, -14336}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      fillFeature_0.setEdges(new NeoObjectVector(new Object[] {edge_0, edge_1, edge_2}));
  
      fillFeature_0.setCadFilters(new NeoObjectVector(new Object[] {}));
  
      fillFeature_0.setIsAllEdgesTangent(false);
  
      fillFeature_0.setContinuityData(new IntVector(new int[] {0, 0, 0}));
  
      fillFeature_0.setGuideSketches(Collections.<CurveFeature>emptyList());
  
      fillFeature_0.setProfileSketches(Collections.<CurveFeature>emptyList());
  
      fillFeature_0.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().execute(fillFeature_0);
  
    
      Face face_3 = 
        ((Face) fillFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.08855328562561882, 0.018382443857779318, 0.508000000000002})));
  
      ReferencePointFromEntityCenter referencePointFromEntityCenter_0 = 
        cadModel_0.getFeatureManager().createPointFromEntityCenter(face_3);
  
      cadModel_0.allowMakingPartDirty(false);
  
      referencePointFromEntityCenter_0.setColorVector(new IntVector(new int[] {-16711936}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      referencePointFromEntityCenter_0.setEntity(face_3);
  
      referencePointFromEntityCenter_0.setCenterPointType(0);
  
      referencePointFromEntityCenter_0.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().execute(referencePointFromEntityCenter_0);
  
      MoveBodyFeature moveBodyFeature_0 = 
        cadModel_0.getFeatureManager().createMoveBodyFeature();
  
      cadModel_0.allowMakingPartDirty(false);
  
      Units units_0 = 
        simulation_0.getUnitsManager().getPreferredUnits(new IntVector(new int[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
  
      moveBodyFeature_0.setIsBodyGroupCreation(false);
  
      moveBodyFeature_0.setColorVector(new IntVector(new int[] {-16711936, -65536, -65536}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      moveBodyFeature_0.setDirectionOption(0);
  
      moveBodyFeature_0.setCoordinateSystemSourceOption(1);
  
      CanonicalReferenceCoordinateSystem canonicalReferenceCoordinateSystem_0 = 
        ((CanonicalReferenceCoordinateSystem) cadModel_0.getFeature("Lab Coordinate System"));
  
      moveBodyFeature_0.setReferenceCoordinateSystem(canonicalReferenceCoordinateSystem_0);
  
      LabCoordinateSystem labCoordinateSystem_0 = 
        simulation_0.getCoordinateSystemManager().getLabCoordinateSystem();
  
      moveBodyFeature_0.setImportedCoordinateSystem(labCoordinateSystem_0);
  
      moveBodyFeature_0.getTranslationVector().setCoordinateSystem(labCoordinateSystem_0);
  
      moveBodyFeature_0.getTranslationVector().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {-0.08538299661646141, -0.0027048856593682464, 0.0}));
  
      moveBodyFeature_0.setCopyOption(0);
  
      moveBodyFeature_0.setBodies(new NeoObjectVector(new Object[] {cadmodelerBody_0}));
  
      moveBodyFeature_0.setBodyGroups(new NeoObjectVector(new Object[] {}));
  
      moveBodyFeature_0.setCadFilters(new NeoObjectVector(new Object[] {}));
  
      moveBodyFeature_0.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().execute(moveBodyFeature_0);
  
 
      ReferencePointFromEntityCenter referencePointFromEntityCenter_1 = 
        cadModel_0.getFeatureManager().createPointFromEntityCenter(face_3);
  
      cadModel_0.allowMakingPartDirty(false);
  
      referencePointFromEntityCenter_1.setColorVector(new IntVector(new int[] {-16711936}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      referencePointFromEntityCenter_1.setEntity(face_3);
  
      referencePointFromEntityCenter_1.setCenterPointType(0);
  
      referencePointFromEntityCenter_1.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().execute(referencePointFromEntityCenter_1);
  
      RotateBodyFeature rotateBodyFeature_0 = 
        cadModel_0.getFeatureManager().createRotateBodyFeature();
  
      cadModel_0.allowMakingPartDirty(false);
  
      rotateBodyFeature_0.setIsBodyGroupCreation(false);
  
      rotateBodyFeature_0.setColorVector(new IntVector(new int[] {-16711936, -65536, -65536}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      rotateBodyFeature_0.setRotationAxisOption(0);
  
      rotateBodyFeature_0.setCoordinateSystemSourceOption(1);
  
      rotateBodyFeature_0.setReferenceCoordinateSystem(canonicalReferenceCoordinateSystem_0);
  
      rotateBodyFeature_0.setImportedCoordinateSystem(labCoordinateSystem_0);
  
      rotateBodyFeature_0.getAxis().setCoordinateSystem(labCoordinateSystem_0);
  
      rotateBodyFeature_0.getPosition().setCoordinateSystem(labCoordinateSystem_0);
  
      rotateBodyFeature_0.getAxis().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.0, 1.0}));
  
      rotateBodyFeature_0.getPosition().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.0, 0.0}));
  
      rotateBodyFeature_0.getAngle().setValue(-90.0);
  
      rotateBodyFeature_0.setCopyOption(0);
  
      rotateBodyFeature_0.setBodies(new NeoObjectVector(new Object[] {cadmodelerBody_0}));
  
      rotateBodyFeature_0.setBodyGroups(new NeoObjectVector(new Object[] {}));
  
      rotateBodyFeature_0.setCadFilters(new NeoObjectVector(new Object[] {}));
  
      rotateBodyFeature_0.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().execute(rotateBodyFeature_0);
  
      BodyCircularPatternMerge bodyCircularPatternMerge_0 = 
        cadModel_0.getFeatureManager().createBodyCircularPatternMerge();
  
      cadModel_0.allowMakingPartDirty(false);
  
      bodyCircularPatternMerge_0.setColorVector(new IntVector(new int[] {-16711936, -16776961, -65536, -65536}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      bodyCircularPatternMerge_0.setBodies(new NeoObjectVector(new Object[] {cadmodelerBody_0}));
  
      bodyCircularPatternMerge_0.setBodyGroups(new NeoObjectVector(new Object[] {}));
  
      bodyCircularPatternMerge_0.setCadFilters(new NeoObjectVector(new Object[] {}));
  
      bodyCircularPatternMerge_0.getNumberCopy().setValue(2.0);
  
      bodyCircularPatternMerge_0.setIsEven(true);
  
      bodyCircularPatternMerge_0.setRotationAxisOption(0);
  
      bodyCircularPatternMerge_0.setCoordinateSystemSourceOption(1);
  
      bodyCircularPatternMerge_0.setReferenceCoordinateSystem(canonicalReferenceCoordinateSystem_0);
  
      bodyCircularPatternMerge_0.setImportedCoordinateSystem(labCoordinateSystem_0);
  
      bodyCircularPatternMerge_0.getDirection().setCoordinateSystem(labCoordinateSystem_0);
  
      bodyCircularPatternMerge_0.getPosition().setCoordinateSystem(labCoordinateSystem_0);
  
      bodyCircularPatternMerge_0.getDirection().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {1.0, 0.0, 0.0}));
  
      bodyCircularPatternMerge_0.getPosition().setCoordinate(units_0, units_0, units_0, new DoubleVector(new double[] {0.0, 0.0, 0.0}));
  
      bodyCircularPatternMerge_0.setSkipPositionsPair(new IntVector(new int[] {}));
  
      bodyCircularPatternMerge_0.setPostOption(0);
  
      bodyCircularPatternMerge_0.setInteractingBodies(new NeoObjectVector(new Object[] {}));
  
      bodyCircularPatternMerge_0.setInteractingBodiesBodyGroups(new NeoObjectVector(new Object[] {}));
  
      bodyCircularPatternMerge_0.setInteractingBodiesCadFilters(new NeoObjectVector(new Object[] {}));
  
      bodyCircularPatternMerge_0.setInteractingSelectedBodies(false);
  
      bodyCircularPatternMerge_0.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().execute(bodyCircularPatternMerge_0);
  
      star.cadmodeler.Body cadmodelerBody_1 = 
        ((star.cadmodeler.Body) bodyCircularPatternMerge_0.getBodyByIndex(0,2));
  
      Face face_4 = 
        ((Face) bodyCircularPatternMerge_0.getFaceByLocation(cadmodelerBody_1,new DoubleVector(new double[] {0.01567755819841113, 0.0031702890091573656, -0.508000000000002})));
  
      ReferencePointFromEntityCenter referencePointFromEntityCenter_2 = 
        cadModel_0.getFeatureManager().createPointFromEntityCenter(face_4);
  
      cadModel_0.allowMakingPartDirty(false);
  
      referencePointFromEntityCenter_2.setColorVector(new IntVector(new int[] {-16711936}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      referencePointFromEntityCenter_2.setEntity(face_4);
  
      referencePointFromEntityCenter_2.setCenterPointType(0);
  
      referencePointFromEntityCenter_2.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().execute(referencePointFromEntityCenter_2);
  
      FaceSketch faceSketch_0 = 
        cadModel_0.getFeatureManager().convertToSketch(face_3);
  
      cadModel_0.allowMakingPartDirty(false);
  
      cadModel_0.getFeatureManager().startSketchEdit(faceSketch_0);
  
      faceSketch_0.markFeatureForEdit();
  
      cadModel_0.allowMakingPartDirty(true);
  
      cadModel_0.getFeatureManager().stopSketchEdit(faceSketch_0, true);
  
      faceSketch_0.setIsUptoDate(true);
  
      cadModel_0.getFeatureManager().rollForwardToEnd(false);
  
      FaceSketch faceSketch_1 = 
        cadModel_0.getFeatureManager().convertToSketch(face_4);
  
      cadModel_0.allowMakingPartDirty(false);
  
      cadModel_0.getFeatureManager().startSketchEdit(faceSketch_1);
  
      faceSketch_1.markFeatureForEdit();
  
      cadModel_0.allowMakingPartDirty(true);
  
      cadModel_0.getFeatureManager().stopSketchEdit(faceSketch_1, true);
  
      faceSketch_1.setIsUptoDate(true);
  
      cadModel_0.getFeatureManager().rollForwardToEnd(false);
  
      LoftMerge loftMerge_0 = 
        (LoftMerge) cadModel_0.getFeatureManager().createLoftMerge(new NeoObjectVector(new Object[] {faceSketch_0, faceSketch_1}), new NeoObjectVector(new Object[] {}));
  
      cadModel_0.allowMakingPartDirty(false);
  
      loftMerge_0.setColorVector(new IntVector(new int[] {-16711936, -65536, -16776961}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      loftMerge_0.setProfileSketches(new NeoObjectVector(new Object[] {faceSketch_0, faceSketch_1}));
  
      loftMerge_0.setLoftedBodyTypeOption(0);
  
      loftMerge_0.setGuideSketches(new NeoObjectVector(new Object[] {}));
  
      loftMerge_0.setProfileAlignmentType(0);
  
      loftMerge_0.setBoundaryContactTypeStart(0);
  
      loftMerge_0.setBoundaryContactTypeEnd(0);
  
      loftMerge_0.setProfileSortingType(0);
  
      loftMerge_0.setSectionProfileType(0);
  
      loftMerge_0.setRefitType(0);
  
      loftMerge_0.setTolerance(1.0E-5);
  
      loftMerge_0.setPeriodicity(false);
  
      loftMerge_0.setCompatibilityMode(false);
  
      loftMerge_0.setPostOption(0);
  
      loftMerge_0.setInteractingBodies(new NeoObjectVector(new Object[] {}));
  
      loftMerge_0.setInteractingBodiesBodyGroups(new NeoObjectVector(new Object[] {}));
  
      loftMerge_0.setInteractingBodiesCadFilters(new NeoObjectVector(new Object[] {}));
  
      loftMerge_0.setInteractingSelectedBodies(false);
  
      loftMerge_0.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().execute(loftMerge_0);
 
      UniteBodiesFeature uniteBodiesFeature_0 = 
        cadModel_0.getFeatureManager().createUniteBodies();
  
      cadModel_0.allowMakingPartDirty(false);

      uniteBodiesFeature_0.setAutoPreview(true);
  
      cadModel_0.getFeatureManager().deleteOnCancel(uniteBodiesFeature_0);
  
      cadModel_0.allowMakingPartDirty(true);
  
      // Up to this point, we have a bad loft and don't like it.
   
   
   }

   private void execute1() {

      Simulation simulation_0 =  //same as in ex0 
        getActiveSimulation(); 
  
      Scene scene_0 = //same as in ex0, but ex0 "creates" the scene
        simulation_0.getSceneManager().getScene("3D-CAD View 1");
  
      
      CadModel cadModel_0 = //similarly nearly-same, cuz not CREATING
        ((CadModel) simulation_0.get(SolidModelManager.class).getObject("3D-CAD Model 1"));
  
      ImportCadFileFeature importCadFileFeature_0 = //Not sure when it gets named (probably auto)
        ((ImportCadFileFeature) cadModel_0.getFeature("ImportCad 1"));
  
      star.cadmodeler.Body cadmodelerBody_0 = 
        ((star.cadmodeler.Body) importCadFileFeature_0.getBodyByIndex(1));
  
      Face face_0 = //definitely not the same face_0 as in ex0
        ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.06012369051384599, -0.04883739321631973, 3.148999968942829})));
  
      Face face_1 = 
        ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {-0.05339514894655294, -0.05640039811832881, 3.148999968942829})));
  
      Edge edge_3 = 
        ((Edge) cadModel_0.getEdgeByLocation(new NeoObjectVector(new Object[] {face_0, face_1})));
  
      cadModel_0.setEdgeNameAttributes(new NeoObjectVector(new Object[] {edge_3}), "LE");
  
      
      Face face_2 = 
        ((Face) importCadFileFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.021008109951117543, -0.37012279310359053, 3.1489999689428294})));
  
      cadModel_0.setFaceNameAttributes(new NeoObjectVector(new Object[] {face_2}), "TE");
  
      
      BodyCircularPatternMerge bodyCircularPatternMerge_0 = 
        ((BodyCircularPatternMerge) cadModel_0.getFeature("Circular Pattern 1"));
  
      star.cadmodeler.Body cadmodelerBody_1 = 
        ((star.cadmodeler.Body) bodyCircularPatternMerge_0.getBodyByIndex(0,2));
  
      Face face_5 = 
        ((Face) bodyCircularPatternMerge_0.getFaceByLocation(cadmodelerBody_1,new DoubleVector(new double[] {0.06012369051384599, 0.048837393216319344, -3.148999968942829})));
  
      Face face_6 = 
        ((Face) bodyCircularPatternMerge_0.getFaceByLocation(cadmodelerBody_1,new DoubleVector(new double[] {-0.05339514894655294, 0.05640039811832842, -3.148999968942829})));
  
      Edge edge_4 = 
        ((Edge) cadModel_0.getEdgeByLocation(new NeoObjectVector(new Object[] {face_5, face_6})));
  
      cadModel_0.setEdgeNameAttributes(new NeoObjectVector(new Object[] {edge_4}), "LEoff");
  
      
      Face face_7 = 
        ((Face) bodyCircularPatternMerge_0.getFaceByLocation(cadmodelerBody_1,new DoubleVector(new double[] {0.021008109951117543, 0.3701227931035901, -3.1489999689428294})));
  
      cadModel_0.setFaceNameAttributes(new NeoObjectVector(new Object[] {face_7}), "TEoff");
  
      
      LoftMerge loftMerge_0 = 
        ((LoftMerge) cadModel_0.getFeature("Loft 1"));
  
      cadModel_0.getFeatureManager().rollBack(loftMerge_0, true);
  
      cadModel_0.allowMakingPartDirty(false);
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);
  
      loftMerge_0.setAutoPreview(true);
  
      cadModel_0.getFeatureManager().rollForwardToEnd(true);
  
      cadModel_0.allowMakingPartDirty(true);
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);
  
      cadModel_0.getFeatureManager().delete(loftMerge_0);
  
      cadModel_0.allowMakingPartDirty(false);
  
      FaceSketch faceSketch_0 = 
        ((FaceSketch) cadModel_0.getFeature("FaceSketch 1"));
  
      cadModel_0.getFeatureManager().rollBack(faceSketch_0, true);
  
      cadModel_0.getFeatureManager().startSketchEdit(faceSketch_0);
  
      
      ParasolidSketchPrimitive parasolidSketchPrimitive_0 = 
        ((ParasolidSketchPrimitive) faceSketch_0.getSketchPrimitive("ParasolidSketchPrimitive 3"));
  
      ParasolidSketchPrimitive parasolidSketchPrimitive_1 = 
        ((ParasolidSketchPrimitive) faceSketch_0.getSketchPrimitive("ParasolidSketchPrimitive 2"));
  
      ParasolidSketchPrimitive parasolidSketchPrimitive_2 = 
        ((ParasolidSketchPrimitive) faceSketch_0.getSketchPrimitive("ParasolidSketchPrimitive 1"));
  
      faceSketch_0.getProjectedSketchPrimitives(new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {parasolidSketchPrimitive_0, parasolidSketchPrimitive_1, parasolidSketchPrimitive_2}), new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {}));
  
      faceSketch_0.startSketchQuickTrim();
  
      faceSketch_0.cancelSketchQuickTrim();
  
      cadModel_0.getFeatureManager().cancelSketchEdit(faceSketch_0);
  
      cadModel_0.allowMakingPartDirty(true);
  
      cadModel_0.getFeatureManager().rollForwardToEnd(true);
  
      cadModel_0.allowMakingPartDirty(false);
  
      cadModel_0.getFeatureManager().rollBack(faceSketch_0, true);
  
      cadModel_0.getFeatureManager().startSketchEdit(faceSketch_0);
  
      faceSketch_0.getProjectedSketchPrimitives(new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {parasolidSketchPrimitive_0, parasolidSketchPrimitive_1, parasolidSketchPrimitive_2}), new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {}));
  
      
      Units units_0 = 
        simulation_0.getUnitsManager().getPreferredUnits(new IntVector(new int[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
  
      
      faceSketch_0.getProjectedSketchPrimitives(new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {parasolidSketchPrimitive_0}), new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {}), new NeoObjectVector(new Object[] {}));
  
      
      CircleSketchPrimitive circleSketchPrimitive_0 = 
        faceSketch_0.createCircle(new DoubleVector(new double[] {0.0, 0.0}), 0.10885831715088566);
  
      
      faceSketch_0.markFeatureForEdit();
  
      cadModel_0.allowMakingPartDirty(true);
  
      cadModel_0.getFeatureManager().stopSketchEdit(faceSketch_0, false);
  
      cadModel_0.getFeatureManager().markDependentNotUptodate(faceSketch_0);
  
      cadModel_0.getFeatureManager().rollForwardToEnd(false);
  
      
      cadModel_0.allowMakingPartDirty(false);
  
      FaceSketch faceSketch_1 = 
        ((FaceSketch) cadModel_0.getFeature("FaceSketch 2"));
  
      cadModel_0.getFeatureManager().rollBack(faceSketch_1, true);
  
      cadModel_0.getFeatureManager().startSketchEdit(faceSketch_1);
  
      
      CircleSketchPrimitive circleSketchPrimitive_1 = 
        faceSketch_1.createCircle(new DoubleVector(new double[] {0.0, 0.0}), 0.1092778427549083);
  
      
      faceSketch_1.setCircleRadius_2(circleSketchPrimitive_1, 0.109);
  
      faceSketch_1.markFeatureForEdit();
  
      cadModel_0.allowMakingPartDirty(true);
  
      cadModel_0.getFeatureManager().stopSketchEdit(faceSketch_1, false);
  
      cadModel_0.getFeatureManager().markDependentNotUptodate(faceSketch_1);
  
      cadModel_0.getFeatureManager().rollForwardToEnd(false);
  
      LoftMerge loftMerge_1 = 
        (LoftMerge) cadModel_0.getFeatureManager().createLoftMerge(new NeoObjectVector(new Object[] {faceSketch_0, faceSketch_1}), new NeoObjectVector(new Object[] {}));
  
      cadModel_0.allowMakingPartDirty(false);
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);
  
      
      loftMerge_1.setAutoPreview(true);
  
      cadModel_0.getFeatureManager().deleteOnCancel(loftMerge_1);
  
      cadModel_0.allowMakingPartDirty(true);
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);
  
      cadModel_0.allowMakingPartDirty(false);
  
      cadModel_0.getFeatureManager().rollBack(faceSketch_0, true);
  
      cadModel_0.getFeatureManager().startSketchEdit(faceSketch_0);
  
      faceSketch_0.deleteSketchPrimitives(new NeoObjectVector(new Object[] {circleSketchPrimitive_0}));
  
      cadModel_0.getFeatureManager().cancelSketchEdit(faceSketch_0);
  
      cadModel_0.allowMakingPartDirty(true);
  
      cadModel_0.getFeatureManager().rollForwardToEnd(true);
  
      cadModel_0.getFeatureManager().delete(faceSketch_0, faceSketch_1);
  
      FillFeature fillFeature_0 = 
        ((FillFeature) cadModel_0.getFeature("Fill Surface 1"));
  
      Face face_3 = 
        ((Face) fillFeature_0.getFaceByLocation(cadmodelerBody_0,new DoubleVector(new double[] {0.01567755819841113, -0.003170289009157421, 0.508000000000002})));
  
      Sketch sketch_0 = 
        cadModel_0.getFeatureManager().createSketch(face_3);
  
      cadModel_0.allowMakingPartDirty(false);
  
      cadModel_0.getFeatureManager().startSketchEdit(sketch_0);
  
      
      CircleSketchPrimitive circleSketchPrimitive_2 = 
        sketch_0.createCircle(new DoubleVector(new double[] {0.0, 0.0}), 0.10967945127114238);
  
      
      sketch_0.setCircleRadius_2(circleSketchPrimitive_2, 0.109);
  
      
      sketch_0.markFeatureForEdit();
  
      cadModel_0.allowMakingPartDirty(true);
  
      cadModel_0.getFeatureManager().stopSketchEdit(sketch_0, true);
  
      sketch_0.setIsUptoDate(true);
  
      cadModel_0.getFeatureManager().rollForwardToEnd(false);
  
      //executing this after 0 results in removing the bad thing
   }

   private void execute2() {

      Simulation simulation_0 = 
        getActiveSimulation();
  
      Scene scene_0 = 
        simulation_0.getSceneManager().getScene("3D-CAD View 1");
  
  
      
      CadModel cadModel_0 = 
        ((CadModel) simulation_0.get(SolidModelManager.class).getObject("3D-CAD Model 1"));
  
      BodyCircularPatternMerge bodyCircularPatternMerge_0 = 
        ((BodyCircularPatternMerge) cadModel_0.getFeature("Circular Pattern 1"));
  
      star.cadmodeler.Body cadmodelerBody_1 = 
        ((star.cadmodeler.Body) bodyCircularPatternMerge_0.getBodyByIndex(0,2));
  
      Face face_4 = 
        ((Face) bodyCircularPatternMerge_0.getFaceByLocation(cadmodelerBody_1,new DoubleVector(new double[] {0.01567755819841113, 0.0031702890091573656, -0.508000000000002})));
  
      Sketch sketch_1 = 
        cadModel_0.getFeatureManager().createSketch(face_4);
  
      cadModel_0.allowMakingPartDirty(false);
  
      cadModel_0.getFeatureManager().startSketchEdit(sketch_1);
  
      Units units_0 = 
        simulation_0.getUnitsManager().getPreferredUnits(new IntVector(new int[] {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
  
      
      CircleSketchPrimitive circleSketchPrimitive_3 = 
        sketch_1.createCircle(new DoubleVector(new double[] {0.0, 0.0}), 0.10816653826391967);
  
      
      sketch_1.setCircleRadius_2(circleSketchPrimitive_3, 0.109);
  
      sketch_1.markFeatureForEdit();
  
      cadModel_0.allowMakingPartDirty(true);
  
      cadModel_0.getFeatureManager().stopSketchEdit(sketch_1, true);
  
      sketch_1.setIsUptoDate(true);
  
      cadModel_0.getFeatureManager().rollForwardToEnd(false);
  
      Sketch sketch_0 = 
        ((Sketch) cadModel_0.getFeature("Sketch 1"));
  
      LoftMerge loftMerge_2 = 
        (LoftMerge) cadModel_0.getFeatureManager().createLoftMerge(new NeoObjectVector(new Object[] {sketch_0, sketch_1}), new NeoObjectVector(new Object[] {}));
  
      cadModel_0.allowMakingPartDirty(false);
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);
  
      loftMerge_2.setColorVector(new IntVector(new int[] {-16711936, -65536, -16776961}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      loftMerge_2.setProfileSketches(new NeoObjectVector(new Object[] {sketch_0, sketch_1}));
  
      loftMerge_2.setLoftedBodyTypeOption(0);
  
      loftMerge_2.setGuideSketches(new NeoObjectVector(new Object[] {}));
  
      loftMerge_2.setProfileAlignmentType(0);
  
      loftMerge_2.setBoundaryContactTypeStart(0);
  
      loftMerge_2.setBoundaryContactTypeEnd(0);
  
      loftMerge_2.setProfileSortingType(0);
  
      loftMerge_2.setSectionProfileType(0);
  
      loftMerge_2.setRefitType(0);
  
      loftMerge_2.setTolerance(1.0E-5);
  
      loftMerge_2.setPeriodicity(false);
  
      loftMerge_2.setCompatibilityMode(false);
  
      loftMerge_2.setPostOption(1);
  
      loftMerge_2.setInteractingBodies(new NeoObjectVector(new Object[] {}));
  
      loftMerge_2.setInteractingBodiesBodyGroups(new NeoObjectVector(new Object[] {}));
  
      loftMerge_2.setInteractingBodiesCadFilters(new NeoObjectVector(new Object[] {}));
  
      loftMerge_2.setInteractingSelectedBodies(false);
  
      loftMerge_2.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().execute(loftMerge_2);
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);
  
      
      cadModel_0.getFeatureManager().rollBack(loftMerge_2, true);
  
      cadModel_0.allowMakingPartDirty(false);
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);
  
      loftMerge_2.setColorVector(new IntVector(new int[] {-16711936, -65536, -16776961}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      loftMerge_2.setProfileSketches(new NeoObjectVector(new Object[] {sketch_0, sketch_1}));
  
      loftMerge_2.setLoftedBodyTypeOption(0);
  
      loftMerge_2.setGuideSketches(new NeoObjectVector(new Object[] {}));
  
      loftMerge_2.setProfileAlignmentType(0);
  
      loftMerge_2.setBoundaryContactTypeStart(0);
  
      loftMerge_2.setBoundaryContactTypeEnd(0);
  
      loftMerge_2.setProfileSortingType(0);
  
      loftMerge_2.setSectionProfileType(0);
  
      loftMerge_2.setRefitType(0);
  
      loftMerge_2.setTolerance(1.0E-5);
  
      loftMerge_2.setPeriodicity(false);
  
      loftMerge_2.setCompatibilityMode(false);
  
      loftMerge_2.setPostOption(1);
  
      loftMerge_2.setInteractingBodies(new NeoObjectVector(new Object[] {}));
  
      loftMerge_2.setInteractingBodiesBodyGroups(new NeoObjectVector(new Object[] {}));
  
      loftMerge_2.setInteractingBodiesCadFilters(new NeoObjectVector(new Object[] {}));
  
      loftMerge_2.setInteractingSelectedBodies(false);
  
      loftMerge_2.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().markDependentNotUptodate(loftMerge_2);
  
      cadModel_0.getFeatureManager().rollForwardToEnd(false);
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);
  
    
      star.cadmodeler.Body cadmodelerBody_2 = 
        ((star.cadmodeler.Body) loftMerge_2.getBodyByLocation(new DoubleVector(new double[] {-0.098639865319869, 0.04628044824200296, -0.508000000000002})));
  
      cadmodelerBody_2.getUnNamedFacesDefaultAttributeName();
  
      cadmodelerBody_2.getUnNamedFacesDefaultAttributeName();
  
      cadmodelerBody_2.getUnNamedEdgesDefaultAttributeName();
  
      cadmodelerBody_2.getUnNamedEdgesDefaultAttributeName();
   }

   

}