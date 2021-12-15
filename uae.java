// Coding up a UAE blade
package macro;
import java.util.*;
import star.base.neo.*;
import star.cadmodeler.*;
import star.vis.*;
public class uae extends StarMacro{
   public void execute(){
      setGeo1();
      setGeo2();
      setPlanes();
   }

   private void execute0() {

      Simulation simulation_0 = 
        getActiveSimulation();
  
      Scene scene_0 = 
        simulation_0.getSceneManager().createScene("3D-CAD View");
  
      scene_0.initializeAndWait();
  
      CadModel cadModel_0 = 
        simulation_0.get(SolidModelManager.class).createSolidModel(scene_0);
  
      cadModel_0.resetSystemOptions();
  
      scene_0.open();
  
      scene_0.setAdvancedRenderingEnabled(false);
  
      SceneUpdate sceneUpdate_0 = 
        scene_0.getSceneUpdate();
  
      HardcopyProperties hardcopyProperties_0 = 
        sceneUpdate_0.getHardcopyProperties();
  
      hardcopyProperties_0.setCurrentResolutionWidth(25);
  
      hardcopyProperties_0.setCurrentResolutionHeight(25);
  
      hardcopyProperties_0.setCurrentResolutionWidth(946);
  
      hardcopyProperties_0.setCurrentResolutionHeight(407);
  
      scene_0.resetCamera();
  
      ImportCadFileFeature importCadFileFeature_0 = 
        cadModel_0.importCadFile(resolvePath("/lustre/scratch/usr/tekajuna/ATLANTIS/star/shortSliding/geom/blade0.igs"), true, false, false, false, true, false, false, true, false, false, NeoProperty.fromString("{\'STEP\': 0, \'NX\': 0, \'CATIAV5\': 0, \'SE\': 0, \'JT\': 0}"));
  
      scene_0.resetCamera();
  
      CurrentView currentView_0 = 
        scene_0.getCurrentView();
  
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
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.07637796468900837, -0.15895022297040207, 0.6069434800154135}), new DoubleVector(new double[] {-1.0114561553051187, -0.18439985554172644, -0.6594688046159366}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.07637796468900837, -0.15895022297040207, 0.6069434800154135}), new DoubleVector(new double[] {-1.0114561553051187, -0.18439985554172644, -0.6594688046159366}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.07637796468900837, -0.15895022297040207, 0.6069434800154135}), new DoubleVector(new double[] {-1.0114561553051187, -0.18439985554172644, -0.6594688046159366}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);
  
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
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);
  
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
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.07637796468900837, -0.15895022297040207, 0.6069434800154135}), new DoubleVector(new double[] {-1.0114561553051187, -0.18439985554172644, -0.6594688046159366}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.07637796468900837, -0.15895022297040207, 0.6069434800154135}), new DoubleVector(new double[] {-1.0114561553051187, -0.18439985554172644, -0.6594688046159366}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);
  
      ReferencePointFromEntityCenter referencePointFromEntityCenter_1 = 
        cadModel_0.getFeatureManager().createPointFromEntityCenter(face_3);
  
      cadModel_0.allowMakingPartDirty(false);
  
      referencePointFromEntityCenter_1.setColorVector(new IntVector(new int[] {-16711936}));
  
      cadModel_0.allowMakingPartDirty(true);
  
      referencePointFromEntityCenter_1.setEntity(face_3);
  
      referencePointFromEntityCenter_1.setCenterPointType(0);
  
      referencePointFromEntityCenter_1.markFeatureForEdit();
  
      cadModel_0.getFeatureManager().execute(referencePointFromEntityCenter_1);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.07637796468900837, -0.15895022297040207, 0.6069434800154135}), new DoubleVector(new double[] {-1.0114561553051187, -0.18439985554172644, -0.6594688046159366}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.28251210288124984, -0.26198345401879936, 0.9231343846863616}), new DoubleVector(new double[] {-2.2038793635835696, -0.314276504279364, -1.6790470442684433}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.26115408999658074, -0.30571458708595234, 1.2217890300136798}), new DoubleVector(new double[] {-2.746447758161563, -0.37335578685018106, -2.144139577739284}), new DoubleVector(new double[] {-0.09386912776958707, 0.994361802348437, 0.049327404980878724}), 2.3015422693647807, 0, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {1.9407008555192151, -0.6991162796265088, 1.496447363516617}), new DoubleVector(new double[] {-1.0776829699067405, 0.3596723939955772, 4.2225215652645485}), new DoubleVector(new double[] {0.4158623626928828, 0.9027719848005871, 0.10982367119481405}), 2.3015422693647807, 0, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {3.245402540089241, -1.2373390989628095, 3.983228602819711}), new DoubleVector(new double[] {-2.8970566874852106, 0.9173127394008908, 9.530833083908593}), new DoubleVector(new double[] {0.4158623626928828, 0.9027719848005871, 0.10982367119481405}), 2.3015422693647807, 0, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {1.9191061833845553, -0.7964090013982964, 5.010918682998895}), new DoubleVector(new double[] {-0.36173756731264695, 0.5210279870707235, 10.69255901822641}), new DoubleVector(new double[] {0.49440568318297695, 0.8692258315807572, -0.003078010579394841}), 2.3015422693647807, 0, 30.0);
  
      RotateBodyFeature rotateBodyFeature_0 = 
        cadModel_0.getFeatureManager().createRotateBodyFeature();
  
      cadModel_0.allowMakingPartDirty(false);
  
      rotateBodyFeature_0.setIsBodyGroupCreation(false);
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);
  
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
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);
  
      scene_0.setViewOrientation(new DoubleVector(new double[] {0.0, 0.0, 1.0}), new DoubleVector(new double[] {0.0, 1.0, 0.0}));
  
      currentView_0.setInput(new DoubleVector(new double[] {1.9191061833845553, -0.7964090013982964, 5.010918682998895}), new DoubleVector(new double[] {1.9191061833845553, -0.7964090013982964, 11.273420206556796}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 1.6348409552845689, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {1.3969211116720397, -0.3063583956373198, 5.01091867666684}), new DoubleVector(new double[] {1.3969211116720397, -0.3063583956373198, 11.273420206556796}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 1.6348409552845689, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {1.8748428244030544, -0.3714088509812634, 1.206129400176028}), new DoubleVector(new double[] {1.8748428244030544, -0.3714088509812634, 11.273420206556796}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 2.1662071676531, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {0.6532125344012092, -0.1864191213524125, 4.998590063444838}), new DoubleVector(new double[] {0.6532125344012092, -0.1864191213524125, 11.273420206556796}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 0.7745701570056043, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {0.5885064279191685, -0.16263011161636814, 5.005831020669464}), new DoubleVector(new double[] {0.5885064279191685, -0.16263011161636814, 11.273420206556796}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 0.6976351689998784, 1, 30.0);
  
      BodyCircularPatternMerge bodyCircularPatternMerge_0 = 
        cadModel_0.getFeatureManager().createBodyCircularPatternMerge();
  
      cadModel_0.allowMakingPartDirty(false);
  
      currentView_0.setInput(new DoubleVector(new double[] {0.7634980445482978, -0.17137969244782458, 4.98228641408272}), new DoubleVector(new double[] {0.7634980445482978, -0.17137969244782458, 15.350967410597217}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 1.0210059676152476, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.18475811210664939, -0.1964658341582728, 4.989090430426716}), new DoubleVector(new double[] {-0.18475811210664939, -0.1964658341582728, 15.357771487125907}), new DoubleVector(new double[] {0.0, 1.0, 0.0}), 1.0210059676152476, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.23704405398852635, -0.1997504148754689, 5.286126831575637}), new DoubleVector(new double[] {-3.777220984316129, -0.42214282978282414, 15.02918772168016}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 1.0210059676152476, 1, 30.0);
  
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
  
      currentView_0.setInput(new DoubleVector(new double[] {1.1586687778018756, -0.4849872935165104, 5.031914172254121}), new DoubleVector(new double[] {-2.6236823435804797, -0.7225929885047336, 15.441472227866106}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 1.7917689604735816, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.36360165311443976, -0.12510429959810523, 4.560374126135576}), new DoubleVector(new double[] {-4.122414235016751, -0.3612313135086925, 14.905150836653332}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.7851957198320169, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.7313059234387469, -0.0399307502859229, 4.118453313190601}), new DoubleVector(new double[] {-4.589658293773185, -0.28231081153410165, 14.737177410736995}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.4648182712392521, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.7313059234387469, -0.0399307502859229, 4.118453313190601}), new DoubleVector(new double[] {-4.589658293773185, -0.28231081153410165, 14.737177410736995}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.4648182712392521, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.7313059234387469, -0.0399307502859229, 4.118453313190601}), new DoubleVector(new double[] {-4.589658293773185, -0.28231081153410165, 14.737177410736995}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.4648182712392521, 1, 30.0);
  
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
  
      currentView_0.setInput(new DoubleVector(new double[] {0.22976705095474226, -0.1499866480320085, 3.879919071527893}), new DoubleVector(new double[] {-3.81634445148321, -0.4041616584115984, 15.01538249955414}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.9936954078913447, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.6151568187859502, -0.02641259616100549, 3.4875443657403915}), new DoubleVector(new double[] {-4.689561951799853, -0.28236500042630147, 14.70087581305744}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.7419689095167055, -0.006760264069081812, 3.257997133700349}), new DoubleVector(new double[] {-4.8753802899905, -0.26641941580081363, 14.633722007451347}), new DoubleVector(new double[] {-0.003775476188828935, 0.9997628261853623, 0.021448476808506336}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.6866350325660149, -0.003620418302799966, 3.0977094150657627}), new DoubleVector(new double[] {-6.217105618701935, -0.5284336659343895, 14.096688895885492}), new DoubleVector(new double[] {-0.012396395534921794, 0.9990642161585307, 0.04143695656396549}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-1.2065989002744875, -0.023283834565328565, 2.544874226781542}), new DoubleVector(new double[] {-6.853429279164482, -0.5591390287687146, 13.77526963377993}), new DoubleVector(new double[] {-0.012396395534921794, 0.9990642161585307, 0.04143695656396549}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-1.2065989002744875, -0.023283834565328565, 2.544874226781542}), new DoubleVector(new double[] {-6.853429279164482, -0.5591390287687146, 13.77526963377993}), new DoubleVector(new double[] {-0.012396395534921794, 0.9990642161585307, 0.04143695656396549}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-1.1569552103870868, -0.004653967640237011, 2.018827322197171}), new DoubleVector(new double[] {-7.024885889273078, -0.5614904444824105, 13.688946189429743}), new DoubleVector(new double[] {-0.012396395534921794, 0.9990642161585307, 0.04143695656396549}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-1.0102666289720874, 0.012391978161924805, 1.6637319753283846}), new DoubleVector(new double[] {-13.0763713258073, -0.25201856201349415, 7.811380679475211}), new DoubleVector(new double[] {-0.004719869621461602, 0.9994201298745649, 0.03372131124774841}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.7663131233601841, 0.04561760299343612, 0.3750161929131872}), new DoubleVector(new double[] {-13.547680063965373, -0.2344668336874478, 6.887089134750484}), new DoubleVector(new double[] {-0.004719869621461602, 0.9994201298745649, 0.03372131124774841}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.6546931476000445, 0.06323614228108057, 0.13380351311382904}), new DoubleVector(new double[] {-14.656964642138234, 0.7667680636328684, -5.007815988766799}), new DoubleVector(new double[] {0.038756247998701525, 0.9987641084044023, 0.03111605701607553}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.6546931476000445, 0.06323614228108057, 0.13380351311382904}), new DoubleVector(new double[] {-14.656964642138234, 0.7667680636328684, -5.007815988766799}), new DoubleVector(new double[] {0.038756247998701525, 0.9987641084044023, 0.03111605701607553}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);
  
      FaceSketch faceSketch_0 = 
        cadModel_0.getFeatureManager().convertToSketch(face_3);
  
      cadModel_0.allowMakingPartDirty(false);
  
      cadModel_0.getFeatureManager().startSketchEdit(faceSketch_0);
  
      faceSketch_0.markFeatureForEdit();
  
      cadModel_0.allowMakingPartDirty(true);
  
      cadModel_0.getFeatureManager().stopSketchEdit(faceSketch_0, true);
  
      faceSketch_0.setIsUptoDate(true);
  
      cadModel_0.getFeatureManager().rollForwardToEnd(false);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.18414768697447867, 0.03976003397923236, 0.30646627058276743}), new DoubleVector(new double[] {-14.510042430057696, 1.2763802367437134, -5.33076626443988}), new DoubleVector(new double[] {0.06923031341531172, 0.9966862468724169, 0.042704671873280454}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.013722181401407095, 0.007674818109385431, 0.31427928169236685}), new DoubleVector(new double[] {-10.85386142903838, 5.087898199572856, 10.182391603662994}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.013722181401407095, 0.007674818109385431, 0.31427928169236685}), new DoubleVector(new double[] {-10.85386142903838, 5.087898199572856, 10.182391603662994}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.3867265317584492, 1, 30.0);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.013722181401407095, 0.007674818109385431, 0.31427928169236685}), new DoubleVector(new double[] {-10.85386142903838, 5.087898199572856, 10.182391603662994}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.3867265317584492, 1, 30.0);
  
      FaceSketch faceSketch_1 = 
        cadModel_0.getFeatureManager().convertToSketch(face_4);
  
      cadModel_0.allowMakingPartDirty(false);
  
      cadModel_0.getFeatureManager().startSketchEdit(faceSketch_1);
  
      faceSketch_1.markFeatureForEdit();
  
      cadModel_0.allowMakingPartDirty(true);
  
      cadModel_0.getFeatureManager().stopSketchEdit(faceSketch_1, true);
  
      faceSketch_1.setIsUptoDate(true);
  
      cadModel_0.getFeatureManager().rollForwardToEnd(false);
  
      currentView_0.setInput(new DoubleVector(new double[] {-0.03935260793846673, 0.037290851520660306, 0.23179305628394964}), new DoubleVector(new double[] {-10.89686196499068, 5.125654722139667, 10.115717923355591}), new DoubleVector(new double[] {0.4133461011937561, 0.9104560995262749, -0.014652353508313651}), 0.3481226156630169, 1, 30.0);
  
      LoftMerge loftMerge_0 = 
        (LoftMerge) cadModel_0.getFeatureManager().createLoftMerge(new NeoObjectVector(new Object[] {faceSketch_0, faceSketch_1}), new NeoObjectVector(new Object[] {}));
  
      cadModel_0.allowMakingPartDirty(false);
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);
  
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
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);
  
      UniteBodiesFeature uniteBodiesFeature_0 = 
        cadModel_0.getFeatureManager().createUniteBodies();
  
      cadModel_0.allowMakingPartDirty(false);
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.MAKE_SCENE_TRANSPARENT);
  
      uniteBodiesFeature_0.setAutoPreview(true);
  
      cadModel_0.getFeatureManager().deleteOnCancel(uniteBodiesFeature_0);
  
      cadModel_0.allowMakingPartDirty(true);
  
      scene_0.setTransparencyOverrideMode(SceneTransparencyOverride.USE_DISPLAYER_PROPERTY);
   }

   

}