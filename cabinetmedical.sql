-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Dim 09 Février 2020 à 20:44
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `cabinetmedical`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `id_client` int(1) NOT NULL AUTO_INCREMENT,
  `version` int(255) NOT NULL,
  `titre` varchar(255) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  PRIMARY KEY (`id_client`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`id_client`, `version`, `titre`, `nom`, `prenom`) VALUES
(1, 2, 'c1', 'hassna', 'ouchen'),
(2, 2, 'c1', 'hassna', 'ouchen'),
(3, 2, 'c1', 'hassna', 'ouchen'),
(4, 2, 'c1', 'hassna', 'ouchen'),
(5, 2, 'c1', 'hassna', 'ouchen'),
(6, 2, 'c1', 'hassna', 'ouchen'),
(7, 2, 'c1', 'hassna', 'ouchen'),
(8, 2, 'c1', 'hassna', 'ouchen');

-- --------------------------------------------------------

--
-- Structure de la table `creneaux`
--

CREATE TABLE IF NOT EXISTS `creneaux` (
  `id_cr` int(20) NOT NULL AUTO_INCREMENT,
  `version` int(11) NOT NULL,
  `Hdebut` int(11) NOT NULL,
  `Mdebut` int(11) NOT NULL,
  `Hfin` int(11) NOT NULL,
  `Mfin` int(11) NOT NULL,
  `id_medecine` int(20) NOT NULL,
  PRIMARY KEY (`id_cr`),
  KEY `pk_med` (`id_medecine`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `user` int(11) NOT NULL,
  `password` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `login`
--

INSERT INTO `login` (`user`, `password`) VALUES
(0, 0),
(0, 0),
(0, 0);

-- --------------------------------------------------------

--
-- Structure de la table `medecines`
--

CREATE TABLE IF NOT EXISTS `medecines` (
  `id_medecine` int(20) NOT NULL AUTO_INCREMENT,
  `version` int(11) NOT NULL,
  `titre` varchar(255) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  PRIMARY KEY (`id_medecine`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `rondezvous`
--

CREATE TABLE IF NOT EXISTS `rondezvous` (
  `id_rv` int(20) NOT NULL AUTO_INCREMENT,
  `id_client` int(20) NOT NULL,
  `id_creneaux` int(20) NOT NULL,
  `jour_date` date NOT NULL,
  PRIMARY KEY (`id_rv`),
  KEY `pk_cr` (`id_creneaux`),
  KEY `pk_cl` (`id_client`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `creneaux`
--
ALTER TABLE `creneaux`
  ADD CONSTRAINT `pk_med` FOREIGN KEY (`id_medecine`) REFERENCES `medecines` (`id_medecine`);

--
-- Contraintes pour la table `rondezvous`
--
ALTER TABLE `rondezvous`
  ADD CONSTRAINT `pk_cl` FOREIGN KEY (`id_client`) REFERENCES `client` (`id_client`),
  ADD CONSTRAINT `pk_cr` FOREIGN KEY (`id_creneaux`) REFERENCES `creneaux` (`id_cr`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
