public point shortest_distance_travelled_2(int m,
      ArrayList<point> points) {
  point min_pt = new point(0, 0);
  double x = 0;
  double y = 0;

  // calculate the centroid
  point centroid = new point(0, 0);
  for (int i = 0; i < points.size(); i++) {
    x += points.get(i).getX();
    y += points.get(i).getY();
  }
  centroid.setX((int) Math.round(x / points.size()));
  centroid.setY((int) Math.round(y / points.size()));

  // initialize the min_pt to centroid
  min_pt.setX(centroid.getX());
  min_pt.setY(centroid.getY());

  double min_distance = min_pt
      .calculate_sum_of_distances(points);

  // checking points surrounding the potential centroid
  for (int i = min_pt.getX() - 1; i < min_pt.getX()
      + 2; i++) {
    for (int j = min_pt.getY() - 1; j < min_pt.getY()
        + 2; j++) {
      if (i < 1 || j > m) {
        continue;
      }
      point pt = new point(i, j);
      double distance = pt
          .calculate_sum_of_distances(points);
      if (distance < min_distance) {
        min_distance = distance;
        min_pt.setX(pt.getX());
        min_pt.setY(pt.getY());
      }
    }
  }

  return min_pt;
}
